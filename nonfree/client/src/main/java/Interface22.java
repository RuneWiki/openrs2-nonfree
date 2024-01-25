import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public interface Interface22 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	void method6628(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V")
	void method6629(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
	void method6630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I")
	int method6631(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[I)V")
	void method6632(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method6633(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;
}
