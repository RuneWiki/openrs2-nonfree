import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "Lclient!wf;")
	public static Class191 aClass191_9;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public static int anInt4563 = -1;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Z")
	public static boolean aBoolean284 = true;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!wf;")
	public static Class191 aClass191_10 = null;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString313 = null;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)Lclient!ml;")
	public static Class1_Sub3_Sub13 method3368() {
		@Pc(19) int local19 = Static50.anIntArray22[0] * Static95.anIntArray212[0];
		@Pc(23) byte[] local23 = Static34.aByteArrayArray5[0];
		@Pc(26) int[] local26 = new int[local19];
		for (@Pc(28) int local28 = 0; local28 < local19; local28++) {
			local26[local28] = Static234.anIntArray454[local23[local28] & 0xFF];
		}
		@Pc(65) Class1_Sub3_Sub13 local65;
		if (Static294.aBoolean367) {
			local65 = new Class1_Sub3_Sub13_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[0], Static137.anIntArray227[0], Static95.anIntArray212[0], Static50.anIntArray22[0], local26);
		} else {
			local65 = new Class1_Sub3_Sub13_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[0], Static137.anIntArray227[0], Static95.anIntArray212[0], Static50.anIntArray22[0], local26);
		}
		Static20.method432();
		return local65;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Lclient!em;")
	public static Class46 method3370() {
		@Pc(32) Class46 local32;
		if (Static294.aBoolean367) {
			local32 = new Class46_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[0], Static137.anIntArray227[0], Static95.anIntArray212[0], Static50.anIntArray22[0], Static34.aByteArrayArray5[0], Static234.anIntArray454);
		} else {
			local32 = new Class46_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[0], Static137.anIntArray227[0], Static95.anIntArray212[0], Static50.anIntArray22[0], Static34.aByteArrayArray5[0], Static234.anIntArray454);
		}
		Static20.method432();
		return local32;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
	public static void method3371() {
		if (Static253.aClass185_1 != null) {
			@Pc(4) Class185 local4 = Static253.aClass185_1;
			synchronized (Static253.aClass185_1) {
				Static253.aClass185_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method3372() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static29.aBooleanArray6[local11] = true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BZ)V")
	public static void method3373(@OriginalArg(1) boolean arg0) {
		Static63.method1123(Static36.anInt902, Static270.anInt5412, Static38.anInt950, arg0);
	}
}
