import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class Class2 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!te;")
	public Class2 aClass2_209;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "J")
	public long aLong145;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!te;")
	public Class2 aClass2_210;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
	public final boolean method2886() {
		return this.aClass2_210 != null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public final void method2888() {
		if (this.aClass2_210 != null) {
			this.aClass2_210.aClass2_209 = this.aClass2_209;
			this.aClass2_209.aClass2_210 = this.aClass2_210;
			this.aClass2_209 = null;
			this.aClass2_210 = null;
		}
	}
}
