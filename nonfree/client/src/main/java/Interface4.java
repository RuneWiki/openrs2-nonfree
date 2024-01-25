import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface4 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBIFZ)[I")
	int[] method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
	boolean method5758(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method5759();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZFII)[I")
	int[] method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!wka;")
	Class406 method5761(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIFII)[F")
	float[] method5762(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
