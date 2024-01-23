import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class Class1 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!b;")
	public Class1 aClass1_213;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "J")
	public long aLong150;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!b;")
	public Class1 aClass1_214;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Z")
	public final boolean method3525() {
		return this.aClass1_214 != null;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
	public final void method3530() {
		if (this.aClass1_214 != null) {
			this.aClass1_214.aClass1_213 = this.aClass1_213;
			this.aClass1_213.aClass1_214 = this.aClass1_214;
			this.aClass1_214 = null;
			this.aClass1_213 = null;
		}
	}
}
