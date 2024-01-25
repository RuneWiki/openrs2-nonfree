import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public interface Interface10 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
	void method4482(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[I)V")
	void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)I")
	int method4484(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)V")
	void method4485(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)V")
	void method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
