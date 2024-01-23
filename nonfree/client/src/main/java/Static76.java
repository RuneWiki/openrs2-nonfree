import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Lclient!in;")
	public static Class71 aClass71_10;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public static int anInt1612;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString93 = "Connected to update server";

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "[Lclient!cg;")
	public static Class1_Sub11[] aClass1_Sub11Array1 = new Class1_Sub11[2048];

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString94 = "flash2:";

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public static void method1315() {
		@Pc(14) Container local14;
		if (Static237.aFrame2 != null) {
			local14 = Static237.aFrame2;
		} else if (Static193.aFrame1 == null) {
			local14 = Static253.aClass175_4.anApplet1;
		} else {
			local14 = Static193.aFrame1;
		}
		Static82.anInt1780 = local14.getSize().width;
		Static179.anInt3754 = local14.getSize().height;
		@Pc(37) Insets local37;
		if (Static193.aFrame1 == local14) {
			local37 = Static193.aFrame1.getInsets();
			Static179.anInt3754 -= local37.bottom + local37.top;
			Static82.anInt1780 -= local37.right + local37.left;
		}
		if (Static31.method647() < 2) {
			Static3.anInt122 = 765;
			Static148.anInt3206 = 503;
			Static273.anInt5328 = (Static82.anInt1780 - 765) / 2;
			Static98.anInt2312 = 0;
		} else {
			Static98.anInt2312 = 0;
			Static273.anInt5328 = 0;
			Static3.anInt122 = Static82.anInt1780;
			Static148.anInt3206 = Static179.anInt3754;
		}
		if (Static277.aBoolean412) {
			Static277.method4226(Static3.anInt122, Static148.anInt3206);
		}
		Static156.aCanvas2.setSize(Static3.anInt122, Static148.anInt3206);
		if (local14 == Static193.aFrame1) {
			local37 = Static193.aFrame1.getInsets();
			Static156.aCanvas2.setLocation(Static273.anInt5328 + local37.left, local37.top - -Static98.anInt2312);
		} else {
			Static156.aCanvas2.setLocation(Static273.anInt5328, Static98.anInt2312);
		}
		if (Static116.anInt5593 != -1) {
			Static84.method1470(true);
		}
		Static10.method251();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!fa;Lclient!fa;IBZ)I")
	public static int method1316(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == 1) {
			@Pc(11) int local11 = arg1.anInt1448;
			@Pc(14) int local14 = arg0.anInt1448;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static29.method570(arg0.method1245().aString166, arg1.method1245().aString166, Static202.anInt4089);
		} else if (arg2 == 3) {
			if (arg1.aString85.equals("-")) {
				if (arg0.aString85.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString85.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static29.method570(arg0.aString85, arg1.aString85, Static202.anInt4089);
			}
		} else if (arg2 == 4) {
			return arg1.method1237() ? (arg0.method1237() ? 0 : 1) : (arg0.method1237() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg1.method1234() ? (arg0.method1234() ? 0 : 1) : (arg0.method1234() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg1.method1242() ? (arg0.method1242() ? 0 : 1) : arg0.method1242() ? -1 : 0;
		} else if (arg2 == 7) {
			return arg1.method1239() ? (arg0.method1239() ? 0 : 1) : arg0.method1239() ? -1 : 0;
		} else {
			return arg1.anInt1452 - arg0.anInt1452;
		}
	}
}
