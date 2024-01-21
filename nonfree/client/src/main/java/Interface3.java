import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public interface Interface3 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	void method1681(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[I)V")
	void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method1683(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
	void method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)I")
	int method1685(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V")
	void method1686(@OriginalArg(0) int arg0);
}
