import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public interface Interface26 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
	void method1349(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I")
	int method1350(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	void method1351(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[I)V")
	void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
	void method1354(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;
}
