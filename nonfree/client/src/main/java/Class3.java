import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class Class3 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "Lclient!tfa;")
	public Class3 aClass3_345;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lclient!tfa;")
	public Class3 aClass3_346;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "J")
	public long aLong345;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)V")
	public final void method9596() {
		if (this.aClass3_345 != null) {
			this.aClass3_345.aClass3_346 = this.aClass3_346;
			this.aClass3_346.aClass3_345 = this.aClass3_345;
			this.aClass3_346 = null;
			this.aClass3_345 = null;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "(I)Z")
	public final boolean method9597() {
		return this.aClass3_345 != null;
	}
}
