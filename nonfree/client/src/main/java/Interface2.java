import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public interface Interface2 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method3469(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[I)V")
	void method3470(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	void method3471(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
	int method3472(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)V")
	void method3474(@OriginalArg(0) int arg0);
}
