import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Lclient!ok;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_20 = new Class109(50);

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public static void method1406() {
		if (Static230.anIntArray424 != null) {
			return;
		}
		Static230.anIntArray424 = new int[65536];
		@Pc(22) double local22 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
			@Pc(38) float local38 = ((float) (local26 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local26 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(55) float local55 = (float) local49 / 128.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(59) float local59 = 0.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(65) float local65 = local38 / 60.0F;
				@Pc(68) int local68 = (int) local65;
				@Pc(72) int local72 = local68 % 6;
				@Pc(78) float local78 = (float) -local68 + local65;
				@Pc(84) float local84 = (1.0F - local47) * local55;
				@Pc(92) float local92 = local55 * (1.0F - local47 * local78);
				@Pc(102) float local102 = local55 * (1.0F - (1.0F - local78) * local47);
				if (local72 == 0) {
					local61 = local84;
					local59 = local102;
					local57 = local55;
				} else if (local72 == 1) {
					local59 = local55;
					local61 = local84;
					local57 = local92;
				} else if (local72 == 2) {
					local59 = local55;
					local61 = local102;
					local57 = local84;
				} else if (local72 == 3) {
					local61 = local55;
					local57 = local84;
					local59 = local92;
				} else if (local72 == 4) {
					local59 = local84;
					local61 = local55;
					local57 = local102;
				} else if (local72 == 5) {
					local61 = local92;
					local57 = local55;
					local59 = local84;
				}
				local57 = (float) Math.pow((double) local57, local22);
				local59 = (float) Math.pow((double) local59, local22);
				local61 = (float) Math.pow((double) local61, local22);
				@Pc(192) int local192 = (int) (local57 * 256.0F);
				@Pc(197) int local197 = (int) (local59 * 256.0F);
				@Pc(202) int local202 = (int) (local61 * 256.0F);
				@Pc(215) int local215 = (local197 << 8) + (local192 << 16) + local202 - 16777216;
				Static230.anIntArray424[local24++] = local215;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILclient!jq;ZI)V")
	public static void method1407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub5_Sub2 arg3) {
		Static84.method3936(arg2, arg0, arg3.anInt6632, arg1, arg3.anInt6631, 0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!vg;BII)V")
	public static void method1411(@OriginalArg(0) Class201 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static54.aBoolean72) {
			@Pc(20) String local20;
			for (@Pc(13) int local13 = 9; local13 >= 5; local13--) {
				local20 = Static246.method4393(local13, arg0);
				if (local20 != null) {
					Static30.method540(local20, 1009, arg0.anInt6548, (long) (local13 + 1), arg0.anInt6541, Static70.method1313(arg0, local13), arg0.aString62);
				}
			}
			local20 = Static89.method1617(arg0);
			if (local20 != null) {
				Static30.method540(local20, 5, arg0.anInt6548, 0L, arg0.anInt6541, arg0.anInt6527, arg0.aString62);
			}
			for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
				@Pc(80) String local80 = Static246.method4393(local73, arg0);
				if (local80 != null) {
					Static30.method540(local80, 2, arg0.anInt6548, (long) (local73 + 1), arg0.anInt6541, Static70.method1313(arg0, local73), arg0.aString62);
				}
			}
			if (Static45.method707(arg0).method5747()) {
				if (arg0.aString63 == null) {
					Static30.method540(Static127.aClass85_60.method2020(Static41.anInt726), 23, arg0.anInt6548, 0L, arg0.anInt6541, -1, "");
				} else {
					Static30.method540(arg0.aString63, 23, arg0.anInt6548, 0L, arg0.anInt6541, -1, "");
				}
			}
		} else if (Static45.method707(arg0).method5746() && (Static5.anInt93 & 0x20) != 0) {
			Static30.method540(Static255.aString49, 6, arg0.anInt6548, 0L, arg0.anInt6541, Static169.anInt6216, Static230.aString42 + " -> " + arg0.aString62);
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method1412() {
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			Static349.aBooleanArray26[local6] = false;
		}
		Static288.anInt5652 = -1;
		Static78.anInt1476 = -1;
		Static53.anInt992 = 1;
		Static350.anInt6717 = 0;
		Static30.anInt601 = 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!of;IZ)V")
	public static void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1.anInt5383 && arg2 != -1) {
			@Pc(23) Class89 local23 = Static162.method2849(arg2);
			@Pc(26) int local26 = local23.anInt2468;
			if (local26 == 1) {
				arg1.anInt5365 = 0;
				arg1.anInt5353 = 0;
				arg1.anInt5389 = 0;
				arg1.anInt5409 = 1;
				arg1.anInt5382 = arg0;
				Static311.method3258(local23, arg1.anInt6631, arg1 == Static192.aClass4_Sub5_Sub2_Sub1_2, arg1.anInt5365, arg1.anInt6632);
			}
			if (local26 == 2) {
				arg1.anInt5353 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt5383 == -1 || Static162.method2849(arg2).anInt2465 >= Static162.method2849(arg1.anInt5383).anInt2465) {
			arg1.anInt5419 = arg1.anInt5413;
			arg1.anInt5409 = 1;
			arg1.anInt5383 = arg2;
			arg1.anInt5365 = 0;
			arg1.anInt5382 = arg0;
			arg1.anInt5389 = 0;
			arg1.anInt5353 = 0;
			if (arg1.anInt5383 == -1) {
				return;
			}
			Static311.method3258(Static162.method2849(arg1.anInt5383), arg1.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2 == arg1, arg1.anInt5365, arg1.anInt6632);
		}
	}
}
