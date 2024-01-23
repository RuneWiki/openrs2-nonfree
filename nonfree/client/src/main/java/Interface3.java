import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface Interface3 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
	void method3678(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
	void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)V")
	void method3680(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[I)V")
	void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
	int method3682(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method3683(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;
}
