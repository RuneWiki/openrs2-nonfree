import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public interface Interface4 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	int method2875(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	void method2876(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method2877(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[I)V")
	void method2878(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	void method2879(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
