import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public interface Interface1 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
	void method732(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
	void method733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[I)V")
	void method734(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method735(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
	int method736(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
	void method737(@OriginalArg(1) int arg0);
}
