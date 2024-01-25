import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!nh;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Lclient!qh;")
	public static Class4_Sub5_Sub17 aClass4_Sub5_Sub17_1;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Lclient!pe;")
	public static final Class276 aClass276_4 = new Class276(1);

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	public static int anInt904 = -50;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIZ)V")
	public static void method825(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static261.method3766(arg1, Static279.aClass179_12.method4066(Static164.anInt2984), arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IFILclient!fba;IF[BFIIIFF)V")
	public static void method826(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class107 arg2, @OriginalArg(5) float arg3, @OriginalArg(6) byte[] arg4, @OriginalArg(7) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static642.method8556(arg1, arg3, arg5, arg6, arg2, local7, arg0, arg4, arg7);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[Ljava/lang/String;[I)V")
	public static void method827(@OriginalArg(1) String[] arg0, @OriginalArg(2) int[] arg1) {
		Static256.method3699(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class4_Sub5_Sub11 local17 = Static652.method8695((long) arg0, 13);
		local17.method3955();
		local17.anInt4427 = arg1;
	}
}
