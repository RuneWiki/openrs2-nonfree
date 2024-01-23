import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Lclient!ce;")
	public static Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString101 = "white:";

	@OriginalMember(owner = "client!fl", name = "rb", descriptor = "[I")
	public static int[] anIntArray189 = new int[4096];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
	public static void method1324() {
		Static292.aClass89_49.method2273(50);
		Static54.aClass89_10.method2273(50);
		Static207.aClass89_30.method2273(50);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public static void method1326() {
		@Pc(3) int local3;
		@Pc(15) int local15;
		for (local3 = -1; local3 < Static16.anInt461; local3++) {
			if (local3 == -1) {
				local15 = 2047;
			} else {
				local15 = Static304.anIntArray533[local3];
			}
			@Pc(25) Class2_Sub4_Sub2 local25 = Static155.aClass2_Sub4_Sub2Array1[local15];
			if (local25 != null && local25.anInt2836 > 0) {
				local25.anInt2836--;
				if (local25.anInt2836 == 0) {
					local25.aString177 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static147.anInt3287; local3++) {
			local15 = Static100.anIntArray224[local3];
			@Pc(77) Class2_Sub4_Sub1 local77 = Static105.aClass2_Sub4_Sub1Array1[local15];
			if (local77 != null && local77.anInt2836 > 0) {
				local77.anInt2836--;
				if (local77.anInt2836 == 0) {
					local77.aString177 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public static void method1328(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static268.aFloat35 = 3.0F;
		} else if (arg0 == 50) {
			Static268.aFloat35 = 4.0F;
		} else if (arg0 == 75) {
			Static268.aFloat35 = 6.0F;
		} else if (arg0 == 100) {
			Static268.aFloat35 = 8.0F;
		} else if (arg0 == 200) {
			Static268.aFloat35 = 16.0F;
		}
		Static202.anInt4408 = -1;
		Static202.anInt4408 = -1;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V")
	public static void method1338(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub3_Sub22 local12 = Static271.method4108(11, arg0);
		local12.method4464();
	}
}
