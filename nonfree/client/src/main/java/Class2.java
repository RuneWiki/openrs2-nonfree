import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class Class2 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!uj;")
	public Class2 aClass2_263;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "J")
	public long aLong225;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!uj;")
	public Class2 aClass2_264;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
	public final boolean method5702() {
		return this.aClass2_263 != null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public final void method5703() {
		if (this.aClass2_263 != null) {
			this.aClass2_263.aClass2_264 = this.aClass2_264;
			this.aClass2_264.aClass2_263 = this.aClass2_263;
			this.aClass2_264 = null;
			this.aClass2_263 = null;
		}
	}
}
