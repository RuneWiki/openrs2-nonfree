import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Lclient!hs;")
	public Class111_Sub1 aClass111_Sub1_9;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Lclient!hs;")
	public Class111_Sub1 aClass111_Sub1_10;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	public final void method5261() {
		if (this.aClass111_Sub1_9 != null) {
			this.aClass111_Sub1_9.aClass111_Sub1_10 = this.aClass111_Sub1_10;
			this.aClass111_Sub1_10.aClass111_Sub1_9 = this.aClass111_Sub1_9;
			this.aClass111_Sub1_10 = null;
			this.aClass111_Sub1_9 = null;
		}
	}
}
