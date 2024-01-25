import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "[I")
	public static final int[] anIntArray15 = new int[4];

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "Lclient!um;")
	public static final Class354 aClass354_3 = new Class354("", 18);

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "[I")
	public static final int[] anIntArray16 = new int[1000];

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_3 = new Class102();

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ha;ZIZ)Lclient!da;")
	public static Class80 method228(@OriginalArg(0) Class57 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class81 local16 = Static446.method6639(arg2, arg0, arg1);
		return local16 == null ? null : local16.aClass80_4;
	}
}
