import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public interface Interface2 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	void method1449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[I)V")
	void method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)I")
	int method1451(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method1452(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	void method1453(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
	void method1454(@OriginalArg(1) int arg0);
}
