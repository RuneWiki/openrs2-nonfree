import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface Interface3 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	void method1461(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)I")
	int method1462(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)V")
	void method1463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[I)V")
	void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BI)V")
	void method1466(@OriginalArg(1) int arg0);
}
