import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class Class2 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!wh;")
	public Class2 aClass2_267;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!wh;")
	public Class2 aClass2_268;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "J")
	public long aLong401;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)Z")
	public final boolean method6258() {
		return this.aClass2_267 != null;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	public final void method6260() {
		if (this.aClass2_267 != null) {
			this.aClass2_267.aClass2_268 = this.aClass2_268;
			this.aClass2_268.aClass2_267 = this.aClass2_267;
			this.aClass2_268 = null;
			this.aClass2_267 = null;
		}
	}
}
