import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class71 {

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!cf;")
	private final Class2_Sub2 aClass2_Sub2_53 = new Class2_Sub2();

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class71() {
		this.aClass2_Sub2_53.aClass2_Sub2_62 = this.aClass2_Sub2_53;
		this.aClass2_Sub2_53.aClass2_Sub2_61 = this.aClass2_Sub2_53;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!cf;)V")
	public void method2229(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_61 != null) {
			arg0.method3026();
		}
		arg0.aClass2_Sub2_62 = this.aClass2_Sub2_53.aClass2_Sub2_62;
		arg0.aClass2_Sub2_61 = this.aClass2_Sub2_53;
		arg0.aClass2_Sub2_61.aClass2_Sub2_62 = arg0;
		arg0.aClass2_Sub2_62.aClass2_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lclient!cf;")
	public Class2_Sub2 method2230() {
		@Pc(3) Class2_Sub2 local3 = this.aClass2_Sub2_53.aClass2_Sub2_62;
		if (local3 == this.aClass2_Sub2_53) {
			return null;
		} else {
			local3.method3026();
			return local3;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(ILclient!cf;)V")
	public void method2231(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_61 != null) {
			arg0.method3026();
		}
		arg0.aClass2_Sub2_62 = this.aClass2_Sub2_53;
		arg0.aClass2_Sub2_61 = this.aClass2_Sub2_53.aClass2_Sub2_61;
		arg0.aClass2_Sub2_61.aClass2_Sub2_62 = arg0;
		arg0.aClass2_Sub2_62.aClass2_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Lclient!cf;")
	public Class2_Sub2 method2233() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_53.aClass2_Sub2_62;
		return this.aClass2_Sub2_53 == local7 ? null : local7;
	}
}
