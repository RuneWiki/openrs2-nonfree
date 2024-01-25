import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class141 {

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!is;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_62;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!pl;")
	private final Class259 aClass259_61;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;)V")
	public Class141(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1) {
		this.aClass259_62 = arg0;
		this.aClass259_61 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLclient!oc;)Lclient!ica;")
	public Interface12 method3289(@OriginalArg(1) Interface19 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class357 local11 = arg0.method7127();
		if (Static459.aClass357_12 == local11) {
			return new Class61((Class321) arg0);
		} else if (Static259.aClass357_7 == local11) {
			return new Class275(this.method3292(), (Class179) arg0);
		} else if (Static92.aClass357_1 == local11) {
			return new Class18(this.aClass259_62, (Class178) arg0);
		} else if (local11 == Static375.aClass357_10) {
			return new Class18_Sub1(this.aClass259_62, (Class178_Sub1) arg0);
		} else if (Static95.aClass357_2 == local11) {
			return new Class210_Sub1(this.aClass259_62, this.aClass259_61, (Class9_Sub3) arg0);
		} else if (Static543.aClass357_13 == local11) {
			return new Class210_Sub3(this.aClass259_62, this.aClass259_61, (Class9_Sub2) arg0);
		} else if (local11 == Static362.aClass357_9) {
			return new Class210_Sub2(this.aClass259_62, this.aClass259_61, (Class9_Sub1) arg0);
		} else if (local11 == Static161.aClass357_3) {
			return new Class212(this.aClass259_62, this.aClass259_61, (Class233) arg0);
		} else if (Static172.aClass357_4 == local11) {
			return new Class117(this.aClass259_62, (Class222) arg0);
		} else if (Static185.aClass357_14 == local11) {
			return new Class210_Sub2_Sub1(this.aClass259_62, this.aClass259_61, (Class9_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Lclient!is;")
	private Class165 method3292() {
		if (this.aClass165_1 == null) {
			this.aClass165_1 = new Class165();
		}
		return this.aClass165_1;
	}
}
