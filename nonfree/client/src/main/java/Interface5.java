import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public interface Interface5 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	int method4010(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	void method4011(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
	void method4012(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
	void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[I)V")
	void method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
