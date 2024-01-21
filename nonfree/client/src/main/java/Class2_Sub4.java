import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!od;")
	public Class2_Sub4 aClass2_Sub4_69;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!od;")
	public Class2_Sub4 aClass2_Sub4_70;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public final void method2853() {
		if (this.aClass2_Sub4_70 != null) {
			this.aClass2_Sub4_70.aClass2_Sub4_69 = this.aClass2_Sub4_69;
			this.aClass2_Sub4_69.aClass2_Sub4_70 = this.aClass2_Sub4_70;
			this.aClass2_Sub4_70 = null;
			this.aClass2_Sub4_69 = null;
		}
	}
}
