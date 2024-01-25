import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public interface Interface7 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
	void method2409(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	int method2410(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void method2411(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V")
	void method2412(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I)V")
	void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
