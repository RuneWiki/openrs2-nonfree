import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lclient!qs;")
	public static Class276 method5977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static270.aClass276ArrayArrayArray2[0][arg1][arg2] != null && Static270.aClass276ArrayArrayArray2[0][arg1][arg2].aClass276_1 != null;
			if (local28 && arg0 >= Static107.anInt2060 - 1) {
				return null;
			}
			Static56.method1218(arg0, arg1, arg2);
		}
		return Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lclient!rr;II)V")
	public static void method5979(@OriginalArg(0) Class292[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class292 local18 = arg0[local12];
			if (local18 != null && local18.anInt7901 == arg1 && !Static67.method1363(local18)) {
				if (local18.lb == 0) {
					method5979(arg0, local18.anInt7890);
					if (local18.aClass292Array2 != null) {
						method5979(local18.aClass292Array2, local18.anInt7890);
					}
					@Pc(56) Class6_Sub11 local56 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local18.anInt7890);
					if (local56 != null) {
						Static441.method6275(local56.anInt1216);
					}
				}
				if (local18.lb == 6 && local18.anInt7936 != -1) {
					@Pc(79) Class57 local79 = Static78.aClass298_2.method6521(local18.anInt7936);
					if (local79 != null) {
						local18.anInt7941 += Static54.anInt1208;
						@Pc(90) int local90 = local18.anInt7969;
						while (local79.anIntArray130[local18.anInt7969] < local18.anInt7941) {
							local18.anInt7941 -= local79.anIntArray130[local18.anInt7969];
							local18.anInt7969++;
							if (local18.anInt7969 >= local79.anIntArray132.length) {
								local18.anInt7969 -= local79.anInt1549;
								if (local18.anInt7969 < 0 || local79.anIntArray132.length <= local18.anInt7969) {
									local18.anInt7969 = 0;
								}
							}
							local18.anInt7886 = local18.anInt7969 + 1;
							if (local79.anIntArray132.length <= local18.anInt7886) {
								local18.anInt7886 -= local79.anInt1549;
								if (local18.anInt7886 < 0 || local18.anInt7886 >= local79.anIntArray132.length) {
									local18.anInt7886 = -1;
								}
							}
							Static464.method6502(local18);
						}
						if (local18.anInt7969 != local90) {
							Static240.method4205(local18.anInt7969, local79);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method5980() {
		@Pc(14) int local14 = (int) ((double) Static473.anInt8075 * 34.46D);
		local14 <<= 0x2;
		if (Static240.aClass14_7.method6832()) {
			local14 += 512;
		}
		Static240.aClass14_7.sa(200, local14);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IF)F")
	public static float method5981(@OriginalArg(1) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IBI)V")
	public static void method5982(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static294.method4730(arg3, arg1, arg0, arg4, -1, null, arg2, arg5);
	}
}
