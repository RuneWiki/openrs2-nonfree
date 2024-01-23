import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class Class2 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!lf;")
	public Class2 aClass2_219;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "J")
	public long aLong188;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "Lclient!lf;")
	public Class2 aClass2_220;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z")
	public final boolean method3977() {
		return this.aClass2_220 != null;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public final void method3986() {
		if (this.aClass2_220 != null) {
			this.aClass2_220.aClass2_219 = this.aClass2_219;
			this.aClass2_219.aClass2_220 = this.aClass2_220;
			this.aClass2_219 = null;
			this.aClass2_220 = null;
		}
	}
}
