import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class Class2 {

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "J")
	public long aLong151;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!vd;")
	public Class2 aClass2_217;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!vd;")
	public Class2 aClass2_218;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
	public final boolean method3550() {
		return this.aClass2_217 != null;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public final void method3556() {
		if (this.aClass2_217 != null) {
			this.aClass2_217.aClass2_218 = this.aClass2_218;
			this.aClass2_218.aClass2_217 = this.aClass2_217;
			this.aClass2_218 = null;
			this.aClass2_217 = null;
		}
	}
}
