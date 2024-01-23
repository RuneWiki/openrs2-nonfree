import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public interface Interface5 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method3549(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	void method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
	void method3551(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	int method3552(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[I)V")
	void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
	void method3554(@OriginalArg(1) int arg0);
}
