import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface Interface1 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Z")
	boolean method389(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIFII)Lclient!q;")
	Class1_Sub2_Sub4_Sub1 method390(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	int method391(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)Z")
	boolean method392(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Z")
	boolean method393(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIF)[I")
	int[] method394(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);
}
