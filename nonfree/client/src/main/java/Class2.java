import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class Class2 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!nj;")
	public Class2 aClass2_209;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
	public long aLong148;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Lclient!nj;")
	public Class2 aClass2_210;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public final void method3183() {
		if (this.aClass2_210 != null) {
			this.aClass2_210.aClass2_209 = this.aClass2_209;
			this.aClass2_209.aClass2_210 = this.aClass2_210;
			this.aClass2_210 = null;
			this.aClass2_209 = null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Z")
	public final boolean method3184() {
		return this.aClass2_210 != null;
	}
}
