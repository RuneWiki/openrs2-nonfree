import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_109 = new Class316(58, 1);

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	public static final int anInt8689 = 52;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
	public static int anInt8692 = 0;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "Lclient!wn;")
	public static final Class349 aClass349_15 = new Class349();

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "Lclient!oj;")
	public static final Class234 aClass234_44 = new Class234(64);

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	public static int anInt8696 = -1;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)I")
	public static int method6914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static417.anInt7443 == -1) {
			return 1;
		}
		if (Static79.anInt2700 != arg1) {
			Static584.method7942(arg1);
			if (Static79.anInt2700 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Static77.aCanvas1.getSize();
			Static237.method3695(Static146.aClass103_14.method2355(Static188.anInt28), Static75.aClass82_1, true);
			@Pc(46) Class134 local46 = Static311.method4670(Static509.aClass248_75, Static417.anInt7443);
			@Pc(49) long local49 = Static416.method5922();
			Static554.aClass90_12.F();
			Static211.aClass93_7.GA(0, Static259.anInt4703, 0);
			Static554.aClass90_12.method7492(Static211.aClass93_7);
			Static554.aClass90_12.m(local32.width / 2, local32.height / 2, 512, 512);
			Static554.aClass90_12.ha(1.0F);
			Static554.aClass90_12.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(90) Class24 local90 = Static554.aClass90_12.method7464(local46, 2048, 64, 64, 768);
			@Pc(92) int local92 = 0;
			label41: for (@Pc(94) int local94 = 0; local94 < 500; local94++) {
				Static554.aClass90_12.D(0);
				Static554.aClass90_12.method7521();
				for (@Pc(103) int local103 = 15; local103 >= 0; local103--) {
					for (@Pc(107) int local107 = 0; local107 <= local103; local107++) {
						Static445.aClass93_8.GA((int) ((float) Static113.anInt1928 * (-((float) local103 / 2.0F) + (float) local107)), 0, (local103 + 1) * Static113.anInt1928);
						local92++;
						local90.method7393(Static445.aClass93_8, null, 0);
						if (Static416.method5922() - local49 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static554.aClass90_12.method7475();
			@Pc(182) long local182 = (long) (local92 * 1000) / (Static416.method5922() - local49);
			Static554.aClass90_12.D(0);
			Static554.aClass90_12.method7521();
			return (int) local182;
		} catch (@Pc(191) Throwable local191) {
			local191.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6915(@OriginalArg(0) Class90 arg0) {
		arg0.ca(0, 0, Static367.anInt6719, 350);
		arg0.C(0, 0, Static367.anInt6719, 350, Static209.anInt3960 << 24 | 0x332277, 1);
		@Pc(32) int local32 = 350 / Static362.anInt6648;
		@Pc(41) int local41;
		if (Static112.anInt1887 > 0) {
			local41 = 346 - Static362.anInt6648 - 4;
			@Pc(51) int local51 = local32 * local41 / (local32 + Static112.anInt1887 - 1);
			@Pc(53) int local53 = 4;
			if (Static112.anInt1887 > 1) {
				local53 = (Static112.anInt1887 - Static446.anInt7893 - 1) * (-local51 + local41) / (Static112.anInt1887 - 1) + 4;
			}
			arg0.C(Static367.anInt6719 - 16, local53, 12, local51, Static209.anInt3960 << 24 | 0x332277, 2);
			for (@Pc(90) int local90 = Static446.anInt7893; local90 < local32 + Static446.anInt7893 && local90 < Static112.anInt1887; local90++) {
				@Pc(101) String[] local101 = Static395.method5728(Static415.aStringArray33[local90], '\b');
				@Pc(108) int local108 = (Static367.anInt6719 - 24) / local101.length;
				for (@Pc(110) int local110 = 0; local110 < local101.length; local110++) {
					@Pc(119) int local119 = local108 * local110 + 8;
					arg0.ca(local119, 0, local119 + local108 - 8, 350);
					Static75.aClass82_1.method7875(350 - Static166.aClass202_9.anInt6135 - Static141.anInt2738 - (local90 + -Static446.anInt7893) * Static362.anInt6648 - 2, -16777216, -1, local101[local110], local119);
				}
			}
		}
		arg0.ca(0, 0, Static367.anInt6719, 350);
		arg0.method7463(350 - Static141.anInt2738, Static367.anInt6719, 0, -1);
		Static264.aClass82_3.method7875(350 - Static479.aClass202_13.anInt6135 - 1, -16777216, -1, "--> " + Static232.aString91, 10);
		if (!Static162.aBoolean225) {
			return;
		}
		local41 = -1;
		if (Static363.anInt6671 % 30 > 15) {
			local41 = 16777215;
		}
		arg0.method7495(350 - Static479.aClass202_13.anInt6135 - 11, local41, 12, Static479.aClass202_13.method4970("--> " + Static232.aString91.substring(0, Static116.anInt1995)) + 10);
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V")
	public static void method6916() {
		for (@Pc(6) Class60_Sub3 local6 = (Class60_Sub3) Static359.aClass349_16.method7892(); local6 != null; local6 = (Class60_Sub3) Static359.aClass349_16.method7892()) {
			Static288.method6397(local6);
		}
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700)) {
			local33 = 3;
			local35 = 0;
		} else {
			local33 = Static558.anInt9704;
			local35 = Static558.anInt9704;
		}
		Static74.method1043();
		for (@Pc(44) int local44 = local35; local44 <= local33; local44++) {
			Static74.method1031();
			Static74.method1032(local44);
			Static74.method1039(local44);
		}
		Static74.method1036();
		Static74.method1048();
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)Z")
	public static boolean method6917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
