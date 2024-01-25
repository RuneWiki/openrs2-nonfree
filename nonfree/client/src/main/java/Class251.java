import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class251 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public int anInt7515;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public int anInt7516;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public int anInt7517;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class251() {
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!pm;)V")
	public Class251(@OriginalArg(0) Class251 arg0) {
		this.anInt7517 = arg0.anInt7517;
		this.anInt7515 = arg0.anInt7515;
		this.anInt7516 = arg0.anInt7516;
	}
}
