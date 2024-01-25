import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_11 = new Class382(14, 0, 4, 1);

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("b1c343c4251b6b60fc78dee7d933be03e4ae25967504908346cc984bf90a097be095bac899ac79c8044ed560aaca56a8acc23c6dbe90df77a5d19a0a4466b4a3", 16);

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_12 = new Class382(9, 0, 4, 1);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method2131(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static586.method8349(arg1);
		@Pc(10) int local10 = Static183.aCalendar2.get(5);
		@Pc(20) int local20 = Static183.aCalendar2.get(2);
		@Pc(24) int local24 = Static183.aCalendar2.get(1);
		return arg0 == 3 ? Static126.method8222(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static235.aStringArrayArray2[arg0][local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIII)I")
	public static int method2133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static258.aClass159Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(22) int local22 = arg1 >> 9;
			@Pc(26) int local26 = arg3 >> 9;
			if (arg0 < 0 || arg4 < 0 || arg0 > Static380.anInt6689 - 1 || arg4 > Static542.anInt9214 - 1) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && local22 <= Static380.anInt6689 - 1 && Static542.anInt9214 - 1 >= local26) {
				@Pc(102) boolean local102 = (Static446.aByteArrayArrayArray12[1][arg1 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(130) boolean local130;
				@Pc(150) boolean local150;
				if ((arg1 & 0x1FF) == 0) {
					local130 = (Static446.aByteArrayArrayArray12[1][local22 - 1][arg3 >> 9] & 0x2) != 0;
					local150 = (Static446.aByteArrayArrayArray12[1][local22][arg3 >> 9] & 0x2) != 0;
					if (local130 != local150) {
						local102 = (Static446.aByteArrayArrayArray12[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local130 = (Static446.aByteArrayArrayArray12[1][arg1 >> 9][local26 - 1] & 0x2) != 0;
					local150 = (Static446.aByteArrayArrayArray12[1][arg1 >> 9][local26] & 0x2) != 0;
					if (local150 != local130) {
						local102 = (Static446.aByteArrayArrayArray12[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local102) {
					arg2++;
				}
				return Static258.aClass159Array1[arg2].method8209(arg1, arg3);
			} else {
				return 0;
			}
		} else {
			return Static258.aClass159Array1[arg2].method8209(arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
	public static int method2141() {
		if (Static12.aFrame1 == null) {
			return Static637.aBoolean730 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
