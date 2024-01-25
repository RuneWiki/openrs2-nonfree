import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface Interface3 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	void method3552(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	void method3553(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	void method3554(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)I")
	int method3555(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[I)V")
	void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V")
	void method3557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
