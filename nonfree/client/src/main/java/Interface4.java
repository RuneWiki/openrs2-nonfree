import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public interface Interface4 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([I)V")
	void method1752(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	void method1753();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	void method1754(@OriginalArg(1) int arg0) throws Exception;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method1755(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	int method1756();
}
