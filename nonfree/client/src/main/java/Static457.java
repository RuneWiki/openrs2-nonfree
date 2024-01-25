import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!fl;")
	public static Class104 aClass104_3;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
	public static int anInt8207;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!gga;")
	public static Class6_Sub5_Sub13 aClass6_Sub5_Sub13_3;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	public static int anInt8208;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public static int anInt8209;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "Lclient!ni;")
	public static Class223 aClass223_104;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!kt;")
	public static final Class178 aClass178_11 = new Class178(3);

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_92 = new Class185(12, 0);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!ji;)Lclient!dk;")
	public static Class66 method6893(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method8246();
		@Pc(16) Class79 local16 = Static174.method3299()[arg0.method8246()];
		@Pc(23) Class127 local23 = Static569.method7978()[arg0.method8246()];
		@Pc(27) int local27 = arg0.method8231();
		@Pc(31) int local31 = arg0.method8231();
		@Pc(35) int local35 = arg0.method8220();
		@Pc(39) int local39 = arg0.method8220();
		@Pc(43) int local43 = arg0.method8236();
		@Pc(47) int local47 = arg0.method8236();
		@Pc(51) int local51 = arg0.method8236();
		@Pc(62) boolean local62 = arg0.method8246() == 1;
		return new Class66(local7, local16, local23, local27, local31, local35, local39, local43, local47, local51, local62);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method6894() {
		Static7.anImage1 = null;
		Static108.aFont1 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method6895(@OriginalArg(1) long arg0) {
		Static287.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static287.aCalendar1.get(7);
		@Pc(28) int local28 = Static287.aCalendar1.get(5);
		@Pc(32) int local32 = Static287.aCalendar1.get(2);
		@Pc(36) int local36 = Static287.aCalendar1.get(1);
		@Pc(40) int local40 = Static287.aCalendar1.get(11);
		@Pc(44) int local44 = Static287.aCalendar1.get(12);
		@Pc(48) int local48 = Static287.aCalendar1.get(13);
		return Static67.aStringArray6[local13 - 1] + ", " + local28 / 10 + local28 % 10 + "-" + Static54.aStringArray5[local32] + "-" + local36 + " " + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + ":" + local48 / 10 + local48 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!bq;ILclient!uca;IILclient!ha;)Z")
	public static boolean method6897(@OriginalArg(0) Class36 arg0, @OriginalArg(2) Class6_Sub48 arg1, @OriginalArg(5) Class5 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray49 != null) {
			local7 = (Static491.anInt7792 - Static491.anInt7788) * (arg0.anInt1752 + arg1.anInt9726 - Static491.anInt7791) / (Static491.anInt7782 - Static491.anInt7791) + Static491.anInt7788;
			local13 = Static491.anInt7793 - (arg0.anInt1757 + arg1.anInt9721 - Static491.anInt7790) * (Static491.anInt7793 - Static491.anInt7784) / (Static491.anInt7786 - Static491.anInt7790);
			local9 = (arg1.anInt9726 + arg0.anInt1755 - Static491.anInt7791) * (Static491.anInt7792 - Static491.anInt7788) / (Static491.anInt7782 - Static491.anInt7791) + Static491.anInt7788;
			local11 = Static491.anInt7793 - (arg0.anInt1771 + arg1.anInt9721 - Static491.anInt7790) * (Static491.anInt7793 - Static491.anInt7784) / (Static491.anInt7786 - Static491.anInt7790);
		}
		@Pc(99) Class4 local99 = null;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		if (arg0.anInt1753 != -1) {
			if (arg1.aBoolean773 && arg0.anInt1739 != -1) {
				local99 = arg0.method1626(arg2, true);
			} else {
				local99 = arg0.method1626(arg2, false);
			}
			if (local99 != null) {
				local101 = arg1.anInt9720 - (local99.method7700() + 1 >> 1);
				if (local101 < local7) {
					local7 = local101;
				}
				local103 = arg1.anInt9720 + (local99.method7700() + 1 >> 1);
				if (local9 < local103) {
					local9 = local103;
				}
				local105 = arg1.anInt9724 - (local99.method7712() + 1 >> 1);
				if (local11 > local105) {
					local11 = local105;
				}
				local107 = arg1.anInt9724 + (local99.method7712() + 1 >> 1);
				if (local107 > local13) {
					local13 = local107;
				}
			}
		}
		@Pc(206) Class333 local206 = null;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(308) int local308;
		if (arg0.aString9 != null) {
			local206 = Static191.method3519(arg0.anInt1772);
			if (local206 != null) {
				local208 = Static150.aClass213_4.method5832(arg0.aString9, Static72.aStringArray8, (int[]) null, (Class4[]) null);
				local210 = (Static491.anInt7792 - Static491.anInt7788) * arg0.anInt1744 / (Static491.anInt7782 - Static491.anInt7791) + arg1.anInt9720;
				local212 = arg1.anInt9724 - arg0.anInt1761 * (Static491.anInt7793 - Static491.anInt7784) / (Static491.anInt7786 - Static491.anInt7790);
				if (local99 == null) {
					local212 -= local206.method7931() * local208 / 2;
				} else {
					local212 -= (local99.method7712() >> 1) + local206.method7932() * local208;
				}
				for (local308 = 0; local308 < local208; local308++) {
					@Pc(314) String local314 = Static72.aStringArray8[local308];
					if (local308 < local208 - 1) {
						local314 = local314.substring(0, local314.length() - 4);
					}
					@Pc(335) int local335 = local206.method7928(local314);
					if (local221 < local335) {
						local221 = local335;
					}
				}
				local223 = local210 - local221 / 2;
				if (local223 < local7) {
					local7 = local223;
				}
				local225 = local221 / 2 + local210;
				local227 = local212;
				if (local9 < local225) {
					local9 = local225;
				}
				local229 = local208 * local206.method7932() + local212;
				if (local11 > local227) {
					local11 = local227;
				}
				if (local229 > local13) {
					local13 = local229;
				}
			}
		}
		if (Static491.anInt7788 > local9 || local7 > Static491.anInt7792 || Static491.anInt7784 > local13 || local11 > Static491.anInt7793) {
			return true;
		}
		Static491.method6584(arg2, arg1, arg0);
		if (local99 != null) {
			if (Static591.anInt9999 > 0 && (Static246.anInt5375 != -1 && arg1.anInt9722 == Static246.anInt5375 || Static451.anInt9272 != -1 && arg0.anInt1754 == Static451.anInt9272)) {
				if (Static502.anInt7199 <= 50) {
					local308 = Static502.anInt7199 * 2;
				} else {
					local308 = 200 - Static502.anInt7199 * 2;
				}
				@Pc(477) int local477 = local308 << 24 | 0xFFFF00;
				arg2.method6120(local99.method7697() / 2 + 7, arg1.anInt9724, local477, arg1.anInt9720);
				arg2.method6120(local99.method7697() / 2 + 5, arg1.anInt9724, local477, arg1.anInt9720);
				arg2.method6120(local99.method7697() / 2 + 3, arg1.anInt9724, local477, arg1.anInt9720);
				arg2.method6120(local99.method7697() / 2 + 1, arg1.anInt9724, local477, arg1.anInt9720);
				arg2.method6120(local99.method7697() / 2, arg1.anInt9724, local477, arg1.anInt9720);
			}
			local99.method7698(arg1.anInt9720 - (local99.method7700() >> 1), arg1.anInt9724 - (local99.method7712() >> 1));
		}
		if (arg0.aString9 != null && local206 != null) {
			Static242.method4389(arg1, local221, arg2, local206, local212, arg0, local208, local210);
		}
		if (arg0.anInt1753 != -1 || arg0.aString9 != null) {
			@Pc(588) Class6_Sub30 local588 = new Class6_Sub30(arg1);
			local588.anInt5788 = local107;
			local588.anInt5794 = local227;
			local588.anInt5787 = local105;
			local588.anInt5793 = local229;
			local588.anInt5792 = local223;
			local588.anInt5790 = local225;
			local588.anInt5785 = local101;
			local588.anInt5795 = local103;
			Static15.aClass163_8.method4967(local588);
		}
		return false;
	}
}
