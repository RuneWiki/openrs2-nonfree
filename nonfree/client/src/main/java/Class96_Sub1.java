import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.hb;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class96_Sub1 extends Class96 implements Interface1 {

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	private final int anInt6194;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
	private final int anInt6193;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!gb;IIZ[III)V")
	public Class96_Sub1(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static487.aClass333_15, Static336.aClass220_12, arg3 && arg0.aBoolean302, arg2 * arg1);
		if (this.aClass9_Sub3_Sub1_6.aBoolean300) {
			this.anInt6193 = arg2;
			this.anInt6194 = arg1;
		} else {
			this.anInt6194 = Static247.method4363(arg1);
			this.anInt6193 = Static247.method4363(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(this.anInt6194, this.anInt6193, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(this.anInt6194, this.anInt6193, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass9_Sub3_Sub1_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (hb.a(local82, (byte) -90)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(93) int local93 = local71.getRowPitch();
			if (arg1 * 4 == local93 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					local71.b(arg4, local107 * arg6 + arg5, local93 * local107, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!gb;Lclient!vj;Lclient!nb;II)V")
	public Class96_Sub1(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass9_Sub3_Sub1_6.aBoolean300) {
			this.anInt6194 = arg3;
			this.anInt6193 = arg4;
		} else {
			this.anInt6194 = Static247.method4363(arg3);
			this.anInt6193 = Static247.method4363(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static160.method3245(this.aClass220_19, this.aClass333_13), 1);
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!gb;Lclient!vj;IIZ[BII)V")
	public Class96_Sub1(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static336.aClass220_12, arg4 && arg0.aBoolean302, arg2 * arg3);
		if (this.aClass9_Sub3_Sub1_6.aBoolean300) {
			this.anInt6194 = arg2;
			this.anInt6193 = arg3;
		} else {
			this.anInt6194 = Static247.method4363(arg2);
			this.anInt6193 = Static247.method4363(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(this.anInt6194, this.anInt6193, 0, 1024, Static160.method3245(Static336.aClass220_12, this.aClass333_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(this.anInt6194, this.anInt6193, 1, 0, Static160.method3245(Static336.aClass220_12, this.aClass333_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass9_Sub3_Sub1_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (hb.a(local90, (byte) -41)) {
			@Pc(108) int local108 = arg2 * this.aClass333_13.anInt9344;
			@Pc(114) int local114 = arg2 * this.aClass333_13.anInt9344;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local108 == local117 && local114 == local108) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local108);
			} else {
				for (@Pc(138) int local138 = 0; local138 < arg3; local138++) {
					local79.a(arg5, local138 * local114 + arg6, local138 * local117, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)I")
	@Override
	public int method7750() {
		return this.anInt6193;
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)I")
	@Override
	public int method7752() {
		return this.anInt6194;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(FI)F")
	@Override
	public float method7754(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6194;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7753(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean458 = arg0;
		this.aBoolean459 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6280() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7749() {
		return true;
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
	@Override
	public void method7736() {
		this.aClass9_Sub3_Sub1_6.method3248(this);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIIB[I)V")
	@Override
	public void method7751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (Static487.aClass333_15 != this.aClass333_13 || Static336.aClass220_12 != this.aClass220_19) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass9_Sub3_Sub1_6.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg3, arg0, arg4, arg2, 0, local16);
		if (!hb.a(local35, (byte) -126)) {
			return;
		}
		@Pc(42) int local42 = local16.getRowPitch();
		if (local42 == arg4 * 4 && arg4 == arg1) {
			local16.b(arg5, 0, 0, arg4 * arg2);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg2; local56++) {
				local16.b(arg5, local56 * arg1, local56 * local42, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!up;)V")
	@Override
	public void method7737(@OriginalArg(1) Class321 arg0) {
		super.method7737(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII[BLclient!vj;III)V")
	@Override
	public void method7747(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4) {
		if (this.aClass333_13 != arg3 || Static336.aClass220_12 != this.aClass220_19) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass9_Sub3_Sub1_6.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg1, 0, local20);
		if (!hb.a(local31, (byte) -126)) {
			return;
		}
		@Pc(42) int local42 = arg4 * this.aClass333_13.anInt9344;
		@Pc(48) int local48 = arg0 * this.aClass333_13.anInt9344;
		@Pc(51) int local51 = local20.getRowPitch();
		if (local51 == local48 && local48 == local42) {
			local20.a((byte[]) arg2, 0, 0, arg1 * local48);
		} else {
			for (@Pc(76) int local76 = 0; local76 < arg1; local76++) {
				local20.a(arg2, local42 * local76, local51 * local76, local48);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IF)F")
	@Override
	public float method7748(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6193;
	}
}
