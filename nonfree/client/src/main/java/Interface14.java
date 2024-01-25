import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public interface Interface14 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)V")
	void method7644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method7645(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BI)V")
	void method7646(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I[I)V")
	void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)I")
	int method7648(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IB)V")
	void method7649(@OriginalArg(0) int arg0);
}
