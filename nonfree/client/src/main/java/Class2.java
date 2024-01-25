import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class Class2 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Lclient!pt;")
	public Class2 aClass2_243;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!pt;")
	public Class2 aClass2_244;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Z")
	public final boolean method6126() {
		return this.aClass2_243 != null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public final void method6130() {
		if (this.aClass2_243 != null) {
			this.aClass2_243.aClass2_244 = this.aClass2_244;
			this.aClass2_244.aClass2_243 = this.aClass2_243;
			this.aClass2_244 = null;
			this.aClass2_243 = null;
		}
	}
}
