import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class364 {

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!kv;")
	private Class178 aClass178_2;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!vd;")
	private final Class353 aClass353_133;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_134;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;)V")
	public Class364(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1) {
		this.aClass353_133 = arg1;
		this.aClass353_134 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)Lclient!kv;")
	private Class178 method8516() {
		if (this.aClass178_2 == null) {
			this.aClass178_2 = new Class178();
		}
		return this.aClass178_2;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tb;Z)Lclient!qd;")
	public Interface21 method8517(@OriginalArg(0) Interface24 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class152 local11 = arg0.method5661();
		if (local11 == Static552.aClass152_11) {
			return new Class26((Class175) arg0);
		} else if (Static59.aClass152_2 == local11) {
			return new Class308(this.method8516(), (Class141) arg0);
		} else if (Static378.aClass152_8 == local11) {
			return new Class13(this.aClass353_134, (Class167) arg0);
		} else if (Static83.aClass152_3 == local11) {
			return new Class13_Sub1(this.aClass353_134, (Class167_Sub1) arg0);
		} else if (local11 == Static148.aClass152_4) {
			return new Class4_Sub2(this.aClass353_134, this.aClass353_133, (Class22_Sub3) arg0);
		} else if (Static615.aClass152_10 == local11) {
			return new Class4_Sub3(this.aClass353_134, this.aClass353_133, (Class22_Sub2) arg0);
		} else if (Static30.aClass152_7 == local11) {
			return new Class4_Sub1(this.aClass353_134, this.aClass353_133, (Class22_Sub1) arg0);
		} else if (local11 == Static194.aClass152_6) {
			return new Class316(this.aClass353_134, this.aClass353_133, (Class182) arg0);
		} else if (local11 == Static614.aClass152_12) {
			return new Class288(this.aClass353_134, (Class124) arg0);
		} else if (local11 == Static193.aClass152_5) {
			return new Class4_Sub1_Sub1(this.aClass353_134, this.aClass353_133, (Class22_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
