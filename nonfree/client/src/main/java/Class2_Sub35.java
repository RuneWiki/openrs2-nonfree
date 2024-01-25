import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public int anInt7246 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public int anInt7245 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	public int anInt7243 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	public int anInt7248 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	public int anInt7244 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	public int anInt7247 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
	public int anInt7252 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
	public int anInt7253 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "Lclient!cs;")
	public final Class2_Sub13 aClass2_Sub13_1;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!cs;)V")
	public Class2_Sub35(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass2_Sub13_1 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)Z")
	public boolean method6334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7248 <= arg0 && this.anInt7253 >= arg0 && arg1 >= this.anInt7245 && this.anInt7252 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt7244 && this.anInt7246 >= arg0 && this.anInt7243 <= arg1 && this.anInt7247 >= arg1;
		}
	}
}
