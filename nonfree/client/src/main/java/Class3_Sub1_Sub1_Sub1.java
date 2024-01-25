import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 implements Interface21 {

	@OriginalMember(owner = "client!saa", name = "O", descriptor = "Lclient!hw;")
	private Class142 aClass142_7;

	@OriginalMember(owner = "client!saa", name = "J", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "client!saa", name = "T", descriptor = "Lclient!bv;")
	public final Class45 aClass45_4;

	@OriginalMember(owner = "client!saa", name = "eb", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZII)V")
	public Class3_Sub1_Sub1_Sub1(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5391);
		this.aClass45_4 = new Class45(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean667 = arg1.anInt5363 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aClass45_4.anInt1904;
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		@Pc(18) Class166 local18 = this.aClass45_4.method1809(true, true, 262144, arg0);
		if (local18 == null) {
			return;
		}
		@Pc(25) int local25 = super.anInt10303 >> 9;
		@Pc(30) int local30 = super.anInt10310 >> 9;
		@Pc(33) Class30 local33 = arg0.method7308();
		local33.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		this.aClass45_4.method1811(local25, local33, local30, arg0, local25, local18, false, local30);
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass45_4.method1804();
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
	}

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aClass45_4.anInt1895;
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(14) Class166 local14 = this.aClass45_4.method1809(false, true, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class30 local21 = arg0.method7308();
		local21.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(35) Class3_Sub4 local35 = Static546.method8162(1, this.aBoolean667);
		@Pc(40) int local40 = super.anInt10303 >> 9;
		@Pc(45) int local45 = super.anInt10310 >> 9;
		this.aClass45_4.method1811(local40, local21, local45, arg0, local40, local14, true, local45);
		if (Static639.aBoolean753) {
			local14.method6678(local21, local35.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			local14.method6685(local21, local35.aClass3_Sub3Array1[0], 0);
		}
		if (this.aClass45_4.aClass3_Sub9_2 != null) {
			@Pc(87) Class203 local87 = this.aClass45_4.aClass3_Sub9_2.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local87, Static380.anInt7419);
			} else {
				arg0.method7287(local87);
			}
		}
		this.aBoolean666 = local14.F() || this.aClass45_4.aClass3_Sub9_2 != null;
		if (this.aClass142_7 == null) {
			this.aClass142_7 = Static268.method4930(super.anInt10303, local14, super.anInt10310, super.anInt10306);
		} else {
			Static561.method8419(super.anInt10310, super.anInt10306, this.aClass142_7, local14, super.anInt10303);
		}
		return local35;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			Static504.aClass46Array16 = null;
		}
		return this.aClass45_4.method1805(arg0 ^ 0x647D);
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class166 local12 = this.aClass45_4.method1809(false, false, 131072, arg0);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class30 local19 = arg0.method7308();
			local19.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local12.method6693(arg2, arg1, local19, false, 0, Static380.anInt7419) : local12.method6698(arg2, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return this.aClass142_7;
	}

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aClass45_4.method1806();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		this.aClass45_4.method1815(arg0);
	}

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aClass45_4.anInt1912;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		this.aClass45_4.method1808(arg0);
	}
}
