import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class Class2 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!o;")
	public Class2 aClass2_115;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "J")
	public long aLong91;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!o;")
	public Class2 aClass2_116;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
	public final boolean method1958() {
		return this.aClass2_116 != null;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public final void method1961() {
		if (this.aClass2_116 != null) {
			this.aClass2_116.aClass2_115 = this.aClass2_115;
			this.aClass2_115.aClass2_116 = this.aClass2_116;
			this.aClass2_116 = null;
			this.aClass2_115 = null;
		}
	}
}
