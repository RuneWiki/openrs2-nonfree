import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public interface Interface3 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
	void method1270(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([I)V")
	void method1271(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	void method1272();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
	int method1273();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	void method1274(@OriginalArg(0) Component arg0) throws Exception;
}
