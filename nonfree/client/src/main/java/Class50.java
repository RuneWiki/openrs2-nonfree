import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class50 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Lclient!eb;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!gk;")
	private Class1 aClass1_85;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class50(@OriginalArg(0) Class42 arg0) {
		this.aClass42_8 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Lclient!gk;")
	public Class1 method1690() {
		@Pc(12) Class1 local12 = this.aClass42_8.aClass1_73.aClass1_251;
		if (local12 == this.aClass42_8.aClass1_73) {
			this.aClass1_85 = null;
			return null;
		} else {
			this.aClass1_85 = local12.aClass1_251;
			return local12;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)Lclient!gk;")
	public Class1 method1691() {
		@Pc(6) Class1 local6 = this.aClass1_85;
		if (this.aClass42_8.aClass1_73 == local6) {
			this.aClass1_85 = null;
			return null;
		} else {
			this.aClass1_85 = local6.aClass1_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!eb;B)V")
	public void method1693(@OriginalArg(0) Class42 arg0) {
		this.aClass42_8 = arg0;
	}
}
