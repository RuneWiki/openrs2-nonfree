import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class76 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Lclient!mh;")
	private Class1 aClass1_104;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "Lclient!tc;")
	private Class195 aClass195_19;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!tc;)V")
	public Class76(@OriginalArg(0) Class195 arg0) {
		this.aClass195_19 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!tc;)V")
	public void method2084(@OriginalArg(1) Class195 arg0) {
		this.aClass195_19 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)Lclient!mh;")
	public Class1 method2085() {
		@Pc(11) Class1 local11 = this.aClass1_104;
		if (this.aClass195_19.aClass1_207 == local11) {
			this.aClass1_104 = null;
			return null;
		} else {
			this.aClass1_104 = local11.aClass1_247;
			return local11;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lclient!mh;")
	public Class1 method2087() {
		@Pc(15) Class1 local15 = this.aClass195_19.aClass1_207.aClass1_247;
		if (local15 == this.aClass195_19.aClass1_207) {
			this.aClass1_104 = null;
			return null;
		} else {
			this.aClass1_104 = local15.aClass1_247;
			return local15;
		}
	}
}
