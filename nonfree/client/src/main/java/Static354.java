import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_42 = new Class211();

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_109 = new Class66(128);

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString382 = "";

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Lclient!gk;")
	public static Class5_Sub18 method5828() {
		if (Static186.aClass211_36 == null || Static102.aClass191_1 == null) {
			return null;
		}
		for (@Pc(16) Class5_Sub18 local16 = (Class5_Sub18) Static102.aClass191_1.method5235(); local16 != null; local16 = (Class5_Sub18) Static102.aClass191_1.method5235()) {
			@Pc(29) Class121 local29 = Static299.method5085(local16.anInt2293);
			if (local29 != null && local29.aBoolean256 && local29.method3309()) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[[IBLclient!en;I)V")
	public static void method5829(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Class59 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3; local3++) {
			@Pc(15) int[][] local15;
			@Pc(17) int local17;
			@Pc(21) int local21;
			if (arg1 == null) {
				local15 = null;
			} else {
				local15 = new int[Static266.anInt5101 + 1][Static339.anInt6352 + 1];
				for (local17 = 0; local17 <= Static339.anInt6352; local17++) {
					for (local21 = 0; local21 <= Static266.anInt5101; local21++) {
						local15[local21][local17] = Static200.anIntArrayArrayArray17[local3][local21][local17] - arg1[local21][local17];
					}
				}
			}
			local17 = 0;
			local21 = 0;
			if (!arg0) {
				if (Static8.aBoolean7) {
					local17 = 2;
				}
				if (Static322.aBoolean457) {
					local21 = 8;
				}
				if (Static134.anInt2750 != 0) {
					local17 |= 0x1;
					if (local3 == 0 || Static46.anInt1196 >= 96) {
						local21 |= 0x10;
					}
				}
			}
			if (Static8.aBoolean7) {
				local21 |= 0x7;
			}
			@Pc(110) Class3 local110 = arg2.method4874(Static266.anInt5101, Static339.anInt6352, Static200.anIntArrayArrayArray17[local3], local15, local17, local21);
			Static98.method2009(local3, local110);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
	public static int method5830() {
		if (Static162.aBoolean229) {
			return 0;
		} else if (Static26.method628()) {
			return Static114.aBoolean158 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBIIIII)V")
	public static void method5833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(14) Class63_Sub2 local14 = (Class63_Sub2) Static175.aClass24_2.method619(); local14 != null; local14 = (Class63_Sub2) Static175.aClass24_2.method627()) {
			if (Static180.anInt3606 >= local14.anInt2247) {
				local14.method5690();
			} else {
				Static6.method186((local14.anInt2252 << 7) + 64, arg3 >> 1, arg1 >> 1, (local14.anInt2250 << 7) + 64, local14.anInt2246 * 2);
				Static190.aClass91_8.method5308(Static330.anIntArray121[1] + arg2, 0, local14.aString141, local14.anInt2254 | 0xFF000000, arg0 + Static330.anIntArray121[0]);
			}
		}
	}
}
