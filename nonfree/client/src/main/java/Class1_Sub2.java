import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "J")
	public long aLong197;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Lclient!vg;")
	public Class1_Sub2 aClass1_Sub2_68;

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "Lclient!vg;")
	public Class1_Sub2 aClass1_Sub2_69;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
	public final void method4509() {
		if (this.aClass1_Sub2_69 != null) {
			this.aClass1_Sub2_69.aClass1_Sub2_68 = this.aClass1_Sub2_68;
			this.aClass1_Sub2_68.aClass1_Sub2_69 = this.aClass1_Sub2_69;
			this.aClass1_Sub2_68 = null;
			this.aClass1_Sub2_69 = null;
		}
	}
}
