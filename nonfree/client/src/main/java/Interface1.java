import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public interface Interface1 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[I")
	int[] method217(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
	boolean method218(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I")
	int method219(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Z")
	boolean method220(@OriginalArg(0) int arg0);
}
