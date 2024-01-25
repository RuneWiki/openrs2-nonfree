import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public interface Interface10 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)V")
	void method4938(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)V")
	void method4939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	void method4940(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)I")
	int method4941(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void method4942(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[I)V")
	void method4943(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
