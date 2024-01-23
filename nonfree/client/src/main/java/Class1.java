import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class Class1 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!jg;")
	public Class1 aClass1_212;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "J")
	public long aLong184;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!jg;")
	public Class1 aClass1_213;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public final void method4186() {
		if (this.aClass1_212 != null) {
			this.aClass1_212.aClass1_213 = this.aClass1_213;
			this.aClass1_213.aClass1_212 = this.aClass1_212;
			this.aClass1_213 = null;
			this.aClass1_212 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
	public final boolean method4187() {
		return this.aClass1_212 != null;
	}
}
