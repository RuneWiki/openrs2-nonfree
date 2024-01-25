import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface12 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
	int method2570();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIFBIZ)[I")
	int[] method2571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Z")
	boolean method2572(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lclient!ns;")
	Class204 method2573(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(FIIIZI)[I")
	int[] method2574(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIFIZ)[F")
	float[] method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3);
}
