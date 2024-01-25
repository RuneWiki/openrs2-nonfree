import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	public static int anInt6740;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt6742;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
	public static final int[] anIntArray503 = new int[64];

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray185 = new int[128][128];

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray186 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public static void method5845() {
		@Pc(1) Class119 local1 = Static153.aClass119_96;
		synchronized (Static153.aClass119_96) {
			Static153.aClass119_96.method3312();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZII)V")
	public static void method5848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub11_Sub19 local12 = Static306.method5411(9, arg1);
		local12.method5537();
		local12.anInt6362 = arg2;
		local12.anInt6365 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	public static void method5849() {
		@Pc(1) Class119 local1 = Static290.aClass119_174;
		synchronized (Static290.aClass119_174) {
			Static290.aClass119_174.method3304();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Z")
	public static boolean method5850(@OriginalArg(1) int arg0) {
		@Pc(7) Class20_Sub1 local7 = Static328.method5761(arg0);
		if (local7 == null) {
			return false;
		} else if (Static268.anInt5456 == 3) {
			@Pc(39) String local39 = "";
			if (Static183.anInt3622 != 0) {
				local39 = ":" + (local7.anInt500 + 7000);
			}
			@Pc(57) String local57 = "";
			if (Static331.aString28 != null) {
				local57 = "/p=" + Static331.aString28;
			}
			@Pc(106) String local106 = "http://" + local7.aString10 + local39 + "/l=" + Static21.anInt455 + "/a=" + Static94.anInt2145 + local57 + "/j" + (Static18.aBoolean56 ? "1" : "0") + ",o" + (Static36.aBoolean76 ? "1" : "0") + ",a2";
			try {
				Static293.aClient1.getAppletContext().showDocument(new URL(local106), "_self");
				return true;
			} catch (@Pc(116) Exception local116) {
				return false;
			}
		} else {
			Static261.anInt5114 = local7.anInt500;
			Static85.aString19 = local7.aString10;
			if (Static183.anInt3622 != 0) {
				Static163.anInt1490 = Static261.anInt5114 + 50000;
				Static165.anInt3323 = Static261.anInt5114 + 40000;
				Static256.anInt5074 = Static165.anInt3323;
			}
			return true;
		}
	}
}
