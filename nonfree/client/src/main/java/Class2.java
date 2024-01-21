import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class Class2 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!na;")
	public Class2 aClass2_209;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "J")
	public long aLong241;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!na;")
	public Class2 aClass2_210;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
	public final boolean method2805() {
		return this.aClass2_210 != null;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
	public final void method2808() {
		if (this.aClass2_210 != null) {
			this.aClass2_210.aClass2_209 = this.aClass2_209;
			this.aClass2_209.aClass2_210 = this.aClass2_210;
			this.aClass2_209 = null;
			this.aClass2_210 = null;
		}
	}
}
