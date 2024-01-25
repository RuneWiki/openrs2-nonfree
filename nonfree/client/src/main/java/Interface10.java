import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public interface Interface10 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
	void method4567(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)I")
	int method4568(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
	void method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[I)V")
	void method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V")
	void method4571(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)V")
	void method4572(@OriginalArg(0) int arg0);
}
