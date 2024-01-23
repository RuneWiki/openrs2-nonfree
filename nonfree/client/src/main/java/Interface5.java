import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public interface Interface5 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIFZI)[I")
	int[] method1961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(BI)Lclient!ua;")
	Class168 method1962(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(IB)Z")
	boolean method1963(@OriginalArg(0) int arg0);
}
