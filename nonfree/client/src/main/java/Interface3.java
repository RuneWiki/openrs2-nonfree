import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public interface Interface3 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
	void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	void method2279(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	void method2280(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	void method2281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[I)V")
	void method2282(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
	int method2283(@OriginalArg(0) int arg0);
}
