import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array4;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!th;")
	public static Class168 aClass168_31;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
	public static int[] anIntArray125 = new int[256];

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public static int anInt989 = 0;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "[Lclient!lf;")
	public static Class98[] aClass98Array1 = new Class98[8];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!th;)I")
	public static int method813(@OriginalArg(1) Class168 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4038(Static122.anInt2670)) {
			local5++;
		}
		if (arg0.method4038(Static169.anInt3799)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)[Lclient!ml;")
	public static Class1_Sub3_Sub13[] method815() {
		@Pc(8) Class1_Sub3_Sub13[] local8 = new Class1_Sub3_Sub13[Static165.anInt3668];
		for (@Pc(10) int local10 = 0; local10 < Static165.anInt3668; local10++) {
			@Pc(17) byte[] local17 = Static34.aByteArrayArray5[local10];
			@Pc(25) int local25 = Static50.anIntArray22[local10] * Static95.anIntArray212[local10];
			if (Static151.aBooleanArray19[local10]) {
				@Pc(105) int[] local105 = new int[local25];
				@Pc(109) byte[] local109 = Static102.aByteArrayArray7[local10];
				for (@Pc(111) int local111 = 0; local111 < local25; local111++) {
					local105[local111] = Static234.anIntArray454[local17[local111] & 0xFF] | (local109[local111] & 0xFF) << 24;
				}
				if (Static294.aBoolean367) {
					local8[local10] = new Class1_Sub3_Sub13_Sub1_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], local105);
				} else {
					local8[local10] = new Class1_Sub3_Sub13_Sub2_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], local105);
				}
			} else {
				@Pc(32) int[] local32 = new int[local25];
				for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
					local32[local34] = Static234.anIntArray454[local17[local34] & 0xFF];
				}
				if (Static294.aBoolean367) {
					local8[local10] = new Class1_Sub3_Sub13_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], local32);
				} else {
					local8[local10] = new Class1_Sub3_Sub13_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], local32);
				}
			}
		}
		Static20.method432();
		return local8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wf;B)V")
	public static void method817(@OriginalArg(0) Class191 arg0) {
		if (Static9.anInt283 == arg0.anInt6152) {
			Static29.aBooleanArray6[arg0.anInt6133] = true;
		}
	}
}
