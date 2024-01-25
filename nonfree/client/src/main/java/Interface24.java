import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public interface Interface24 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V")
	void method5168(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
	void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method5170(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I[I)V")
	void method5171(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)I")
	int method5172(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(IZ)V")
	void method5173(@OriginalArg(0) int arg0);
}
