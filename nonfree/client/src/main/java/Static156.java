import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ht", name = "L", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_150 = new Class12(54, 10);

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "[I")
	public static final int[] anIntArray216 = new int[14];

	@OriginalMember(owner = "client!ht", name = "G", descriptor = "[B")
	public static final byte[] aByteArray28 = new byte[16384];

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)[Lclient!dq;")
	public static Class60[] method2484() {
		return new Class60[] { Static158.aClass60_6, Static417.aClass60_19, Static112.aClass60_5, Static435.aClass60_15, Static327.aClass60_14, Static87.aClass60_13, Static223.aClass60_9, Static250.aClass60_12, Static355.aClass60_16, Static446.aClass60_20, Static235.aClass60_10, Static238.aClass60_11, Static409.aClass60_18, Static397.aClass60_17, Static73.aClass60_3 };
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([[BBLclient!qs;)V")
	public static void method2487(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class71_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class1_Sub14 local30 = new Class1_Sub14(local23);
				local36 = Static68.anIntArray59[local17] >> 8;
				@Pc(42) int local42 = Static68.anIntArray59[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static190.anInt3507;
				@Pc(55) int local55 = local42 * 64 - Static331.anInt6034;
				Static442.method5918();
				arg1.method4799(Static331.anInt6034, Static20.aClass181Array2, local55, local49, Static190.anInt3507, local30);
				arg1.method4805(local30, Static447.aClass121_11, local12, local55, local49);
				if (!arg1.aBoolean488 && Static254.anInt4366 / 8 == local36 && Static289.anInt4852 / 8 == local42 && local12[0] != -1) {
					Static448.aClass223_1 = Static377.aClass243_1.method5516(Static347.aClass163_1, local12[3], local12[0], local12[2], local12[1]);
					Static75.anInt1424 = local12[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local15; local128++) {
			@Pc(146) int local146 = (Static68.anIntArray59[local128] >> 8) * 64 - Static190.anInt3507;
			local36 = (Static68.anIntArray59[local128] & 0xFF) * 64 - Static331.anInt6034;
			@Pc(161) byte[] local161 = arg0[local128];
			if (local161 == null && Static289.anInt4852 < 800) {
				Static442.method5918();
				arg1.method4798(local146, local36);
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V")
	public static void method2489() {
		Static97.anInt1902 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static31.aClass1_Sub14Array1[local14] = null;
			Static282.aByteArray57[local14] = 1;
			Static212.aClass144Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)V")
	public static void method2490() {
		if (!Static272.aBoolean362) {
			return;
		}
		while (true) {
			while (Static164.anInt2905 < Static4.aClass48_Sub1Array1.length) {
				@Pc(25) Class48_Sub1 local25 = Static4.aClass48_Sub1Array1[Static164.anInt2905];
				if (local25 != null && local25.anInt1025 == -1) {
					if (Static355.aClass1_Sub4_5 == null) {
						Static355.aClass1_Sub4_5 = Static438.aClass268_1.method5997(local25.aString19);
					}
					@Pc(48) int local48 = Static355.aClass1_Sub4_5.anInt464;
					if (local48 == -1) {
						return;
					}
					local25.anInt1025 = local48;
					Static164.anInt2905++;
					Static355.aClass1_Sub4_5 = null;
				} else {
					Static164.anInt2905++;
				}
			}
			return;
		}
	}
}
