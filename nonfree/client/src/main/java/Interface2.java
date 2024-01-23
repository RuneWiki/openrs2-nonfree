import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface2 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
	int[] method4411(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIFII)Lclient!n;")
	Class1_Sub2_Sub14_Sub1 method4412(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Z")
	boolean method4413(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)Z")
	boolean method4414(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
	int method4415(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)I")
	int method4416(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(BI)I")
	int method4417(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FII)[I")
	int[] method4418(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(II)Z")
	boolean method4419(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(II)Z")
	boolean method4420(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(II)V")
	void method4421(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IB)I")
	int method4422(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(IB)Z")
	boolean method4423(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(II)I")
	int method4424(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	void method4425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
