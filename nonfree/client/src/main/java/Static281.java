import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
	public static int anInt5401;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "[Lclient!gu;")
	public static final Class5_Sub18[] aClass5_Sub18Array5 = new Class5_Sub18[8];

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lclient!ow;")
	public static final Class270 aClass270_1 = new Class270(true);

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public static void method4524() {
		@Pc(7) int local7;
		if (Static522.aClass38Array4 != null) {
			for (local7 = 0; local7 < Static364.anInt6622; local7++) {
				Static522.aClass38Array4[local7] = null;
			}
			Static522.aClass38Array4 = null;
		}
		if (Static402.aClass38Array3 != null) {
			for (local7 = 0; local7 < Static272.anInt5008; local7++) {
				Static402.aClass38Array3[local7] = null;
			}
			Static402.aClass38Array3 = null;
		}
		if (Static108.aClass38Array1 != null) {
			for (local7 = 0; local7 < Static479.anInt8053; local7++) {
				Static108.aClass38Array1[local7] = null;
			}
			Static108.aClass38Array1 = null;
		}
		Static595.anIntArray540 = null;
		Static390.aClass38Array2 = null;
		Static150.anInt3079 = -1;
		Static552.anInt9017 = -1;
		Static276.anIntArrayArrayArray49 = null;
	}

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "(B)V")
	public static void method4526() {
		while (true) {
			if (Static474.aClass5_Sub41_Sub2_2.method7876(Static630.anInt10261) >= 15) {
				@Pc(20) int local20 = Static474.aClass5_Sub41_Sub2_2.method7871(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					@Pc(34) Class5_Sub25 local34 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local20);
					@Pc(40) Class28_Sub1_Sub4_Sub2_Sub1 local40;
					if (local34 == null) {
						local40 = new Class28_Sub1_Sub4_Sub2_Sub1();
						local40.anInt5512 = local20;
						local34 = new Class5_Sub25(local40);
						Static56.aClass300_8.method7191(local34, (long) local20);
						local27 = true;
						Static317.aClass5_Sub25Array1[Static37.anInt617++] = local34;
					}
					local40 = local34.aClass28_Sub1_Sub4_Sub2_Sub1_1;
					Static588.anIntArray533[Static36.anInt607++] = local20;
					local40.anInt5452 = Static518.anInt8627;
					if (local40.aClass134_1 != null && local40.aClass134_1.method3271()) {
						Static46.method609(local40);
					}
					@Pc(96) int local96 = Static474.aClass5_Sub41_Sub2_2.method7871(2);
					@Pc(101) int local101 = Static474.aClass5_Sub41_Sub2_2.method7871(5);
					if (local101 > 15) {
						local101 -= 32;
					}
					@Pc(112) int local112 = Static474.aClass5_Sub41_Sub2_2.method7871(1);
					if (local112 == 1) {
						Static144.anIntArray129[Static256.anInt4715++] = local20;
					}
					@Pc(134) int local134 = Static474.aClass5_Sub41_Sub2_2.method7871(3) + 4 << 11 & 0x3C0C;
					@Pc(139) int local139 = Static474.aClass5_Sub41_Sub2_2.method7871(5);
					if (local139 > 15) {
						local139 -= 32;
					}
					local40.method3061(Static231.aClass19_2.method274(Static474.aClass5_Sub41_Sub2_2.method7871(14)));
					@Pc(158) int local158 = Static474.aClass5_Sub41_Sub2_2.method7871(1);
					local40.method4585(local40.aClass134_1.anInt3851);
					local40.anInt5519 = local40.aClass134_1.anInt3825 << 3;
					if (local27) {
						local40.method4590(local134, true);
					}
					local40.method3062(local139 + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0], local40.method4599(), Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] + local101, local158 == 1, local96);
					if (local40.aClass134_1.method3271()) {
						Static331.method5106(0, local40.anIntArray307[0], local40.anIntArray308[0], (Class28_Sub1_Sub4_Sub2_Sub2) null, local40.aByte145, local40, (Class164) null);
					}
					continue;
				}
			}
			Static474.aClass5_Sub41_Sub2_2.method7878();
			return;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/io/File;BI)[B")
	public static byte[] method4527(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static122.method8234(arg1, local11, arg0);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)I")
	public static int method4528() {
		@Pc(18) byte local18;
		if (Static631.anInt10279 < 96) {
			Static418.method6228();
			local18 = 1;
		} else {
			@Pc(22) int local22 = Static222.method3494();
			if (local22 <= 100) {
				Static115.method2132();
				local18 = 4;
			} else if (local22 <= 500) {
				Static428.method6320();
				local18 = 3;
			} else if (local22 <= 1000) {
				local18 = 2;
				Static274.method4251();
			} else {
				Static418.method6228();
				local18 = 1;
			}
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != 0) {
			Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
			Static428.method6321(0, false);
		}
		Static102.method1995();
		return local18;
	}
}
