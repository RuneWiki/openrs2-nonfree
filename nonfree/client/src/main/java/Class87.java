import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class Class87 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!wn;")
	public Class87 aClass87_11;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!wn;")
	public Class87 aClass87_12;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public final void method4455() {
		if (this.aClass87_12 != null) {
			this.aClass87_12.aClass87_11 = this.aClass87_11;
			this.aClass87_11.aClass87_12 = this.aClass87_12;
			this.aClass87_11 = null;
			this.aClass87_12 = null;
		}
	}
}
