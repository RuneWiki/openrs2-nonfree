import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class93 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!ki;")
	private Class1 aClass1_81;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!wo;")
	private Class266 aClass266_15;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class93() {
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class93(@OriginalArg(0) Class266 arg0) {
		this.aClass266_15 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)Lclient!ki;")
	public Class1 method1880() {
		@Pc(8) Class1 local8 = this.aClass266_15.aClass1_255.aClass1_261;
		if (this.aClass266_15.aClass1_255 == local8) {
			this.aClass1_81 = null;
			return null;
		} else {
			this.aClass1_81 = local8.aClass1_261;
			return local8;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!wo;)V")
	public void method1881(@OriginalArg(1) Class266 arg0) {
		this.aClass266_15 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lclient!ki;")
	public Class1 method1882() {
		@Pc(6) Class1 local6 = this.aClass1_81;
		if (this.aClass266_15.aClass1_255 == local6) {
			this.aClass1_81 = null;
			return null;
		} else {
			this.aClass1_81 = local6.aClass1_261;
			return local6;
		}
	}
}
