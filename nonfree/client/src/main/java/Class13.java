import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class Class13 {

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!ff;")
	public Class13 aClass13_23;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!ff;")
	public Class13 aClass13_24;

	static {
		new Class175("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public final void method5934() {
		if (this.aClass13_23 != null) {
			this.aClass13_23.aClass13_24 = this.aClass13_24;
			this.aClass13_24.aClass13_23 = this.aClass13_23;
			this.aClass13_23 = null;
			this.aClass13_24 = null;
		}
	}
}
