import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_31 = new Class238(2, 18);

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public static int anInt7443 = 0;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "[I")
	public static final int[] anIntArray511 = new int[100];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method6107() {
		Static172.aClass87_11 = null;
		Static151.aClass87Array7 = null;
		Static15.aClass87Array1 = null;
		Static227.aClass87Array13 = null;
		Static236.aClass29_2 = null;
		Static311.aClass87Array15 = null;
		Static38.aClass87Array2 = null;
		Static404.aClass87Array17 = null;
		Static85.aClass87Array5 = null;
		Static41.aClass87_4 = null;
		Static340.aClass87Array16 = null;
		Static192.aClass87Array10 = null;
		Static211.aClass87Array12 = null;
		Static95.aClass87Array6 = null;
		Static35.aClass29_1 = null;
		Static201.aClass87Array14 = null;
		Static440.aClass29_3 = null;
		Static77.aClass87Array4 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)I")
	public static int method6108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static398.anIntArray128[arg1 & 0x3] : Static297.anIntArray355[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
	public static void method6109(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static212.method3218(arg0, 5);
		local16.method3084();
	}
}
