import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!na", name = "s", descriptor = "J")
	public long aLong198;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!na;")
	public Class1_Sub2 aClass1_Sub2_68;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!na;")
	public Class1_Sub2 aClass1_Sub2_69;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public final void method4661() {
		if (this.aClass1_Sub2_69 != null) {
			this.aClass1_Sub2_69.aClass1_Sub2_68 = this.aClass1_Sub2_68;
			this.aClass1_Sub2_68.aClass1_Sub2_69 = this.aClass1_Sub2_69;
			this.aClass1_Sub2_69 = null;
			this.aClass1_Sub2_68 = null;
		}
	}
}
