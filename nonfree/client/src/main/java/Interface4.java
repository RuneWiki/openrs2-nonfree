import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface Interface4 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
	void method1150(@OriginalArg(3) Component arg0) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
	int method1151();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	void method1152(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	void method1153();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V")
	void method1154(@OriginalArg(0) int[] arg0);
}
