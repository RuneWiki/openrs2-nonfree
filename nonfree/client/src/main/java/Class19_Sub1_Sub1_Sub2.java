import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class19_Sub1_Sub1_Sub2 extends Class19_Sub1_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!oda", name = "ab", descriptor = "Lclient!dfa;")
	private Class68 aClass68_2;

	@OriginalMember(owner = "client!oda", name = "S", descriptor = "Z")
	private boolean aBoolean611 = true;

	@OriginalMember(owner = "client!oda", name = "O", descriptor = "Lclient!gw;")
	public final Class142 aClass142_2;

	@OriginalMember(owner = "client!oda", name = "Q", descriptor = "Z")
	private final boolean aBoolean610;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIIIII)V")
	public Class19_Sub1_Sub1_Sub2(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass142_2 = new Class142(arg0, arg1, arg10, arg11, super.aByte146, arg3, this, arg7, arg12);
		this.aBoolean610 = arg1.anInt4425 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		return false;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aClass142_2.anInt4295;
	}

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		return arg0 == 4 ? this.aClass142_2.method3537(0) : -94;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		this.aClass142_2.method3540(arg0);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return this.aClass68_2;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		@Pc(12) Class157 local12 = this.aClass142_2.method3545(262144, false, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt11204 >> 9;
		@Pc(24) int local24 = super.anInt11211 >> 9;
		@Pc(27) Class181 local27 = arg0.method7693();
		local27.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		this.aClass142_2.method3544(local12, local19, local24, local27, local19, false, arg0, local24);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		@Pc(14) Class157 local14 = this.aClass142_2.method3545(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class181 local22 = arg0.method7693();
		local22.method6356(super.aShort111 + super.anInt11204, super.anInt11208, super.aShort110 + super.anInt11211);
		@Pc(42) Class19_Sub8 local42 = Static58.method727(1, this.aBoolean610);
		@Pc(47) int local47 = super.anInt11204 >> 9;
		@Pc(60) int local60 = super.anInt11211 >> 9;
		this.aClass142_2.method3544(local14, local47, local60, local22, local47, true, arg0, local60);
		if (Static568.aBoolean784) {
			local14.method5227(local22, local42.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			local14.method5232(local22, local42.aClass19_Sub6Array1[0], 0);
		}
		if (this.aClass142_2.aClass19_Sub9_6 != null) {
			@Pc(106) Class162 local106 = this.aClass142_2.aClass19_Sub9_6.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local106, Static705.anInt11029);
			} else {
				arg0.method7656(local106);
			}
		}
		this.aBoolean611 = local14.F() || this.aClass142_2.aClass19_Sub9_6 != null;
		if (this.aClass68_2 == null) {
			this.aClass68_2 = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, local14);
		} else {
			Static529.method7487(super.anInt11204, super.anInt11208, super.anInt11211, this.aClass68_2, local14);
		}
		return local42;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		this.aClass142_2.method3538(arg0);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aBoolean611;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aClass142_2.method3541();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aClass142_2.anInt4300;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class157 local18 = this.aClass142_2.method3545(131072, false, arg1, false);
		if (local18 == null) {
			return false;
		} else {
			@Pc(26) Class181 local26 = arg1.method7693();
			local26.method6356(super.aShort111 + super.anInt11204, super.anInt11208, super.anInt11211 + super.aShort110);
			return Static568.aBoolean784 ? local18.method5221(arg2, arg0, local26, false, 0, Static705.anInt11029) : local18.method5218(arg2, arg0, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass142_2.method3542();
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return this.aClass142_2.anInt4301;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!mka;)V")
	public void method6699(@OriginalArg(1) Class241 arg0) {
		this.aClass142_2.method3539(arg0);
	}
}
