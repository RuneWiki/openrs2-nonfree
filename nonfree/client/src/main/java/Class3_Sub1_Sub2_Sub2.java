import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 implements Interface21 {

	@OriginalMember(owner = "client!pw", name = "O", descriptor = "Lclient!hw;")
	private Class142 aClass142_6;

	@OriginalMember(owner = "client!pw", name = "A", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!pw", name = "W", descriptor = "Lclient!bv;")
	public final Class45 aClass45_3;

	@OriginalMember(owner = "client!pw", name = "U", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIIIII)V")
	public Class3_Sub1_Sub2_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass45_3 = new Class45(arg0, arg1, arg10, arg11, super.aByte132, arg3, this, arg7, arg12);
		this.aBoolean581 = arg1.anInt5363 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		this.aClass45_3.method1815(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass45_3.method1804();
	}

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aClass45_3.anInt1895;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aClass45_3.method1806();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		this.aClass45_3.method1808(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aClass45_3.anInt1904;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		@Pc(18) Class166 local18 = this.aClass45_3.method1809(false, true, 262144, arg0);
		if (local18 == null) {
			return;
		}
		@Pc(25) int local25 = super.anInt10303 >> 9;
		@Pc(30) int local30 = super.anInt10310 >> 9;
		@Pc(33) Class30 local33 = arg0.method7308();
		local33.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		this.aClass45_3.method1811(local25, local33, local30, arg0, local25, local18, false, local30);
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aClass45_3.anInt1912;
	}

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(14) Class166 local14 = this.aClass45_3.method1809(false, true, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class30 local21 = arg0.method7308();
		local21.method4649(super.anInt10303 + super.aShort108, super.anInt10306, super.anInt10310 + super.aShort107);
		@Pc(41) Class3_Sub4 local41 = Static546.method8162(1, this.aBoolean581);
		@Pc(46) int local46 = super.anInt10303 >> 9;
		@Pc(51) int local51 = super.anInt10310 >> 9;
		this.aClass45_3.method1811(local46, local21, local51, arg0, local46, local14, true, local51);
		if (Static639.aBoolean753) {
			local14.method6678(local21, local41.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			local14.method6685(local21, local41.aClass3_Sub3Array1[0], 0);
		}
		if (this.aClass45_3.aClass3_Sub9_2 != null) {
			@Pc(93) Class203 local93 = this.aClass45_3.aClass3_Sub9_2.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local93, Static380.anInt7419);
			} else {
				arg0.method7287(local93);
			}
		}
		this.aBoolean580 = local14.F() || this.aClass45_3.aClass3_Sub9_2 != null;
		if (this.aClass142_6 == null) {
			this.aClass142_6 = Static268.method4930(super.anInt10303, local14, super.anInt10310, super.anInt10306);
		} else {
			Static561.method8419(super.anInt10310, super.anInt10306, this.aClass142_6, local14, super.anInt10303);
		}
		return local41;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return this.aClass142_6;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean580;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class166 local12 = this.aClass45_3.method1809(false, false, 131072, arg0);
		if (local12 == null) {
			return false;
		} else {
			@Pc(23) Class30 local23 = arg0.method7308();
			local23.method4649(super.aShort108 + super.anInt10303, super.anInt10306, super.aShort107 + super.anInt10310);
			return Static639.aBoolean753 ? local12.method6693(arg2, arg1, local23, false, 0, Static380.anInt7419) : local12.method6698(arg2, arg1, local23, false, 0);
		}
	}

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			this.aBoolean581 = false;
		}
		return this.aClass45_3.method1805(-119);
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
	}
}
