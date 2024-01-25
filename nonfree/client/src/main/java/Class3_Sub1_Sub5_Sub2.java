import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class3_Sub1_Sub5_Sub2 extends Class3_Sub1_Sub5 implements Interface21 {

	@OriginalMember(owner = "client!ju", name = "db", descriptor = "Lclient!hw;")
	private Class142 aClass142_5;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!ju", name = "cb", descriptor = "Lclient!bv;")
	public final Class45 aClass45_2;

	@OriginalMember(owner = "client!ju", name = "bb", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIII)V")
	public Class3_Sub1_Sub5_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static337.method5822(arg8, arg9));
		this.aClass45_2 = new Class45(arg0, arg1, arg8, arg9, super.aByte132, arg3, this, arg7, arg10);
		this.aBoolean445 = arg1.anInt5363 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aClass45_2.anInt1912;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		this.aClass45_2.method1808(arg0);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		@Pc(20) Class166 local20 = this.aClass45_2.method1809(true, true, 262144, arg0);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10303 >> 9;
		@Pc(32) int local32 = super.anInt10310 >> 9;
		@Pc(35) Class30 local35 = arg0.method7308();
		local35.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		this.aClass45_2.method1811(local27, local35, local32, arg0, local27, local20, false, local32);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass45_2.method1804();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class166 local12 = this.aClass45_2.method1809(false, false, 131072, arg0);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class30 local19 = arg0.method7308();
			local19.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local12.method6693(arg2, arg1, local19, false, 0, Static380.anInt7419) : local12.method6698(arg2, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			this.aBoolean445 = false;
		}
		return this.aClass45_2.method1805(-71);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aClass45_2.method1806();
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aClass45_2.anInt1904;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		this.aClass45_2.method1815(arg0);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(16) Class166 local16 = this.aClass45_2.method1809(false, true, 2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class30 local23 = arg0.method7308();
		local23.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(37) Class3_Sub4 local37 = Static546.method8162(1, this.aBoolean445);
		@Pc(42) int local42 = super.anInt10303 >> 9;
		@Pc(47) int local47 = super.anInt10310 >> 9;
		this.aClass45_2.method1811(local42, local23, local47, arg0, local42, local16, true, local47);
		if (Static639.aBoolean753) {
			local16.method6678(local23, local37.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			local16.method6685(local23, local37.aClass3_Sub3Array1[0], 0);
		}
		if (this.aClass45_2.aClass3_Sub9_2 != null) {
			@Pc(89) Class203 local89 = this.aClass45_2.aClass3_Sub9_2.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local89, Static380.anInt7419);
			} else {
				arg0.method7287(local89);
			}
		}
		this.aBoolean444 = local16.F() || this.aClass45_2.aClass3_Sub9_2 != null;
		if (this.aClass142_5 == null) {
			this.aClass142_5 = Static268.method4930(super.anInt10303, local16, super.anInt10310, super.anInt10306);
		} else {
			Static561.method8419(super.anInt10310, super.anInt10306, this.aClass142_5, local16, super.anInt10303);
		}
		return local37;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return this.aClass142_5;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aClass45_2.anInt1895;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
	}

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean444;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
