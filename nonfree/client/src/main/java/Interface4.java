import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public interface Interface4 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
	void method1714(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	void method1715(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	void method1716();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	int method1717();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)V")
	void method1718(@OriginalArg(0) int[] arg0);
}
