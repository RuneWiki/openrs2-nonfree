import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dm", name = "ib", descriptor = "I")
	public static int anInt1438;

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "Lclient!ug;")
	public static Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!dm", name = "eb", descriptor = "I")
	public static int anInt1436 = -1;

	@OriginalMember(owner = "client!dm", name = "fb", descriptor = "I")
	public static int anInt1437 = 0;

	@OriginalMember(owner = "client!dm", name = "gb", descriptor = "[I")
	public static int[] anIntArray123 = new int[500];

	@OriginalMember(owner = "client!dm", name = "hb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V")
	public static void method1105(@OriginalArg(1) int arg0) {
		Static54.anInt1326 = -1;
		Static54.anInt1326 = -1;
		if (arg0 == 37) {
			Static250.aFloat31 = 3.0F;
		} else if (arg0 == 50) {
			Static250.aFloat31 = 4.0F;
		} else if (arg0 == 75) {
			Static250.aFloat31 = 6.0F;
		} else if (arg0 == 100) {
			Static250.aFloat31 = 8.0F;
		} else if (arg0 == 200) {
			Static250.aFloat31 = 16.0F;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!la;IIIII)Ljava/awt/Frame;")
	public static Frame method1107(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0.method2880()) {
			return null;
		}
		@Pc(26) Class168[] local26 = Static210.method3508(arg0);
		if (local26 == null) {
			return null;
		}
		@Pc(33) boolean local33 = false;
		for (@Pc(35) int local35 = 0; local35 < local26.length; local35++) {
			if (local26[local35].anInt5413 == arg3 && local26[local35].anInt5415 == arg1 && (!local33 || arg2 < local26[local35].anInt5416)) {
				local33 = true;
				arg2 = local26[local35].anInt5416;
			}
		}
		if (!local33) {
			return null;
		}
		@Pc(101) Class111 local101 = arg0.method2887(arg2, arg1, arg3);
		while (local101.anInt3788 == 0) {
			Static138.method2475(10L);
		}
		@Pc(114) Frame local114 = (Frame) local101.anObject4;
		if (local114 == null) {
			return null;
		} else if (local101.anInt3788 == 2) {
			Static249.method3916(arg0, local114);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
	public static void method1109() {
		Static91.aClass2_Sub16_Sub1_1.method2204();
		@Pc(7) int local7 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
		if (local7 == 0) {
			return;
		}
		@Pc(26) int local26 = Static91.aClass2_Sub16_Sub1_1.method2202(2);
		if (local26 == 0) {
			Static132.anIntArray303[Static222.anInt4523++] = 2047;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local26 == 1) {
			local49 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
			Static22.aClass15_Sub2_Sub2_1.method4294(1, local49);
			local59 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
			if (local59 == 1) {
				Static132.anIntArray303[Static222.anInt4523++] = 2047;
			}
		} else if (local26 == 2) {
			if (Static91.aClass2_Sub16_Sub1_1.method2202(1) == 1) {
				local49 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
				Static22.aClass15_Sub2_Sub2_1.method4294(2, local49);
				local59 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
				Static22.aClass15_Sub2_Sub2_1.method4294(2, local59);
			} else {
				local49 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
				Static22.aClass15_Sub2_Sub2_1.method4294(0, local49);
			}
			local49 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
			if (local49 == 1) {
				Static132.anIntArray303[Static222.anInt4523++] = 2047;
			}
		} else if (local26 == 3) {
			Static32.anInt876 = Static91.aClass2_Sub16_Sub1_1.method2202(2);
			local49 = Static91.aClass2_Sub16_Sub1_1.method2202(7);
			local59 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
			if (local59 == 1) {
				Static132.anIntArray303[Static222.anInt4523++] = 2047;
			}
			@Pc(170) int local170 = Static91.aClass2_Sub16_Sub1_1.method2202(7);
			@Pc(175) int local175 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
			Static22.aClass15_Sub2_Sub2_1.method4305(local175 == 1, local49, local170);
		}
	}
}
