import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!USMRNXZO")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!USMRNXZO", name = "e", descriptor = "Lclient!USMRNXZO;")
	public Class8_Sub1 aClass8_Sub1_36;

	@OriginalMember(owner = "client!USMRNXZO", name = "f", descriptor = "Lclient!USMRNXZO;")
	public Class8_Sub1 aClass8_Sub1_37;

	@OriginalMember(owner = "client!USMRNXZO", name = "b", descriptor = "()V")
	public final void method547() {
		if (this.aClass8_Sub1_37 != null) {
			this.aClass8_Sub1_37.aClass8_Sub1_36 = this.aClass8_Sub1_36;
			this.aClass8_Sub1_36.aClass8_Sub1_37 = this.aClass8_Sub1_37;
			this.aClass8_Sub1_36 = null;
			this.aClass8_Sub1_37 = null;
		}
	}
}
