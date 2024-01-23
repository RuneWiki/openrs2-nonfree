import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class124 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Lclient!qm;")
	private Class1_Sub2 aClass1_Sub2_42;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Lclient!tg;")
	private Class170 aClass170_7;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLclient!tg;)V")
	public void method3166(@OriginalArg(1) Class170 arg0) {
		this.aClass170_7 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lclient!qm;")
	public Class1_Sub2 method3167() {
		@Pc(4) Class1_Sub2 local4 = this.aClass170_7.aClass1_Sub2_64.aClass1_Sub2_75;
		if (local4 == this.aClass170_7.aClass1_Sub2_64) {
			this.aClass1_Sub2_42 = null;
			return null;
		} else {
			this.aClass1_Sub2_42 = local4.aClass1_Sub2_75;
			return local4;
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)Lclient!qm;")
	public Class1_Sub2 method3168() {
		@Pc(6) Class1_Sub2 local6 = this.aClass1_Sub2_42;
		if (local6 == this.aClass170_7.aClass1_Sub2_64) {
			this.aClass1_Sub2_42 = null;
			return null;
		} else {
			this.aClass1_Sub2_42 = local6.aClass1_Sub2_75;
			return local6;
		}
	}
}
