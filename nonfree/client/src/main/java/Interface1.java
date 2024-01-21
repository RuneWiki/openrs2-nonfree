import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public interface Interface1 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
	int method215();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	void method216(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	void method217();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method218(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([I)V")
	void method219(@OriginalArg(0) int[] arg0);
}
