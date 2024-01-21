import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public interface Interface3 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([I)V")
	void method1626(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)I")
	int method1627();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	void method1628();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	void method1629(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	void method1630(@OriginalArg(0) Component arg0) throws Exception;
}
