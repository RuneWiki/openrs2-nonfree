import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public interface Interface3 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	void method2839(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[I)V")
	void method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I")
	int method2841(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	void method2842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
	void method2843(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
	void method2844(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;
}
