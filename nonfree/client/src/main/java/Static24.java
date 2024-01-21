import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_4;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "I")
	public static int anInt692 = 0;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "Lclient!fc;")
	private static Class25 aClass25_297 = Static78.method1313("Your account is already logged in)3");

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_298 = aClass25_297;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "Lclient!p;")
	public static Class63 aClass63_2 = new Class63(50);

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!fc;")
	private static Class25 aClass25_299 = Static78.method1313(" million");

	@OriginalMember(owner = "client!de", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_300 = aClass25_299;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "[I")
	public static int[] anIntArray148 = new int[2000];

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_301 = Static78.method1313("sl_button");

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
	public static int anInt701 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
	public static boolean method571(@OriginalArg(1) int arg0) {
		if (!Static57.method1727(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class1_Sub2_Sub14[] local17 = Static56.aClass1_Sub2_Sub14ArrayArray1[arg0];
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class1_Sub2_Sub14 local25 = local17[local19];
			if (local25 != null && local25.anInt1960 == 6) {
				@Pc(54) int local54;
				if (local25.anInt1946 != -1 || local25.anInt1925 != -1) {
					@Pc(49) boolean local49 = Static45.method964(local25);
					if (local49) {
						local54 = local25.anInt1925;
					} else {
						local54 = local25.anInt1946;
					}
					if (local54 != -1) {
						@Pc(69) Class1_Sub2_Sub17 local69 = Static34.method755(local54);
						local25.anInt1929 += Static18.anInt522;
						label52: while (true) {
							do {
								do {
									if (local25.anInt1929 <= local69.anIntArray406[local25.anInt1940]) {
										break label52;
									}
									local13 = true;
									local25.anInt1929 -= local69.anIntArray406[local25.anInt1940];
									local25.anInt1940++;
								} while (local25.anInt1940 < local69.anIntArray410.length);
								local25.anInt1940 -= local69.anInt2348;
							} while (local25.anInt1940 >= 0 && local69.anIntArray410.length > local25.anInt1940);
							local25.anInt1940 = 0;
						}
					}
				}
				if (local25.anInt1948 != 0 && !local25.aBoolean90) {
					local13 = true;
					@Pc(153) int local153 = local25.anInt1948 >> 16;
					local54 = local25.anInt1948 << 16 >> 16;
					@Pc(164) int local164 = local153 * Static18.anInt522;
					local54 *= Static18.anInt522;
					local25.anInt1924 = local25.anInt1924 + local54 & 0x7FF;
					local25.anInt1902 = local25.anInt1902 + local164 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
	public static void method572() {
		Static120.anIntArray486 = new int[104];
		Static37.anIntArrayArray10 = new int[105][105];
		Static71.anIntArray278 = new int[104];
		Static85.aByteArrayArrayArray6 = new byte[4][104][104];
		Static28.aByteArrayArrayArray2 = new byte[4][105][105];
		Static97.anIntArrayArrayArray7 = new int[4][105][105];
		Static26.aByteArrayArrayArray1 = new byte[4][104][104];
		Static39.aByteArrayArrayArray5 = new byte[4][104][104];
		Static121.anInt2875 = 99;
		Static14.anIntArray76 = new int[104];
		Static22.anIntArray161 = new int[104];
		Static38.aByteArrayArrayArray3 = new byte[4][104][104];
		Static97.anIntArray399 = new int[104];
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method573() {
		aClass63_2 = null;
		aClass25_299 = null;
		anIntArray148 = null;
		aClass1_Sub2_Sub2_Sub4_4 = null;
		aClass25_297 = null;
		aClass25_300 = null;
		aClass25_298 = null;
		aClass25_301 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!v;II)V")
	public static void method574(@OriginalArg(1) Class1_Sub2_Sub3_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2810 == arg1 && arg1 != -1) {
			@Pc(19) int local19 = Static34.method755(arg1).anInt2338;
			if (local19 == 1) {
				arg0.anInt2829 = arg2;
				arg0.anInt2807 = 0;
				arg0.anInt2790 = 0;
				arg0.anInt2808 = 0;
			}
			if (local19 == 2) {
				arg0.anInt2790 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt2810 == -1 || Static34.method755(arg1).anInt2356 >= Static34.method755(arg0.anInt2810).anInt2356) {
			arg0.anInt2790 = 0;
			arg0.anInt2829 = arg2;
			arg0.anInt2808 = 0;
			arg0.anInt2807 = 0;
			arg0.anInt2806 = arg0.anInt2839;
			arg0.anInt2810 = arg1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BJ)Lclient!fc;")
	public static Class25 method575(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(52) byte[] local52 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local29--;
				local52[local29] = Static22.aByteArray14[(int) (local56 - arg0 * 37L)];
			}
			@Pc(81) Class25 local81 = new Class25();
			local81.aByteArray15 = local52;
			local81.anInt956 = local52.length;
			return local81;
		}
	}
}
