import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public interface Interface3 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	void method1149(@OriginalArg(1) int arg0) throws Exception;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([I)V")
	void method1150(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	void method1151();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
	int method1152();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	void method1153(@OriginalArg(0) Component arg0) throws Exception;
}
