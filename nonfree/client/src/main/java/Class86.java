import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class86 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!bs;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!pe;")
	private final Class254 aClass254_31;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!pe;")
	private final Class254 aClass254_30;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;)V")
	public Class86(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1) {
		this.aClass254_31 = arg1;
		this.aClass254_30 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!kr;I)Lclient!n;")
	public Interface11 method2384(@OriginalArg(0) Interface8 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class103 local11 = arg0.method7774();
		if (local11 == Static501.aClass103_9) {
			return new Class215((Class283) arg0);
		} else if (local11 == Static333.aClass103_4) {
			return new Class229(this.method2385(), (Class68) arg0);
		} else if (local11 == Static496.aClass103_8) {
			return new Class14(this.aClass254_30, (Class284) arg0);
		} else if (Static366.aClass103_5 == local11) {
			return new Class14_Sub1(this.aClass254_30, (Class284_Sub1) arg0);
		} else if (local11 == Static244.aClass103_3) {
			return new Class88_Sub2(this.aClass254_30, this.aClass254_31, (Class260_Sub2) arg0);
		} else if (local11 == Static30.aClass103_2) {
			return new Class88_Sub3(this.aClass254_30, this.aClass254_31, (Class260_Sub3) arg0);
		} else if (local11 == Static5.aClass103_1) {
			return new Class88_Sub1(this.aClass254_30, this.aClass254_31, (Class260_Sub1) arg0);
		} else if (local11 == Static595.aClass103_10) {
			return new Class42(this.aClass254_30, this.aClass254_31, (Class72) arg0);
		} else if (local11 == Static429.aClass103_6) {
			return new Class338(this.aClass254_30, (Class67) arg0);
		} else if (local11 == Static496.aClass103_7) {
			return new Class88_Sub1_Sub1(this.aClass254_30, this.aClass254_31, (Class260_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lclient!bs;")
	private Class36 method2385() {
		if (this.aClass36_1 == null) {
			this.aClass36_1 = new Class36();
		}
		return this.aClass36_1;
	}
}
