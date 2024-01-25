import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
	public int anInt8045;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	public int anInt8046;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public int anInt8047;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public int anInt8048;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public int anInt8049;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	public int anInt8050 = -1;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
	public boolean aBoolean541 = false;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class3_Sub48(@OriginalArg(0) int arg0) {
		this.anInt8050 = arg0;
	}
}
