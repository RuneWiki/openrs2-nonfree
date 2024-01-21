import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public static int anInt1438 = 0;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_760 = Static32.method683("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public static volatile int anInt1443 = 0;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!ja;")
	public static Class2_Sub13 aClass2_Sub13_1 = new Class2_Sub13(new byte[5000]);

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public static int anInt1445 = 0;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_761 = Static32.method683("::fpsoff");

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!eh;")
	public static Class25 aClass25_6 = new Class25(32);

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!rc;")
	public static Class74 aClass74_46 = new Class74(500);

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method1161() {
		aClass74_46 = null;
		aClass2_Sub13_1 = null;
		aClass49_761 = null;
		aClass25_6 = null;
		anIntArray170 = null;
		aClass49_760 = null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!nd;ZZ)V")
	public static void method1162(@OriginalArg(0) Class57 arg0, @OriginalArg(1) boolean arg1) {
		if (Static175.aClass57_4 != null) {
			try {
				Static175.aClass57_4.method1892();
			} catch (@Pc(8) Exception local8) {
			}
			Static175.aClass57_4 = null;
		}
		Static175.aClass57_4 = arg0;
		Static37.method758(arg1);
		Static93.aClass2_Sub13_2.anInt3940 = 0;
		Static73.anInt1527 = 0;
		Static91.aClass2_Sub2_Sub17_1 = null;
		Static134.aClass2_Sub13_4 = null;
		while (true) {
			@Pc(33) Class2_Sub2_Sub17 local33 = (Class2_Sub2_Sub17) Static118.aClass25_8.method837();
			if (local33 == null) {
				while (true) {
					local33 = (Class2_Sub2_Sub17) Static12.aClass25_2.method837();
					if (local33 == null) {
						if (Static69.aByte4 != 0) {
							try {
								@Pc(92) Class2_Sub13 local92 = new Class2_Sub13(4);
								local92.method2932(4);
								local92.method2932(Static69.aByte4);
								local92.method2921(0);
								Static175.aClass57_4.method1885(4, local92.aByteArray49);
							} catch (@Pc(113) IOException local113) {
								try {
									Static175.aClass57_4.method1892();
								} catch (@Pc(118) Exception local118) {
								}
								Static175.aClass57_4 = null;
								Static69.anInt1423++;
							}
						}
						Static29.anInt714 = 0;
						Static153.aLong133 = Static108.method1828();
						return;
					}
					Static4.aClass46_1.method1574(local33);
					Static21.aClass25_3.method838(local33.aLong157, local33);
					Static24.anInt540++;
					Static4.anInt69--;
				}
			}
			Static133.aClass25_13.method838(local33.aLong157, local33);
			Static134.anInt2914++;
			Static145.anInt3076--;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)Z")
	public static boolean method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static163.anInt695 + arg0 * Static46.anInt1062 >> 16;
		@Pc(19) int local19 = arg2 * Static46.anInt1062 - arg0 * Static163.anInt695 >> 16;
		@Pc(29) int local29 = arg1 * Static126.anInt2751 + local19 * Static105.anInt2201 >> 16;
		@Pc(39) int local39 = arg1 * Static105.anInt2201 - local19 * Static126.anInt2751 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static115.anInt2398 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static3.anInt52 + (local39 << 9) / local29;
			return local55 >= Static23.anInt507 && local55 <= Static170.anInt3725 && local63 >= Static40.anInt977 && local63 <= Static113.anInt2349;
		} else {
			return false;
		}
	}
}
