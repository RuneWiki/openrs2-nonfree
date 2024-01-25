import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface7 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IFIBIZ)[I")
	int[] method76(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Z")
	boolean method77(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Lclient!ks;")
	Class150 method78(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZZIIIF)[I")
	int[] method79(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FIIIZI)[F")
	float[] method80(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);
}
