import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public interface Interface9 {

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)I")
	int method5168(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I[I)V")
	void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBI)V")
	void method5170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)V")
	void method5171(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	void method5172(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
	void method5173(@OriginalArg(1) int arg0);
}
