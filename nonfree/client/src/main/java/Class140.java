import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class140 {

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!ad;")
	private final Class4 aClass4_6 = new Class4();

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private final int anInt4133;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	private int anInt4139;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!br;")
	private final Class26 aClass26_22;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
	public Class140(@OriginalArg(0) int arg0) {
		this.anInt4133 = arg0;
		this.anInt4139 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass26_22 = new Class26(local14);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method3813() {
		for (@Pc(5) Class1_Sub1_Sub6 local5 = (Class1_Sub1_Sub6) this.aClass4_6.method177(); local5 != null; local5 = (Class1_Sub1_Sub6) this.aClass4_6.method182()) {
			if (local5.method3232()) {
				local5.method5710();
				local5.method5564();
				this.anInt4139++;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I")
	public int method3814() {
		return this.anInt4139;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method3816(@OriginalArg(1) long arg0) {
		@Pc(16) Class1_Sub1_Sub6 local16 = (Class1_Sub1_Sub6) this.aClass26_22.method870(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Object local24 = local16.method3235();
		if (local24 == null) {
			local16.method5710();
			local16.method5564();
			this.anInt4139++;
			return null;
		}
		if (local16.method3232()) {
			@Pc(49) Class1_Sub1_Sub6_Sub1 local49 = new Class1_Sub1_Sub6_Sub1(local24);
			this.aClass26_22.method877(local16.aLong215, local49);
			this.aClass4_6.method180(local49);
			local49.aLong208 = 0L;
			local16.method5710();
			local16.method5564();
		} else {
			this.aClass4_6.method180(local16);
			local16.aLong208 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(JBLjava/lang/Object;)V")
	public void method3817(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method3821(arg0);
		if (this.anInt4139 == 0) {
			@Pc(16) Class1_Sub1_Sub6 local16 = (Class1_Sub1_Sub6) this.aClass4_6.method183();
			local16.method5710();
			local16.method5564();
		} else {
			this.anInt4139--;
		}
		@Pc(35) Class1_Sub1_Sub6_Sub1 local35 = new Class1_Sub1_Sub6_Sub1(arg1);
		this.aClass26_22.method877(arg0, local35);
		this.aClass4_6.method180(local35);
		local35.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method3818() {
		@Pc(9) Class1_Sub1_Sub6 local9 = (Class1_Sub1_Sub6) this.aClass26_22.method871();
		while (local9 != null) {
			@Pc(20) Object local20 = local9.method3235();
			if (local20 != null) {
				return local20;
			}
			@Pc(26) Class1_Sub1_Sub6 local26 = local9;
			local9 = (Class1_Sub1_Sub6) this.aClass26_22.method878();
			local26.method5710();
			local26.method5564();
			this.anInt4139++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	public void method3819() {
		this.aClass4_6.method179();
		this.aClass26_22.method876();
		this.anInt4139 = this.anInt4133;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
	public int method3820() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub1_Sub6 local13 = (Class1_Sub1_Sub6) this.aClass4_6.method177(); local13 != null; local13 = (Class1_Sub1_Sub6) this.aClass4_6.method182()) {
			if (!local13.method3232()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(JB)V")
	private void method3821(@OriginalArg(0) long arg0) {
		@Pc(19) Class1_Sub1_Sub6 local19 = (Class1_Sub1_Sub6) this.aClass26_22.method870(arg0);
		if (local19 != null) {
			local19.method5710();
			local19.method5564();
			this.anInt4139++;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public void method3824(@OriginalArg(0) int arg0) {
		if (Static62.aClass160_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub1_Sub6 local13 = (Class1_Sub1_Sub6) this.aClass4_6.method177(); local13 != null; local13 = (Class1_Sub1_Sub6) this.aClass4_6.method182()) {
			if (local13.method3232()) {
				if (local13.method3235() == null) {
					local13.method5710();
					local13.method5564();
					this.anInt4139++;
				}
			} else if (++local13.aLong208 > (long) arg0) {
				@Pc(53) Class1_Sub1_Sub6 local53 = Static62.aClass160_1.method4427(local13);
				this.aClass26_22.method877(local13.aLong215, local53);
				Static79.method3437(local53, local13);
				local13.method5710();
				local13.method5564();
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)I")
	public int method3825() {
		return this.anInt4133;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3827() {
		@Pc(17) Class1_Sub1_Sub6 local17 = (Class1_Sub1_Sub6) this.aClass26_22.method878();
		while (local17 != null) {
			@Pc(25) Object local25 = local17.method3235();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class1_Sub1_Sub6 local29 = local17;
			local17 = (Class1_Sub1_Sub6) this.aClass26_22.method878();
			local29.method5710();
			local29.method5564();
			this.anInt4139++;
		}
		return null;
	}
}
