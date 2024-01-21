import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class Class2 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!se;")
	public Class2 aClass2_207;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!se;")
	public Class2 aClass2_208;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "J")
	public long aLong139;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public final void method2705() {
		if (this.aClass2_208 != null) {
			this.aClass2_208.aClass2_207 = this.aClass2_207;
			this.aClass2_207.aClass2_208 = this.aClass2_208;
			this.aClass2_208 = null;
			this.aClass2_207 = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
	public final boolean method2707() {
		return this.aClass2_208 != null;
	}
}
