import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public interface Interface13 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5096(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	void method5097(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	void method5098(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)V")
	void method5099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[I)V")
	void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
	int method5101(@OriginalArg(1) int arg0);
}
