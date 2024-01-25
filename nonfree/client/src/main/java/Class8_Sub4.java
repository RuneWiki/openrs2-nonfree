import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!uj;")
	public Class8_Sub4 aClass8_Sub4_7;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Lclient!uj;")
	public Class8_Sub4 aClass8_Sub4_8;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public final void method2081() {
		if (this.aClass8_Sub4_8 != null) {
			this.aClass8_Sub4_8.aClass8_Sub4_7 = this.aClass8_Sub4_7;
			this.aClass8_Sub4_7.aClass8_Sub4_8 = this.aClass8_Sub4_8;
			this.aClass8_Sub4_7 = null;
			this.aClass8_Sub4_8 = null;
		}
	}
}
