import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class107 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!fb;")
	private Class106 aClass106_1;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!gda;")
	private final Class126 aClass126_84;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!gda;")
	private final Class126 aClass126_83;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;)V")
	public Class107(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1) {
		this.aClass126_84 = arg1;
		this.aClass126_83 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!al;)Lclient!bka;")
	public Interface5 method2732(@OriginalArg(1) Interface3 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) Class392 local12 = arg0.method8802();
		if (local12 == Static20.aClass392_1) {
			return new Class267((Class253) arg0);
		} else if (local12 == Static183.aClass392_2) {
			return new Class350(this.method2734(), (Class88) arg0);
		} else if (Static626.aClass392_8 == local12) {
			return new Class89(this.aClass126_83, (Class91) arg0);
		} else if (Static186.aClass392_3 == local12) {
			return new Class89_Sub1(this.aClass126_83, (Class91_Sub1) arg0);
		} else if (Static348.aClass392_4 == local12) {
			return new Class46_Sub3(this.aClass126_83, this.aClass126_84, (Class132_Sub3) arg0);
		} else if (local12 == Static439.aClass392_6) {
			return new Class46_Sub1(this.aClass126_83, this.aClass126_84, (Class132_Sub2) arg0);
		} else if (local12 == Static678.aClass392_10) {
			return new Class46_Sub2(this.aClass126_83, this.aClass126_84, (Class132_Sub1) arg0);
		} else if (local12 == Static577.aClass392_7) {
			return new Class266(this.aClass126_83, this.aClass126_84, (Class178) arg0);
		} else if (local12 == Static428.aClass392_5) {
			return new Class375(this.aClass126_83, (Class292) arg0);
		} else if (local12 == Static645.aClass392_9) {
			return new Class46_Sub2_Sub1(this.aClass126_83, this.aClass126_84, (Class132_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lclient!fb;")
	private Class106 method2734() {
		if (this.aClass106_1 == null) {
			this.aClass106_1 = new Class106();
		}
		return this.aClass106_1;
	}
}
