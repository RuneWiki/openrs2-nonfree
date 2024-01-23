import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public interface Interface1 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Lclient!wf;")
	Class188 method1449(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIF)[I")
	int[] method1450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(BI)Z")
	boolean method1451(@OriginalArg(1) int arg0);
}
