import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public interface Interface5 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)I")
	int method3650(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
	void method3651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[I)V")
	void method3652(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/awt/Component;ZI)V")
	void method3653(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(BI)V")
	void method3654(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	void method3655(@OriginalArg(1) int arg0);
}
