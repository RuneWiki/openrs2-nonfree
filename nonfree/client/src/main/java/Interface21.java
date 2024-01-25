import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public interface Interface21 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	void method3778(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)I")
	int method3779(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	void method3780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	void method3781(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
	void method3782(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[I)V")
	void method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
