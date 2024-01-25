import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface5 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIZIIZ)[I")
	int[] method5192(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Lclient!tr;")
	Class342 method5193(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	int method5194();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFIBZ)[I")
	int[] method5195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBZIFI)[F")
	float[] method5196(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method5197(@OriginalArg(0) int arg0);
}
