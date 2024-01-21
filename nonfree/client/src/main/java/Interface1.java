import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface1 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	void method693(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
	void method694(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
	int method695(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method696(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V")
	void method697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
	void method698(@OriginalArg(0) int arg0);
}
