import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "[I")
	public static final int[] anIntArray9 = new int[14];

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
	public static final int anInt70 = 4;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
	public static int anInt73 = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIB)Z")
	public static boolean method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method69(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = arg0 ? 32768 : 0;
		@Pc(33) int local33 = (arg0 ? Static181.aClass71_1.anInt2331 : Static181.aClass71_1.anInt2336) + local23;
		for (@Pc(35) int local35 = local23; local35 < local33; local35++) {
			@Pc(42) Class2_Sub5_Sub10 local42 = Static181.aClass71_1.method1830(local35);
			if (local42.aBoolean349 && local42.method3915().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static101.aShortArray24 = null;
					Static259.anInt4836 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(76) short[] local76 = new short[local11.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local13; local78++) {
						local76[local78] = local11[local78];
					}
					local11 = local76;
				}
				local11[local13++] = (short) local35;
			}
		}
		Static414.anInt6897 = 0;
		Static259.anInt4836 = local13;
		Static101.aShortArray24 = local11;
		@Pc(115) String[] local115 = new String[Static259.anInt4836];
		for (@Pc(117) int local117 = 0; local117 < Static259.anInt4836; local117++) {
			local115[local117] = Static181.aClass71_1.method1830(local11[local117]).method3915();
		}
		Static390.method5185(local115, Static101.aShortArray24);
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(II)V")
	public static void method70(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub5_Sub1 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class64 local8 = Static263.aClass64Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static386.anInt6463; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static42.anInt4340; local15++) {
						local1 = local8.k(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static307.anInt5425;
							@Pc(32) int local32 = local12 << Static307.anInt5425;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class64 local41 = Static263.aClass64Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.l(local15, local12) - local41.l(local15, local12);
									@Pc(67) int local67 = local8.l(local15 + 1, local12) - local41.l(local15 + 1, local12);
									@Pc(85) int local85 = local8.l(local15 + 1, local12 + 1) - local41.l(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.l(local15, local12 + 1) - local41.l(local15, local12 + 1);
									local41.b(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
	public static void method71() {
		Static3.method126();
		Static149.method2452(Static12.aClass79_Sub1_1.aBoolean358);
		Static366.aClass18_2 = Static234.method3657(0, Static339.aCanvas7, 22050, Static43.aClass59_5);
		Static366.aClass18_2.method5633(Static164.aClass2_Sub3_Sub4_4);
		Static151.aClass18_1 = Static234.method3657(1, Static339.aCanvas7, 2048, Static43.aClass59_5);
		Static151.aClass18_1.method5633(Static260.aClass2_Sub3_Sub1_2);
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
	public static void method72() {
		if (Static73.anInt1597 != 3) {
			Static375.anInt5832 = -1;
		}
	}
}
