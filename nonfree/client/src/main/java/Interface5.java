import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface5 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method6867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZFIIII)[I")
	int[] method6868(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!je;")
	Class156 method6869(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method6870(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIFZI)[F")
	float[] method6871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	int method6872();
}
