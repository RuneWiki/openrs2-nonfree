import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public interface Interface3 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Z")
	boolean method1277(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!ns;")
	Class166 method1278(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIFII)[I")
	int[] method1279(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZFII)[F")
	float[] method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(ZIIFII)[I")
	int[] method1281(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
