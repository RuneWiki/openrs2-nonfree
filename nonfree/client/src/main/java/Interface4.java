import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public interface Interface4 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	void method2519(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	void method2520(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(II)I")
	int method2521(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method2522(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[I)V")
	void method2523(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
	void method2524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
