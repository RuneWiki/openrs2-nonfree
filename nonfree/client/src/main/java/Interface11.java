import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface11 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!qf;")
	Class297 method6027(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
	int method6028();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZFI)[I")
	int[] method6029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIIZF)[F")
	float[] method6030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIIIZ)[I")
	int[] method6031(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method6032(@OriginalArg(0) int arg0);
}
