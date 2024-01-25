import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface8 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IFIZZI)[F")
	float[] method7083(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	boolean method7084(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lclient!lba;")
	Class175 method7085(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIIF)[I")
	int[] method7086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	int method7087();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIFI)[I")
	int[] method7088(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);
}
