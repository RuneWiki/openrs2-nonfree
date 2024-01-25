import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Lclient!id;")
	public final Class117 aClass117_3;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIIZIIIIII)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static312.method2274(arg11, arg12));
		this.aClass117_3 = new Class117(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean479 = arg1.anInt7186 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		@Pc(16) Class32 local16 = this.aClass117_3.method2618(false, true, arg0, super.anInt5533, super.anInt5532, 262144);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt5532 >> 7;
			@Pc(28) int local28 = super.anInt5533 >> 7;
			this.aClass117_3.method2614(local16, arg0, local23, local28, local28, local23, false);
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aClass117_3.anInt3233;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aClass117_3.method2625();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aClass117_3.anInt3240;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(18) Class32 local18 = this.aClass117_3.method2618(false, true, arg0, super.anInt5533, super.anInt5532, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(32) Class102 local32 = arg0.method2223();
		local32.R(super.anInt5524 + super.anInt5532, super.anInt5528, super.anInt5533 + super.anInt5526);
		@Pc(49) Class38_Sub3 local49 = null;
		if (this.aBoolean479) {
			local49 = Static313.method4433(1);
		}
		if (this.aClass117_3.aClass38_Sub6_1 == null) {
			local18.method5675(local32, local49 == null ? null : local49.aClass38_Sub4Array1[0], 0);
		} else {
			@Pc(81) Class192 local81 = this.aClass117_3.aClass38_Sub6_1.method3549();
			arg0.method2218(local18, local81, local32, local49 == null ? null : local49.aClass38_Sub4Array1[0]);
		}
		@Pc(100) int local100 = super.anInt5532 >> 7;
		@Pc(105) int local105 = super.anInt5533 >> 7;
		this.aClass117_3.method2614(local18, arg0, local100, local105, local105, local100, true);
		return local49;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class32 local16 = this.aClass117_3.method2618(false, false, arg1, super.anInt5533, super.anInt5532, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class102 local23 = arg1.method2223();
			local23.R(super.anInt5532 + super.anInt5524, super.anInt5528, super.anInt5533 + super.anInt5526);
			return local16.method5671(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.aClass117_3.method2618(false, false, arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)I")
	@Override
	public int method4502() {
		return this.aClass117_3.method2623();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		this.aClass117_3.method2617(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aClass117_3.anInt3237;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		this.aClass117_3.method2619(arg0);
	}
}
