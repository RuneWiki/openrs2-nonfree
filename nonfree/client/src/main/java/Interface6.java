import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface6 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
	int method6353();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIZIII)[I")
	int[] method6354(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method6355(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIZFII)[F")
	float[] method6356(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!lba;")
	Class199 method6357(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIBFI)[I")
	int[] method6358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);
}
