import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface9 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZFIII)[F")
	float[] method1072(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	boolean method1073(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lclient!raa;")
	Class291 method1074(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZFI)[I")
	int[] method1075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(FIIZII)[I")
	int[] method1076(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method1077();
}
