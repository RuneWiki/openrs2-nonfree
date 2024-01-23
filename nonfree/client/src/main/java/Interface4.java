import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public interface Interface4 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Z")
	boolean method981(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	void method982(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)Z")
	boolean method983(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZI)Z")
	boolean method984(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I")
	int method985(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)[I")
	int[] method986(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)Z")
	boolean method987(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(FII)[I")
	int[] method988(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IFIZI)Lclient!ek;")
	Class1_Sub2_Sub2_Sub1 method989(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(ZI)Z")
	boolean method990(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)I")
	int method991(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	void method992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(II)I")
	int method993(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(ZI)I")
	int method994(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)I")
	int method995(@OriginalArg(0) int arg0);
}
