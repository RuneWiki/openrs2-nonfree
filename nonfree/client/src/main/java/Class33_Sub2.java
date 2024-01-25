import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.wd;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class33_Sub2 extends Class33 implements Interface19 {

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "Z")
	public boolean aBoolean122;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	private final int anInt1495;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	private final int anInt1496;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!rd;Lclient!kea;IIZ[BII)V")
	public Class33_Sub2(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static290.aClass189_11, arg4 && arg0.aBoolean593, arg3 * arg2);
		if (this.aClass95_Sub3_Sub1_8.aBoolean592) {
			this.anInt1495 = arg3;
			this.anInt1496 = arg2;
		} else {
			this.anInt1496 = Static350.method4699(arg2);
			this.anInt1495 = Static350.method4699(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(this.anInt1496, this.anInt1495, 0, 1024, Static484.method6732(Static290.aClass189_11, this.aClass188_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(this.anInt1496, this.anInt1495, 1, 0, Static484.method6732(Static290.aClass189_11, this.aClass188_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (wd.a(117, (int) local90)) {
			@Pc(109) int local109 = arg2 * this.aClass188_14.anInt4725;
			@Pc(115) int local115 = arg2 * this.aClass188_14.anInt4725;
			@Pc(118) int local118 = local79.getRowPitch();
			if (local118 == local115 && local109 == local115) {
				local79.a((byte[]) arg5, arg6, 0, local115 * arg3);
			} else {
				for (@Pc(134) int local134 = 0; local134 < arg3; local134++) {
					local79.a(arg5, local134 * local109 + arg6, local134 * local118, local115);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!rd;IIZ[III)V")
	public Class33_Sub2(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static393.aClass188_12, Static290.aClass189_11, arg3 && arg0.aBoolean593, arg2 * arg1);
		if (this.aClass95_Sub3_Sub1_8.aBoolean592) {
			this.anInt1495 = arg2;
			this.anInt1496 = arg1;
		} else {
			this.anInt1496 = Static350.method4699(arg1);
			this.anInt1495 = Static350.method4699(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(this.anInt1496, this.anInt1495, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(this.anInt1496, this.anInt1495, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (wd.a(68, (int) local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (local94 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(108) int local108 = 0; local108 < arg2; local108++) {
					local71.a(arg4, arg6 * local108 + arg5, local108 * local94, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!rd;Lclient!kea;Lclient!kf;II)V")
	public Class33_Sub2(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass95_Sub3_Sub1_8.aBoolean592) {
			this.anInt1496 = arg3;
			this.anInt1495 = arg4;
		} else {
			this.anInt1496 = Static350.method4699(arg3);
			this.anInt1495 = Static350.method4699(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static484.method6732(this.aClass189_20, this.aClass188_14), 1);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (Static393.aClass188_12 != this.aClass188_14 || this.aClass189_20 != Static290.aClass189_11) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, arg0, arg2, arg3, arg5, 0, local15);
		if (!wd.a(32, (int) local26)) {
			return;
		}
		@Pc(36) int local36 = local15.getRowPitch();
		if (arg3 * 4 == local36 && arg3 == arg1) {
			local15.a((int[]) arg4, 0, 0, arg5 * arg3);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg5; local55++) {
				local15.a(arg4, local55 * arg1, local36 * local55, arg3);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7838() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIBII[II)V")
	@Override
	public void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int[] arg2) {
		if (Static393.aClass188_12 != this.aClass188_14 || this.aClass189_20 != Static290.aClass189_11) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 16, local16);
		if (!wd.a(121, (int) local27)) {
			return;
		}
		@Pc(34) int local34 = local16.getRowPitch();
		if (local34 == arg1 * 4) {
			local16.b(arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
				local16.b(arg2, arg1 * local45, local45 * local34, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return this.anInt1495;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method3138(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean123 = arg0;
		this.aBoolean122 = arg1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BF)F")
	@Override
	public float method3136(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1496;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!tb;)V")
	@Override
	public void method7837(@OriginalArg(1) Class328 arg0) {
		super.method7837(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	@Override
	public int method3134() {
		return this.anInt1496;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3131() {
		return true;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	@Override
	public void method7839() {
		this.aClass95_Sub3_Sub1_8.method6730(this);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([BILclient!kea;IIIIII)V")
	@Override
	public void method3135(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		if (arg1 != this.aClass188_14 || Static290.aClass189_11 != this.aClass189_20) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg4, 0, local20);
		if (!wd.a(33, (int) local31)) {
			return;
		}
		@Pc(42) int local42 = arg2 * this.aClass188_14.anInt4725;
		@Pc(48) int local48 = arg3 * this.aClass188_14.anInt4725;
		@Pc(51) int local51 = local20.getRowPitch();
		if (local48 == local51 && local42 == local48) {
			local20.a((byte[]) arg0, 0, 0, arg4 * local48);
		} else {
			for (@Pc(63) int local63 = 0; local63 < arg4; local63++) {
				local20.a(arg0, local42 * local63, local51 * local63, local48);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IF)F")
	@Override
	public float method3137(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1495;
	}
}
