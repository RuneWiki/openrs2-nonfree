import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_941 = Static129.method2060(":clan:");

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!r;")
	private static Class61 aClass61_943 = Static129.method2060("Loaded textures");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_942 = aClass61_943;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public static final int anInt3018 = 20;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public static int anInt3021 = -1;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
	public static int[] anIntArray361 = new int[25];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZ)Lclient!r;")
	public static Class61 method1890(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(18) int local18 = 1;
		for (@Pc(26) int local26 = arg0 / 10; local26 != 0; local26 /= 10) {
			local18++;
		}
		@Pc(39) int local39 = local18;
		if (arg0 < 0 || arg1) {
			local39 = local18 + 1;
		}
		@Pc(47) byte[] local47 = new byte[local39];
		if (arg0 < 0) {
			local47[0] = 45;
		} else if (arg1) {
			local47[0] = 43;
		}
		for (@Pc(65) int local65 = 0; local65 < local18; local65++) {
			@Pc(70) int local70 = arg0 % 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			arg0 /= 10;
			if (local70 > 9) {
				local70 += 39;
			}
			local47[local39 - local65 - 1] = (byte) (local70 + 48);
		}
		@Pc(108) Class61 local108 = new Class61();
		local108.aByteArray38 = local47;
		local108.anInt2675 = local39;
		return local108;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method1891() {
		if (Static108.aClass30_2 != null) {
			Static108.aClass30_2.method779();
			Static108.aClass30_2 = null;
		}
		Static103.method1747();
		Static61.aClass81_1.method2096();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static103.aClass66Array1[local22].method1803();
		}
		System.gc();
		Static11.method203();
		Static23.anInt715 = -1;
		Static78.aBoolean75 = false;
		Static60.method1019();
		Static36.method697(10);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method1892() {
		aClass61_941 = null;
		anIntArray361 = null;
		aClass61_942 = null;
		aClass1_1 = null;
		aClass61_943 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IJ)V")
	public static void method1893(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static77.method1249(arg0 - 1L);
			Static77.method1249(1L);
		} else {
			Static77.method1249(arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIB)I")
	public static int method1894(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg2; local7++) {
			local1 = local1 >>> 8 ^ Class61.anIntArray331[(arg1[local7] ^ local1) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method1895() {
		for (@Pc(3) int local3 = 0; local3 < Static95.anInt2449; local3++) {
			@Pc(17) int local17 = Static121.anIntArray363[local3]--;
			if (Static121.anIntArray363[local3] >= -10) {
				@Pc(88) Class53 local88 = Static45.aClass53Array1[local3];
				if (local88 == null) {
					local88 = Static138.method1537(Static82.aClass26_Sub1_15, Static108.anIntArray20[local3], 0);
					if (local88 == null) {
						continue;
					}
					Static121.anIntArray363[local3] += local88.method1536();
					Static45.aClass53Array1[local3] = local88;
				}
				if (Static121.anIntArray363[local3] < 0) {
					@Pc(205) int local205;
					if (Static10.anIntArray52[local3] == 0) {
						local205 = Static30.anInt924;
					} else {
						@Pc(128) int local128 = (Static10.anIntArray52[local3] & 0xFF) * 128;
						@Pc(136) int local136 = Static10.anIntArray52[local3] >> 16 & 0xFF;
						@Pc(146) int local146 = local136 * 128 + 64 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912;
						if (local146 < 0) {
							local146 = -local146;
						}
						@Pc(159) int local159 = Static10.anIntArray52[local3] >> 8 & 0xFF;
						@Pc(168) int local168 = local159 * 128 + 64 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875;
						if (local168 < 0) {
							local168 = -local168;
						}
						@Pc(183) int local183 = local146 + local168 - 128;
						if (local183 > local128) {
							Static121.anIntArray363[local3] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local205 = (local128 - local183) * Static82.anInt2264 / local128;
					}
					if (local205 > 0) {
						@Pc(216) Class5_Sub21_Sub1 local216 = local88.method1538().method1700(Static115.aClass9_1);
						@Pc(221) Class5_Sub5_Sub2 local221 = Static135.method832(local216, local205);
						local221.method831(Static67.anIntArray249[local3] - 1);
						Static85.aClass5_Sub5_Sub4_2.method1563(local221);
					}
					Static121.anIntArray363[local3] = -100;
				}
			} else {
				Static95.anInt2449--;
				for (@Pc(31) int local31 = local3; local31 < Static95.anInt2449; local31++) {
					Static108.anIntArray20[local31] = Static108.anIntArray20[local31 + 1];
					Static45.aClass53Array1[local31] = Static45.aClass53Array1[local31 + 1];
					Static67.anIntArray249[local31] = Static67.anIntArray249[local31 + 1];
					Static121.anIntArray363[local31] = Static121.anIntArray363[local31 + 1];
					Static10.anIntArray52[local31] = Static10.anIntArray52[local31 + 1];
				}
				local3--;
			}
		}
		if (Static78.aBoolean75 && !Static107.method1793()) {
			if (Static52.anInt1345 != 0 && Static23.anInt715 != -1) {
				Static89.method1571(0, Static52.anInt1345, Static42.aClass26_Sub1_6, Static23.anInt715);
			}
			Static78.aBoolean75 = false;
		}
	}
}
