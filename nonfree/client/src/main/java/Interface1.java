import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public interface Interface1 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)V")
	void method2424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	int method2425(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)Z")
	boolean method2426(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I")
	int method2427(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIZFI)Lclient!n;")
	Class4_Sub2_Sub4_Sub2 method2428(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)Z")
	boolean method2429(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(II)Z")
	boolean method2430(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(II)I")
	int method2431(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZF)[I")
	int[] method2432(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)Z")
	boolean method2433(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)[I")
	int[] method2434(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(II)Z")
	boolean method2435(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(II)V")
	void method2436(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(II)I")
	int method2437(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IZ)I")
	int method2438(@OriginalArg(0) int arg0);
}
