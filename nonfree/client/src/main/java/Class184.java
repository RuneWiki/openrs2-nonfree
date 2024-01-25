import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class184 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public int anInt4743;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class184() {
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!pm;)V")
	public Class184(@OriginalArg(0) Class184 arg0) {
		this.anInt4744 = arg0.anInt4744;
		this.anInt4745 = arg0.anInt4745;
		this.anInt4743 = arg0.anInt4743;
	}
}
