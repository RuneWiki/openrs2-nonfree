import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	public long aLong234;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Lclient!pm;")
	public Class1_Sub1 aClass1_Sub1_59;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Lclient!pm;")
	public Class1_Sub1 aClass1_Sub1_60;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public final void method7493() {
		if (this.aClass1_Sub1_60 != null) {
			this.aClass1_Sub1_60.aClass1_Sub1_59 = this.aClass1_Sub1_59;
			this.aClass1_Sub1_59.aClass1_Sub1_60 = this.aClass1_Sub1_60;
			this.aClass1_Sub1_60 = null;
			this.aClass1_Sub1_59 = null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)Z")
	public final boolean method7495() {
		return this.aClass1_Sub1_60 != null;
	}
}
