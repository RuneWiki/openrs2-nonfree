import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class119 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!pha;")
	private Class289 aClass289_1;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Lclient!ik;")
	private final Class182 aClass182_48;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Lclient!ik;")
	private final Class182 aClass182_49;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;)V")
	public Class119(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1) {
		this.aClass182_48 = arg0;
		this.aClass182_49 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lclient!pha;")
	private Class289 method2867() {
		if (this.aClass289_1 == null) {
			this.aClass289_1 = new Class289();
		}
		return this.aClass289_1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!cr;)Lclient!cha;")
	public Interface2 method2869(@OriginalArg(1) Interface3 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) Class390 local12 = arg0.method7510();
		if (Static386.aClass390_8 == local12) {
			return new Class134((Class41) arg0);
		} else if (Static248.aClass390_7 == local12) {
			return new Class283(this.method2867(), (Class171) arg0);
		} else if (Static133.aClass390_5 == local12) {
			return new Class399(this.aClass182_48, (Class227) arg0);
		} else if (local12 == Static562.aClass390_11) {
			return new Class399_Sub1(this.aClass182_48, (Class227_Sub1) arg0);
		} else if (local12 == Static56.aClass390_2) {
			return new Class64_Sub1(this.aClass182_48, this.aClass182_49, (Class104_Sub1) arg0);
		} else if (local12 == Static709.aClass390_13) {
			return new Class64_Sub3(this.aClass182_48, this.aClass182_49, (Class104_Sub3) arg0);
		} else if (local12 == Static624.aClass390_10) {
			return new Class64_Sub2(this.aClass182_48, this.aClass182_49, (Class104_Sub2) arg0);
		} else if (Static601.aClass390_12 == local12) {
			return new Class183(this.aClass182_48, this.aClass182_49, (Class333) arg0);
		} else if (Static9.aClass390_1 == local12) {
			return new Class385(this.aClass182_48, (Class115) arg0);
		} else if (Static184.aClass390_6 == local12) {
			return new Class64_Sub2_Sub1(this.aClass182_48, this.aClass182_49, (Class104_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}
}
