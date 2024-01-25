import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface4 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFZIII)[F")
	float[] method8046(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
	int method8047();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!hd;")
	Class127 method8048(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
	boolean method8049(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIFIII)[I")
	int[] method8050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFIZI)[I")
	int[] method8051(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);
}
