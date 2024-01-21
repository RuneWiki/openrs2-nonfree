import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public static int anInt2466;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array43;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!uf;")
	public static Class75 aClass75_5;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!gf;")
	public static Class28 aClass28_11 = new Class28(512);

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public static int anInt2468 = 0;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array26 = new Class76[500];

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_1161 = Static134.method2017("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	public static volatile int anInt2471 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method1723() {
		Static104.anInt2333 = 0;
		Static48.anInt1228 = 0;
		Static36.method654();
		Static5.method68();
		Static17.method237();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static104.anInt2333; local17++) {
			local23 = Static88.anIntArray290[local17];
			if (Static78.anInt1981 != Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local23].anInt1391) {
				Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local23].aClass4_Sub4_Sub10_1 = null;
				Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local23] = null;
			}
		}
		if (Static30.anInt1437 != Static24.aClass4_Sub10_Sub1_1.anInt931) {
			throw new RuntimeException("gnp1 pos:" + Static24.aClass4_Sub10_Sub1_1.anInt931 + " psize:" + Static30.anInt1437);
		}
		for (local23 = 0; local23 < Static76.anInt1935; local23++) {
			if (Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static47.anIntArray153[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static76.anInt1935);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lclient!m;")
	public static Class4_Sub4_Sub11 method1725(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub4_Sub11 local6 = (Class4_Sub4_Sub11) Static132.aClass72_28.method1781((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static32.aClass17_12.method290(4, arg0);
		local6 = new Class4_Sub4_Sub11();
		if (local27 != null) {
			local6.method1172(arg0, new Class4_Sub10(local27));
		}
		local6.method1170();
		Static132.aClass72_28.method1783(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method1726() {
		aClass76_1161 = null;
		aClass76Array26 = null;
		aClass75_5 = null;
		aClass28_11 = null;
		aClass4_Sub4_Sub5_Sub2Array43 = null;
	}
}
