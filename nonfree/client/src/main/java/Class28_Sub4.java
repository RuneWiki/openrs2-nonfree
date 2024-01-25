import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!je;")
	public Class28_Sub4 aClass28_Sub4_9;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!je;")
	public Class28_Sub4 aClass28_Sub4_10;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	public final void method8430() {
		if (this.aClass28_Sub4_10 != null) {
			this.aClass28_Sub4_10.aClass28_Sub4_9 = this.aClass28_Sub4_9;
			this.aClass28_Sub4_9.aClass28_Sub4_10 = this.aClass28_Sub4_10;
			this.aClass28_Sub4_10 = null;
			this.aClass28_Sub4_9 = null;
		}
	}
}
