import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public interface Interface24 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
	int method3966(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[I)V")
	void method3967(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
	void method3968(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
	void method3969(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	void method3970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	void method3971(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;
}
