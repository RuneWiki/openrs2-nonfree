import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public interface Interface4 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
	int method1475(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V")
	void method1476(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[I)V")
	void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	void method1478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(IB)V")
	void method1479(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method1480(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;
}
