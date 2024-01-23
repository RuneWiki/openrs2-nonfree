import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public interface Interface1 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIIIF)[I")
	int[] method754(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Lclient!nb;")
	Class116 method755(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
	boolean method756(@OriginalArg(0) int arg0);
}
