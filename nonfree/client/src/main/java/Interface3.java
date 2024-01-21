import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public interface Interface3 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
	int method1476();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	void method1477();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	void method1478(@OriginalArg(1) int arg0) throws Exception;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	void method1479(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	void method1480(@OriginalArg(1) Component arg0) throws Exception;
}
