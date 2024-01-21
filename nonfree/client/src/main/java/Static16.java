import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "Lclient!ve;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_4;

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "Lclient!lb;")
	public static Class45 aClass45_2 = new Class45();

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][105][105];

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[5][5000];

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "Lclient!cb;")
	public static Class12 aClass12_6 = new Class12(128);

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
	public static int anInt553 = 0;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "Lclient!od;")
	private static Class60 aClass60_181 = Static41.method597("white:");

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_177 = aClass60_181;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!od;")
	private static Class60 aClass60_178 = Static41.method597("Loaded input handler");

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "Lclient!od;")
	public static Class60 aClass60_179 = Static41.method597("(U5");

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_180 = Static41.method597("compass");

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lclient!od;")
	public static Class60 aClass60_182 = aClass60_178;

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lclient!od;")
	public static Class60 aClass60_183 = aClass60_181;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "Lclient!od;")
	public static Class60 aClass60_184 = Static41.method597("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method308() {
		aClass60_184 = null;
		anIntArrayArray13 = null;
		aClass60_177 = null;
		aClass60_179 = null;
		aClass45_2 = null;
		aClass60_181 = null;
		aClass60_182 = null;
		aClass10_Sub1_4 = null;
		aClass60_178 = null;
		aClass81_1 = null;
		aClass60_183 = null;
		aClass60_180 = null;
		aClass12_6 = null;
		anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!od;)I")
	public static int method310(@OriginalArg(1) Class60 arg0) {
		if (Static11.anInt428 == 1) {
			return 7;
		} else if (arg0.method1321(Static49.aClass60_462)) {
			return 1;
		} else if (arg0.method1321(Static23.aClass60_255)) {
			return 1;
		} else if (arg0.method1321(Static22.aClass60_246)) {
			return 2;
		} else if (arg0.method1321(Static119.aClass60_1071)) {
			return 2;
		} else if (arg0.method1321(Static24.aClass60_275)) {
			return 3;
		} else if (arg0.method1321(Static15.aClass60_1030)) {
			return 4;
		} else if (arg0.method1321(Static35.aClass60_352)) {
			return 4;
		} else if (arg0.method1321(Static111.aClass60_1026)) {
			return 5;
		} else if (arg0.method1321(Static47.aClass60_433)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method312() {
		if (Static108.aClass40_1 != null) {
			@Pc(3) Class40 local3 = Static108.aClass40_1;
			synchronized (Static108.aClass40_1) {
				Static108.aClass40_1 = null;
			}
		}
	}
}
