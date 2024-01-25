import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bda", name = "w", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "Lclient!mha;")
	public static final Class232 aClass232_1 = new Class232(128);

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
	public static int anInt600 = 0;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!vp;Z)Z")
	public static boolean method569(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static11.aClass61Array1 == Static456.aClass61Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8165();
		if (arg0.aShort107 < 0 || arg0.aShort108 < 0 || arg0.aShort109 >= Static357.anInt5961 || arg0.aShort110 >= Static429.anInt7422) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort107; local36 <= arg0.aShort109; local36++) {
			for (local40 = arg0.aShort108; local40 <= arg0.aShort110; local40++) {
				@Pc(47) Class217 local47 = Static411.method6333(arg0.aByte132, local36, local40);
				if (local47 != null) {
					@Pc(53) Class290 local53 = Static164.method2362(arg0);
					@Pc(56) Class290 local56 = local47.aClass290_2;
					if (local56 == null) {
						local47.aClass290_2 = local53;
					} else {
						while (local56.aClass290_3 != null) {
							local56 = local56.aClass290_3;
						}
						local56.aClass290_3 = local53;
					}
					if (local6 && (Static361.anIntArrayArray64[local36][local40] & 0xFF000000) != 0) {
						local8 = Static361.anIntArrayArray64[local36][local40];
						local10 = Static328.aShortArrayArray23[local36][local40];
						local12 = Static488.aByteArrayArray18[local36][local40];
					}
					if (!arg1 && local47.aClass4_Sub2_Sub2_1 != null && local47.aClass4_Sub2_Sub2_1.aShort64 > local33) {
						local33 = local47.aClass4_Sub2_Sub2_1.aShort64;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort107; local40 <= arg0.aShort109; local40++) {
				for (@Pc(136) int local136 = arg0.aShort108; local136 <= arg0.aShort110; local136++) {
					if ((Static361.anIntArrayArray64[local40][local136] & 0xFF000000) == 0) {
						Static361.anIntArrayArray64[local40][local136] = local8;
						Static328.aShortArrayArray23[local40][local136] = local10;
						Static488.aByteArrayArray18[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static210.aClass4_Sub2_Sub1Array1[Static454.anInt7719++] = arg0;
		} else {
			local40 = Static11.aClass61Array1 == Static456.aClass61Array3 ? 1 : 0;
			if (!arg0.method8733()) {
				arg0.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local40];
				Static243.aClass4_Sub2Array2[local40] = arg0;
			} else if (arg0.method8727()) {
				arg0.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local40];
				Static457.aClass4_Sub2Array4[local40] = arg0;
			} else {
				arg0.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local40];
				Static79.aClass4_Sub2Array1[local40] = arg0;
				Static28.aBoolean15 = true;
			}
		}
		if (arg1) {
			arg0.anInt10228 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)[I")
	public static int[] method570() {
		return new int[] { Static313.anInt5371, Static164.anInt2742, anInt601 };
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	public static void method571() {
		Static110.anInt2062 = 0;
		Static444.anInt7581 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static28.anInt358; local11++) {
			@Pc(22) int local22 = local11 * Static6.anInt95;
			for (@Pc(24) int local24 = 0; local24 < Static6.anInt95; local24++) {
				@Pc(30) int local30 = local22 + local24;
				Static197.anInterface16Array5[local30].method8782(local24 * Static408.anInt7120, local11 * Static252.anInt4593, Static408.anInt7120, Static252.anInt4593, true);
			}
		}
	}
}
