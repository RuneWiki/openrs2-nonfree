import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UXRJCYSS")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!UXRJCYSS", name = "h", descriptor = "Lclient!UXRJCYSS;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!UXRJCYSS", name = "i", descriptor = "Lclient!UXRJCYSS;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!UXRJCYSS", name = "g", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!UXRJCYSS", name = "b", descriptor = "()V")
	public final void method508() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
