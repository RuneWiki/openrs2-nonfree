import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "Lclient!ta;")
	public static Class14 aClass14_15;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lclient!ta;")
	public static Class14 aClass14_16;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "Lclient!ac;")
	public static Class3 aClass3_10;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_559 = Static14.method2017("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
	public static int anInt1141 = 0;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!kc;")
	private static Class36 aClass36_560 = Static14.method2017("Please use a different world)3");

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "Lclient!kc;")
	public static Class36 aClass36_561 = Static14.method2017("Ausw-=hlen");

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Lclient!kc;")
	private static Class36 aClass36_562 = Static14.method2017("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "Lclient!kc;")
	public static Class36 aClass36_563 = aClass36_560;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!kc;")
	public static Class36 aClass36_564 = aClass36_562;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!kc;")
	public static Class36 aClass36_565 = Static14.method2017("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array21 = new Class36[200];

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_566 = aClass36_560;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
	public static void method830(@OriginalArg(1) int arg0) {
		if (!Static104.method1913()) {
			return;
		}
		if (Static27.aBoolean37) {
			Static8.anInt214 = arg0;
		} else {
			Static8.method182(arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method831() {
		aClass14_15 = null;
		anIntArray161 = null;
		aClass3_10 = null;
		aClass36_562 = null;
		aCRC32_1 = null;
		aClass36_565 = null;
		aClass36_559 = null;
		aClass36_560 = null;
		aClass14_16 = null;
		aClass36_561 = null;
		aClass36Array21 = null;
		aClass36_563 = null;
		aClass36_566 = null;
		aClass36_564 = null;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Lclient!va;")
	public static Class2_Sub1_Sub18 method832(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub18 local10 = (Class2_Sub1_Sub18) Static13.aClass22_5.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static36.aClass3_5.method928(arg0, 10);
		local10 = new Class2_Sub1_Sub18();
		local10.anInt2828 = arg0;
		if (local25 != null) {
			local10.method1982(new Class2_Sub12(local25));
		}
		local10.method1980();
		if (local10.anInt2823 != -1) {
			local10.method1986(method832(local10.anInt2823), method832(local10.anInt2836));
		}
		if (!Static27.aBoolean38 && local10.aBoolean132) {
			local10.aClass36Array50 = null;
			local10.anInt2817 = 0;
			local10.aClass36Array49 = null;
			local10.aClass36_1397 = Static16.aClass36_209;
		}
		Static13.aClass22_5.method712(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method833() {
		Static55.aClass22_35.method716();
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public static void method834() {
		if (Static41.aClass29_1 == null) {
			return;
		}
		if (Static79.anInt2048 < 0) {
			if (Static38.anInt969 > 0) {
				Static38.anInt969--;
				if (Static38.anInt969 == 0) {
					if (Static17.aByteArray4 == null) {
						Static41.aClass29_1.method1934(256);
					} else {
						Static41.aClass29_1.method1934(Static88.anInt2316);
						Static79.anInt2048 = Static88.anInt2316;
						Static41.aClass29_1.method1935(Static11.aBoolean4, Static17.aByteArray4, Static88.anInt2316);
						Static17.aByteArray4 = null;
					}
					Static99.anInt2032 = 0;
				}
			}
		} else if (Static38.anInt969 > 0) {
			Static99.anInt2032 += Static20.anInt502;
			Static41.aClass29_1.method1930(Static99.anInt2032, Static79.anInt2048);
			Static38.anInt969--;
			if (Static38.anInt969 == 0) {
				Static41.aClass29_1.method1933();
				Static79.anInt2048 = -1;
				Static38.anInt969 = 20;
			}
		}
		Static41.aClass29_1.method1929();
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public static void method835() {
		if (!Static101.aBoolean119) {
			return;
		}
		Static61.aClass14_22 = null;
		Static58.anIntArray194 = null;
		Static55.aClass14_34 = null;
		Static82.aClass2_Sub1_Sub1_Sub1_20 = null;
		Static38.anIntArray144 = null;
		aClass14_16 = null;
		Static91.anIntArray281 = null;
		Static85.aClass2_Sub1_Sub1_Sub1_21 = null;
		Static107.anIntArray332 = null;
		Static1.anIntArray1 = null;
		Static14.anIntArray346 = null;
		Static55.aClass14_35 = null;
		Static101.aClass14_33 = null;
		Static2.aClass2_Sub1_Sub1_Sub1Array54 = null;
		Static7.anIntArray19 = null;
		Static89.aClass14_28 = null;
		Static110.aClass14_36 = null;
		Static57.aClass14_21 = null;
		Static60.aClass2_Sub1_Sub1_Sub3_5 = null;
		Static7.aClass14_3 = null;
		Static90.anIntArray277 = null;
		Static24.aClass2_Sub1_Sub1_Sub3_3 = null;
		Static113.method2044();
		Static38.method746(true);
		Static101.aBoolean119 = false;
	}
}
