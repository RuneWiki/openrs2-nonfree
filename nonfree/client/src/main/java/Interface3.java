import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface Interface3 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	int method2797(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	void method2798(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
	void method2799(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
	void method2800(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
	void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[I)V")
	void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
