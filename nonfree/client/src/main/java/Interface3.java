import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface Interface3 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
	void method1575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[I)V")
	void method1576(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method1577(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	void method1578(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I")
	int method1579(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	void method1580(@OriginalArg(0) int arg0);
}
