import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.nba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class87_Sub3 extends Class87 implements Interface2 {

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Z")
	public boolean aBoolean560;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Z")
	public boolean aBoolean561;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	private final int anInt8146;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	private final int anInt8147;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ss;Lclient!hi;Lclient!ne;II)V")
	public Class87_Sub3(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass66_Sub1_Sub2_6.aBoolean589) {
			this.anInt8146 = arg4;
			this.anInt8147 = arg3;
		} else {
			this.anInt8147 = Static514.method7261(arg3);
			this.anInt8146 = Static514.method7261(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static490.method7005(this.aClass141_14, this.aClass239_18), 1);
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ss;IIZ[III)V")
	public Class87_Sub3(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static85.aClass141_2, Static349.aClass239_12, arg3 && arg0.aBoolean588, arg2 * arg1);
		if (this.aClass66_Sub1_Sub2_6.aBoolean589) {
			this.anInt8147 = arg1;
			this.anInt8146 = arg2;
		} else {
			this.anInt8147 = Static514.method7261(arg1);
			this.anInt8146 = Static514.method7261(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt8147, this.anInt8146, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt8147, this.anInt8146, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass66_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (nba.a(local82, (byte) -44)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(96) int local96 = local71.getRowPitch();
			if (local96 == arg1 * 4 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(110) int local110 = 0; local110 < arg2; local110++) {
					local71.b(arg4, local110 * arg6 + arg5, local110 * local96, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ss;Lclient!hi;IIZ[BII)V")
	public Class87_Sub3(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static349.aClass239_12, arg4 && arg0.aBoolean588, arg2 * arg3);
		if (this.aClass66_Sub1_Sub2_6.aBoolean589) {
			this.anInt8147 = arg2;
			this.anInt8146 = arg3;
		} else {
			this.anInt8147 = Static514.method7261(arg2);
			this.anInt8146 = Static514.method7261(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt8147, this.anInt8146, 0, 1024, Static490.method7005(this.aClass141_14, Static349.aClass239_12), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt8147, this.anInt8146, 1, 0, Static490.method7005(this.aClass141_14, Static349.aClass239_12), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass66_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (nba.a(local90, (byte) -78)) {
			@Pc(107) int local107 = arg2 * this.aClass141_14.anInt4189;
			@Pc(113) int local113 = arg2 * this.aClass141_14.anInt4189;
			@Pc(116) int local116 = local79.getRowPitch();
			if (local113 == local116 && local107 == local113) {
				local79.a((byte[]) arg5, arg6, 0, local113 * arg3);
			} else {
				for (@Pc(133) int local133 = 0; local133 < arg3; local133++) {
					local79.a(arg5, local107 * local133 + arg6, local116 * local133, local113);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6716() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
	@Override
	public int method6723() {
		return this.anInt8147;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
	@Override
	public int method6722() {
		return this.anInt8146;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6721() {
		return true;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII[I)V")
	@Override
	public void method6720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int[] arg5) {
		if (this.aClass141_14 != Static85.aClass141_2 || Static349.aClass239_12 != this.aClass239_18) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass66_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, arg0, arg4, arg2, arg1, 0, local15);
		if (!nba.a(local26, (byte) -76)) {
			return;
		}
		@Pc(34) int local34 = local15.getRowPitch();
		if (arg2 * 4 == local34 && arg2 == arg3) {
			local15.b(arg5, 0, 0, arg2 * arg1);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
				local15.b(arg5, local48 * arg3, local48 * local34, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IF)F")
	@Override
	public float method6725(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8147;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6724(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8146;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	@Override
	public void method6761() {
		this.aClass66_Sub1_Sub2_6.method7000(this);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBII[BLclient!hi;III)V")
	@Override
	public void method6719(@OriginalArg(0) int arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) Class141 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg2 != this.aClass141_14 || this.aClass239_18 != Static349.aClass239_12) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass66_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg0, 0, local16);
		if (!nba.a(local33, (byte) -67)) {
			return;
		}
		@Pc(44) int local44 = arg3 * this.aClass141_14.anInt4189;
		@Pc(50) int local50 = arg4 * this.aClass141_14.anInt4189;
		@Pc(53) int local53 = local16.getRowPitch();
		if (local53 == local50 && local50 == local44) {
			local16.a((byte[]) arg1, 0, 0, local50 * arg0);
		} else {
			for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
				local16.a(arg1, local74 * local44, local53 * local74, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!cba;I)V")
	@Override
	public void method6762(@OriginalArg(0) Class46 arg0) {
		super.method6762(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method6718(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean560 = arg1;
		this.aBoolean561 = arg0;
	}
}
