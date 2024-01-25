import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
	public static final int[] anIntArray99 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public static int anInt2017 = 0;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_62 = new Class174("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!hi;Z)Z")
	public static boolean method1845(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static178.aClass55Array1 == Static349.aClass55Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6187();
		if (arg0.aShort108 < 0 || arg0.aShort107 < 0 || arg0.aShort109 >= Static459.anInt5916 || arg0.aShort110 >= Static342.anInt5746) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort108; local34 <= arg0.aShort109; local34++) {
			for (local38 = arg0.aShort107; local38 <= arg0.aShort110; local38++) {
				@Pc(45) Class227 local45 = Static361.method5054(arg0.aByte101, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort108) {
						local49++;
					}
					if (local34 < arg0.aShort109) {
						local49 += 4;
					}
					if (local38 > arg0.aShort107) {
						local49 += 8;
					}
					if (local38 < arg0.aShort110) {
						local49 += 2;
					}
					@Pc(74) Class114 local74 = Static349.method4874(arg0, local49);
					@Pc(77) Class114 local77 = local45.aClass114_2;
					if (local77 == null) {
						local45.aClass114_2 = local74;
					} else {
						while (local77.aClass114_1 != null) {
							local77 = local77.aClass114_1;
						}
						local77.aClass114_1 = local74;
					}
					local45.aByte77 = (byte) (local45.aByte77 | local49);
					if (local6 && (Static328.anIntArrayArray46[local34][local38] & 0xFF000000) != 0) {
						local8 = Static328.anIntArrayArray46[local34][local38];
						local10 = Static404.aShortArrayArray6[local34][local38];
						local12 = Static422.aByteArrayArray23[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort108; local38 <= arg0.aShort109; local38++) {
				for (@Pc(150) int local150 = arg0.aShort107; local150 <= arg0.aShort110; local150++) {
					if ((Static328.anIntArrayArray46[local38][local150] & 0xFF000000) == 0) {
						Static328.anIntArrayArray46[local38][local150] = local8;
						Static404.aShortArrayArray6[local38][local150] = local10;
						Static422.aByteArrayArray23[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static424.aClass1_Sub2Array3[Static17.anInt290++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)V")
	public static void method1846(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static140.anIntArray129[local7] = Static140.anIntArray129[local7 - 1];
			Static201.anIntArray226[local7] = Static201.anIntArray226[local7 - 1];
			Static247.aStringArray42[local7] = Static247.aStringArray42[local7 - 1];
			Static197.aStringArray20[local7] = Static197.aStringArray20[local7 - 1];
			Static10.aStringArray1[local7] = Static10.aStringArray1[local7 - 1];
			Static156.aStringArray15[local7] = Static156.aStringArray15[local7 - 1];
			Static61.anIntArray58[local7] = Static61.anIntArray58[local7 - 1];
		}
		Static140.anIntArray129[0] = arg2;
		Static247.aStringArray42[0] = arg3;
		Static201.anIntArray226[0] = arg6;
		Static197.aStringArray20[0] = arg5;
		Static10.aStringArray1[0] = arg0;
		Static156.aStringArray15[0] = arg1;
		Static367.anInt6208 = Static125.anInt2284;
		Static61.anIntArray58[0] = arg4;
		Static7.anInt1914++;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!ga;)V")
	public static void method1848(@OriginalArg(1) Class82 arg0) {
		@Pc(7) Class82 local7 = Static264.method3661(arg0);
		@Pc(19) int local19;
		@Pc(21) int local21;
		if (local7 == null) {
			local19 = Static310.anInt5307;
			local21 = Static166.anInt3014;
		} else {
			local19 = local7.anInt2192;
			local21 = local7.anInt2216;
		}
		Static338.method4720(local21, false, local19, arg0);
		Static409.method5641(local19, arg0, local21);
	}
}
