import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public interface Interface10 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method5526(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)I")
	int method5527(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V")
	void method5528(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[I)V")
	void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	void method5530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V")
	void method5531(@OriginalArg(0) int arg0);
}
