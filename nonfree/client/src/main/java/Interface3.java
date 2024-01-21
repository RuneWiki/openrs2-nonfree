import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface Interface3 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	void method1011(@OriginalArg(1) int arg0) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	void method1012();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I")
	int method1013();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	void method1014(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V")
	void method1015(@OriginalArg(0) int[] arg0);
}
