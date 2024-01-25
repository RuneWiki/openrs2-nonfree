import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_42 = new Class11(13, 3);

	@OriginalMember(owner = "client!gs", name = "E", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_60 = new Class205(89, 2);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!up;III)V")
	public static void method2424(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static223.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt3737 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub17_Sub1Array2[arg0.anInt3737++] = Static386.aClass2_Sub17_Sub1Array3[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt3737; local21 < 4; local21++) {
			arg0.aClass2_Sub17_Sub1Array2[local21] = null;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!is;B)V")
	public static void method2425(@OriginalArg(0) Class111 arg0) {
		Static3.anInt131 = 3;
		Static127.method2517(true);
		Static212.aBoolean293 = true;
		Static143.anInt2862 = 127;
		Static364.anInt6192 = 0;
		Static272.aBoolean352 = true;
		Static116.anInt2496 = 1;
		Static349.aBoolean351 = true;
		Static10.aBoolean424 = true;
		Static202.anInt3721 = 2;
		Static131.anInt2686 = 0;
		Static132.anInt2711 = 0;
		Static6.aBoolean21 = true;
		Static178.aBoolean265 = true;
		Static58.aBoolean89 = true;
		Static343.aBoolean422 = true;
		Static385.aBoolean467 = true;
		Static132.anInt2709 = 0;
		Static187.aBoolean270 = true;
		Static322.anInt5529 = 255;
		Static330.anInt5659 = 127;
		if (Static253.anInt4468 >= 96) {
			Static133.method2603(2);
		} else {
			Static133.method2603(0);
		}
		Static278.aBoolean357 = true;
		Static182.anInt3879 = 2;
		Static29.anInt617 = Static168.anInt3226 == 1 ? 2 : 4;
		Static80.anInt1467 = 0;
		Static214.aBoolean294 = false;
		Static358.aBoolean142 = true;
		Static213.anInt3866 = 2;
		Static207.aBoolean371 = false;
		Static81.anInt1473 = 0;
		Static262.aBoolean340 = false;
		@Pc(93) Class25 local93 = null;
		try {
			@Pc(97) Class182 local97 = arg0.method2814();
			while (local97.anInt4498 == 0) {
				Static358.method2028(1L);
			}
			if (local97.anInt4498 == 1) {
				local93 = (Class25) local97.anObject6;
				@Pc(124) byte[] local124 = new byte[(int) local93.method590()];
				@Pc(139) int local139;
				for (@Pc(126) int local126 = 0; local126 < local124.length; local126 += local139) {
					local139 = local93.method592(local124.length - local126, local124, local126);
					if (local139 == -1) {
						throw new IOException("EOF");
					}
				}
				Static257.method4005(new Class2_Sub16(local124));
			}
		} catch (@Pc(167) Exception local167) {
		}
		try {
			if (local93 != null) {
				local93.method594();
			}
		} catch (@Pc(176) Exception local176) {
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static85.anIntArrayArrayArray2[arg0][local16][local20] == -Static100.anInt2069) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static333.anInt5694) + 1;
			@Pc(142) int local142 = (arg3 << Static333.anInt5694) + 2;
			@Pc(151) int local151 = Static350.aClass107Array4[arg0].method4685(arg1, arg3) + arg5;
			if (!Static4.method85(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static333.anInt5694) - 1;
			if (!Static4.method85(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static333.anInt5694) - 1;
			if (!Static4.method85(local20, local151, local177)) {
				return false;
			} else if (Static4.method85(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static66.method1052(arg0, arg1, arg3)) {
			local16 = arg1 << Static333.anInt5694;
			local20 = arg3 << Static333.anInt5694;
			return Static4.method85(local16 + 1, Static350.aClass107Array4[arg0].method4685(arg1, arg3) + arg5, local20 + 1) && Static4.method85(local16 + Static180.anInt6489 - 1, Static350.aClass107Array4[arg0].method4685(arg1 + 1, arg3) + arg5, local20 + 1) && Static4.method85(local16 + Static180.anInt6489 - 1, Static350.aClass107Array4[arg0].method4685(arg1 + 1, arg3 + 1) + arg5, local20 + Static180.anInt6489 - 1) && Static4.method85(local16 + 1, Static350.aClass107Array4[arg0].method4685(arg1, arg3 + 1) + arg5, local20 + Static180.anInt6489 - 1);
		} else {
			return false;
		}
	}
}
