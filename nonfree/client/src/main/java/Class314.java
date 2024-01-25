import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class314 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "Lclient!ui;")
	private Class295 aClass295_61;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!wda;")
	private Class1 aClass1_276;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class314() {
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!ui;)V")
	public Class314(@OriginalArg(0) Class295 arg0) {
		this.aClass295_61 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Lclient!wda;")
	public Class1 method8056() {
		@Pc(12) Class1 local12 = this.aClass1_276;
		if (local12 == this.aClass295_61.aClass1_260) {
			this.aClass1_276 = null;
			return null;
		} else {
			this.aClass1_276 = local12.aClass1_283;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Lclient!wda;")
	public Class1 method8057() {
		@Pc(8) Class1 local8 = this.aClass295_61.aClass1_260.aClass1_283;
		if (local8 == this.aClass295_61.aClass1_260) {
			this.aClass1_276 = null;
			return null;
		} else {
			this.aClass1_276 = local8.aClass1_283;
			return local8;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ui;I)V")
	public void method8058(@OriginalArg(0) Class295 arg0) {
		this.aClass295_61 = arg0;
	}
}
