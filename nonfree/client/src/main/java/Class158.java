import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class158 {

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	public int anInt5149;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "[I")
	public final int[] anIntArray422;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
	public final int[] anIntArray423;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class158(@OriginalArg(0) int arg0) {
		this.anInt5149 = arg0;
		this.anIntArray422 = new int[this.anInt5149];
		this.anIntArray423 = new int[this.anInt5149];
	}
}
