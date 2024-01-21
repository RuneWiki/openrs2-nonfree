import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface3 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	void method1420(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I[I)V")
	void method1421(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	void method1422(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
	void method1423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)I")
	int method1424(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;
}
