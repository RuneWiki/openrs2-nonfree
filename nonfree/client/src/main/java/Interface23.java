import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public interface Interface23 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)J")
	long method9042();

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ[B)V")
	void method9043(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
	int method9044();

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
	int method9045();
}
