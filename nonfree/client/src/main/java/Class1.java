import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class Class1 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!je;")
	public Class1 aClass1_105;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!je;")
	public Class1 aClass1_106;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "J")
	public long aLong87;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
	public final boolean method2073() {
		return this.aClass1_105 != null;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public final void method2076() {
		if (this.aClass1_105 != null) {
			this.aClass1_105.aClass1_106 = this.aClass1_106;
			this.aClass1_106.aClass1_105 = this.aClass1_105;
			this.aClass1_106 = null;
			this.aClass1_105 = null;
		}
	}
}
