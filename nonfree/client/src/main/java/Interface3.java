import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public interface Interface3 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)I")
	int method4131(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)I")
	int method4132(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	void method4133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)I")
	int method4134(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)I")
	int method4135(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IFB)[I")
	int[] method4136(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)Z")
	boolean method4137(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(II)[I")
	int[] method4138(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIIFZ)Lclient!sc;")
	Class2_Sub8_Sub1_Sub1 method4139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
	void method4140(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(IB)Z")
	boolean method4141(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IB)I")
	int method4142(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(II)Z")
	boolean method4143(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(BI)Z")
	boolean method4144(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(II)Z")
	boolean method4145(@OriginalArg(0) int arg0);
}
