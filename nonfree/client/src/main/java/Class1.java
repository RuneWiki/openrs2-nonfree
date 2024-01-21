import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Class1 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "J")
	public long aLong34;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!u;")
	public Class1 aClass1_43;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!u;")
	public Class1 aClass1_44;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public final void method690() {
		if (this.aClass1_44 != null) {
			this.aClass1_44.aClass1_43 = this.aClass1_43;
			this.aClass1_43.aClass1_44 = this.aClass1_44;
			this.aClass1_43 = null;
			this.aClass1_44 = null;
		}
	}
}
