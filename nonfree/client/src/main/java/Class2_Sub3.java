import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "J")
	public long aLong295;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!ge;")
	public Class2_Sub3 aClass2_Sub3_68;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!ge;")
	public Class2_Sub3 aClass2_Sub3_69;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public final void method4613() {
		if (this.aClass2_Sub3_69 != null) {
			this.aClass2_Sub3_69.aClass2_Sub3_68 = this.aClass2_Sub3_68;
			this.aClass2_Sub3_68.aClass2_Sub3_69 = this.aClass2_Sub3_69;
			this.aClass2_Sub3_69 = null;
			this.aClass2_Sub3_68 = null;
		}
	}
}
