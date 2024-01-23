import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public interface Interface3 {

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(II)Z")
	boolean method4584(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(IB)Lclient!jd;")
	Class85 method4585(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIFI)[I")
	int[] method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);
}
