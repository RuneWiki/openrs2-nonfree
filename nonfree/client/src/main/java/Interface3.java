import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public interface Interface3 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)[I")
	int[] method3050(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
	boolean method3051(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)Z")
	boolean method3052(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)Z")
	boolean method3053(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)I")
	int method3054(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)Z")
	boolean method3055(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(FII)[I")
	int[] method3056(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1);
}
