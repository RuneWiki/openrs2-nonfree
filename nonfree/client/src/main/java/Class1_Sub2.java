import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!lh;")
	public Class1_Sub2 aClass1_Sub2_49;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "J")
	public long aLong156;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "Lclient!lh;")
	public Class1_Sub2 aClass1_Sub2_50;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public final void method3318() {
		if (this.aClass1_Sub2_49 != null) {
			this.aClass1_Sub2_49.aClass1_Sub2_50 = this.aClass1_Sub2_50;
			this.aClass1_Sub2_50.aClass1_Sub2_49 = this.aClass1_Sub2_49;
			this.aClass1_Sub2_49 = null;
			this.aClass1_Sub2_50 = null;
		}
	}
}
