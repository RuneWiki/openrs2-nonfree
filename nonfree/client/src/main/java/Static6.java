import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_92 = Static177.method3050(":trade:");

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[Lclient!cb;")
	public static final Class13[] aClass13Array1 = new Class13[50];

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2 = null;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_93 = Static177.method3050("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_95 = Static177.method3050("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!jd;")
	public static Class46 aClass46_94 = aClass46_95;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	public static int anInt227 = 0;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_96 = Static177.method3050("jlv");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[BI)I")
	public static int method97(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static39.method692(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!h;I)V")
	public static void method98(@OriginalArg(0) Class4_Sub11 arg0) {
		if (Static50.aClass56_1 != null) {
			try {
				Static50.aClass56_1.method1966(0L);
				Static50.aClass56_1.method1958(arg0.aByteArray19, 24, arg0.anInt1597);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt1597 += 24;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].anInt1036 = arg3;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method100() {
		if (Static43.aClass41_1 != null) {
			Static43.aClass41_1.method2047();
		}
		if (Static156.aClass41_2 != null) {
			Static156.aClass41_2.method2047();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method101() {
		Static128.aClass28_1.method3131();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static143.aLongArray38[local10] = 0L;
		}
		for (@Pc(32) int local32 = 0; local32 < 32; local32++) {
			Static174.aLongArray45[local32] = 0L;
		}
		Static143.anInt3326 = 0;
	}
}
