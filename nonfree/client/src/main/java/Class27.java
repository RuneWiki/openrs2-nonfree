import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class27 {

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!lb;")
	private final Class1_Sub1 aClass1_Sub1_30 = new Class1_Sub1();

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class27() {
		this.aClass1_Sub1_30.aClass1_Sub1_70 = this.aClass1_Sub1_30;
		this.aClass1_Sub1_30.aClass1_Sub1_69 = this.aClass1_Sub1_30;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Lclient!lb;")
	public Class1_Sub1 method1339() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_30.aClass1_Sub1_69;
		return local7 == this.aClass1_Sub1_30 ? null : local7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!lb;)V")
	public void method1340(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_70 != null) {
			arg0.method3503();
		}
		arg0.aClass1_Sub1_69 = this.aClass1_Sub1_30;
		arg0.aClass1_Sub1_70 = this.aClass1_Sub1_30.aClass1_Sub1_70;
		arg0.aClass1_Sub1_70.aClass1_Sub1_69 = arg0;
		arg0.aClass1_Sub1_69.aClass1_Sub1_70 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Lclient!lb;")
	public Class1_Sub1 method1341() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_30.aClass1_Sub1_69;
		if (this.aClass1_Sub1_30 == local7) {
			return null;
		} else {
			local7.method3503();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(ILclient!lb;)V")
	public void method1342(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_70 != null) {
			arg0.method3503();
		}
		arg0.aClass1_Sub1_69 = this.aClass1_Sub1_30.aClass1_Sub1_69;
		arg0.aClass1_Sub1_70 = this.aClass1_Sub1_30;
		arg0.aClass1_Sub1_70.aClass1_Sub1_69 = arg0;
		arg0.aClass1_Sub1_69.aClass1_Sub1_70 = arg0;
	}
}
