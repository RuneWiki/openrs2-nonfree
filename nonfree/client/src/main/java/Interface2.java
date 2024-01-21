import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public interface Interface2 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)V")
	void method2457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
	void method2458(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
	void method2459(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	void method2460(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	int method2461(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[I)V")
	void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
