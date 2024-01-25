import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public interface Interface6 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
	int method2581(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
	void method2582(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	void method2583(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(II)V")
	void method2584(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I[I)V")
	void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)V")
	void method2586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
