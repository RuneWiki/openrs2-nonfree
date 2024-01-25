import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class Class2 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "J")
	public long aLong241;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!jd;")
	public Class2 aClass2_283;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!jd;")
	public Class2 aClass2_284;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Z")
	public final boolean method7799() {
		return this.aClass2_283 != null;
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	public final void method7802() {
		if (this.aClass2_283 != null) {
			this.aClass2_283.aClass2_284 = this.aClass2_284;
			this.aClass2_284.aClass2_283 = this.aClass2_283;
			this.aClass2_284 = null;
			this.aClass2_283 = null;
		}
	}
}
