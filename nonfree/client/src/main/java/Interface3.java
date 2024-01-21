import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public interface Interface3 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[I)V")
	void method2552(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	int method2553(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	void method2554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method2555(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	void method2556(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
	void method2557(@OriginalArg(0) int arg0);
}
