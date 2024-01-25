import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class6 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!th;")
	private final Class325 aClass325_1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!wa;")
	private final Class354 aClass354_1;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	private final int anInt128;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
	public Class6(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass325_1 = new Class325();
		this.anInt128 = arg0;
		this.anInt130 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass354_1 = new Class354(local14);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method92(@OriginalArg(1) long arg0) {
		@Pc(14) Class3_Sub7_Sub15 local14 = (Class3_Sub7_Sub15) this.aClass354_1.method7689(arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(24) Object local24 = local14.method6553();
		if (local24 == null) {
			local14.method7825();
			local14.method7614();
			this.anInt130 += local14.anInt7879;
			return null;
		}
		if (local14.method6554()) {
			@Pc(52) Class3_Sub7_Sub15_Sub1 local52 = new Class3_Sub7_Sub15_Sub1(local24, local14.anInt7879);
			this.aClass354_1.method7691(local52, local14.aLong273);
			this.aClass325_1.method6862(local52);
			local52.aLong263 = 0L;
			local14.method7825();
			local14.method7614();
		} else {
			this.aClass325_1.method6862(local14);
			local14.aLong263 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
	public int method93() {
		return this.anInt128;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public void method94() {
		for (@Pc(19) Class3_Sub7_Sub15 local19 = (Class3_Sub7_Sub15) this.aClass325_1.method6859(); local19 != null; local19 = (Class3_Sub7_Sub15) this.aClass325_1.method6863()) {
			if (local19.method6554()) {
				local19.method7825();
				local19.method7614();
				this.anInt130 += local19.anInt7879;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Object;JII)V")
	public void method95(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (this.anInt128 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method105(arg1);
		this.anInt130 -= arg2;
		while (this.anInt130 < 0) {
			@Pc(39) Class3_Sub7_Sub15 local39 = (Class3_Sub7_Sub15) this.aClass325_1.method6860();
			this.method98(local39);
		}
		@Pc(52) Class3_Sub7_Sub15_Sub1 local52 = new Class3_Sub7_Sub15_Sub1(arg0, arg2);
		this.aClass354_1.method7691(local52, arg1);
		this.aClass325_1.method6862(local52);
		local52.aLong263 = 0L;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public void method97(@OriginalArg(1) int arg0) {
		if (Static3.aClass83_3 == null) {
			return;
		}
		for (@Pc(16) Class3_Sub7_Sub15 local16 = (Class3_Sub7_Sub15) this.aClass325_1.method6859(); local16 != null; local16 = (Class3_Sub7_Sub15) this.aClass325_1.method6863()) {
			if (local16.method6554()) {
				if (local16.method6553() == null) {
					local16.method7825();
					local16.method7614();
					this.anInt130++;
				}
			} else if (++local16.aLong263 > (long) arg0) {
				@Pc(40) Class3_Sub7_Sub15 local40 = Static3.aClass83_3.method2424(local16);
				this.aClass354_1.method7691(local40, local16.aLong273);
				Static185.method3151(local16, local40);
				local16.method7825();
				local16.method7614();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!mga;)V")
	private void method98(@OriginalArg(1) Class3_Sub7_Sub15 arg0) {
		if (arg0 != null) {
			arg0.method7825();
			arg0.method7614();
			this.anInt130 += arg0.anInt7879;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method100() {
		@Pc(17) Class3_Sub7_Sub15 local17 = (Class3_Sub7_Sub15) this.aClass354_1.method7694();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method6553();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class3_Sub7_Sub15 local29 = local17;
			local17 = (Class3_Sub7_Sub15) this.aClass354_1.method7692();
			local29.method7825();
			local29.method7614();
			this.anInt130 += local29.anInt7879;
		}
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
	public int method101() {
		return this.anInt130;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public void method102() {
		this.aClass325_1.method6864();
		this.aClass354_1.method7687();
		this.anInt130 = this.anInt128;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)I")
	public int method103() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class3_Sub7_Sub15 local18 = (Class3_Sub7_Sub15) this.aClass325_1.method6859(); local18 != null; local18 = (Class3_Sub7_Sub15) this.aClass325_1.method6863()) {
			if (!local18.method6554()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method104() {
		@Pc(18) Class3_Sub7_Sub15 local18 = (Class3_Sub7_Sub15) this.aClass354_1.method7692();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method6553();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class3_Sub7_Sub15 local28 = local18;
			local18 = (Class3_Sub7_Sub15) this.aClass354_1.method7692();
			local28.method7825();
			local28.method7614();
			this.anInt130 += local28.anInt7879;
		}
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V")
	private void method105(@OriginalArg(0) long arg0) {
		@Pc(14) Class3_Sub7_Sub15 local14 = (Class3_Sub7_Sub15) this.aClass354_1.method7689(arg0);
		this.method98(local14);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method106(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method95(arg1, arg0, 1);
	}
}
