import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class Class1 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
	public long aLong184;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!vc;")
	public Class1 aClass1_119;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Lclient!vc;")
	public Class1 aClass1_120;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public final void method2024() {
		if (this.aClass1_119 != null) {
			this.aClass1_119.aClass1_120 = this.aClass1_120;
			this.aClass1_120.aClass1_119 = this.aClass1_119;
			this.aClass1_119 = null;
			this.aClass1_120 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Z")
	public final boolean method2025() {
		return this.aClass1_119 != null;
	}
}
