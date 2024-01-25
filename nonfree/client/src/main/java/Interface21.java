import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public interface Interface21 extends Interface11 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method5806();

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	void method8887();

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Lclient!oea;")
	Class250 method5807();

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	void method5800(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z")
	boolean method5808();
}
