import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public interface Interface3 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method1442(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
	int method1443(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	void method1444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[I)V")
	void method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	void method1446(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	void method1447(@OriginalArg(0) int arg0);
}
