import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Class1 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "J")
	public long aLong33;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!u;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!u;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public final void method673() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
