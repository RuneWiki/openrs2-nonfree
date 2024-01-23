import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "[I")
	public static int[] anIntArray512;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!tf", name = "db", descriptor = "Lclient!ek;")
	public static Class42 aClass42_90;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	public static int anInt5269 = -1;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "Z")
	public static volatile boolean aBoolean351 = false;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
	public static int anInt5272 = 0;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
	public static int anInt5273 = -1;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Loading - please wait.";

	@OriginalMember(owner = "client!tf", name = "ib", descriptor = "I")
	public static int anInt5284 = 0;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V")
	public static void method4263(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class2 local14 = Static80.aClass101_4.method2868(); local14 != null; local14 = Static80.aClass101_4.method2859()) {
			if ((local14.aLong214 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method4743();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qc;II)V")
	public static void method4264(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (Static268.anInt5236 < arg0.anInt5335) {
			Static307.method4641(arg0);
		} else if (Static268.anInt5236 > arg0.anInt5328) {
			Static151.method2699(arg0);
		} else {
			Static287.method4464(arg0);
		}
		if (arg0.anInt5358 < 128 || arg0.anInt5371 < 128 || arg0.anInt5358 >= 13184 || arg0.anInt5371 >= 13184) {
			arg0.anInt5328 = 0;
			arg0.anInt5332 = -1;
			arg0.anInt5335 = 0;
			arg0.anInt5301 = -1;
			arg0.anInt5358 = arg0.anIntArray516[0] * 128 + arg0.method4286() * 64;
			arg0.anInt5371 = arg0.anIntArray518[0] * 128 + arg0.method4286() * 64;
			arg0.method4289();
		}
		if (Static22.aClass15_Sub2_Sub2_1 == arg0 && (arg0.anInt5358 < 1536 || arg0.anInt5371 < 1536 || arg0.anInt5358 >= 11776 || arg0.anInt5371 >= 11776)) {
			arg0.anInt5335 = 0;
			arg0.anInt5328 = 0;
			arg0.anInt5332 = -1;
			arg0.anInt5301 = -1;
			arg0.anInt5358 = arg0.anIntArray516[0] * 128 + arg0.method4286() * 64;
			arg0.anInt5371 = arg0.anIntArray518[0] * 128 + arg0.method4286() * 64;
			arg0.method4289();
		}
		Static122.method2049(arg0);
		Static255.method4017(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V")
	public static void method4266(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = Static296.aByteArrayArray19.length;
		@Pc(14) byte[][] local14;
		if (Static116.aBoolean184 && arg0) {
			local14 = Static223.aByteArrayArray14;
		} else {
			local14 = Static195.aByteArrayArray20;
		}
		for (@Pc(32) int local32 = 0; local32 < local8; local32++) {
			@Pc(39) byte[] local39 = local14[local32];
			if (local39 != null) {
				@Pc(53) int local53 = (Static253.anIntArray485[local32] >> 8) * 64 - Static160.anInt5159;
				@Pc(63) int local63 = (Static253.anIntArray485[local32] & 0xFF) * 64 - Static234.anInt4705;
				Static220.method3662();
				Static81.method1478(arg0, local39, Static89.aClass154Array1, local53, local63);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
	public static void method4268() {
		Static214.anInt4373 = 0;
		Static222.anInt4523 = 0;
		Static56.method1109();
		Static306.method4636();
		Static159.method2932();
		Static27.method4372();
		@Pc(25) int local25;
		for (local25 = 0; local25 < Static214.anInt4373; local25++) {
			@Pc(32) int local32 = Static190.anIntArray399[local25];
			if (Static188.aClass15_Sub2_Sub2Array41[local32].anInt5378 != Static268.anInt5236) {
				if (Static188.aClass15_Sub2_Sub2Array41[local32].anInt5401 > 0) {
					Static170.method3082(local32, Static188.aClass15_Sub2_Sub2Array41[local32]);
				}
				Static188.aClass15_Sub2_Sub2Array41[local32] = null;
			}
		}
		if (Static218.anInt4451 != Static91.aClass2_Sub16_Sub1_1.anInt2789) {
			throw new RuntimeException("gpp1 pos:" + Static91.aClass2_Sub16_Sub1_1.anInt2789 + " psize:" + Static218.anInt4451);
		}
		for (local25 = 0; local25 < Static191.anInt4008; local25++) {
			if (Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static191.anInt4008);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static30.method572(Static148.anInt3245, arg3, Static166.anInt3675);
		@Pc(17) int local17 = Static30.method572(Static148.anInt3245, arg2, Static166.anInt3675);
		@Pc(23) int local23 = Static30.method572(Static53.anInt1319, arg1, Static81.anInt1915);
		@Pc(29) int local29 = Static30.method572(Static53.anInt1319, arg4, Static81.anInt1915);
		@Pc(38) int local38 = Static30.method572(Static148.anInt3245, arg3 + arg5, Static166.anInt3675);
		@Pc(47) int local47 = Static30.method572(Static148.anInt3245, arg2 - arg5, Static166.anInt3675);
		@Pc(49) int local49;
		for (local49 = local11; local49 < local38; local49++) {
			Static25.method486(Static275.anIntArrayArray37[local49], local23, local29, arg0);
		}
		for (local49 = local17; local49 > local47; local49--) {
			Static25.method486(Static275.anIntArrayArray37[local49], local23, local29, arg0);
		}
		@Pc(95) int local95 = Static30.method572(Static53.anInt1319, arg1 + arg5, Static81.anInt1915);
		@Pc(104) int local104 = Static30.method572(Static53.anInt1319, arg4 - arg5, Static81.anInt1915);
		for (local49 = local38; local49 <= local47; local49++) {
			@Pc(113) int[] local113 = Static275.anIntArrayArray37[local49];
			Static25.method486(local113, local23, local95, arg0);
			Static25.method486(local113, local95, local104, arg6);
			Static25.method486(local113, local104, local29, arg0);
		}
	}
}
