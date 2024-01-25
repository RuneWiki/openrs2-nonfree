import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public interface Interface6 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	void method3986(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[I)V")
	void method3987(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	void method3988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
	void method3989(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
	void method3990(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)I")
	int method3991(@OriginalArg(0) int arg0);
}
