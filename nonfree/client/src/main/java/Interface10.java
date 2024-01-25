import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public interface Interface10 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLjava/awt/Component;ZI)V")
	void method4467(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[I)V")
	void method4468(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
	int method4469(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
	void method4470(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	void method4471(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	void method4472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
