import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public interface Interface2 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IFIZIZ)[I")
	int[] method3581(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(FIZIII)[I")
	int[] method3582(@OriginalArg(0) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	boolean method3583(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)I")
	int method3584();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Lclient!td;")
	Class296 method3585(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZFBIII)[F")
	float[] method3586(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
