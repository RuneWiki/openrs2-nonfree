import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public interface Interface4 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	void method3350(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	void method3351(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
	void method3352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method3353(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[I)V")
	void method3354(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
	int method3355(@OriginalArg(0) int arg0);
}
