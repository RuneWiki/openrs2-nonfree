import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface3 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIZFI)[I")
	int[] method1508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
	boolean method1509(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZBIIF)[F")
	float[] method1510(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!va;")
	Class200 method1511(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZFIIBI)[I")
	int[] method1512(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);
}
