import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.gh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class33_Sub1 extends Class33 implements Interface2 {

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "Z")
	public boolean aBoolean202;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
	public boolean aBoolean203;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	private final int anInt2758;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	private final int anInt2757;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!er;IIZ[III)V")
	public Class33_Sub1(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static171.aClass358_12, Static104.aClass86_8, arg3 && arg0.aBoolean197, arg1 * arg2);
		if (this.aClass100_Sub1_Sub1_6.aBoolean199) {
			this.anInt2758 = arg2;
			this.anInt2757 = arg1;
		} else {
			this.anInt2757 = Static146.method2737(arg1);
			this.anInt2758 = Static146.method2737(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt2757, this.anInt2758, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt2757, this.anInt2758, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (gh.a(-2005530585, local83)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(101) int local101 = local72.getRowPitch();
			if (arg1 * 4 == local101 && arg1 == arg6) {
				local72.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(117) int local117 = 0; local117 < arg2; local117++) {
					local72.b(arg4, arg5 + local117 * arg6, local117 * local101, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!er;Lclient!ua;Lclient!dn;II)V")
	public Class33_Sub1(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass100_Sub1_Sub1_6.aBoolean199) {
			this.anInt2757 = arg3;
			this.anInt2758 = arg4;
		} else {
			this.anInt2757 = Static146.method2737(arg3);
			this.anInt2758 = Static146.method2737(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static136.method2539(this.aClass86_18, this.aClass358_15), 1);
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!er;Lclient!ua;IIZ[BII)V")
	public Class33_Sub1(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static104.aClass86_8, arg4 && arg0.aBoolean197, arg3 * arg2);
		if (this.aClass100_Sub1_Sub1_6.aBoolean199) {
			this.anInt2757 = arg2;
			this.anInt2758 = arg3;
		} else {
			this.anInt2757 = Static146.method2737(arg2);
			this.anInt2758 = Static146.method2737(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt2757, this.anInt2758, 0, 1024, Static136.method2539(Static104.aClass86_8, this.aClass358_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt2757, this.anInt2758, 1, 0, Static136.method2539(Static104.aClass86_8, this.aClass358_15), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (gh.a(-2005530585, local91)) {
			@Pc(112) int local112 = arg2 * this.aClass358_15.anInt9551;
			@Pc(118) int local118 = arg2 * this.aClass358_15.anInt9551;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local118 == local121 && local118 == local112) {
				local80.a((byte[]) arg5, arg6, 0, local118 * arg3);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local80.a(arg5, arg6 + local112 * local135, local135 * local121, local118);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIILclient!ua;II[BII)V")
	@Override
	public void method3683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class358 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4) {
		if (arg2 != this.aClass358_15 || Static104.aClass86_8 != this.aClass86_18) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(29) int local29 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg0, 0, local18);
		if (!gh.a(-2005530585, local29)) {
			return;
		}
		@Pc(41) int local41 = arg4 * this.aClass358_15.anInt9551;
		@Pc(47) int local47 = arg1 * this.aClass358_15.anInt9551;
		@Pc(50) int local50 = local18.getRowPitch();
		if (local50 == local41 && local47 == local41) {
			local18.a((byte[]) arg3, 0, 0, arg0 * local41);
		} else {
			for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
				local18.a(arg3, local47 * local68, local68 * local50, local41);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	@Override
	public void method8895() {
		this.aClass100_Sub1_Sub1_6.method2540(this);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!se;)V")
	@Override
	public void method8896(@OriginalArg(1) Class328 arg0) {
		super.method8896(arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3682() {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6164() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)I")
	@Override
	public int method3680() {
		return this.anInt2757;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(FZ)F")
	@Override
	public float method3681(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2757;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method3687(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean202 = arg1;
		this.aBoolean203 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)I")
	@Override
	public int method3688() {
		return this.anInt2758;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(FI)F")
	@Override
	public float method3685(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2758;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III[IIBII)V")
	@Override
	public void method3684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass358_15 != Static171.aClass358_12 || this.aClass86_18 != Static104.aClass86_8) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(37) int local37 = this.anIDirect3DTexture1.LockRect(0, arg5, arg0, arg4, arg1, 0, local18);
		if (!gh.a(-2005530585, local37)) {
			return;
		}
		@Pc(44) int local44 = local18.getRowPitch();
		if (arg4 * 4 == local44 && arg4 == arg3) {
			local18.b(arg2, 0, 0, arg1 * arg4);
		} else {
			for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
				local18.b(arg2, local66 * arg3, local44 * local66, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method3686(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass358_15 != Static171.aClass358_12 || this.aClass86_18 != Static104.aClass86_8) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 16, local22);
		if (!gh.a(-2005530585, local33)) {
			return;
		}
		@Pc(40) int local40 = local22.getRowPitch();
		if (local40 == arg2 * 4) {
			local22.a((int[]) arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
				local22.a(arg0, arg2 * local51, local51 * local40, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}
