import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!je", name = "z", descriptor = "J")
	public long aLong174;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "Lclient!je;")
	public Class1_Sub1 aClass1_Sub1_52;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "Lclient!je;")
	public Class1_Sub1 aClass1_Sub1_53;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public final void method3531() {
		if (this.aClass1_Sub1_53 != null) {
			this.aClass1_Sub1_53.aClass1_Sub1_52 = this.aClass1_Sub1_52;
			this.aClass1_Sub1_52.aClass1_Sub1_53 = this.aClass1_Sub1_53;
			this.aClass1_Sub1_52 = null;
			this.aClass1_Sub1_53 = null;
		}
	}
}
