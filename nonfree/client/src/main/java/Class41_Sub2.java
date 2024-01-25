import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!hg;")
	public Class41_Sub2 aClass41_Sub2_7;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!hg;")
	public Class41_Sub2 aClass41_Sub2_8;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public final void method5480() {
		if (this.aClass41_Sub2_8 != null) {
			this.aClass41_Sub2_8.aClass41_Sub2_7 = this.aClass41_Sub2_7;
			this.aClass41_Sub2_7.aClass41_Sub2_8 = this.aClass41_Sub2_8;
			this.aClass41_Sub2_7 = null;
			this.aClass41_Sub2_8 = null;
		}
	}
}
