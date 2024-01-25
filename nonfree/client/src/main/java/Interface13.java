import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public interface Interface13 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	void method8512(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
	void method8513(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;BIZ)V")
	void method8514(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[I)V")
	void method8515(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I")
	int method8516(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	void method8517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
