import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class Class217 {

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	protected Class217() {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public abstract void method5790(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Lclient!uia;")
	public abstract Class345 method5791();

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
	public abstract int method5793(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method5794(@OriginalArg(0) int arg0);
}
