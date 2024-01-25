import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public interface Interface3 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZFBI)[F")
	float[] method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IFIIZI)[I")
	int[] method164(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIFII)[I")
	int[] method165(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lclient!he;")
	Class89 method166(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)Z")
	boolean method167(@OriginalArg(1) int arg0);
}
