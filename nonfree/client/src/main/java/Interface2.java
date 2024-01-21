import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public interface Interface2 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
	int method1168();

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	void method1169(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	void method1170(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	void method1171();

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([I)V")
	void method1172(@OriginalArg(0) int[] arg0);
}
