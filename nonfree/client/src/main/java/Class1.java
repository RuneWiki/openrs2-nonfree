import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class Class1 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!hb;")
	public Class1 aClass1_209;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "J")
	public long aLong140;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!hb;")
	public Class1 aClass1_210;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public final void method3141() {
		if (this.aClass1_209 != null) {
			this.aClass1_209.aClass1_210 = this.aClass1_210;
			this.aClass1_210.aClass1_209 = this.aClass1_209;
			this.aClass1_209 = null;
			this.aClass1_210 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
	public final boolean method3142() {
		return this.aClass1_209 != null;
	}
}
