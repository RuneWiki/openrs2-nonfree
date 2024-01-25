import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array16;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	public static int anInt5288;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public static int anInt5286 = 0;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Lclient!kj;")
	public static final Class192 aClass192_1 = new Class192();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)Z")
	public static boolean method4289() {
		try {
			return Static62.method1097();
		} catch (@Pc(15) IOException local15) {
			Static590.method7839();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(78) String local78 = "T2 - " + (Static504.aClass235_188 == null ? -1 : Static504.aClass235_188.method4740()) + "," + (Static125.aClass235_83 == null ? -1 : Static125.aClass235_83.method4740()) + "," + (Static73.aClass235_31 == null ? -1 : Static73.aClass235_31.method4740()) + " - " + Static445.anInt7693 + "," + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] + Static541.anInt9058) + "," + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] + Static116.anInt2289) + " - ";
			for (@Pc(80) int local80 = 0; local80 < Static445.anInt7693 && local80 < 50; local80++) {
				local78 = local78 + Static585.aClass1_Sub35_Sub2_2.aByteArray85[local80] + ",";
			}
			Static345.method4708(local20, local78);
			Static424.method5868(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZIIIII)V")
	public static void method4291(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg2 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = Static125.aShort36 + (Static286.aShort118 - Static125.aShort36) * local21 / 100;
		if (local46 < Static421.aShort94) {
			local46 = Static421.aShort94;
		} else if (Static59.aShort14 < local46) {
			local46 = Static59.aShort14;
		}
		@Pc(76) int local76 = local46 * 512 * arg2 / (arg3 * 334);
		@Pc(110) int local110;
		@Pc(117) int local117;
		@Pc(85) short local85;
		if (Static75.aShort125 > local76) {
			local85 = Static75.aShort125;
			local46 = local85 * arg3 * 334 / (arg2 * 512);
			if (Static59.aShort14 < local46) {
				local46 = Static59.aShort14;
				local110 = local46 * arg2 * 512 / (local85 * 334);
				local117 = (arg3 - local110) / 2;
				if (arg0) {
					Static16.aClass134_1.JA();
					Static16.aClass134_1.method6929(local117, arg4, arg1, -16777216, arg2);
					Static16.aClass134_1.method6929(local117, arg4, arg3 + arg1 - local117, -16777216, arg2);
				}
				arg1 += local117;
				arg3 -= local117 * 2;
			}
		} else if (Static199.aShort49 < local76) {
			local85 = Static199.aShort49;
			local46 = arg3 * 334 * local85 / (arg2 * 512);
			if (Static421.aShort94 > local46) {
				local46 = Static421.aShort94;
				local110 = arg3 * local85 * 334 / (local46 * 512);
				local117 = (arg2 - local110) / 2;
				if (arg0) {
					Static16.aClass134_1.JA();
					Static16.aClass134_1.method6929(arg3, arg4, arg1, -16777216, local117);
					Static16.aClass134_1.method6929(arg3, arg2 + arg4 - local117, arg1, -16777216, local117);
				}
				arg2 -= local117 * 2;
				arg4 += local117;
			}
		}
		Static31.anInt508 = (short) arg2;
		Static535.anInt8945 = arg1;
		Static447.anInt7726 = arg4;
		Static488.anInt2823 = arg2 * local46 / 334;
		Static126.anInt2508 = (short) arg3;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Lclient!sw;")
	public static Class8_Sub3_Sub1 method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass8_Sub3_Sub1_1 == null ? null : local7.aClass8_Sub3_Sub1_1;
	}
}
