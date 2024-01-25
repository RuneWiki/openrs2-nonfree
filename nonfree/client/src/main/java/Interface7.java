import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface7 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZFIII)[I")
	int[] method2128(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FIIBZI)[I")
	int[] method2129(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZFBIII)[F")
	float[] method2130(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!dv;")
	Class62 method2131(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)Z")
	boolean method2132(@OriginalArg(0) int arg0);
}
