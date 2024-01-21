import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class Class1 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!md;")
	public Class1 aClass1_213;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "J")
	public long aLong251;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!md;")
	public Class1 aClass1_214;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Z")
	public final boolean method3411() {
		return this.aClass1_214 != null;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	public final void method3414() {
		if (this.aClass1_214 != null) {
			this.aClass1_214.aClass1_213 = this.aClass1_213;
			this.aClass1_213.aClass1_214 = this.aClass1_214;
			this.aClass1_213 = null;
			this.aClass1_214 = null;
		}
	}
}
