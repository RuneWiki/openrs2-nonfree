import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface Interface3 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
	int method1557();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
	void method1558(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	void method1559();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	void method1560(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Component;)V")
	void method1561(@OriginalArg(1) Component arg0) throws Exception;
}
