import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public interface Interface4 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(FIB)[I")
	int[] method2896(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
	boolean method2897(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)I")
	int method2898(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)Z")
	boolean method2899(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIZIF)Lclient!qn;")
	Class3_Sub4_Sub12_Sub2 method2900(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)I")
	int method2901(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V")
	void method2902(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(BI)I")
	int method2903(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)V")
	void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)Z")
	boolean method2905(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(II)I")
	int method2906(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(II)[I")
	int[] method2907(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(II)I")
	int method2908(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IB)Z")
	boolean method2909(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(IB)Z")
	boolean method2910(@OriginalArg(0) int arg0);
}
