import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt7992;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public static int anInt7997;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
	public static final int[] anIntArray610 = new int[3];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method6700() {
		if (Static155.aBoolean227) {
			return;
		}
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean196) {
			Static161.aFloat56 = (int) Static161.aFloat56 - 65 & 0xFFFFFF80;
		} else {
			Static232.aFloat73 += (-24.0F - Static232.aFloat73) / 2.0F;
		}
		Static253.aBoolean338 = true;
		Static155.aBoolean227 = true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!ps;)V")
	public static void method6701(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (Static346.aClass179_28 == null) {
			return;
		}
		try {
			Static346.aClass179_28.method4528(0L);
			Static346.aClass179_28.method4520(24, arg1.aByteArray96, arg0);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method6702(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static16.anInt362;
		@Pc(9) int[] local9 = Static325.anIntArray473;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class1_Sub1_Sub2_Sub1 local21 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local9[local13]];
			if (local21 != null && local21 != Static266.aClass1_Sub1_Sub2_Sub1_1 && local21.aString83 != null && local21.aString83.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static93.method1721(Static237.aClass243_50);
					Static381.aClass2_Sub29_Sub2_2.method5217(local9[local13]);
					Static381.aClass2_Sub29_Sub2_2.method5220(0);
				} else if (arg0 == 4) {
					Static93.method1721(Static5.aClass243_3);
					Static381.aClass2_Sub29_Sub2_2.method5212(0);
					Static381.aClass2_Sub29_Sub2_2.method5228(local9[local13]);
				} else if (arg0 == 5) {
					Static93.method1721(Static112.aClass243_31);
					Static381.aClass2_Sub29_Sub2_2.method5172(0);
					Static381.aClass2_Sub29_Sub2_2.method5217(local9[local13]);
				} else if (arg0 == 6) {
					Static93.method1721(Static84.aClass243_21);
					Static381.aClass2_Sub29_Sub2_2.method5220(0);
					Static381.aClass2_Sub29_Sub2_2.method5228(local9[local13]);
				} else if (arg0 == 7) {
					Static93.method1721(Static111.aClass243_30);
					Static381.aClass2_Sub29_Sub2_2.method5220(0);
					Static381.aClass2_Sub29_Sub2_2.method5186(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static215.method6797(Static104.aClass202_63.method5139(Static172.anInt6352) + arg1);
		}
	}
}
