import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public interface Interface1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	boolean method187(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)I")
	int method188(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Z")
	boolean method189(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)Z")
	boolean method190(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFB)[I")
	int[] method191(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IZ)[I")
	int[] method192(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)Z")
	boolean method193(@OriginalArg(1) int arg0);
}
