import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class71 {

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!ke;")
	private final Class1_Sub2 aClass1_Sub2_52 = new Class1_Sub2();

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class71() {
		this.aClass1_Sub2_52.aClass1_Sub2_72 = this.aClass1_Sub2_52;
		this.aClass1_Sub2_52.aClass1_Sub2_71 = this.aClass1_Sub2_52;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Lclient!ke;")
	public Class1_Sub2 method2252() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_52.aClass1_Sub2_71;
		return this.aClass1_Sub2_52 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lclient!ke;")
	public Class1_Sub2 method2253() {
		@Pc(12) Class1_Sub2 local12 = this.aClass1_Sub2_52.aClass1_Sub2_71;
		if (local12 == this.aClass1_Sub2_52) {
			return null;
		} else {
			local12.method3072();
			return local12;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ke;)V")
	public void method2254(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_72 != null) {
			arg0.method3072();
		}
		arg0.aClass1_Sub2_72 = this.aClass1_Sub2_52.aClass1_Sub2_72;
		arg0.aClass1_Sub2_71 = this.aClass1_Sub2_52;
		arg0.aClass1_Sub2_72.aClass1_Sub2_71 = arg0;
		arg0.aClass1_Sub2_71.aClass1_Sub2_72 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!ke;)V")
	public void method2255(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_72 != null) {
			arg0.method3072();
		}
		arg0.aClass1_Sub2_72 = this.aClass1_Sub2_52;
		arg0.aClass1_Sub2_71 = this.aClass1_Sub2_52.aClass1_Sub2_71;
		arg0.aClass1_Sub2_72.aClass1_Sub2_71 = arg0;
		arg0.aClass1_Sub2_71.aClass1_Sub2_72 = arg0;
	}
}
