import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class Class5 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!ej;")
	public Class5 aClass5_209;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "J")
	public long aLong253;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "Lclient!ej;")
	public Class5 aClass5_210;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z")
	public final boolean method3206() {
		return this.aClass5_210 != null;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public final void method3207() {
		if (this.aClass5_210 != null) {
			this.aClass5_210.aClass5_209 = this.aClass5_209;
			this.aClass5_209.aClass5_210 = this.aClass5_210;
			this.aClass5_210 = null;
			this.aClass5_209 = null;
		}
	}
}
