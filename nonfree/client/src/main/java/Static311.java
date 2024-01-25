import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
	public static int anInt6287;

	@OriginalMember(owner = "client!tr", name = "W", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!tr", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[100];

	@OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
	public static int anInt6289 = 0;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIII)Z")
	public static boolean method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static39.method938(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static97.method5912(local10 + 1, Static301.aClass73Array31[arg0].method4931(arg1, arg2) + arg3, local14 + 1) && Static97.method5912(local10 + 128 - 1, Static301.aClass73Array31[arg0].method4931(arg1 + 1, arg2) + arg3, local14 + 1) && Static97.method5912(local10 + 128 - 1, Static301.aClass73Array31[arg0].method4931(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static97.method5912(local10 + 1, Static301.aClass73Array31[arg0].method4931(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
