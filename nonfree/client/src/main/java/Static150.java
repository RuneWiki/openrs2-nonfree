import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray20;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt7358;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_123 = new Class231("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
	public static void method5917(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static103.anInt5365 != -1) {
				Static188.method5356(Static103.anInt5365);
			}
			for (@Pc(15) Class2_Sub9 local15 = (Class2_Sub9) Static394.aClass220_45.method5096(); local15 != null; local15 = (Class2_Sub9) Static394.aClass220_45.method5098()) {
				if (!local15.method6258()) {
					local15 = (Class2_Sub9) Static394.aClass220_45.method5096();
					if (local15 == null) {
						break;
					}
				}
				Static343.method2399(true, local15, false);
			}
			Static103.anInt5365 = -1;
			Static394.aClass220_45 = new Class220(8);
			Static404.method2274();
			Static103.anInt5365 = Static306.anInt5515;
			Static92.method1399(false);
			Static323.method4576();
			Static76.method1144(Static103.anInt5365);
		}
		Static205.aString31 = "";
		Static448.aString72 = "";
		Static418.aBoolean480 = false;
		Static435.method5890();
		Static236.anInt3995 = -1;
		Static176.method2576(Static447.anInt7439);
		Static127.aClass11_Sub5_Sub2_Sub1_2 = new Class11_Sub5_Sub2_Sub1();
		Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] = Static234.anInt3949 / 2;
		Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 = Static234.anInt3949 * 128 / 2;
		Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 = Static371.anInt6492 * 128 / 2;
		Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0] = Static371.anInt6492 / 2;
		Static120.anInt2052 = 0;
		Static263.anInt4619 = 0;
		if (Static25.anInt7273 == 2) {
			Static263.anInt4619 = Static412.anInt7076 << 7;
			Static120.anInt2052 = Static281.anInt4446 << 7;
		} else {
			Static13.method315();
		}
		Static366.method5130();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
	public static void method5918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(0, 15);
		local8.method2574();
		local8.anInt3131 = arg1;
		local8.anInt3130 = arg0;
	}
}
