import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt4825;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
	public static int[] anIntArray546;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Select";

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	public static int anInt4828 = -1;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "[Lclient!id;")
	public static Class83[] aClass83Array1 = new Class83[50];

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
	public static int anInt4835 = 0;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString182 = "flash1:";

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Lclient!td;")
	public static Class1_Sub5_Sub21 method4037() {
		@Pc(15) Class1_Sub5_Sub21 local15 = (Class1_Sub5_Sub21) Static105.aClass189_1.method4600();
		if (local15 != null) {
			local15.method4573();
			local15.method4577();
			return local15;
		}
		do {
			local15 = (Class1_Sub5_Sub21) Static178.aClass189_5.method4600();
			if (local15 == null) {
				return null;
			}
			if (local15.method4067() > Static244.method3859()) {
				return null;
			}
			local15.method4573();
			local15.method4577();
		} while ((local15.aLong211 & Long.MIN_VALUE) == 0L);
		return local15;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method4038() {
		Static312.aClass175_45.method4287();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public static void method4039(@OriginalArg(0) boolean arg0) {
		Static249.anIntArrayArrayArray16 = null;
		Static249.aByteArrayArrayArray18 = null;
		Static249.aByteArrayArrayArray20 = null;
		Static215.aClass96_18 = null;
		Static249.anIntArray609 = null;
		Static249.aByteArrayArrayArray17 = null;
		Static249.aByteArrayArrayArray16 = null;
		Static249.anIntArrayArrayArray15 = null;
		if (arg0 && Static249.aClass1_Sub5_Sub14_3 != null) {
			Static92.anInt1936 = Static249.aClass1_Sub5_Sub14_3.anInt3525;
		} else {
			Static92.anInt1936 = -1;
		}
		Static73.aClass157_8 = null;
		Static249.aClass1_Sub5_Sub14_3 = null;
		Static114.anInt2348 = 0;
		Static249.aByteArrayArrayArray19 = null;
		Static249.aClass189_13.method4604();
		Static239.aClass6_7 = null;
		Static289.aClass6_8 = null;
		Static230.aClass1_Sub5_Sub6_Sub1_4 = null;
		Static148.aClass6_5 = null;
		Static249.aClass78_3 = null;
		Static144.aClass6_4 = null;
		Static182.aClass6_6 = null;
		Static130.aClass1_Sub5_Sub6_4 = null;
		Static24.aClass6_1 = null;
		Static55.aClass6_2 = null;
		Static125.aClass6_3 = null;
		Static55.anInt1176 = -1;
		Static272.anInt5001 = -1;
		Static91.method1739();
		Static260.aClass86_34 = null;
		Static242.aClass86_29 = null;
		Static234.aClass98_1 = null;
		Static153.method2081(128, 64);
		Static84.method1709(64);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!nm;B)V")
	public static void method4040(@OriginalArg(0) Class119 arg0) {
		Static240.anInt4468 = arg0.method3241("runes");
	}
}
