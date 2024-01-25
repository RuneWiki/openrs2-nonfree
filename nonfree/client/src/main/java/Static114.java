import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt1886 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;IZI)V")
	public static void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		Static525.aClass310_105.anInt9032 = 1;
		@Pc(9) String local9 = arg3.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg0 != -1) {
			@Pc(24) Class108 local24 = Static653.aClass104_2.method2173(arg0);
			if (local24 == null || arg1 != local24.method2205()) {
				return;
			}
			if (local24.method2205()) {
				local16 = local24.aString32;
			} else {
				local14 = local24.anInt2348;
			}
		}
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static252.aClass56_1.anInt1014; local54++) {
			@Pc(60) Class284 local60 = Static252.aClass56_1.method1052(local54);
			if ((!arg5 || local60.aBoolean544) && local60.anInt7752 == -1 && local60.anInt7731 == -1 && local60.anInt7744 == -1 && local60.anInt7762 == 0 && local60.aString89.toLowerCase().indexOf(local9) != -1) {
				if (arg0 != -1) {
					if (arg1) {
						if (!arg2.equals(local60.method6833(arg0, local16))) {
							continue;
						}
					} else if (local60.method6828(local14, arg0) != arg4) {
						continue;
					}
				}
				if (local52 >= 250) {
					Static345.aShortArray74 = null;
					Static280.anInt5164 = -1;
					return;
				}
				if (local12.length <= local52) {
					@Pc(157) short[] local157 = new short[local12.length * 2];
					for (@Pc(159) int local159 = 0; local159 < local52; local159++) {
						local157[local159] = local12[local159];
					}
					local12 = local157;
				}
				local12[local52++] = (short) local54;
			}
		}
		Static280.anInt5164 = local52;
		Static505.anInt8752 = 0;
		Static345.aShortArray74 = local12;
		@Pc(196) String[] local196 = new String[Static280.anInt5164];
		for (@Pc(198) int local198 = 0; local198 < Static280.anInt5164; local198++) {
			local196[local198] = Static252.aClass56_1.method1052(local12[local198]).aString89;
		}
		Static286.method4787(local196, Static345.aShortArray74);
		Static525.aClass310_105.method7789();
		Static525.aClass310_105.anInt9032 = 2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public static void method1816(@OriginalArg(1) int arg0) {
		if (Static181.aClass14_Sub26_9.aClass43_Sub4_1.method1830() == 0) {
			arg0 = -1;
		}
		if (Static582.anInt9621 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(32) Class218 local32 = Static603.aClass279_2.method6657(arg0);
			@Pc(36) Class266 local36 = local32.method5190();
			if (local36 == null) {
				arg0 = -1;
			} else {
				Static344.aClass173_5.method4248(local36.method6469(), local36.method6465(), new Point(local32.anInt5770, local32.anInt5775), Static626.aCanvas12, local36.method6471());
				Static582.anInt9621 = arg0;
			}
		}
		if (arg0 == -1 && Static582.anInt9621 != -1) {
			Static344.aClass173_5.method4248(-1, (int[]) null, new Point(), Static626.aCanvas12, -1);
			Static582.anInt9621 = -1;
		}
	}
}
