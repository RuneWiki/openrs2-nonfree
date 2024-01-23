import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class172 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Lclient!jo;")
	private Class86 aClass86_9 = new Class86();

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	private int anInt5466;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	private int anInt5469;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Lclient!tm;")
	private Class163 aClass163_36;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
	public Class172(@OriginalArg(0) int arg0) {
		this.anInt5466 = arg0;
		@Pc(11) int local11 = 1;
		this.anInt5469 = arg0;
		while (arg0 > local11 + local11) {
			local11 += local11;
		}
		this.aClass163_36 = new Class163(local11);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method4345(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method4353(arg1);
		if (this.anInt5466 == 0) {
			@Pc(24) Class4_Sub2_Sub8 local24 = (Class4_Sub2_Sub8) this.aClass86_9.method2186();
			local24.method4690();
			local24.method4697();
		} else {
			this.anInt5466--;
		}
		@Pc(35) Class4_Sub2_Sub8_Sub1 local35 = new Class4_Sub2_Sub8_Sub1(arg0);
		this.aClass163_36.method4181(arg1, local35);
		this.aClass86_9.method2185(local35);
		local35.aLong212 = 0L;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public void method4346() {
		for (@Pc(7) Class4_Sub2_Sub8 local7 = (Class4_Sub2_Sub8) this.aClass86_9.method2183(); local7 != null; local7 = (Class4_Sub2_Sub8) this.aClass86_9.method2184()) {
			if (local7.method1817()) {
				local7.method4690();
				local7.method4697();
				this.anInt5466++;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZJ)Ljava/lang/Object;")
	public Object method4347(@OriginalArg(1) long arg0) {
		@Pc(16) Class4_Sub2_Sub8 local16 = (Class4_Sub2_Sub8) this.aClass163_36.method4188(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Object local24 = local16.method1815();
		if (local24 == null) {
			local16.method4690();
			local16.method4697();
			this.anInt5466++;
			return null;
		}
		if (local16.method1817()) {
			@Pc(61) Class4_Sub2_Sub8_Sub1 local61 = new Class4_Sub2_Sub8_Sub1(local24);
			this.aClass163_36.method4181(local16.aLong211, local61);
			this.aClass86_9.method2185(local61);
			local61.aLong212 = 0L;
			local16.method4690();
			local16.method4697();
		} else {
			this.aClass86_9.method2185(local16);
			local16.aLong212 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)I")
	public int method4348() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class4_Sub2_Sub8 local13 = (Class4_Sub2_Sub8) this.aClass86_9.method2183(); local13 != null; local13 = (Class4_Sub2_Sub8) this.aClass86_9.method2184()) {
			if (!local13.method1817()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public void method4349(@OriginalArg(1) int arg0) {
		if (Static245.aClass44_1 == null) {
			return;
		}
		for (@Pc(17) Class4_Sub2_Sub8 local17 = (Class4_Sub2_Sub8) this.aClass86_9.method2183(); local17 != null; local17 = (Class4_Sub2_Sub8) this.aClass86_9.method2184()) {
			if (local17.method1817()) {
				if (local17.method1815() == null) {
					local17.method4690();
					local17.method4697();
					this.anInt5466++;
				}
			} else if (++local17.aLong212 > (long) arg0) {
				@Pc(42) Class4_Sub2_Sub8 local42 = Static245.aClass44_1.method1444(local17);
				this.aClass163_36.method4181(local17.aLong211, local42);
				Static53.method1027(local42, local17);
				local17.method4690();
				local17.method4697();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	public void method4350() {
		this.aClass86_9.method2179();
		this.aClass163_36.method4190();
		this.anInt5466 = this.anInt5469;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IJ)V")
	public void method4353(@OriginalArg(1) long arg0) {
		@Pc(15) Class4_Sub2_Sub8 local15 = (Class4_Sub2_Sub8) this.aClass163_36.method4188(arg0);
		if (local15 != null) {
			local15.method4690();
			local15.method4697();
			this.anInt5466++;
		}
	}
}
