import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public interface Interface4 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BIZIFI)[I")
	int[] method2412(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "(II)Lclient!sc;")
	Class152 method2413(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)Z")
	boolean method2414(@OriginalArg(1) int arg0);
}
