import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_95;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_96;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1434 = Static177.method3050("document)3cookie=(R");

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1435 = Static177.method3050(":assist:");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method3014() {
		@Pc(3) int local3 = Static9.anInt327;
		@Pc(5) int local5 = Static148.anInt3380;
		@Pc(7) int local7 = Static185.anInt4084;
		@Pc(19) int local19 = Static163.anInt3720;
		Static145.method2941(local3, local5, local7, local19, 6116423);
		Static145.method2941(local3 + 1, local5 - -1, local7 - 2, 16, 0);
		Static145.method2945(local3 + 1, local5 - -18, local7 - 2, local19 + -19, 0);
		Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method890(Static61.aClass46_595, local3 + 3, local5 + 14, 6116423, -1);
		@Pc(64) int local64 = Static25.anInt620;
		@Pc(66) int local66 = Static169.anInt3778;
		for (@Pc(68) int local68 = 0; local68 < Static3.anInt86; local68++) {
			@Pc(83) int local83 = (Static3.anInt86 - local68 - 1) * 15 + local5 + 31;
			@Pc(85) int local85 = 16777215;
			if (local3 < local64 && local64 < local3 + local7 && local66 > local83 - 13 && local83 + 3 > local66) {
				local85 = 16776960;
			}
			Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method890(Static180.method3091(local68), local3 + 3, local83, local85, 0);
		}
		Static117.method2133(Static163.anInt3720, Static148.anInt3380, Static185.anInt4084, Static9.anInt327);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
	public static int method3016(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	public static void method3019(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static139.aBooleanArray13[arg0]) {
			return;
		}
		Static167.aClass62_42.method2880(arg0);
		if (Static54.aClass1ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static54.aClass1ArrayArray1[arg0].length; local27++) {
			if (Static54.aClass1ArrayArray1[arg0][local27] != null) {
				if (Static54.aClass1ArrayArray1[arg0][local27].anInt7 == 2) {
					local25 = false;
				} else {
					Static54.aClass1ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static54.aClass1ArrayArray1[arg0] = null;
		}
		Static139.aBooleanArray13[arg0] = false;
	}
}
