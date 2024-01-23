import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
	public static int anInt3386;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public static int anInt3377 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[5][5000];

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
	public static int anInt3387 = -1;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "[I")
	public static int[] anIntArray281 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mk", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString119 = "Loading fonts - ";

	@OriginalMember(owner = "client!mk", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString120 = " ";

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!li;)V")
	public static void method2682(@OriginalArg(0) Class99 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3225; local2 <= arg0.anInt3223; local2++) {
			for (@Pc(9) int local9 = arg0.anInt3222; local9 <= arg0.anInt3221; local9++) {
				@Pc(22) Class4_Sub21 local22 = Static261.aClass4_Sub21ArrayArrayArray4[arg0.anInt3231][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt2694; local26++) {
						if (local22.aClass99Array19[local26] == arg0) {
							local22.anInt2694--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt2694; local44++) {
								local22.aClass99Array19[local44] = local22.aClass99Array19[local44 + 1];
								local22.anIntArray227[local44] = local22.anIntArray227[local44 + 1];
							}
							local22.aClass99Array19[local22.anInt2694] = null;
							break;
						}
					}
					local22.anInt2695 = 0;
					for (local26 = 0; local26 < local22.anInt2694; local26++) {
						local22.anInt2695 |= local22.anIntArray227[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Z")
	public static boolean method2683(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static256.aShortArray81[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1002;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZ)V")
	public static void method2686(@OriginalArg(0) boolean arg0) {
		Static290.method4524(Static27.anInt596, Static272.aFloat154, Static39.aFloat23, Static52.aFloat31);
		Static290.method4527(Static52.anInt1183, Static84.anInt1719, arg0);
		Static290.method4526((float) Static73.anInt1472, (float) Static3.anInt17, (float) Static248.anInt4864);
		Static290.method4518();
		Static129.aFloat79 = Static146.aFloat87;
		Static129.aFloat80 = Static204.aFloat117;
		Static129.aFloat78 = Static303.aFloat169;
		Static90.aClass4_Sub2_Sub11_11 = Static170.aClass4_Sub2_Sub11_9;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!cg;IIB)Lclient!wb;")
	public static Class4_Sub2_Sub4 method2688(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		return Static225.method3549(0, arg0, arg1) ? Static157.method258() : null;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V")
	public static void method2690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static201.aBoolean247 = true;
		Static298.anInt5314 = arg0;
		Static176.anInt5578 = arg1;
		Static191.anInt3883 = arg2;
		Static113.anInt2263 = -1;
		Static108.anInt2153 = -1;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)I")
	public static int method2691() {
		if (Static5.aBoolean9) {
			return 0;
		} else if (Static162.method2605()) {
			return Static59.aBoolean75 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
