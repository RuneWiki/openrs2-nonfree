import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface3 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	void method2870(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
	void method2871(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	void method2872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[I)V")
	void method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
	void method2874(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)I")
	int method2875(@OriginalArg(0) int arg0);
}
