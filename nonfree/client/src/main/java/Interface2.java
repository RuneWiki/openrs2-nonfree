import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public interface Interface2 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
	void method1449(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
	void method1450(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
	int method1451(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[I)V")
	void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	void method1453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
	void method1454(@OriginalArg(1) int arg0);
}
