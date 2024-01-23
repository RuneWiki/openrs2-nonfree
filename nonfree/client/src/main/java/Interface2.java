import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public interface Interface2 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IFI)[I")
	int[] method1969(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)I")
	int method1970(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZBIIF)Lclient!af;")
	Class4_Sub2_Sub1_Sub1 method1971(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)V")
	void method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	void method1973(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)Z")
	boolean method1974(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)[I")
	int[] method1975(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(BI)Z")
	boolean method1976(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
	boolean method1977(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(IB)Z")
	boolean method1978(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)I")
	int method1979(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)Z")
	boolean method1980(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(BI)I")
	int method1981(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)I")
	int method1982(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)I")
	int method1983(@OriginalArg(1) int arg0);
}
