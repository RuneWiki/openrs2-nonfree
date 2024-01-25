import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class Class16_Sub6 extends Class16 {

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!rv;")
	public Class16_Sub6 aClass16_Sub6_9;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "Lclient!rv;")
	public Class16_Sub6 aClass16_Sub6_10;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public final void method8603() {
		if (this.aClass16_Sub6_9 != null) {
			this.aClass16_Sub6_9.aClass16_Sub6_10 = this.aClass16_Sub6_10;
			this.aClass16_Sub6_10.aClass16_Sub6_9 = this.aClass16_Sub6_9;
			this.aClass16_Sub6_10 = null;
			this.aClass16_Sub6_9 = null;
		}
	}
}
