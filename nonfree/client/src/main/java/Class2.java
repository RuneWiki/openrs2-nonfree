import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class Class2 {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!ca;")
	public Class2 aClass2_127;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!ca;")
	public Class2 aClass2_128;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Z")
	public final boolean method2207() {
		return this.aClass2_127 != null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public final void method2209() {
		if (this.aClass2_127 != null) {
			this.aClass2_127.aClass2_128 = this.aClass2_128;
			this.aClass2_128.aClass2_127 = this.aClass2_127;
			this.aClass2_127 = null;
			this.aClass2_128 = null;
		}
	}
}
