import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class228 {

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "Lclient!eo;")
	private Class92 aClass92_2;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "Lclient!pu;")
	private final Class270 aClass270_65;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!pu;")
	private final Class270 aClass270_64;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;)V")
	public Class228(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1) {
		this.aClass270_65 = arg0;
		this.aClass270_64 = arg1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)Lclient!eo;")
	private Class92 method4666() {
		if (this.aClass92_2 == null) {
			this.aClass92_2 = new Class92();
		}
		return this.aClass92_2;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!waa;B)Lclient!kba;")
	public Interface12 method4667(@OriginalArg(0) Interface24 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class297 local11 = arg0.method7306();
		if (local11 == Static1.aClass297_1) {
			return new Class212((Class56) arg0);
		} else if (local11 == Static393.aClass297_12) {
			return new Class48(this.method4666(), (Class233) arg0);
		} else if (Static31.aClass297_3 == local11) {
			return new Class28(this.aClass270_65, (Class97) arg0);
		} else if (local11 == Static5.aClass297_2) {
			return new Class28_Sub1(this.aClass270_65, (Class97_Sub1) arg0);
		} else if (local11 == Static192.aClass297_9) {
			return new Class72_Sub2(this.aClass270_65, this.aClass270_64, (Class54_Sub3) arg0);
		} else if (local11 == Static157.aClass297_8) {
			return new Class72_Sub3(this.aClass270_65, this.aClass270_64, (Class54_Sub1) arg0);
		} else if (Static331.aClass297_10 == local11) {
			return new Class72_Sub1(this.aClass270_65, this.aClass270_64, (Class54_Sub2) arg0);
		} else if (Static157.aClass297_7 == local11) {
			return new Class148(this.aClass270_65, this.aClass270_64, (Class267) arg0);
		} else if (local11 == Static488.aClass297_6) {
			return new Class116(this.aClass270_65, (Class332) arg0);
		} else if (local11 == Static364.aClass297_11) {
			return new Class72_Sub1_Sub1(this.aClass270_65, this.aClass270_64, (Class54_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}
}
