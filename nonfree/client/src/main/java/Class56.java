import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class56 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!qb;")
	private final Class2_Sub2 aClass2_Sub2_48 = new Class2_Sub2();

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass2_Sub2_48.aClass2_Sub2_65 = this.aClass2_Sub2_48;
		this.aClass2_Sub2_48.aClass2_Sub2_66 = this.aClass2_Sub2_48;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Lclient!qb;")
	public Class2_Sub2 method1285() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_48.aClass2_Sub2_65;
		return this.aClass2_Sub2_48 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lclient!qb;")
	public Class2_Sub2 method1286() {
		@Pc(3) Class2_Sub2 local3 = this.aClass2_Sub2_48.aClass2_Sub2_65;
		if (local3 == this.aClass2_Sub2_48) {
			return null;
		} else {
			local3.method1935();
			return local3;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!qb;)V")
	public void method1287(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method1935();
		}
		arg0.aClass2_Sub2_66 = this.aClass2_Sub2_48.aClass2_Sub2_66;
		arg0.aClass2_Sub2_65 = this.aClass2_Sub2_48;
		arg0.aClass2_Sub2_66.aClass2_Sub2_65 = arg0;
		arg0.aClass2_Sub2_65.aClass2_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(ILclient!qb;)V")
	public void method1288(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method1935();
		}
		arg0.aClass2_Sub2_66 = this.aClass2_Sub2_48;
		arg0.aClass2_Sub2_65 = this.aClass2_Sub2_48.aClass2_Sub2_65;
		arg0.aClass2_Sub2_66.aClass2_Sub2_65 = arg0;
		arg0.aClass2_Sub2_65.aClass2_Sub2_66 = arg0;
	}
}
