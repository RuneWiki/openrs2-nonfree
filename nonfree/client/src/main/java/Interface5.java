import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public interface Interface5 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
	void method7287(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[I)V")
	void method7288(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	void method7289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)I")
	int method7290(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method7291(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	void method7292(@OriginalArg(0) int arg0);
}
