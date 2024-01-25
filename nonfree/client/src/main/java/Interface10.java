import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public interface Interface10 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z")
	boolean method191(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)Lclient!jc;")
	Class121 method192(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZFIZII)[I")
	int[] method193(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IFZIII)[I")
	int[] method194(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBIFZI)[F")
	float[] method195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);
}
