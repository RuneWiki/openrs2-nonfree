import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class Class1 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!jp;")
	public Class1 aClass1_263;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "Lclient!jp;")
	public Class1 aClass1_264;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "J")
	public long aLong228;

	static {
		new Class65("", 76);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)Z")
	public final boolean method6175() {
		return this.aClass1_263 != null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public final void method6178() {
		if (this.aClass1_263 != null) {
			this.aClass1_263.aClass1_264 = this.aClass1_264;
			this.aClass1_264.aClass1_263 = this.aClass1_263;
			this.aClass1_263 = null;
			this.aClass1_264 = null;
		}
	}
}
