import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class Class1 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!ba;")
	public Class1 aClass1_234;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "J")
	public long aLong214;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!ba;")
	public Class1 aClass1_235;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public final void method4779() {
		if (this.aClass1_234 != null) {
			this.aClass1_234.aClass1_235 = this.aClass1_235;
			this.aClass1_235.aClass1_234 = this.aClass1_234;
			this.aClass1_235 = null;
			this.aClass1_234 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
	public final boolean method4782() {
		return this.aClass1_234 != null;
	}
}
