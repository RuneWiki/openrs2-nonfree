import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public static int anInt877;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public static int anInt880 = 0;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!aa;ZIILclient!ne;Lclient!u;)Z")
	public static boolean method932(@OriginalArg(0) Class2 arg0, @OriginalArg(4) Class1_Sub25 arg1, @OriginalArg(5) Class202 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray744 != null) {
			local9 = (Static342.anInt2141 - Static342.anInt2145) * (arg1.anInt4119 + (arg2.anInt5891 - Static342.anInt2149)) / (Static342.anInt2143 - Static342.anInt2149) + Static342.anInt2145;
			local11 = Static342.anInt2151 - (Static342.anInt2151 - Static342.anInt2142) * (-Static342.anInt2147 + arg1.anInt4125 + arg2.anInt5884) / (Static342.anInt2140 - Static342.anInt2147);
			local13 = Static342.anInt2151 - (Static342.anInt2151 - Static342.anInt2142) * (arg2.anInt5895 - (-arg1.anInt4125 - -Static342.anInt2147)) / (Static342.anInt2140 - Static342.anInt2147);
			local7 = Static342.anInt2145 + (arg1.anInt4119 + arg2.anInt5909 - Static342.anInt2149) * (Static342.anInt2141 - Static342.anInt2145) / (Static342.anInt2143 - Static342.anInt2149);
		}
		@Pc(101) Class90 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg2.anInt5886 != -1) {
			if (arg1.aBoolean349 && arg2.anInt5883 != -1) {
				local101 = arg2.method5169(true, arg0);
			} else {
				local101 = arg2.method5169(false, arg0);
			}
			if (local101 != null) {
				local103 = arg1.anInt4121 - (local101.method5464() + 1 >> 1);
				local105 = arg1.anInt4121 + (local101.method5464() + 1 >> 1);
				if (local103 < local7) {
					local7 = local103;
				}
				if (local9 < local105) {
					local9 = local105;
				}
				local107 = arg1.anInt4120 - (local101.method5467() + 1 >> 1);
				local109 = arg1.anInt4120 + (local101.method5467() + 1 >> 1);
				if (local11 > local107) {
					local11 = local107;
				}
				if (local13 < local109) {
					local13 = local109;
				}
			}
		}
		@Pc(212) Class16 local212 = null;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(281) int local281;
		@Pc(304) int local304;
		if (arg2.aString234 != null) {
			local212 = Static194.method3678(arg2.anInt5900);
			if (local212 != null) {
				local219 = Static95.aClass38_3.method1314(null, null, Static107.aStringArray19, arg2.aString234);
				local221 = arg1.anInt4120;
				if (local101 == null) {
					local221 -= local219 * local212.method433() / 2;
				} else {
					local221 -= (local101.method5467() >> 1) + (local219 * local212.method435());
				}
				for (local281 = 0; local281 < local219; local281++) {
					@Pc(287) String local287 = Static107.aStringArray19[local281];
					if (local219 - 1 > local281) {
						local287 = local287.substring(0, local287.length() - 4);
					}
					local304 = local212.method438(local287);
					if (local223 < local304) {
						local223 = local304;
					}
				}
				local225 = arg1.anInt4121 - local223 / 2;
				local227 = arg1.anInt4121 + local223 / 2;
				if (local225 < local7) {
					local7 = local225;
				}
				local229 = local221;
				if (local9 < local227) {
					local9 = local227;
				}
				local231 = local221 + local212.method435() * local219;
				if (local11 > local229) {
					local11 = local229;
				}
				if (local13 < local231) {
					local13 = local231;
				}
			}
		}
		if (Static342.anInt2145 > local9 || local7 > Static342.anInt2141 || local13 < Static342.anInt2142 || Static342.anInt2151 < local11) {
			return true;
		}
		@Pc(411) int local411;
		if (arg2.anIntArray744 != null) {
			@Pc(409) int[] local409 = new int[arg2.anIntArray744.length];
			for (local411 = 0; local411 < local409.length / 2; local411++) {
				local304 = arg2.anIntArray744[local411 * 2] + arg1.anInt4119;
				@Pc(436) int local436 = arg1.anInt4125 + arg2.anIntArray744[local411 * 2 + 1];
				local409[local411 * 2] = (local304 - Static342.anInt2149) * (-Static342.anInt2145 + Static342.anInt2141) / (Static342.anInt2143 - Static342.anInt2149) + Static342.anInt2145;
				local409[local411 * 2 + 1] = Static342.anInt2151 - (local436 - Static342.anInt2147) * (-Static342.anInt2142 + Static342.anInt2151) / (Static342.anInt2140 - Static342.anInt2147);
			}
			Static146.method2779(arg0, local409, arg2.anInt5889);
			for (local304 = 0; local304 < local409.length / 2 - 1; local304++) {
				arg0.method3310(local409[(local304 + 1) * 2 + 1], local409[local304 * 2 + 1], local409[local304 * 2], arg2.anInt5885, local409[local304 * 2 + 2]);
			}
			arg0.method3310(local409[1], local409[local409.length - 1], local409[local409.length - 2], arg2.anInt5885, local409[0]);
		}
		if (local101 != null) {
			if (Static177.anInt3677 > 0 && (Static239.anInt4658 != -1 && arg1.anInt4124 == Static239.anInt4658 || Static327.anInt6270 != -1 && arg2.anInt5902 == Static327.anInt6270)) {
				if (Static23.anInt530 <= 50) {
					local281 = Static23.anInt530 * 2;
				} else {
					local281 = (100 - Static23.anInt530) * 2;
				}
				local411 = local281 << 24 | 0xFFFF00;
				arg0.method3297(arg1.anInt4120, local411, arg1.anInt4121, local101.method5471() / 2 + 7);
				arg0.method3297(arg1.anInt4120, local411, arg1.anInt4121, local101.method5471() / 2 + 5);
				arg0.method3297(arg1.anInt4120, local411, arg1.anInt4121, local101.method5471() / 2 + 3);
				arg0.method3297(arg1.anInt4120, local411, arg1.anInt4121, local101.method5471() / 2 + 1);
				arg0.method3297(arg1.anInt4120, local411, arg1.anInt4121, local101.method5471() / 2);
			}
			local101.method5454(arg1.anInt4121 - (local101.method5464() >> 1), arg1.anInt4120 + -(local101.method5467() >> 1));
		}
		if (arg2.aString234 != null && local212 != null) {
			Static302.method4314(local219, local212, arg0, local223, local221, arg2, arg1);
		}
		if (arg2.anInt5886 != -1 || arg2.aString234 != null) {
			@Pc(729) Class1_Sub22 local729 = new Class1_Sub22(arg1);
			local729.anInt3987 = local107;
			local729.anInt3985 = local225;
			local729.anInt3989 = local103;
			local729.anInt3992 = local109;
			local729.anInt3984 = local231;
			local729.anInt3982 = local229;
			local729.anInt3991 = local227;
			local729.anInt3983 = local105;
			Static185.aClass195_5.method5018(local729);
		}
		return false;
	}
}
