import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IILclient!pja;IIIIBIILclient!ha;I)V")
	public static void method6620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class132 arg9, @OriginalArg(11) int arg10) {
		if (arg0 < arg7 && arg7 < arg8 + arg0 && arg1 > arg3 - 13 && arg1 < arg3 + 3 && arg2.aBoolean506) {
			arg4 = arg5;
		}
		@Pc(32) int[] local32 = null;
		if (Static273.method4028(arg2.anInt7577)) {
			local32 = Static340.aClass121_1.method2647((int) arg2.aLong224).anIntArray357;
		} else if (arg2.anInt7576 != -1) {
			local32 = Static340.aClass121_1.method2647(arg2.anInt7576).anIntArray357;
		} else if (Static186.method2659(arg2.anInt7577)) {
			@Pc(109) Class6_Sub44 local109 = (Class6_Sub44) Static349.aClass209_32.method5038((long) (int) arg2.aLong224);
			if (local109 != null) {
				@Pc(114) Class2_Sub1_Sub1_Sub3_Sub2 local114 = local109.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				@Pc(117) Class91 local117 = local114.aClass91_1;
				if (local117.anIntArray140 != null) {
					local117 = local117.method2036(Static659.aClass363_3);
				}
				if (local117 != null) {
					local32 = local117.anIntArray142;
				}
			}
		} else if (Static59.method1104(arg2.anInt7577)) {
			@Pc(74) Class308 local74;
			if (arg2.anInt7577 == 1003) {
				local74 = Static411.aClass88_3.method2024((int) arg2.aLong224);
			} else {
				local74 = Static411.aClass88_3.method2024((int) (arg2.aLong224 >>> 32 & 0x7FFFFFFFL));
			}
			if (local74.anIntArray566 != null) {
				local74 = local74.method7297(Static659.aClass363_3);
			}
			if (local74 != null) {
				local32 = local74.anIntArray570;
			}
		}
		@Pc(143) String local143 = Static103.method1677(arg2);
		if (local32 != null) {
			local143 = local143 + Static521.method7353(local32);
		}
		Static51.aClass19_4.method6322(Static493.anIntArray540, arg0 + 3, arg3, arg4, Static24.aClass9Array7, local143);
		if (arg2.aBoolean504) {
			Static408.aClass9_28.method8920(arg0 + Static173.aClass151_4.method3323(local143) + 5, arg3 - 12);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)I")
	public static int method6621(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
