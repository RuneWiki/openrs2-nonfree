import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!de", name = "W", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "Lclient!kb;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "Z")
	public static boolean aBoolean24;

	@OriginalMember(owner = "client!de", name = "X", descriptor = "Lclient!af;")
	public static Class5 aClass5_385 = Static45.method1937("Benutzen");

	@OriginalMember(owner = "client!de", name = "rb", descriptor = "Lclient!af;")
	private static Class5 aClass5_392 = Static45.method1937("cyan:");

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "Lclient!af;")
	public static Class5 aClass5_386 = aClass5_392;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "Lclient!af;")
	private static Class5 aClass5_391 = Static45.method1937("Members object");

	@OriginalMember(owner = "client!de", name = "db", descriptor = "Lclient!af;")
	public static Class5 aClass5_387 = aClass5_391;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "Lclient!af;")
	public static Class5 aClass5_388 = Static45.method1937("<img=1>");

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "Lclient!af;")
	public static Class5 aClass5_389 = aClass5_392;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "Lclient!af;")
	public static Class5 aClass5_390 = Static45.method1937("hel");

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "I")
	public static int anInt844 = 127;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
	public static void method585() {
		Static55.aClass28_37.method792();
		Static30.aClass28_23.method792();
		Static121.aClass28_81.method792();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIB)I")
	public static int method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) long local15 = (long) (arg1 + (arg0 << 16));
		return Static51.aClass1_Sub3_Sub15_1 != null && Static51.aClass1_Sub3_Sub15_1.aLong95 == local15 ? Static100.aClass1_Sub20_5.anInt2951 * 99 / (Static100.aClass1_Sub20_5.aByteArray36.length - Static51.aClass1_Sub3_Sub15_1.aByte7) + 1 : 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
	public static int method587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub2 local18 = (Class1_Sub2) Static59.aClass7_6.method287((long) arg0);
		if (local18 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local18.anIntArray11.length) {
			return local18.anIntArray11[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
	public static void method589(@OriginalArg(1) int arg0) {
		if (!Static8.method244(arg0)) {
			return;
		}
		@Pc(14) Class1_Sub17[] local14 = Static49.aClass1_Sub17ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class1_Sub17 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2268 = 0;
				local22.anInt2258 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public static void method590() {
		aClass5_391 = null;
		aClass5_390 = null;
		aClass5_386 = null;
		aClass5_392 = null;
		aClass5_388 = null;
		aClass5_385 = null;
		anIntArray97 = null;
		aClass5_387 = null;
		aClass41_3 = null;
		aClass5_389 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!kb;Lclient!af;Lclient!af;)[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] method592(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) int local13 = arg0.method1724(arg1);
		@Pc(21) int local21 = arg0.method1698(arg2, local13);
		return Static125.method2218(local21, local13, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;B)V")
	public static void method593(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class41 arg2) {
		Static122.aClass41_30 = arg0;
		Static95.aClass41_20 = arg2;
		Static24.aClass41_2 = arg1;
		Static49.aClass1_Sub17ArrayArray1 = new Class1_Sub17[Static122.aClass41_30.method1720()][];
		Static89.aBooleanArray26 = new boolean[Static122.aClass41_30.method1720()];
	}
}
