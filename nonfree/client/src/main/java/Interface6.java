import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface6 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FZZIII)[I")
	int[] method1488(@OriginalArg(0) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIFIZI)[I")
	int[] method1489(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIFIB)[F")
	float[] method1490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method1491();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!jp;")
	Class175 method1492(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z")
	boolean method1493(@OriginalArg(1) int arg0);
}
