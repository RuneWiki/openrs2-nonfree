import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class268 {

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Lclient!et;")
	private final Class65 aClass65_10 = new Class65();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	private int anInt7535;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
	private final int anInt7543;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!lp;")
	private final Class140 aClass140_43;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I)V")
	public Class268(@OriginalArg(0) int arg0) {
		this.anInt7535 = arg0;
		this.anInt7543 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass140_43 = new Class140(local14);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public void method6160() {
		this.aClass65_10.method1687();
		this.aClass140_43.method3488();
		this.anInt7535 = this.anInt7543;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method6161() {
		@Pc(17) Class3_Sub3_Sub6 local17 = (Class3_Sub3_Sub6) this.aClass140_43.method3485();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method4737();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class3_Sub3_Sub6 local29 = local17;
			local17 = (Class3_Sub3_Sub6) this.aClass140_43.method3485();
			local29.method6288();
			local29.method6102();
			this.anInt7535 += local17.anInt5706;
		}
		return null;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I")
	public int method6162() {
		return this.anInt7535;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/Object;JZ)V")
	public void method6164(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method6165(arg1, arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BJILjava/lang/Object;)V")
	private void method6165(@OriginalArg(1) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt7543 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6167(arg0);
		this.anInt7535--;
		while (this.anInt7535 < 0) {
			@Pc(32) Class3_Sub3_Sub6 local32 = (Class3_Sub3_Sub6) this.aClass65_10.method1685();
			this.method6172(local32);
		}
		@Pc(47) Class3_Sub3_Sub6_Sub1 local47 = new Class3_Sub3_Sub6_Sub1(arg1, 1);
		this.aClass140_43.method3494(arg0, local47);
		this.aClass65_10.method1686(local47);
		local47.aLong243 = 0L;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method6166(@OriginalArg(0) long arg0) {
		@Pc(18) Class3_Sub3_Sub6 local18 = (Class3_Sub3_Sub6) this.aClass140_43.method3490(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Object local26 = local18.method4737();
		if (local26 == null) {
			local18.method6288();
			local18.method6102();
			this.anInt7535 += local18.anInt5706;
			return null;
		}
		if (local18.method4739()) {
			@Pc(54) Class3_Sub3_Sub6_Sub1 local54 = new Class3_Sub3_Sub6_Sub1(local26, local18.anInt5706);
			this.aClass140_43.method3494(local18.aLong248, local54);
			this.aClass65_10.method1686(local54);
			local54.aLong243 = 0L;
			local18.method6288();
			local18.method6102();
		} else {
			this.aClass65_10.method1686(local18);
			local18.aLong243 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(JB)V")
	private void method6167(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub3_Sub6 local10 = (Class3_Sub3_Sub6) this.aClass140_43.method3490(arg0);
		this.method6172(local10);
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public void method6168() {
		for (@Pc(15) Class3_Sub3_Sub6 local15 = (Class3_Sub3_Sub6) this.aClass65_10.method1684(); local15 != null; local15 = (Class3_Sub3_Sub6) this.aClass65_10.method1688()) {
			if (local15.method4739()) {
				local15.method6288();
				local15.method6102();
				this.anInt7535 += local15.anInt5706;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)I")
	public int method6169() {
		return this.anInt7543;
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)I")
	public int method6170() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub3_Sub6 local13 = (Class3_Sub3_Sub6) this.aClass65_10.method1684(); local13 != null; local13 = (Class3_Sub3_Sub6) this.aClass65_10.method1688()) {
			if (!local13.method4739()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public Object method6171() {
		@Pc(16) Class3_Sub3_Sub6 local16 = (Class3_Sub3_Sub6) this.aClass140_43.method3486();
		while (local16 != null) {
			@Pc(24) Object local24 = local16.method4737();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class3_Sub3_Sub6 local28 = local16;
			local16 = (Class3_Sub3_Sub6) this.aClass140_43.method3485();
			local28.method6288();
			local28.method6102();
			this.anInt7535 += local16.anInt5706;
		}
		return null;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!me;I)V")
	private void method6172(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method6288();
			arg0.method6102();
			this.anInt7535 += arg0.anInt5706;
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	public void method6173(@OriginalArg(1) int arg0) {
		if (Static172.aClass170_1 == null) {
			return;
		}
		for (@Pc(18) Class3_Sub3_Sub6 local18 = (Class3_Sub3_Sub6) this.aClass65_10.method1684(); local18 != null; local18 = (Class3_Sub3_Sub6) this.aClass65_10.method1688()) {
			if (local18.method4739()) {
				if (local18.method4737() == null) {
					local18.method6288();
					local18.method6102();
					this.anInt7535++;
				}
			} else if ((long) arg0 < ++local18.aLong243) {
				@Pc(44) Class3_Sub3_Sub6 local44 = Static172.aClass170_1.method5416(local18);
				this.aClass140_43.method3494(local18.aLong248, local44);
				Static357.method4981(local44, local18);
				local18.method6288();
				local18.method6102();
			}
		}
	}
}
