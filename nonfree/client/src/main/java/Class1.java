import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class Class1 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
	public long aLong158;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!lb;")
	public Class1 aClass1_215;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!lb;")
	public Class1 aClass1_216;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public final void method3056() {
		if (this.aClass1_216 != null) {
			this.aClass1_216.aClass1_215 = this.aClass1_215;
			this.aClass1_215.aClass1_216 = this.aClass1_216;
			this.aClass1_216 = null;
			this.aClass1_215 = null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
	public final boolean method3059() {
		return this.aClass1_216 != null;
	}
}
