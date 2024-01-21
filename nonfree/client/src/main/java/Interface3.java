import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface Interface3 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Z")
	boolean method2816(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Z")
	boolean method2817(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIF)[I")
	int[] method2818(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)I")
	int method2819(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)[I")
	int[] method2820(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
	boolean method2821(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Z")
	boolean method2822(@OriginalArg(1) int arg0);
}
