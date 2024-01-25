import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class92 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!tv;")
	private Class4 aClass4_59;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!au;")
	private Class22 aClass22_17;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class92() {
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!au;)V")
	public Class92(@OriginalArg(0) Class22 arg0) {
		this.aClass22_17 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)Lclient!tv;")
	public Class4 method2165() {
		@Pc(8) Class4 local8 = this.aClass22_17.aClass4_13.aClass4_286;
		if (this.aClass22_17.aClass4_13 == local8) {
			this.aClass4_59 = null;
			return null;
		} else {
			this.aClass4_59 = local8.aClass4_286;
			return local8;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!au;B)V")
	public void method2166(@OriginalArg(0) Class22 arg0) {
		this.aClass22_17 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)Lclient!tv;")
	public Class4 method2168() {
		@Pc(14) Class4 local14 = this.aClass4_59;
		if (this.aClass22_17.aClass4_13 == local14) {
			this.aClass4_59 = null;
			return null;
		} else {
			this.aClass4_59 = local14.aClass4_286;
			return local14;
		}
	}
}
