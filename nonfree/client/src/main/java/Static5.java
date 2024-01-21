import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!ga;")
	public static Class30 aClass30_67;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1664 = Static169.method2903("::rect_debug");

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!ia;")
	public static Class41 aClass41_35 = new Class41();

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public static int anInt4365 = 0;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1665 = Static169.method2903(")4lang)4de");

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public static void method3147() {
		aClass41_35 = null;
		aClass23_1665 = null;
		aClass23_1664 = null;
		aClass30_67 = null;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public static void method3148() {
		Static39.method659(Static133.aClass60_12);
		Static30.anInt2834++;
		if (Static77.aBoolean106 && Static50.aBoolean60) {
			@Pc(26) int local26 = Static163.anInt4014;
			local26 -= Static169.anInt4122;
			if (local26 < Static178.anInt4247) {
				local26 = Static178.anInt4247;
			}
			@Pc(45) int local45 = Static96.anInt2484;
			if (Static142.aClass60_13.anInt3014 + Static178.anInt4247 < Static133.aClass60_12.anInt3014 + local26) {
				local26 = Static142.aClass60_13.anInt3014 + Static178.anInt4247 - Static133.aClass60_12.anInt3014;
			}
			@Pc(68) int local68 = local26 - Static60.anInt4362;
			local45 -= Static99.anInt2527;
			if (Static38.anInt1036 > local45) {
				local45 = Static38.anInt1036;
			}
			if (Static142.aClass60_13.anInt3017 + Static38.anInt1036 < Static133.aClass60_12.anInt3017 + local45) {
				local45 = Static38.anInt1036 + Static142.aClass60_13.anInt3017 - Static133.aClass60_12.anInt3017;
			}
			@Pc(103) int local103 = Static142.aClass60_13.anInt2968 + local26 - Static178.anInt4247;
			@Pc(108) int local108 = local45 - Static135.anInt3418;
			@Pc(111) int local111 = Static133.aClass60_12.anInt2989;
			@Pc(119) int local119 = Static142.aClass60_13.anInt3029 + local45 - Static38.anInt1036;
			if (Static30.anInt2834 > Static133.aClass60_12.anInt3037 && (local111 < local68 || -local111 > local68 || local108 > local111 || -local111 > local108)) {
				Static86.aBoolean115 = true;
			}
			@Pc(156) Class1_Sub13 local156;
			if (Static133.aClass60_12.anObjectArray22 != null && Static86.aBoolean115) {
				local156 = new Class1_Sub13();
				local156.anInt2663 = local119;
				local156.aClass60_6 = Static133.aClass60_12;
				local156.anObjectArray3 = Static133.aClass60_12.anObjectArray22;
				local156.anInt2666 = local103;
				Static178.method3065(local156);
			}
			if (Static18.anInt568 == 0) {
				if (Static86.aBoolean115) {
					if (Static133.aClass60_12.anObjectArray13 != null) {
						local156 = new Class1_Sub13();
						local156.anObjectArray3 = Static133.aClass60_12.anObjectArray13;
						local156.anInt2663 = local119;
						local156.aClass60_6 = Static133.aClass60_12;
						local156.anInt2666 = local103;
						local156.aClass60_7 = Static91.aClass60_4;
						Static178.method3065(local156);
					}
					if (Static91.aClass60_4 != null && Static64.method1132(Static133.aClass60_12) != null) {
						Static25.aClass1_Sub8_Sub1_1.method919(173);
						Static25.aClass1_Sub8_Sub1_1.method894(Static91.aClass60_4.anInt3019);
						Static25.aClass1_Sub8_Sub1_1.method879(Static133.aClass60_12.anInt3016);
						Static25.aClass1_Sub8_Sub1_1.method860(Static91.aClass60_4.anInt3016);
						Static25.aClass1_Sub8_Sub1_1.method894(Static133.aClass60_12.anInt3019);
					}
				} else if ((Static90.anInt2406 == 1 || Static88.method1548(Static38.anInt1037 - 1)) && Static38.anInt1037 > 2) {
					Static91.method1598();
				} else if (Static38.anInt1037 > 0) {
					Static103.method1767(Static38.anInt1037 - 1);
				}
				Static133.aClass60_12 = null;
			}
		} else if (Static30.anInt2834 > 1) {
			Static133.aClass60_12 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
	public static int method3150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * 15731 * local20 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!uc;")
	public static RuntimeException_Sub1 method3151(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString5 = local12.aString5 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!ed;B)V")
	public static void method3152(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class23 arg1) {
		@Pc(14) int local14 = Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1.method3062(arg1, 250);
		@Pc(25) int local25 = Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1.method3041(arg1, 250) * 13;
		Static150.method3024(6, 6, local14 + 4 + 4, local25 - -8, 0);
		Static150.method3019(6, 6, local14 + 4 + 4, local25 + 8, 16777215);
		Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1.method3052(arg1, 10, 10, local14, local25, 16777215, -1, 1, 1, 0);
		Static176.method2991(6, local25 + 4 + 4, 6, local14 + 4 + 4);
		if (!arg0) {
			Static103.method1757(local25, 10, 10, local14);
			return;
		}
		try {
			@Pc(117) Graphics local117 = Static91.aCanvas1.getGraphics();
			Static138.aClass25_1.method2795(local117);
		} catch (@Pc(125) Exception local125) {
			Static91.aCanvas1.repaint();
		}
	}
}
