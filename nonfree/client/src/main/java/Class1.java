import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class Class1 {

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "J")
	public long aLong150;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Lclient!ji;")
	public Class1 aClass1_213;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!ji;")
	public Class1 aClass1_214;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public final void method3295() {
		if (this.aClass1_214 != null) {
			this.aClass1_214.aClass1_213 = this.aClass1_213;
			this.aClass1_213.aClass1_214 = this.aClass1_214;
			this.aClass1_214 = null;
			this.aClass1_213 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z")
	public final boolean method3296() {
		return this.aClass1_214 != null;
	}
}
