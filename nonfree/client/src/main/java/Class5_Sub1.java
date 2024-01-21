import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IZSDUVJF")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!IZSDUVJF", name = "f", descriptor = "Lclient!IZSDUVJF;")
	public Class5_Sub1 aClass5_Sub1_36;

	@OriginalMember(owner = "client!IZSDUVJF", name = "g", descriptor = "Lclient!IZSDUVJF;")
	public Class5_Sub1 aClass5_Sub1_37;

	@OriginalMember(owner = "client!IZSDUVJF", name = "e", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!IZSDUVJF", name = "b", descriptor = "()V")
	public final void method424() {
		if (this.aClass5_Sub1_37 != null) {
			this.aClass5_Sub1_37.aClass5_Sub1_36 = this.aClass5_Sub1_36;
			this.aClass5_Sub1_36.aClass5_Sub1_37 = this.aClass5_Sub1_37;
			this.aClass5_Sub1_36 = null;
			this.aClass5_Sub1_37 = null;
		}
	}
}
