import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class279 {

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "I")
	private final int anInt7907;

	@OriginalMember(owner = "client!pja", name = "j", descriptor = "I")
	private int anInt7914;

	@OriginalMember(owner = "client!pja", name = "l", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_6;

	@OriginalMember(owner = "client!pja", name = "r", descriptor = "Lclient!cja;")
	private final Class62 aClass62_34;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(I)V")
	public Class279(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(II)V")
	public Class279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass258_6 = new Class258();
		this.anInt7914 = arg0;
		this.anInt7907 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass62_34 = new Class62(local14);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)I")
	public int method6628() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub6_Sub3 local13 = (Class3_Sub6_Sub3) this.aClass258_6.method5934(); local13 != null; local13 = (Class3_Sub6_Sub3) this.aClass258_6.method5929()) {
			if (!local13.method7028()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(B)I")
	public int method6629() {
		return this.anInt7907;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
	public void method6630(@OriginalArg(0) int arg0) {
		if (Static66.aClass304_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub6_Sub3 local13 = (Class3_Sub6_Sub3) this.aClass258_6.method5934(); local13 != null; local13 = (Class3_Sub6_Sub3) this.aClass258_6.method5929()) {
			if (local13.method7028()) {
				if (local13.method7027() == null) {
					local13.method8770();
					local13.method8342();
					this.anInt7914 += local13.anInt8306;
				}
			} else if ((long) arg0 < ++local13.aLong290) {
				@Pc(35) Class3_Sub6_Sub3 local35 = Static66.aClass304_1.method8670(local13);
				this.aClass62_34.method1686(local13.aLong309, local35);
				Static58.method1431(local13, local35);
				local13.method8770();
				local13.method8342();
			}
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method6631(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub6_Sub3 local10 = (Class3_Sub6_Sub3) this.aClass62_34.method1682(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method7027();
		if (local18 == null) {
			local10.method8770();
			local10.method8342();
			this.anInt7914 += local10.anInt8306;
			return null;
		}
		if (local10.method7028()) {
			@Pc(52) Class3_Sub6_Sub3_Sub2 local52 = new Class3_Sub6_Sub3_Sub2(local18, local10.anInt8306);
			this.aClass62_34.method1686(local10.aLong309, local52);
			this.aClass258_6.method5936(local52);
			local52.aLong290 = 0L;
			local10.method8770();
			local10.method8342();
		} else {
			this.aClass258_6.method5936(local10);
			local10.aLong290 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
	public void method6632(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) long arg2) {
		if (this.anInt7907 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method6636(arg2);
		this.anInt7914 -= arg0;
		while (this.anInt7914 < 0) {
			@Pc(38) Class3_Sub6_Sub3 local38 = (Class3_Sub6_Sub3) this.aClass258_6.method5931();
			this.method6639(local38);
		}
		@Pc(51) Class3_Sub6_Sub3_Sub2 local51 = new Class3_Sub6_Sub3_Sub2(arg1, arg0);
		this.aClass62_34.method1686(arg2, local51);
		this.aClass258_6.method5936(local51);
		local51.aLong290 = 0L;
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method6633() {
		@Pc(19) Class3_Sub6_Sub3 local19 = (Class3_Sub6_Sub3) this.aClass62_34.method1681();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method7027();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class3_Sub6_Sub3 local29 = local19;
			local19 = (Class3_Sub6_Sub3) this.aClass62_34.method1681();
			local29.method8770();
			local29.method8342();
			this.anInt7914 += local29.anInt8306;
		}
		return null;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(Z)I")
	public int method6634() {
		return this.anInt7914;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method6635(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method6632(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(JI)V")
	private void method6636(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub6_Sub3 local10 = (Class3_Sub6_Sub3) this.aClass62_34.method1682(arg0);
		this.method6639(local10);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
	public void method6637() {
		for (@Pc(7) Class3_Sub6_Sub3 local7 = (Class3_Sub6_Sub3) this.aClass258_6.method5934(); local7 != null; local7 = (Class3_Sub6_Sub3) this.aClass258_6.method5929()) {
			if (local7.method7028()) {
				local7.method8770();
				local7.method8342();
				this.anInt7914 += local7.anInt8306;
			}
		}
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)V")
	public void method6638() {
		this.aClass258_6.method5933();
		this.aClass62_34.method1683();
		this.anInt7914 = this.anInt7907;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Lclient!caa;I)V")
	private void method6639(@OriginalArg(0) Class3_Sub6_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8770();
			arg0.method8342();
			this.anInt7914 += arg0.anInt8306;
		}
	}

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method6640() {
		@Pc(11) Class3_Sub6_Sub3 local11 = (Class3_Sub6_Sub3) this.aClass62_34.method1680();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7027();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub6_Sub3 local23 = local11;
			local11 = (Class3_Sub6_Sub3) this.aClass62_34.method1681();
			local23.method8770();
			local23.method8342();
			this.anInt7914 += local23.anInt8306;
		}
		return null;
	}
}
