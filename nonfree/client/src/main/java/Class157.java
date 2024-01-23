import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class157 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!ea;")
	private Class37 aClass37_13 = new Class37();

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	private int anInt5051;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	private int anInt5053;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!l;")
	private Class101 aClass101_20;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V")
	public Class157(@OriginalArg(0) int arg0) {
		this.anInt5051 = arg0;
		this.anInt5053 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass101_20 = new Class101(local14);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method4026(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method4035(arg0);
		if (this.anInt5053 == 0) {
			@Pc(15) Class2_Sub8_Sub4 local15 = (Class2_Sub8_Sub4) this.aClass37_13.method1146();
			local15.method4743();
			local15.method4686();
		} else {
			this.anInt5053--;
		}
		@Pc(38) Class2_Sub8_Sub4_Sub2 local38 = new Class2_Sub8_Sub4_Sub2(arg1);
		this.aClass101_20.method2860(local38, arg0);
		this.aClass37_13.method1144(local38);
		local38.aLong212 = 0L;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public void method4027() {
		this.aClass37_13.method1141();
		this.aClass101_20.method2869();
		this.anInt5053 = this.anInt5051;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
	public int method4030() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub8_Sub4 local13 = (Class2_Sub8_Sub4) this.aClass37_13.method1139(); local13 != null; local13 = (Class2_Sub8_Sub4) this.aClass37_13.method1145()) {
			if (!local13.method3755()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method4031(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub8_Sub4 local10 = (Class2_Sub8_Sub4) this.aClass101_20.method2867(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(27) Object local27 = local10.method3754();
		if (local27 == null) {
			local10.method4743();
			local10.method4686();
			this.anInt5053++;
			return null;
		}
		if (local10.method3755()) {
			@Pc(53) Class2_Sub8_Sub4_Sub2 local53 = new Class2_Sub8_Sub4_Sub2(local27);
			this.aClass101_20.method2860(local53, local10.aLong214);
			this.aClass37_13.method1144(local53);
			local53.aLong212 = 0L;
			local10.method4743();
			local10.method4686();
		} else {
			this.aClass37_13.method1144(local10);
			local10.aLong212 = 0L;
		}
		return local27;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public void method4033() {
		for (@Pc(12) Class2_Sub8_Sub4 local12 = (Class2_Sub8_Sub4) this.aClass37_13.method1139(); local12 != null; local12 = (Class2_Sub8_Sub4) this.aClass37_13.method1145()) {
			if (local12.method3755()) {
				local12.method4743();
				local12.method4686();
				this.anInt5053++;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
	public void method4034(@OriginalArg(0) int arg0) {
		if (Static46.aClass26_1 == null) {
			return;
		}
		for (@Pc(13) Class2_Sub8_Sub4 local13 = (Class2_Sub8_Sub4) this.aClass37_13.method1139(); local13 != null; local13 = (Class2_Sub8_Sub4) this.aClass37_13.method1145()) {
			if (local13.method3755()) {
				if (local13.method3754() == null) {
					local13.method4743();
					local13.method4686();
					this.anInt5053++;
				}
			} else if ((long) arg0 < ++local13.aLong212) {
				@Pc(59) Class2_Sub8_Sub4 local59 = Static46.aClass26_1.method825(local13);
				this.aClass101_20.method2860(local59, local13.aLong214);
				Static155.method2849(local59, local13);
				local13.method4743();
				local13.method4686();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
	public void method4035(@OriginalArg(1) long arg0) {
		@Pc(19) Class2_Sub8_Sub4 local19 = (Class2_Sub8_Sub4) this.aClass101_20.method2867(arg0);
		if (local19 != null) {
			local19.method4743();
			local19.method4686();
			this.anInt5053++;
		}
	}
}
