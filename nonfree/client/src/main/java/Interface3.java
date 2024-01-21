import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface Interface3 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	void method2358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/awt/Component;IB)V")
	void method2359(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
	void method2360(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[I)V")
	void method2361(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I")
	int method2362(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	void method2363(@OriginalArg(0) int arg0);
}
