import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface Interface1 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)I")
	int method967(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	void method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)V")
	void method969(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)V")
	void method970(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[I)V")
	void method971(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method972(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;
}
