import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class Class41_Sub7 extends Class41 {

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!pm;")
	public Class41_Sub7 aClass41_Sub7_7;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Lclient!pm;")
	public Class41_Sub7 aClass41_Sub7_8;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public final void method5821() {
		if (this.aClass41_Sub7_7 != null) {
			this.aClass41_Sub7_7.aClass41_Sub7_8 = this.aClass41_Sub7_8;
			this.aClass41_Sub7_8.aClass41_Sub7_7 = this.aClass41_Sub7_7;
			this.aClass41_Sub7_7 = null;
			this.aClass41_Sub7_8 = null;
		}
	}
}
