import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public interface Interface16 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	void method4957(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method4958(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
	void method4959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)I")
	int method4960(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[I)V")
	void method4961(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	void method4962(@OriginalArg(1) int arg0);
}
