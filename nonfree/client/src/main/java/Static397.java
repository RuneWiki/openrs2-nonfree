import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_202 = new Class151("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray162 = new int[128][128];

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "Lclient!st;")
	public static final Class227 aClass227_6 = new Class227();

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "[I")
	public static final int[] anIntArray399 = new int[4];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;IZI)Z")
	public static boolean method4996(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local46 >= '0' && local46 <= '9') {
				local78 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local78 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local78 = local46 - 'W';
			} else {
				return false;
			}
			if (local78 >= 10) {
				return false;
			}
			if (local26) {
				local78 = -local78;
			}
			@Pc(121) int local121 = local30 * 10 + local78;
			if (local30 != local121 / 10) {
				return false;
			}
			local28 = true;
			local30 = local121;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Lclient!np;")
	public static Class1_Sub3_Sub13 method4998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class1_Sub3_Sub13 local20 = (Class1_Sub3_Sub13) Static353.aClass257_24.method5503((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class1_Sub3_Sub13(arg0, arg1);
			Static353.aClass257_24.method5504(local20, local20.aLong226);
		}
		return local20;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!td;[[BB)V")
	public static void method5001(@OriginalArg(0) Class148_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(38) int local38;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) byte[] local25 = arg1[local17];
			if (local25 != null) {
				@Pc(32) Class1_Sub11 local32 = new Class1_Sub11(local25);
				local38 = Static334.anIntArray331[local17] >> 8;
				@Pc(44) int local44 = Static334.anIntArray331[local17] & 0xFF;
				@Pc(51) int local51 = local38 * 64 - Static101.anInt6646;
				@Pc(57) int local57 = local44 * 64 - Static278.anInt4392;
				Static15.method239();
				arg0.method4872(local57, Static101.anInt6646, local32, local51, Static278.anInt4392, Static383.aClass247Array1);
				arg0.method4884(local57, Static213.aClass128_22, local32, local12, local51);
				if (!arg0.aBoolean521 && Static92.anInt1619 / 8 == local38 && Static64.anInt1135 / 8 == local44 && local12[0] != -1) {
					Static25.aClass256_1 = Static128.aClass66_1.method1365(local12[3], Static331.aClass238_1, local12[2], local12[1], local12[0]);
					Static366.anInt6203 = local12[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local15; local128++) {
			@Pc(140) int local140 = (Static334.anIntArray331[local128] >> 8) * 64 - Static101.anInt6646;
			local38 = (Static334.anIntArray331[local128] & 0xFF) * 64 - Static278.anInt4392;
			@Pc(154) byte[] local154 = arg1[local128];
			if (local154 == null && Static64.anInt1135 < 800) {
				Static15.method239();
				arg0.method4873(local38, local140);
			}
		}
	}
}
