import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface Interface3 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IFB)[I")
	int[] method122(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z")
	boolean method123(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)Z")
	boolean method124(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Z")
	boolean method125(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IZ)[I")
	int[] method126(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(IZ)Z")
	boolean method127(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
	int method128(@OriginalArg(0) int arg0);
}
