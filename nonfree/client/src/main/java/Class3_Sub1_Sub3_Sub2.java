import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class3_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub3 implements Interface21 {

	@OriginalMember(owner = "client!fea", name = "eb", descriptor = "Lclient!hw;")
	private Class142 aClass142_3;

	@OriginalMember(owner = "client!fea", name = "ib", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!fea", name = "Y", descriptor = "Lclient!bv;")
	public final Class45 aClass45_1;

	@OriginalMember(owner = "client!fea", name = "jb", descriptor = "Z")
	private final boolean aBoolean269;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIIIIIII)V")
	public Class3_Sub1_Sub3_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5375 == 1, Static508.method7816(arg13, arg12));
		this.aClass45_1 = new Class45(arg0, arg1, arg12, arg13, super.aByte132, arg3, this, arg7, arg14);
		this.aBoolean269 = arg1.anInt5363 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		return arg0 == -25675 ? this.aClass45_1.method1805(arg0 ^ 0x6462) : -125;
	}

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class166 local14 = this.aClass45_1.method1809(false, false, 131072, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(25) Class30 local25 = arg0.method7308();
			local25.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local14.method6693(arg2, arg1, local25, false, 0, Static380.anInt7419) : local14.method6698(arg2, arg1, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aClass45_1.anInt1895;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return this.aClass142_3;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean268;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		this.aClass45_1.method1815(arg0);
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(14) Class166 local14 = this.aClass45_1.method1809(false, true, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class30 local21 = arg0.method7308();
		local21.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(35) Class3_Sub4 local35 = Static546.method8162(1, this.aBoolean269);
		this.aClass45_1.method1811(super.aShort121, local21, super.aShort119, arg0, super.aShort118, local14, true, super.aShort120);
		if (Static639.aBoolean753) {
			local14.method6678(local21, local35.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			local14.method6685(local21, local35.aClass3_Sub3Array1[0], 0);
		}
		if (this.aClass45_1.aClass3_Sub9_2 != null) {
			@Pc(81) Class203 local81 = this.aClass45_1.aClass3_Sub9_2.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local81, Static380.anInt7419);
			} else {
				arg0.method7287(local81);
			}
		}
		this.aBoolean268 = local14.F() || this.aClass45_1.aClass3_Sub9_2 != null;
		if (this.aClass142_3 == null) {
			this.aClass142_3 = Static268.method4930(super.anInt10303, local14, super.anInt10310, super.anInt10306);
		} else {
			Static561.method8419(super.anInt10310, super.anInt10306, this.aClass142_3, local14, super.anInt10303);
		}
		return local35;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aClass45_1.anInt1912;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aClass45_1.anInt1904;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		this.aClass45_1.method1808(arg0);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aClass45_1.method1806();
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		@Pc(12) Class166 local12 = this.aClass45_1.method1809(true, true, 262144, arg0);
		if (local12 != null) {
			@Pc(17) Class30 local17 = arg0.method7308();
			local17.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			this.aClass45_1.method1811(super.aShort121, local17, super.aShort119, arg0, super.aShort118, local12, false, super.aShort120);
		}
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass45_1.method1804();
	}
}
