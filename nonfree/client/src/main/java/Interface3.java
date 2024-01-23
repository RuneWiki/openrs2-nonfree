import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public interface Interface3 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lclient!rn;")
	Class145 method959(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZIIF)[I")
	int[] method960(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Z")
	boolean method961(@OriginalArg(0) int arg0);
}
