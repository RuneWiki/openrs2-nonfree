import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public interface Interface2 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	void method940(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[I)V")
	void method941(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
	void method942(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
	void method943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)V")
	void method944(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I")
	int method945(@OriginalArg(1) int arg0);
}
