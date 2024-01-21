import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public interface Interface3 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method2528(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)I")
	int method2529(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	void method2530(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)V")
	void method2531(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[I)V")
	void method2533(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
