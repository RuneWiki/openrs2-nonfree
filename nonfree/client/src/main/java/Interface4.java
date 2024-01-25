import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface4 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method892(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIFZ)[F")
	float[] method893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BFZIII)[I")
	int[] method894(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Lclient!tha;")
	Class325 method895(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	int method896();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIBFII)[I")
	int[] method897(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
