import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public int anInt7282 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	public int anInt7285 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	public int anInt7284 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	public int anInt7287 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	public int anInt7289 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
	public int anInt7291 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
	public int anInt7293 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	public int anInt7292 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "Lclient!jd;")
	public final Class6_Sub22 aClass6_Sub22_1;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!jd;)V")
	public Class6_Sub38(@OriginalArg(0) Class6_Sub22 arg0) {
		this.aClass6_Sub22_1 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Z")
	public boolean method5819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7291 <= arg1 && arg1 <= this.anInt7287 && arg0 >= this.anInt7282 && arg0 <= this.anInt7293) {
			return true;
		} else {
			return this.anInt7292 <= arg1 && arg1 <= this.anInt7289 && arg0 >= this.anInt7285 && this.anInt7284 >= arg0;
		}
	}
}
