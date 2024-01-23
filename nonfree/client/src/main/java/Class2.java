import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class Class2 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!ma;")
	public Class2 aClass2_230;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "J")
	public long aLong315;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!ma;")
	public Class2 aClass2_231;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public final void method4926() {
		if (this.aClass2_230 != null) {
			this.aClass2_230.aClass2_231 = this.aClass2_231;
			this.aClass2_231.aClass2_230 = this.aClass2_230;
			this.aClass2_231 = null;
			this.aClass2_230 = null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
	public final boolean method4927() {
		return this.aClass2_230 != null;
	}
}
