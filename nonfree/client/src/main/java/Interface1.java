import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public interface Interface1 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V")
	void method1171(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method1172(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IB)I")
	int method1173(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	void method1174(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIB)V")
	void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[I)V")
	void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
