import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface4 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method8974(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!dba;")
	Class69 method8975(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method8976();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIIIZ)[I")
	int[] method8977(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IFIIIZ)[F")
	float[] method8978(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method8979(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);
}
