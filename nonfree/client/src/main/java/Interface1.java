import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public interface Interface1 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
	void method560(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZI)V")
	void method561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	void method562(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[I)V")
	void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)I")
	int method564(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IB)V")
	void method565(@OriginalArg(0) int arg0);
}
