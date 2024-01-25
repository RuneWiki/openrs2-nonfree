import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public interface Interface1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZBLjava/awt/Component;)V")
	void method1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[I)V")
	void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	void method3(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	void method4(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	void method5(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
	int method6(@OriginalArg(1) int arg0);
}
