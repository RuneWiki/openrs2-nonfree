import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface3 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method1881(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V")
	void method1882(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)I")
	int method1883(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[I)V")
	void method1884(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
	void method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	void method1886(@OriginalArg(1) int arg0);
}
