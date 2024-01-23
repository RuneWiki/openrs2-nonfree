import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!w;")
	public Class1_Sub2 aClass1_Sub2_68;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "J")
	public long aLong201;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Lclient!w;")
	public Class1_Sub2 aClass1_Sub2_69;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public final void method4347() {
		if (this.aClass1_Sub2_69 != null) {
			this.aClass1_Sub2_69.aClass1_Sub2_68 = this.aClass1_Sub2_68;
			this.aClass1_Sub2_68.aClass1_Sub2_69 = this.aClass1_Sub2_69;
			this.aClass1_Sub2_68 = null;
			this.aClass1_Sub2_69 = null;
		}
	}
}
