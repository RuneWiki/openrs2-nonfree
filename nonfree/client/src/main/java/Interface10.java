import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public interface Interface10 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Component;ZZI)V")
	void method4436(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	void method4437(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
	void method4438(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)I")
	int method4439(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V")
	void method4440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[I)V")
	void method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
