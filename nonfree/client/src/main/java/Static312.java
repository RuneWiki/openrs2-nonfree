import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public static int anInt6516 = -1;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString259 = "M";

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
	public static final int[] anIntArray808 = new int[13];

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public static void method5687() {
		if (Static132.aBoolean236) {
			return;
		}
		Static132.aBoolean236 = true;
		Static1.aBoolean13 = true;
		if (Static102.aBoolean179) {
			Static233.aFloat86 = (int) Static233.aFloat86 + 47 & 0xFFFFFFF0;
		} else {
			Static71.aFloat29 += (12.0F - Static71.aFloat29) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)V")
	public static void method5688(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub2 local12 = Static42.method1000(14, arg0);
		local12.method167();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method5690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static248.aClass1_Sub7_Sub1_2.method728(4);
		Static248.aClass1_Sub7_Sub1_2.method3142(arg1);
		Static248.aClass1_Sub7_Sub1_2.method3119(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V")
	public static void method5691(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class1 local14 = Static324.aClass26_31.method871(); local14 != null; local14 = Static324.aClass26_31.method878()) {
			if ((local14.aLong215 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method5710();
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
	public static void method5692(@OriginalArg(0) int arg0) {
		Static215.anInt4248 = -1;
		Static185.anInt1061 = arg0;
		Static215.anInt4248 = -1;
		Static346.method5645();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)I")
	public static int method5693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static7.aClass41Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(19) int local19 = arg0 >> 7;
			@Pc(23) int local23 = arg4 >> 7;
			if (arg3 < 0 || arg1 < 0 || arg3 > Static48.anInt1107 - 1 || arg1 > Static337.anInt6402 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static48.anInt1107 - 1 && local23 <= Static337.anInt6402 - 1) {
				@Pc(89) boolean local89 = (Static183.aByteArrayArrayArray7[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(114) boolean local114;
				@Pc(133) boolean local133;
				if ((arg0 & 0x7F) == 0) {
					local114 = (Static183.aByteArrayArrayArray7[1][local19 - 1][arg4 >> 7] & 0x2) != 0;
					local133 = (Static183.aByteArrayArrayArray7[1][local19][arg4 >> 7] & 0x2) != 0;
					if (local133 != local114) {
						local89 = (Static183.aByteArrayArrayArray7[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local114 = (Static183.aByteArrayArrayArray7[1][arg0 >> 7][local23 - 1] & 0x2) != 0;
					local133 = (Static183.aByteArrayArrayArray7[1][arg0 >> 7][local23] & 0x2) != 0;
					if (local114 != local133) {
						local89 = (Static183.aByteArrayArrayArray7[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if (local89) {
					arg2++;
				}
				return Static7.aClass41Array1[arg2].method5433(arg0, arg4);
			} else {
				return 0;
			}
		} else {
			return Static7.aClass41Array1[arg2].method5433(arg0, arg4);
		}
	}
}
