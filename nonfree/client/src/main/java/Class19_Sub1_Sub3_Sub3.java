import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lla")
public final class Class19_Sub1_Sub3_Sub3 extends Class19_Sub1_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!lla", name = "lb", descriptor = "Lclient!dfa;")
	private Class68 lb;

	@OriginalMember(owner = "client!lla", name = "jb", descriptor = "Z")
	private boolean aBoolean495 = true;

	@OriginalMember(owner = "client!lla", name = "O", descriptor = "Lclient!gw;")
	public final Class142 aClass142_1;

	@OriginalMember(owner = "client!lla", name = "Y", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!lla", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIIIIIII)V")
	public Class19_Sub1_Sub3_Sub3(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4421 == 1, Static472.method6964(arg12, arg13));
		this.aClass142_1 = new Class142(arg0, arg1, arg12, arg13, super.aByte146, arg3, this, arg7, arg14);
		this.aBoolean496 = arg1.anInt4425 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		@Pc(20) Class157 local20 = this.aClass142_1.method3545(2048, false, arg0, true);
		if (local20 == null) {
			return null;
		}
		@Pc(28) Class181 local28 = arg0.method7693();
		local28.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(42) Class19_Sub8 local42 = Static58.method727(1, this.aBoolean496);
		this.aClass142_1.method3544(local20, super.aShort121, super.aShort122, local28, super.aShort123, true, arg0, super.aShort124);
		if (Static568.aBoolean784) {
			local20.method5227(local28, local42.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			local20.method5232(local28, local42.aClass19_Sub6Array1[0], 0);
		}
		if (this.aClass142_1.aClass19_Sub9_6 != null) {
			@Pc(92) Class162 local92 = this.aClass142_1.aClass19_Sub9_6.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local92, Static705.anInt11029);
			} else {
				arg0.method7656(local92);
			}
		}
		this.aBoolean495 = local20.F() || this.aClass142_1.aClass19_Sub9_6 != null;
		if (this.lb == null) {
			this.lb = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, local20);
		} else {
			Static529.method7487(super.anInt11204, super.anInt11208, super.anInt11211, this.lb, local20);
		}
		return local42;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		@Pc(12) Class157 local12 = this.aClass142_1.method3545(262144, true, arg0, true);
		if (local12 != null) {
			@Pc(17) Class181 local17 = arg0.method7693();
			local17.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			this.aClass142_1.method3544(local12, super.aShort121, super.aShort122, local17, super.aShort123, false, arg0, super.aShort124);
		}
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aClass142_1.anInt4300;
	}

	@OriginalMember(owner = "client!lla", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		this.aClass142_1.method3538(arg0);
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aClass142_1.method3541();
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aClass142_1.anInt4295;
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return this.aClass142_1.anInt4301;
	}

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aBoolean495;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return this.lb;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(ILclient!mka;)V")
	public void method5398(@OriginalArg(1) Class241 arg0) {
		this.aClass142_1.method3539(arg0);
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class157 local12 = this.aClass142_1.method3545(131072, false, arg1, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(28) Class181 local28 = arg1.method7693();
			local28.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			return Static568.aBoolean784 ? local12.method5221(arg2, arg0, local28, false, 0, Static705.anInt11029) : local12.method5218(arg2, arg0, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		this.aClass142_1.method3540(arg0);
	}

	@OriginalMember(owner = "client!lla", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lla", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 != 4) {
			this.method9381();
		}
		return this.aClass142_1.method3537(0);
	}

	@OriginalMember(owner = "client!lla", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass142_1.method3542();
	}

	@OriginalMember(owner = "client!lla", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		return false;
	}
}
