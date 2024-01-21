import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class Class1 {

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!ue;")
	public Class1 aClass1_119;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!ue;")
	public Class1 aClass1_120;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "J")
	public long aLong98;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public final void method2128() {
		if (this.aClass1_120 != null) {
			this.aClass1_120.aClass1_119 = this.aClass1_119;
			this.aClass1_119.aClass1_120 = this.aClass1_120;
			this.aClass1_120 = null;
			this.aClass1_119 = null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)Z")
	public final boolean method2133() {
		return this.aClass1_120 != null;
	}
}
