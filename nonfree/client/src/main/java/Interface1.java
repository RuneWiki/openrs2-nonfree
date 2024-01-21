import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface Interface1 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	int method315();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
	void method316(@OriginalArg(1) int arg0) throws Exception;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	void method317();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([I)V")
	void method318(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	void method319(@OriginalArg(1) Component arg0) throws Exception;
}
