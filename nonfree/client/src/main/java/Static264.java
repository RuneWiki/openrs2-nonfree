import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt4974;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!lc;")
	public static Class98 aClass98_153;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!lc;")
	public static Class98 aClass98_154;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "[I")
	public static int[] anIntArray443 = new int[25];

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!dh;")
	public static Class33 aClass33_38 = new Class33(16);

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString178 = "white:";

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method3975() {
		Static160.aClass33_28.method839();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	public static void method3976(@OriginalArg(1) int arg0) {
		if (arg0 == Static267.anInt3573) {
			return;
		}
		@Pc(31) boolean local31 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (Static267.anInt3573 == 0) {
			Static87.method1402();
		}
		if (arg0 == 40) {
			Static47.method748();
		}
		if (arg0 != 40 && Static298.aClass158_4 != null) {
			Static298.aClass158_4.method3779();
			Static298.aClass158_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static30.anInt609 = 1;
			Static5.anInt134 = 0;
			Static131.anInt2782 = 0;
			Static117.anInt2596 = 0;
			Static69.anInt1273 = 1;
			Static261.method3958(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static94.method1517();
		}
		if (arg0 == 5) {
			Static96.method1561(Static288.aClass98_66);
		} else {
			Static275.method4100();
		}
		@Pc(117) boolean local117 = Static267.anInt3573 == 5 || Static267.anInt3573 == 10 || Static267.anInt3573 == 28;
		if (local31 != local117) {
			if (local31) {
				Static67.anInt1256 = Static14.anInt2097;
				if (Static52.anInt1043 == 0) {
					Static115.method1990();
				} else {
					Static3.method46(255, Static14.anInt2097, Static94.aClass98_56);
				}
				Static103.aClass113_1.method2675(false);
			} else {
				Static115.method1990();
				Static103.aClass113_1.method2675(true);
			}
		}
		if (Static178.aBoolean216 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static178.method2753();
		}
		Static267.anInt3573 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method3977(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub2_Sub21 local8 = Static39.method4121(arg1, 3);
		local8.method4360();
		local8.aString192 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method3978() {
		anIntArray443 = null;
		aClass98_153 = null;
		aString178 = null;
		aClass33_38 = null;
		aClass98_154 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!lc;)[Lclient!tb;")
	public static Class59_Sub2[] method3979(@OriginalArg(1) int arg0, @OriginalArg(3) Class98 arg1) {
		return Static292.method4344(arg0, 0, arg1) ? Static2.method12() : null;
	}
}
