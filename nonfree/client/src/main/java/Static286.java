import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "J")
	public static long aLong174;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public static int anInt5199;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_64 = new Class215(8, 8);

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!sp;")
	public static final Class219 aClass219_5 = new Class219("LOCAL", 4);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg1 != Static80.anInt1616) {
			Static341.anIntArray504 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static341.anIntArray504[local9] = (local9 << 12) / arg1;
			}
			Static203.anInt3883 = arg1 - 1;
			Static80.anInt1616 = arg1;
			Static256.anInt4776 = arg1 * 32;
		}
		if (Static262.anInt4939 == arg0) {
			return;
		}
		if (Static80.anInt1616 == arg0) {
			Static165.anIntArray209 = Static341.anIntArray504;
		} else {
			Static165.anIntArray209 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static165.anIntArray209[local9] = (local9 << 12) / arg0;
			}
		}
		Static262.anInt4939 = arg0;
		Static211.anInt3929 = arg0 - 1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!uu;B)V")
	public static void method3975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray21 != null) {
			@Pc(13) Class4_Sub34 local13 = new Class4_Sub34();
			local13.aClass247_15 = arg2;
			local13.anObjectArray4 = arg2.anObjectArray21;
			Static271.method3894(local13);
		}
		Static408.anInt6726 = arg2.anInt6809;
		Static7.anInt5460 = arg0;
		Static341.aBoolean599 = true;
		Static157.anInt3147 = arg2.anInt6773;
		Static161.anInt3179 = arg2.anInt6779;
		Static434.anInt7378 = arg1;
		Static23.anInt350 = arg2.anInt6865;
		Static273.anInt5120 = arg2.anInt6790;
		Static63.method1142(arg2);
	}
}
