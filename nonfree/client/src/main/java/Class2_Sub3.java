import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Lclient!md;")
	public Class2_Sub3 aClass2_Sub3_69;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!md;")
	public Class2_Sub3 aClass2_Sub3_70;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "J")
	public long aLong184;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	public final void method3918() {
		if (this.aClass2_Sub3_70 != null) {
			this.aClass2_Sub3_70.aClass2_Sub3_69 = this.aClass2_Sub3_69;
			this.aClass2_Sub3_69.aClass2_Sub3_70 = this.aClass2_Sub3_70;
			this.aClass2_Sub3_69 = null;
			this.aClass2_Sub3_70 = null;
		}
	}
}
