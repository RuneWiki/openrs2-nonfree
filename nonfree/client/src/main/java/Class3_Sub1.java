import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KWULTEKW")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!KWULTEKW", name = "e", descriptor = "Lclient!KWULTEKW;")
	public Class3_Sub1 aClass3_Sub1_36;

	@OriginalMember(owner = "client!KWULTEKW", name = "f", descriptor = "Lclient!KWULTEKW;")
	public Class3_Sub1 aClass3_Sub1_37;

	@OriginalMember(owner = "client!KWULTEKW", name = "b", descriptor = "()V")
	public final void method548() {
		if (this.aClass3_Sub1_37 != null) {
			this.aClass3_Sub1_37.aClass3_Sub1_36 = this.aClass3_Sub1_36;
			this.aClass3_Sub1_36.aClass3_Sub1_37 = this.aClass3_Sub1_37;
			this.aClass3_Sub1_36 = null;
			this.aClass3_Sub1_37 = null;
		}
	}
}
