import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface6 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FZZIII)[I")
	int[] method3933(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	boolean method3934(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIFZ)[I")
	int[] method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZIF)[F")
	float[] method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Lclient!iq;")
	Class114 method3937(@OriginalArg(0) int arg0);
}
