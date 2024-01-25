import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class55 {

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!ut;")
	private Class322 aClass322_1;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!jo;")
	private final Class168 aClass168_21;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!jo;)V")
	public Class55(@OriginalArg(0) Class168 arg0) {
		this.aClass168_21 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Lclient!ut;")
	private Class322 method1369() {
		if (this.aClass322_1 == null) {
			this.aClass322_1 = new Class322();
		}
		return this.aClass322_1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!mc;I)Lclient!wu;")
	public Interface23 method1371(@OriginalArg(0) Interface12 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class271 local11 = arg0.method8097();
		if (Static125.aClass271_2 == local11) {
			return new Class230((Class206) arg0);
		} else if (local11 == Static508.aClass271_8) {
			return new Class287(this.method1369(), (Class197) arg0);
		} else if (Static249.aClass271_4 == local11) {
			return new Class47(this.aClass168_21, (Class177) arg0);
		} else if (Static502.aClass271_7 == local11) {
			return new Class47_Sub1(this.aClass168_21, (Class177_Sub1) arg0);
		} else if (local11 == Static511.aClass271_9) {
			return new Class255_Sub2((Class101_Sub2) arg0);
		} else if (Static260.aClass271_5 == local11) {
			return new Class255_Sub3(this.aClass168_21, (Class101_Sub1) arg0);
		} else if (local11 == Static47.aClass271_1) {
			return new Class255_Sub1(this.aClass168_21, (Class101_Sub3) arg0);
		} else if (Static451.aClass271_6 == local11) {
			return new Class347((Class189) arg0);
		} else if (local11 == Static224.aClass271_3) {
			return new Class256(this.aClass168_21, (Class292) arg0);
		} else {
			return null;
		}
	}
}
