import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public interface Interface4 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZFZI)[I")
	int[] method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBIZFI)[I")
	int[] method3791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	boolean method3792(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FIIZII)[F")
	float[] method3793(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!kf;")
	Class140 method3794(@OriginalArg(1) int arg0);
}
