import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface8 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method7811(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFZII)[I")
	int[] method7812(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Lclient!sw;")
	Class321 method7813(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method7814();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZBIIFI)[I")
	int[] method7815(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIFI)[F")
	float[] method7816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);
}
