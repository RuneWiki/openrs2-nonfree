import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class Class16 {

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lclient!nfa;")
	public Class16 aClass16_67;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lclient!nfa;")
	public Class16 aClass16_68;

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)V")
	public final void method8874() {
		if (this.aClass16_68 != null) {
			this.aClass16_68.aClass16_67 = this.aClass16_67;
			this.aClass16_67.aClass16_68 = this.aClass16_68;
			this.aClass16_68 = null;
			this.aClass16_67 = null;
		}
	}
}
