import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public interface Interface2 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
	void method1627(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	void method1628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	void method1629(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
	int method1630(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
	void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	void method1632(@OriginalArg(1) int arg0);
}
