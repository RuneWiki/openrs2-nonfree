import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class Class1 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "J")
	public long aLong148;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!o;")
	public Class1 aClass1_215;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!o;")
	public Class1 aClass1_216;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public final void method3134() {
		if (this.aClass1_216 != null) {
			this.aClass1_216.aClass1_215 = this.aClass1_215;
			this.aClass1_215.aClass1_216 = this.aClass1_216;
			this.aClass1_215 = null;
			this.aClass1_216 = null;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z")
	public final boolean method3137() {
		return this.aClass1_216 != null;
	}
}
