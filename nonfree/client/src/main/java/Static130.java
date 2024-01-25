import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!nl;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public static int anInt2453 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!dq;II)Ljava/awt/Frame;")
	public static Frame method2302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method1176()) {
			return null;
		}
		@Pc(22) Class196[] local22 = Static143.method2458(arg2);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (arg1 == local22[local30].anInt5452 && local22[local30].anInt5445 == arg0 && (!local28 || arg3 < local22[local30].anInt5450)) {
				local28 = true;
				arg3 = local22[local30].anInt5450;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(91) Class1 local91 = arg2.method1175(arg3, arg1, arg0);
		while (local91.anInt2 == 0) {
			Static185.method3004(10L);
		}
		@Pc(105) Frame local105 = (Frame) local91.anObject1;
		if (local105 == null) {
			return null;
		} else if (local91.anInt2 == 2) {
			Static64.method1167(arg2, local105);
			return null;
		} else {
			return local105;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!fr;IILclient!ji;Lclient!km;)Z")
	public static boolean method2304(@OriginalArg(1) Class80 arg0, @OriginalArg(4) Class2_Sub20 arg1, @OriginalArg(5) Class82 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray241 != null) {
			local9 = Static302.anInt394 + (arg0.anInt2033 + arg1.anInt2998 - Static302.anInt395) * (-Static302.anInt394 + Static302.anInt397) / (Static302.anInt386 - Static302.anInt395);
			local11 = Static302.anInt390 - (Static302.anInt390 - Static302.anInt392) * (arg1.anInt3001 + arg0.anInt2042 - Static302.anInt391) / (Static302.anInt388 - Static302.anInt391);
			local13 = Static302.anInt390 - (arg1.anInt3001 + arg0.anInt2046 - Static302.anInt391) * (Static302.anInt390 - Static302.anInt392) / (Static302.anInt388 - Static302.anInt391);
			local7 = Static302.anInt394 + (arg1.anInt2998 + arg0.anInt2061 - Static302.anInt395) * (Static302.anInt397 - Static302.anInt394) / (Static302.anInt386 - Static302.anInt395);
		}
		@Pc(102) Class5 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg0.anInt2037 != -1) {
			if (arg1.aBoolean223 && arg0.anInt2059 != -1) {
				local102 = arg0.method1844(true, arg2);
			} else {
				local102 = arg0.method1844(false, arg2);
			}
			if (local102 != null) {
				local104 = arg1.anInt2995 - (local102.method4990() + 1 >> 1);
				local106 = arg1.anInt2995 + (local102.method4990() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local108 = arg1.anInt3004 - (local102.method4992() + 1 >> 1);
				if (local106 > local9) {
					local9 = local106;
				}
				if (local108 < local11) {
					local11 = local108;
				}
				local110 = arg1.anInt3004 + (local102.method4992() + 1 >> 1);
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(205) Class176 local205 = null;
		@Pc(207) int local207 = 0;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(268) int local268;
		@Pc(291) int local291;
		if (arg0.aString23 != null) {
			local205 = Static185.method3005(arg0.anInt2055);
			if (local205 != null) {
				local207 = Static296.aClass216_6.method5072(null, arg0.aString23, null, Static22.aStringArray5);
				local209 = arg1.anInt3004;
				if (local102 == null) {
					local209 -= local207 * local205.method4158() / 2;
				} else {
					local209 -= (local102.method4992() >> 1) + local205.method4159() * local207;
				}
				for (local268 = 0; local268 < local207; local268++) {
					@Pc(274) String local274 = Static22.aStringArray5[local268];
					if (local207 - 1 > local268) {
						local274 = local274.substring(0, local274.length() - 4);
					}
					local291 = local205.method4162(local274);
					if (local211 < local291) {
						local211 = local291;
					}
				}
				local213 = arg1.anInt2995 - local211 / 2;
				local215 = local211 / 2 + arg1.anInt2995;
				if (local7 > local213) {
					local7 = local213;
				}
				if (local215 > local9) {
					local9 = local215;
				}
				local217 = local209;
				if (local217 < local11) {
					local11 = local217;
				}
				local219 = local205.method4159() * local207 + local209;
				if (local219 > local13) {
					local13 = local219;
				}
			}
		}
		if (Static302.anInt394 > local9 || Static302.anInt397 < local7 || Static302.anInt392 > local13 || Static302.anInt390 < local11) {
			return true;
		}
		@Pc(392) int local392;
		if (arg0.anIntArray241 != null) {
			@Pc(390) int[] local390 = new int[arg0.anIntArray241.length];
			for (local392 = 0; local392 < local390.length / 2; local392++) {
				local291 = arg0.anIntArray241[local392 * 2] + arg1.anInt2998;
				@Pc(417) int local417 = arg0.anIntArray241[local392 * 2 + 1] + arg1.anInt3001;
				local390[local392 * 2] = Static302.anInt394 + (local291 - Static302.anInt395) * (Static302.anInt397 - Static302.anInt394) / (Static302.anInt386 - Static302.anInt395);
				local390[local392 * 2 + 1] = Static302.anInt390 - (Static302.anInt390 - Static302.anInt392) * (-Static302.anInt391 + local417) / (Static302.anInt388 - Static302.anInt391);
			}
			Static132.method2322(arg2, local390, arg0.anInt2034);
			for (local291 = 0; local291 < local390.length / 2 - 1; local291++) {
				arg2.method4497(local390[local291 * 2], arg0.anInt2058, local390[(local291 + 1) * 2 + 1], local390[local291 * 2 + 1], local390[(local291 + 1) * 2]);
			}
			arg2.method4497(local390[local390.length - 2], arg0.anInt2058, local390[1], local390[local390.length - 1], local390[0]);
		}
		if (local102 != null) {
			if (Static276.anInt4916 > 0 && (Static10.anInt307 != -1 && Static10.anInt307 == arg1.anInt3000 || Static358.anInt6273 != -1 && Static358.anInt6273 == arg0.anInt2039)) {
				if (Static269.anInt4775 > 50) {
					local268 = (100 - Static269.anInt4775) * 2;
				} else {
					local268 = Static269.anInt4775 * 2;
				}
				local392 = local268 << 24 | 0xFFFF00;
				arg2.method4491(arg1.anInt3004, local102.method5002() / 2 + 7, local392, arg1.anInt2995);
				arg2.method4491(arg1.anInt3004, local102.method5002() / 2 + 5, local392, arg1.anInt2995);
				arg2.method4491(arg1.anInt3004, local102.method5002() / 2 + 3, local392, arg1.anInt2995);
				arg2.method4491(arg1.anInt3004, local102.method5002() / 2 + 1, local392, arg1.anInt2995);
				arg2.method4491(arg1.anInt3004, local102.method5002() / 2, local392, arg1.anInt2995);
			}
			local102.method5004(arg1.anInt2995 - (local102.method4990() >> 1), arg1.anInt3004 + -(local102.method4992() >> 1));
		}
		if (arg0.aString23 != null && local205 != null) {
			Static335.method5122(arg2, arg1, local211, arg0, local207, local205, local209);
		}
		if (arg0.anInt2037 != -1 || arg0.aString23 != null) {
			@Pc(709) Class2_Sub39 local709 = new Class2_Sub39(arg1);
			local709.anInt6190 = local108;
			local709.anInt6192 = local219;
			local709.anInt6188 = local110;
			local709.anInt6184 = local213;
			local709.anInt6189 = local104;
			local709.anInt6185 = local215;
			local709.anInt6186 = local217;
			local709.anInt6187 = local106;
			Static100.aClass210_16.method5044(local709);
		}
		return false;
	}
}
