import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qda", name = "r", descriptor = "Lclient!vo;")
	public static Class348 aClass348_99;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_16 = new Class273(4);

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_12 = new Class273(1);

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_9 = new Class273(1);

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_10 = new Class273(2);

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_11 = new Class273(4);

	@OriginalMember(owner = "client!qda", name = "i", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_13 = new Class273(2);

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_14 = new Class273(4);

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "Lclient!qda;")
	public static final Class273 aClass273_15 = new Class273(2);

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "[Lclient!rba;")
	public static final Class286[] aClass286Array1 = new Class286[16];

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_13 = new Class277(3, 5);

	@OriginalMember(owner = "client!qda", name = "o", descriptor = "Lclient!hp;")
	public static final Class143 aClass143_3 = new Class143();

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "J")
	public static long aLong216 = 0L;

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "[I")
	public static final int[] anIntArray454 = new int[6];

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_110 = new Class90(68, 6);

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
	public static void method6349() {
		if (Static155.aFloat73 < 1024.0F) {
			Static155.aFloat73 = 1024.0F;
		}
		if (Static155.aFloat73 > 3072.0F) {
			Static155.aFloat73 = 3072.0F;
		}
		while (Static189.aFloat83 >= 16384.0F) {
			Static189.aFloat83 -= 16384.0F;
		}
		while (Static189.aFloat83 < 0.0F) {
			Static189.aFloat83 += 16384.0F;
		}
		@Pc(46) int local46 = Static148.anInt3159 >> 9;
		@Pc(50) int local50 = Static222.anInt4655 >> 9;
		@Pc(58) int local58 = Static461.method6782(Static222.anInt4655, Static352.anInt6764, Static148.anInt3159);
		@Pc(60) int local60 = 0;
		@Pc(88) int local88;
		if (local46 > 3 && local50 > 3 && local46 < Static338.anInt6508 - 4 && local50 < Static390.anInt7654 - 4) {
			for (local88 = local46 - 4; local88 <= local46 + 4; local88++) {
				for (@Pc(94) int local94 = local50 - 4; local94 <= local50 + 4; local94++) {
					@Pc(98) int local98 = Static352.anInt6764;
					if (local98 < 3 && Static193.method3175(local94, local88)) {
						local98++;
					}
					@Pc(111) int local111 = 0;
					if (Static360.aClass123_Sub1_2.aByteArrayArrayArray14 != null && Static360.aClass123_Sub1_2.aByteArrayArrayArray14[local98] != null) {
						local111 = (Static360.aClass123_Sub1_2.aByteArrayArrayArray14[local98][local88][local94] & 0xFF) * 8;
					}
					if (Static255.aClass115Array2 != null && Static255.aClass115Array2[local98] != null) {
						@Pc(151) int local151 = local58 + local111 - Static255.aClass115Array2[local98].method8055(local94, local88);
						if (local60 < local151) {
							local60 = local151;
						}
					}
				}
			}
		}
		local88 = (local60 >> 2) * 1536;
		if (local88 > 786432) {
			local88 = 786432;
		}
		if (local88 < 262144) {
			local88 = 262144;
		}
		if (local88 > Static506.anInt9470) {
			Static506.anInt9470 += (local88 - Static506.anInt9470) / 24;
		} else if (local88 < Static506.anInt9470) {
			Static506.anInt9470 += (local88 - Static506.anInt9470) / 80;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method6350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!Static420.method6283(arg7)) {
			return;
		}
		if (Static264.aClass155ArrayArray1[arg7] == null) {
			Static70.method1534(Static535.aClass155ArrayArray2[arg7], -1, arg4, arg0, arg5, arg3, arg6, arg2, arg8, arg1);
		} else {
			Static70.method1534(Static264.aClass155ArrayArray1[arg7], -1, arg4, arg0, arg5, arg3, arg6, arg2, arg8, arg1);
		}
	}
}
