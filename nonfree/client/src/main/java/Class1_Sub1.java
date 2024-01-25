import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "Lclient!tda;")
	public Class1_Sub1 aClass1_Sub1_9;

	@OriginalMember(owner = "client!tda", name = "w", descriptor = "Lclient!tda;")
	public Class1_Sub1 aClass1_Sub1_10;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)V")
	public final void method5645() {
		if (this.aClass1_Sub1_9 != null) {
			this.aClass1_Sub1_9.aClass1_Sub1_10 = this.aClass1_Sub1_10;
			this.aClass1_Sub1_10.aClass1_Sub1_9 = this.aClass1_Sub1_9;
			this.aClass1_Sub1_10 = null;
			this.aClass1_Sub1_9 = null;
		}
	}
}
