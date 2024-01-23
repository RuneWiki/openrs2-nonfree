import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface5 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	void method4036();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	void method4037();

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()I")
	int method4038();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	void method4039(@OriginalArg(0) int arg0);
}
