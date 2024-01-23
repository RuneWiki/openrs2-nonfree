import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Loading wordpack - ";

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!jj;B)V")
	public static void method2662(@OriginalArg(0) Class1_Sub18 arg0) {
		label124: while (true) {
			if (arg0.anInt3911 < arg0.aByteArray71.length) {
				@Pc(22) boolean local22 = false;
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				if (arg0.method3122() == 1) {
					local22 = true;
					local24 = arg0.method3122();
					local26 = arg0.method3122();
				}
				@Pc(46) int local46 = arg0.method3122();
				@Pc(50) int local50 = arg0.method3122();
				@Pc(57) int local57 = local46 * 64 - Static219.anInt4487;
				@Pc(68) int local68 = Static198.anInt3851 + Static77.anInt1559 - local50 * 64 - 1;
				@Pc(94) int local94;
				@Pc(98) int local98;
				if (local57 >= 0 && local68 - 63 >= 0 && Static93.anInt1769 > local57 + 63 && local68 < Static77.anInt1559) {
					local94 = local57 >> 6;
					local98 = local68 >> 6;
					@Pc(100) int local100 = 0;
					while (true) {
						if (local100 >= 64) {
							continue label124;
						}
						for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
							if (!local22 || local24 * 8 <= local100 && local100 < local24 * 8 + 8 && local105 >= local26 * 8 && local105 < local26 * 8 + 8) {
								@Pc(148) int local148 = arg0.method3122();
								if (local148 != 0) {
									@Pc(165) int local165;
									if ((local148 & 0x1) == 1) {
										local165 = arg0.method3122();
										if (Static242.aByteArrayArrayArray22[local94][local98] == null) {
											Static242.aByteArrayArrayArray22[local94][local98] = new byte[4096];
										}
										Static242.aByteArrayArrayArray22[local94][local98][local100 + (63 - local105 << 6)] = (byte) local165;
									}
									if ((local148 & 0x2) == 2) {
										local165 = arg0.method3109();
										if (Static38.anIntArrayArrayArray6[local94][local98] == null) {
											Static38.anIntArrayArrayArray6[local94][local98] = new int[4096];
										}
										Static38.anIntArrayArrayArray6[local94][local98][local100 + (63 - local105 << 6)] = local165;
									}
									if ((local148 & 0x4) == 4) {
										local165 = arg0.method3109();
										if (Static84.anIntArrayArrayArray9[local94][local98] == null) {
											Static84.anIntArrayArrayArray9[local94][local98] = new int[4096];
										}
										local165--;
										@Pc(264) Class104 local264 = Static35.method636(local165);
										if (local264.anIntArray350 != null) {
											local264 = local264.method2355();
											if (local264 == null || local264.anInt2801 == -1) {
												continue;
											}
										}
										Static84.anIntArrayArrayArray9[local94][local98][local100 + (63 - local105 << 6)] = local264.anInt2819 + 1;
										@Pc(302) Class1_Sub5 local302 = new Class1_Sub5();
										local302.anInt1011 = local68;
										local302.anInt1015 = local57;
										local302.anInt1013 = local264.anInt2801;
										Static152.aClass69_12.method1628(local302);
									}
								}
							}
						}
						local100++;
					}
				}
				local94 = 0;
				while (true) {
					if ((local22 ? 64 : 4096) <= local94) {
						continue label124;
					}
					local98 = arg0.method3122();
					if (local98 != 0) {
						if ((local98 & 0x1) == 1) {
							arg0.anInt3911++;
						}
						if ((local98 & 0x2) == 2) {
							arg0.anInt3911 += 2;
						}
						if ((local98 & 0x4) == 4) {
							arg0.anInt3911 += 3;
						}
					}
					local94++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	public static void method2663(@OriginalArg(1) boolean arg0) {
		Static13.aBoolean247 = arg0;
		Static131.aBoolean175 = !Static39.method718();
	}
}
