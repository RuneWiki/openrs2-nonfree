import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class151 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Lclient!mt;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!gga;")
	private final Class124 aClass124_51;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!gga;")
	private final Class124 aClass124_50;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;)V")
	public Class151(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1) {
		this.aClass124_51 = arg0;
		this.aClass124_50 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!wm;B)Lclient!jq;")
	public Interface9 method4177(@OriginalArg(0) Interface27 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) Class148 local18 = arg0.method9592();
		if (local18 == Static262.aClass148_12) {
			return new Class24((Class384) arg0);
		} else if (Static601.aClass148_21 == local18) {
			return new Class297(this.method4179(), (Class198) arg0);
		} else if (Static266.aClass148_13 == local18) {
			return new Class215(this.aClass124_51, (Class226) arg0);
		} else if (Static645.aClass148_20 == local18) {
			return new Class215_Sub1(this.aClass124_51, (Class226_Sub1) arg0);
		} else if (Static553.aClass148_19 == local18) {
			return new Class133_Sub2(this.aClass124_51, this.aClass124_50, (Class139_Sub3) arg0);
		} else if (local18 == Static472.aClass148_17) {
			return new Class133_Sub1(this.aClass124_51, this.aClass124_50, (Class139_Sub1) arg0);
		} else if (Static198.aClass148_9 == local18) {
			return new Class133_Sub3(this.aClass124_51, this.aClass124_50, (Class139_Sub2) arg0);
		} else if (Static135.aClass148_6 == local18) {
			return new Class273(this.aClass124_51, this.aClass124_50, (Class385) arg0);
		} else if (Static92.aClass148_22 == local18) {
			return new Class62(this.aClass124_51, (Class369) arg0);
		} else if (local18 == Static229.aClass148_11) {
			return new Class133_Sub3_Sub1(this.aClass124_51, this.aClass124_50, (Class139_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lclient!mt;")
	private Class238 method4179() {
		if (this.aClass238_1 == null) {
			this.aClass238_1 = new Class238();
		}
		return this.aClass238_1;
	}
}
