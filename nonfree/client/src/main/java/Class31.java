import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class31 {

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!bl;")
	private Class17 aClass17_2 = new Class17();

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!cd;")
	private Class22 aClass22_4;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
	public Class31(@OriginalArg(0) int arg0) {
		this.anInt1059 = arg0;
		this.anInt1056 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass22_4 = new Class22(local14);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	public int method849() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub3 local13 = (Class1_Sub2_Sub3) this.aClass17_2.method469(); local13 != null; local13 = (Class1_Sub2_Sub3) this.aClass17_2.method466()) {
			if (!local13.method4489()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public void method850() {
		for (@Pc(7) Class1_Sub2_Sub3 local7 = (Class1_Sub2_Sub3) this.aClass17_2.method469(); local7 != null; local7 = (Class1_Sub2_Sub3) this.aClass17_2.method466()) {
			if (local7.method4489()) {
				local7.method4534();
				local7.method4509();
				this.anInt1056++;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method851(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method854(arg1);
		if (this.anInt1056 == 0) {
			@Pc(25) Class1_Sub2_Sub3 local25 = (Class1_Sub2_Sub3) this.aClass17_2.method463();
			local25.method4534();
			local25.method4509();
		} else {
			this.anInt1056--;
		}
		@Pc(44) Class1_Sub2_Sub3_Sub2 local44 = new Class1_Sub2_Sub3_Sub2(arg0);
		this.aClass22_4.method643(arg1, local44);
		this.aClass17_2.method462(local44);
		local44.aLong197 = 0L;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method852(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) this.aClass22_4.method633(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(26) Object local26 = local10.method4492();
		if (local26 == null) {
			local10.method4534();
			local10.method4509();
			this.anInt1056++;
			return null;
		}
		if (local10.method4489()) {
			@Pc(52) Class1_Sub2_Sub3_Sub2 local52 = new Class1_Sub2_Sub3_Sub2(local26);
			this.aClass22_4.method643(local10.aLong202, local52);
			this.aClass17_2.method462(local52);
			local52.aLong197 = 0L;
			local10.method4534();
			local10.method4509();
		} else {
			this.aClass17_2.method462(local10);
			local10.aLong197 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)V")
	public void method854(@OriginalArg(1) long arg0) {
		@Pc(12) Class1_Sub2_Sub3 local12 = (Class1_Sub2_Sub3) this.aClass22_4.method633(arg0);
		if (local12 != null) {
			local12.method4534();
			local12.method4509();
			this.anInt1056++;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public void method855() {
		this.aClass17_2.method468();
		this.aClass22_4.method635();
		this.anInt1056 = this.anInt1059;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public void method856(@OriginalArg(0) int arg0) {
		if (Static81.aClass136_1 == null) {
			return;
		}
		for (@Pc(18) Class1_Sub2_Sub3 local18 = (Class1_Sub2_Sub3) this.aClass17_2.method469(); local18 != null; local18 = (Class1_Sub2_Sub3) this.aClass17_2.method466()) {
			if (local18.method4489()) {
				if (local18.method4492() == null) {
					local18.method4534();
					local18.method4509();
					this.anInt1056++;
				}
			} else if ((long) arg0 < ++local18.aLong197) {
				@Pc(63) Class1_Sub2_Sub3 local63 = Static81.aClass136_1.method3961(local18);
				this.aClass22_4.method643(local18.aLong202, local63);
				Static13.method2696(local63, local18);
				local18.method4534();
				local18.method4509();
			}
		}
	}
}
