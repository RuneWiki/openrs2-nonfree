import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public interface Interface1 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	int method4590(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[I")
	int[] method4591(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIFZI)Lclient!si;")
	Class1_Sub3_Sub13_Sub2 method4592(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)Z")
	boolean method4593(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)Z")
	boolean method4594(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)V")
	void method4595(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(II)I")
	int method4596(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(II)I")
	int method4597(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FIB)[I")
	int[] method4598(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
	void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)I")
	int method4600(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)I")
	int method4601(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Z")
	boolean method4602(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)Z")
	boolean method4603(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(II)Z")
	boolean method4604(@OriginalArg(0) int arg0);
}
