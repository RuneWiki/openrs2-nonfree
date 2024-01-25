import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt8806;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!da;")
	public static Class64 aClass64_14;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method7381() {
		@Pc(5) short local5 = 1024;
		@Pc(7) short local7 = 3072;
		if (Static172.aBoolean322) {
			if (Static167.aBoolean310) {
				local5 = 2048;
			}
			local7 = 4096;
		}
		if (Static189.aFloat109 < (float) local5) {
			Static189.aFloat109 = local5;
		}
		if (Static189.aFloat109 > (float) local7) {
			Static189.aFloat109 = local7;
		}
		while (Static378.aFloat160 >= 16384.0F) {
			Static378.aFloat160 -= 16384.0F;
		}
		while (Static378.aFloat160 < 0.0F) {
			Static378.aFloat160 += 16384.0F;
		}
		@Pc(58) int local58 = Static85.anInt1773 >> 9;
		@Pc(62) int local62 = Static57.anInt1181 >> 9;
		@Pc(68) int local68 = Static582.method8038(Static16.anInt308, Static85.anInt1773, Static57.anInt1181);
		@Pc(70) int local70 = 0;
		@Pc(94) int local94;
		if (local58 > 3 && local62 > 3 && Static3.anInt46 - 4 > local58 && Static270.anInt5194 - 4 > local62) {
			for (local94 = local58 - 4; local94 <= local58 + 4; local94++) {
				for (@Pc(99) int local99 = local62 - 4; local99 <= local62 + 4; local99++) {
					@Pc(102) int local102 = Static16.anInt308;
					if (local102 < 3 && Static471.method6782(local99, local94)) {
						local102++;
					}
					@Pc(115) int local115 = 0;
					if (Static580.aClass45_Sub1_2.aByteArrayArrayArray14 != null && Static580.aClass45_Sub1_2.aByteArrayArrayArray14[local102] != null) {
						local115 = (Static580.aClass45_Sub1_2.aByteArrayArrayArray14[local102][local94][local99] & 0xFF) * 8 << 2;
					}
					if (Static331.aClass112Array3 != null && Static331.aClass112Array3[local102] != null) {
						@Pc(157) int local157 = local115 + local68 - Static331.aClass112Array3[local102].method7819(local99, local94);
						if (local157 > local70) {
							local70 = local157;
						}
					}
				}
			}
		}
		local94 = (local70 >> 2) * 1536;
		if (local94 > 786432) {
			local94 = 786432;
		}
		if (local94 < 262144) {
			local94 = 262144;
		}
		if (Static600.anInt9884 < local94) {
			Static600.anInt9884 += (local94 - Static600.anInt9884) / 24;
		} else if (local94 < Static600.anInt9884) {
			Static600.anInt9884 += (local94 - Static600.anInt9884) / 80;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Lclient!ud;I)Lclient!rt;")
	public static Class160_Sub3 method7382(@OriginalArg(0) Class2_Sub34 arg0) {
		return new Class160_Sub3(arg0.method6856(), arg0.method6856(), arg0.method6856(), arg0.method6856(), arg0.method6870(), arg0.method6870(), arg0.method6904());
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method7383(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) String local6 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = local17 + (arg1 ? Static249.aClass111_1.anInt3552 : Static249.aClass111_1.anInt3550);
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(35) Class2_Sub5_Sub17 local35 = Static249.aClass111_1.method2928(local29);
			if (local35.aBoolean568 && local35.method6305().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static275.aShortArray60 = null;
					Static214.anInt4435 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(64) short[] local64 = new short[local9.length * 2];
					for (@Pc(66) int local66 = 0; local66 < local11; local66++) {
						local64[local66] = local9[local66];
					}
					local9 = local64;
				}
				local9[local11++] = (short) local29;
			}
		}
		Static275.aShortArray60 = local9;
		Static291.anInt5470 = 0;
		Static214.anInt4435 = local11;
		@Pc(102) String[] local102 = new String[Static214.anInt4435];
		for (@Pc(104) int local104 = 0; local104 < Static214.anInt4435; local104++) {
			local102[local104] = Static249.aClass111_1.method2928(local9[local104]).method6305();
		}
		Static323.method4875(Static275.aShortArray60, local102);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!bj;)Ljava/lang/String;")
	public static String method7385(@OriginalArg(1) Class2_Sub5_Sub2 arg0) {
		return arg0.aString8 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method7386(@OriginalArg(0) int arg0) {
		Static303.aLong163 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZLclient!dm;I)V")
	public static void method7387(@OriginalArg(0) int arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2) {
		Static630.aClass78_12 = arg1;
		Static337.anInt9546 = arg2;
		Static127.anInt2942 = arg0;
	}
}
