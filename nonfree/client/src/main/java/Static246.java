import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!s", name = "m", descriptor = "I")
	public static int anInt4983;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString173 = null;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString174 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!s", name = "u", descriptor = "I")
	public static int anInt4989 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method4159() {
		if (Static228.aFloat19 < Static228.aFloat18) {
			Static228.aFloat19 = (float) ((double) Static228.aFloat19 + (double) Static228.aFloat19 / 30.0D);
			if (Static228.aFloat19 > Static228.aFloat18) {
				Static228.aFloat19 = Static228.aFloat18;
			}
			Static202.method3347();
		} else if (Static228.aFloat19 > Static228.aFloat18) {
			Static228.aFloat19 = (float) ((double) Static228.aFloat19 - (double) Static228.aFloat19 / 30.0D);
			if (Static228.aFloat18 > Static228.aFloat19) {
				Static228.aFloat19 = Static228.aFloat18;
			}
			Static202.method3347();
		}
		if (Static79.anInt1913 != -1 && Static9.anInt187 != -1) {
			@Pc(64) int local64 = Static79.anInt1913 - Static158.anInt2949;
			@Pc(68) int local68 = Static9.anInt187 - Static168.anInt3167;
			if (local68 < 2 || local68 > 2) {
				local68 >>= 0x4;
			}
			if (local64 < 2 || local64 > 2) {
				local64 >>= 0x4;
			}
			Static158.anInt2949 += local64;
			Static168.anInt3167 += local68;
			if (local64 == 0 && local68 == 0) {
				Static79.anInt1913 = -1;
				Static9.anInt187 = -1;
			}
			Static202.method3347();
		}
		if (Static135.anInt2616 <= 0) {
			Static300.anInt5934 = -1;
			Static257.anInt5294 = -1;
		} else {
			Static157.anInt2942--;
			if (Static157.anInt2942 == 0) {
				Static135.anInt2616--;
				Static157.anInt2942 = 100;
			}
		}
		if (!Static201.aBoolean281 || Static204.aClass56_18 == null) {
			return;
		}
		for (@Pc(147) Class3_Sub9 local147 = (Class3_Sub9) Static204.aClass56_18.method1281(); local147 != null; local147 = (Class3_Sub9) Static204.aClass56_18.method1278()) {
			@Pc(155) Class40 local155 = Static96.method1438(local147.aClass3_Sub4_Sub23_1.anInt5971);
			if (Static129.anInt2458 == 0 && local147.method1063(Static153.anInt2892, Static167.anInt3153)) {
				if (!local147.aClass3_Sub4_Sub23_1.aBoolean422) {
					local147.aClass3_Sub4_Sub23_1.aBoolean422 = true;
					Static5.method105(local147.aClass3_Sub4_Sub23_1.anInt5971, local155.anInt1166, 15);
				}
				if (local147.aClass3_Sub4_Sub23_1.aBoolean422) {
					Static5.method105(local147.aClass3_Sub4_Sub23_1.anInt5971, local155.anInt1166, 17);
				}
			} else if (local147.aClass3_Sub4_Sub23_1.aBoolean422) {
				local147.aClass3_Sub4_Sub23_1.aBoolean422 = false;
				Static5.method105(local147.aClass3_Sub4_Sub23_1.anInt5971, local155.anInt1166, 16);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)V")
	public static void method4161(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static283.aBoolean393 && arg0) {
			local11 = 1;
			local13 = Static50.aByteArrayArray22;
		} else {
			local13 = Static302.aByteArrayArray126;
			local11 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			Static174.method2872();
			for (@Pc(37) int local37 = 0; local37 < 13; local37++) {
				for (@Pc(44) int local44 = 0; local44 < 13; local44++) {
					@Pc(57) int local57 = Static120.anIntArrayArrayArray9[local21][local37][local44];
					if (local57 != -1) {
						@Pc(67) int local67 = local57 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(79) int local79 = local57 >> 1 & 0x3;
							@Pc(85) int local85 = local57 >> 14 & 0x3FF;
							@Pc(91) int local91 = local57 >> 3 & 0x7FF;
							@Pc(101) int local101 = local91 / 8 + (local85 / 8 << 8);
							for (@Pc(103) int local103 = 0; local103 < Static297.anIntArray220.length; local103++) {
								if (local101 == Static297.anIntArray220[local103] && local13[local103] != null) {
									Static35.method535(arg0, local67, (local85 & 0x7) * 8, (local91 & 0x7) * 8, local44 * 8, local37 * 8, local21, local79, Static138.aClass153Array1, local13[local103]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
