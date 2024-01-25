import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public interface Interface6 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	void method3594(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZI)V")
	void method3595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLjava/awt/Component;IZ)V")
	void method3596(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[I)V")
	void method3597(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)V")
	void method3598(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)I")
	int method3599(@OriginalArg(1) int arg0);
}
