import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface6 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIFZI)[I")
	int[] method7085(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FZIIII)[F")
	float[] method7086(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method7087();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!qr;")
	Class294 method7088(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFZIII)[I")
	int[] method7089(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
	boolean method7090(@OriginalArg(1) int arg0);
}
