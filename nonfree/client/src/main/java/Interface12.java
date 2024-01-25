import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public interface Interface12 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[I)V")
	void method5656(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)V")
	void method5657(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
	int method5658(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
	void method5659(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V")
	void method5660(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB)V")
	void method5661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
