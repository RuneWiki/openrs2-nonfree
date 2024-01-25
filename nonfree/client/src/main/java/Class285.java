import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class285 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!ri;")
	public Class285 aClass285_5;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!rc;")
	public Class20_Sub2_Sub4 aClass20_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public void method6515() {
		if (Static4.anInt80 < 500) {
			this.aClass285_5 = Static180.aClass285_4;
			this.aClass20_Sub2_Sub4_1 = null;
			Static4.anInt80++;
			Static180.aClass285_4 = this;
		}
	}
}
