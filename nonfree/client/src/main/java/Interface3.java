import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public interface Interface3 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lclient!aa;")
	Class2 method1235(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZIIF)[I")
	int[] method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)Z")
	boolean method1237(@OriginalArg(0) int arg0);
}
