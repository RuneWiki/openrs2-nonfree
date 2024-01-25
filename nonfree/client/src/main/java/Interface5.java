import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public interface Interface5 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[I)V")
	void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I")
	int method2528(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(II)V")
	void method2529(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	void method2530(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method2531(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BII)V")
	void method2532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
