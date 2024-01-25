import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class19_Sub1_Sub2_Sub2 extends Class19_Sub1_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!vh", name = "V", descriptor = "Lclient!dfa;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "Z")
	private boolean aBoolean778 = true;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "Lclient!gw;")
	public final Class142 aClass142_3;

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "Z")
	private final boolean aBoolean779;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIII)V")
	public Class19_Sub1_Sub2_Sub2(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static149.method2438(arg8, arg9));
		this.aClass142_3 = new Class142(arg0, arg1, arg8, arg9, super.aByte146, arg3, this, arg7, arg10);
		this.aBoolean779 = arg1.anInt4425 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return this.aClass68_5;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		return arg0 == 4 ? this.aClass142_3.method3537(0) : 59;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!mka;I)V")
	public void method9018(@OriginalArg(0) Class241 arg0) {
		this.aClass142_3.method3539(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		@Pc(14) Class157 local14 = this.aClass142_3.method3545(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class181 local22 = arg0.method7693();
		local22.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(36) Class19_Sub8 local36 = Static58.method727(1, this.aBoolean779);
		@Pc(41) int local41 = super.anInt11204 >> 9;
		@Pc(46) int local46 = super.anInt11211 >> 9;
		this.aClass142_3.method3544(local14, local41, local46, local22, local41, true, arg0, local46);
		if (Static568.aBoolean784) {
			local14.method5227(local22, local36.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			local14.method5232(local22, local36.aClass19_Sub6Array1[0], 0);
		}
		if (this.aClass142_3.aClass19_Sub9_6 != null) {
			@Pc(92) Class162 local92 = this.aClass142_3.aClass19_Sub9_6.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local92, Static705.anInt11029);
			} else {
				arg0.method7656(local92);
			}
		}
		this.aBoolean778 = local14.F() || this.aClass142_3.aClass19_Sub9_6 != null;
		if (this.aClass68_5 == null) {
			this.aClass68_5 = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, local14);
		} else {
			Static529.method7487(super.anInt11204, super.anInt11208, super.anInt11211, this.aClass68_5, local14);
		}
		return local36;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return this.aClass142_3.anInt4301;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aBoolean778;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class157 local20 = this.aClass142_3.method3545(131072, false, arg1, false);
		if (local20 == null) {
			return false;
		} else {
			@Pc(28) Class181 local28 = arg1.method7693();
			local28.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			return Static568.aBoolean784 ? local20.method5221(arg2, arg0, local28, false, 0, Static705.anInt11029) : local20.method5218(arg2, arg0, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aClass142_3.anInt4300;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		this.aClass142_3.method3540(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass142_3.method3542();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		this.aClass142_3.method3538(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aClass142_3.anInt4295;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aClass142_3.method3541();
	}

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		@Pc(12) Class157 local12 = this.aClass142_3.method3545(262144, true, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt11204 >> 9;
		@Pc(24) int local24 = super.anInt11211 >> 9;
		@Pc(27) Class181 local27 = arg0.method7693();
		local27.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		this.aClass142_3.method3544(local12, local19, local24, local27, local19, false, arg0, local24);
	}
}
