import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public interface Interface2 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Z")
	boolean method1090(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
	boolean method1091(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)I")
	int method1092(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)Z")
	boolean method1093(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)[I")
	int[] method1094(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
	boolean method1095(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIF)[I")
	int[] method1096(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1);
}
