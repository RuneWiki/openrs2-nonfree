import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public interface Interface1 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)I")
	int method1625(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)I")
	int method1626(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(II)[I")
	int[] method1627(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZFIIZ)Lclient!ln;")
	Class1_Sub1_Sub3_Sub2 method1628(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(II)Z")
	boolean method1629(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(II)V")
	void method1630(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)I")
	int method1631(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "f", descriptor = "(II)Z")
	boolean method1632(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V")
	void method1633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!an", name = "g", descriptor = "(II)Z")
	boolean method1634(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!an", name = "h", descriptor = "(II)I")
	int method1635(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "i", descriptor = "(II)I")
	int method1636(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!an", name = "j", descriptor = "(II)Z")
	boolean method1637(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!an", name = "k", descriptor = "(II)Z")
	boolean method1638(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIF)[I")
	int[] method1639(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);
}
