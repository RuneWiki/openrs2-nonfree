import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_149 = new Class211(51, 8);

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_195 = new Class102(41, 5);

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[I")
	public static final int[] anIntArray554 = new int[1000];

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
	public static int anInt6612 = 0;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method5116() {
		@Pc(12) Class178 local12 = null;
		try {
			@Pc(18) Class91 local18 = Static79.aClass183_2.method3921("2", true);
			while (local18.anInt2446 == 0) {
				Static429.method5376(1L);
			}
			if (local18.anInt2446 == 1) {
				local12 = (Class178) local18.anObject3;
				@Pc(40) byte[] local40 = new byte[(int) local12.method3780()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local12.method3777(local42, local40.length - local42, local40);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static205.method2734(new Class2_Sub13(local40));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local12 != null) {
				local12.method3779();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z")
	public static boolean method5118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!dk;)Lclient!kt;")
	public static Class141 method5120(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1) {
		@Pc(8) byte[] local8 = arg1.method1110(arg0);
		return local8 == null ? null : new Class141(local8);
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	public static void method5121() {
		Static224.aClass156_27.method3161();
		for (@Pc(13) Class2_Sub46 local13 = (Class2_Sub46) Static261.aClass156_13.method3155(); local13 != null; local13 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			if (local13.anInt7283 < 1000) {
				local13.method5703();
				Static224.aClass156_27.method3157(local13);
			}
		}
		Static224.aClass156_27.method3158(Static261.aClass156_13);
		@Pc(43) int local43 = -1;
		@Pc(53) Class2_Sub14 local53 = (Class2_Sub14) Static57.aClass156_8.method3155();
		if (local53 != null) {
			local43 = local53.method5381();
		}
		if (!Static126.aBoolean52) {
			if (local43 == 0 && (Static30.anInt587 == 1 && Static137.anInt6647 > 2 || Static242.method3086())) {
				local43 = 2;
			}
			if (local43 == 2 && Static137.anInt6647 > 0 && local53 != null) {
				if (Static336.aClass16_18 == null && Static302.anInt4877 == 0) {
					Static176.method71(local53.method5382(), local53.method5383());
				} else {
					Static78.anInt1491 = 2;
				}
			}
			if (local43 == 0 && Static137.anInt6647 > 0) {
				Static348.method4627();
			}
			if (Static336.aClass16_18 == null && Static302.anInt4877 == 0) {
				Static61.aClass2_Sub46_1 = null;
				Static78.anInt1491 = 0;
				return;
			}
			return;
		}
		@Pc(134) int local134;
		@Pc(138) int local138;
		if (local43 == -1) {
			local134 = Static376.aClass203_1.method4918();
			local138 = Static376.aClass203_1.method4925();
			if (Static275.anInt4524 - 10 > local134 || local134 > Static275.anInt4524 + Static246.anInt3972 + 10 || local138 < Static253.anInt4058 - 10 || local138 > Static253.anInt4058 + Static429.anInt6935 + 10) {
				Static117.method1762();
			}
		}
		if (local43 != 0) {
			return;
		}
		local134 = Static275.anInt4524;
		local138 = Static253.anInt4058;
		@Pc(184) int local184 = Static246.anInt3972;
		@Pc(190) int local190 = local53.method5382();
		@Pc(194) int local194 = local53.method5383();
		@Pc(196) int local196 = -1;
		@Pc(216) int local216;
		for (@Pc(198) int local198 = 0; local198 < Static137.anInt6647; local198++) {
			if (Static285.aBoolean329) {
				local216 = local138 + (Static137.anInt6647 - local198 - 1) * 16 + 33;
				if (local190 > local134 && local190 < local134 + local184 && local194 > local216 - 13 && local216 + 4 > local194) {
					local196 = local198;
				}
			} else {
				local216 = local138 + (-local198 + -1 + Static137.anInt6647) * 16 + 31;
				if (local134 < local190 && local190 < local184 + local134 && local194 > local216 - 13 && local216 + 3 > local194) {
					local196 = local198;
				}
			}
		}
		if (local196 != -1) {
			local216 = 0;
			@Pc(302) Class32 local302 = new Class32(Static261.aClass156_13);
			for (@Pc(307) Class2_Sub46 local307 = (Class2_Sub46) local302.method668(); local307 != null; local307 = (Class2_Sub46) local302.method667()) {
				if (local216 == local196) {
					Static315.method4296(local307, local194, local190);
				}
				local216++;
			}
		}
		Static117.method1762();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public static void method5122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static118.aClass4_1 == Static270.aClass4_3) {
			if (!Static111.method1707(arg0, 0, -2, 1, arg1, 0, 1, false)) {
				Static111.method1707(arg0, 0, -3, 1, arg1, 0, 1, false);
			}
		} else if (!Static111.method1707(arg0, 0, -3, 1, arg1, 0, 1, false)) {
			Static111.method1707(arg0, 0, -2, 1, arg1, 0, 1, false);
		}
	}
}
