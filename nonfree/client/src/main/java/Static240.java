import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!qk;IIB)V")
	public static void method8601(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static190.aBoolean232) {
			@Pc(13) Class300 local13 = Static540.anInt9171 == -1 ? null : Static449.aClass55_2.method1843(Static540.anInt9171);
			if (Static76.method1833(arg0).method2319() && (Static37.anInt1189 & 0x20) != 0 && (local13 == null || arg0.method7076(Static540.anInt9171, local13.anInt8686) != local13.anInt8686)) {
				Static582.method8234(Static136.aString18, true, arg0.anInt8185, false, Static11.aString107 + " -> " + arg0.aString91, arg0.anInt8147, (long) (arg0.anInt8147 << 0 | arg0.anInt8185), Static262.anInt4805, 0L, 25, arg0.anInt8217, false);
			}
		}
		@Pc(99) String local99;
		for (@Pc(84) int local84 = 9; local84 >= 5; local84--) {
			local99 = Static301.method4796(arg0, local84);
			if (local99 != null) {
				Static582.method8234(local99, true, arg0.anInt8185, false, arg0.aString91, arg0.anInt8147, (long) (arg0.anInt8185 | arg0.anInt8147 << 0), Static508.method7597(local84, arg0), (long) (local84 + 1), 1002, arg0.anInt8217, false);
			}
		}
		local99 = Static203.method3500(arg0);
		if (local99 != null) {
			Static582.method8234(local99, true, arg0.anInt8185, false, arg0.aString91, arg0.anInt8147, (long) (arg0.anInt8147 << 0 | arg0.anInt8185), arg0.anInt8190, 0L, 16, arg0.anInt8217, false);
		}
		for (@Pc(178) int local178 = 4; local178 >= 0; local178--) {
			@Pc(185) String local185 = Static301.method4796(arg0, local178);
			if (local185 != null) {
				Static582.method8234(local185, true, arg0.anInt8185, false, arg0.aString91, arg0.anInt8147, (long) (arg0.anInt8185 | arg0.anInt8147 << 0), Static508.method7597(local178, arg0), (long) (local178 + 1), 45, arg0.anInt8217, false);
			}
		}
		if (!Static76.method1833(arg0).method2317()) {
			return;
		}
		if (arg0.aString90 == null) {
			Static582.method8234(Static59.aClass43_9.method1598(Static325.anInt6083), true, arg0.anInt8185, false, "", arg0.anInt8147, (long) (arg0.anInt8147 << 0 | arg0.anInt8185), -1, 0L, 4, arg0.anInt8217, false);
		} else {
			Static582.method8234(arg0.aString90, true, arg0.anInt8185, false, "", arg0.anInt8147, (long) (arg0.anInt8185 | arg0.anInt8147 << 0), -1, 0L, 4, arg0.anInt8217, false);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	public static void method8602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static542.aClass222_7 == Static212.aClass222_2) {
			if (!Static396.method5709(1, 0, -2, 1, arg1, arg0, 0, false)) {
				Static396.method5709(1, 0, -3, 1, arg1, arg0, 0, false);
			}
		} else if (!Static396.method5709(1, 0, -3, 1, arg1, arg0, 0, false)) {
			Static396.method5709(1, 0, -2, 1, arg1, arg0, 0, false);
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
	public static void method8606() {
		if (Static423.anInt7643 < 0) {
			return;
		}
		@Pc(4) long local4 = Static374.method6036();
		Static423.anInt7643 = (int) ((long) Static423.anInt7643 + Static222.aLong120 - local4);
		if (Static423.anInt7643 > 0) {
			@Pc(20) int local20 = (Static423.anInt7643 << 8) / Static153.anInt3027;
			@Pc(25) int local25 = 255 - local20;
			@Pc(30) float local30 = (float) local20 / 255.0F;
			@Pc(34) float local34 = 1.0F - local30;
			Static527.anInt8993 = (local25 * (Static2.aClass16_1.anInt817 & 0xFF00FF) + (Static556.anInt9295 & 0xFF00FF) * local20 & 0xFF00FF00) + ((Static2.aClass16_1.anInt817 & 0xFF00) * local25 + (Static556.anInt9295 & 0xFF00) * local20 & 0xFF0000) >>> 8;
			Static386.aFloat161 = Static76.aFloat65 + (Static2.aClass16_1.aFloat43 - Static76.aFloat65) * local34;
			Static448.aFloat183 = Static401.aFloat164 + (Static2.aClass16_1.aFloat41 - Static401.aFloat164) * local34;
			Static291.aFloat105 = Static63.aFloat62 + (Static2.aClass16_1.aFloat39 - Static63.aFloat62) * local34;
			Static485.aFloat186 = local34 * (Static2.aClass16_1.aFloat44 - Static644.aFloat214) + Static644.aFloat214;
			Static436.aFloat181 = Static537.aFloat201 + (Static2.aClass16_1.aFloat42 - Static537.aFloat201) * local34;
			Static271.anInt4937 = local20 * Static431.anInt7785 + local25 * Static2.aClass16_1.anInt816 >> 8;
			Static199.anInt3921 = (local20 * (Static341.anInt9028 & 0xFF00FF) + (Static2.aClass16_1.anInt814 & 0xFF00FF) * local25 & 0xFF00FF00) + ((Static341.anInt9028 & 0xFF00) * local20 + ((Static2.aClass16_1.anInt814 & 0xFF00) * local25) & 0xFF0000) >>> 8;
			Static427.aFloat180 = (Static2.aClass16_1.aFloat40 - Static303.aFloat108) * local34 + Static303.aFloat108;
			if (Static128.aClass205_2 != Static2.aClass16_1.aClass205_1) {
				Static594.aClass205_4 = Static383.aClass5_12.method7564(Static128.aClass205_2, Static2.aClass16_1.aClass205_1, local34, Static594.aClass205_4);
			}
		} else {
			Static436.aFloat181 = Static2.aClass16_1.aFloat42;
			Static594.aClass205_4 = Static2.aClass16_1.aClass205_1;
			Static427.aFloat180 = Static2.aClass16_1.aFloat40;
			Static271.anInt4937 = Static2.aClass16_1.anInt816;
			Static291.aFloat105 = Static2.aClass16_1.aFloat39;
			Static199.anInt3921 = Static2.aClass16_1.anInt814;
			Static527.anInt8993 = Static2.aClass16_1.anInt817;
			Static448.aFloat183 = Static2.aClass16_1.aFloat41;
			Static485.aFloat186 = Static2.aClass16_1.aFloat44;
			Static386.aFloat161 = Static2.aClass16_1.aFloat43;
			Static423.anInt7643 = -1;
		}
		Static222.aLong120 = local4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public static void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(11, arg1);
		local8.method3608();
		local8.anInt4064 = arg2;
		local8.anInt4062 = arg0;
	}
}
