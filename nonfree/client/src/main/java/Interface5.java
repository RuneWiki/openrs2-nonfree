import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public interface Interface5 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)I")
	int method777(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)I")
	int method778(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(IB)Z")
	boolean method779(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(IB)[I")
	int[] method780(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI)Z")
	boolean method781(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
	void method782(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)Z")
	boolean method783(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(IB)I")
	int method784(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(II)Z")
	boolean method785(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZII)V")
	void method786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(II)Z")
	boolean method787(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(BI)I")
	int method788(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZIFB)Lclient!ch;")
	Class1_Sub2_Sub1_Sub2 method789(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(FII)[I")
	int[] method790(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "(II)I")
	int method791(@OriginalArg(1) int arg0);
}
