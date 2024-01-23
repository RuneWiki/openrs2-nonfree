import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface Interface2 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BII)V")
	void method2581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[I)V")
	void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
	void method2583(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)I")
	int method2584(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	void method2585(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	void method2586(@OriginalArg(1) int arg0);
}
