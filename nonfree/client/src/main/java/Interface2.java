import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface2 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
	int method3855(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[I)V")
	void method3856(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)V")
	void method3857(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	void method3858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	void method3859(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;ZIZ)V")
	void method3860(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;
}
