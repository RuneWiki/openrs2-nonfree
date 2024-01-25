import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface9 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	int method5655(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
	void method5656(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
	void method5657(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	void method5658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
	void method5659(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
	void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
