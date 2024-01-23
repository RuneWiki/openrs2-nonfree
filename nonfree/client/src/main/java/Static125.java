import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
	public static int anInt5772;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray52 = new int[5][5000];

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString275 = "";

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)I")
	public static int method4627(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
	public static void method4628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < Static89.anInt1993; local7++) {
			@Pc(23) Class57 local23 = Static131.method2290(local7);
			if (local23 != null) {
				@Pc(28) int local28 = local23.anInt1606;
				if (local28 >= 0 && !Static93.anInterface5_1.method3524(local28)) {
					local28 = -1;
				}
				@Pc(60) int local60;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(105) int local105;
				if (local23.anInt1608 >= 0) {
					local74 = local23.anInt1608;
					local80 = (local74 & 0x7F) + arg1;
					if (local80 < 0) {
						local80 = 0;
					} else if (local80 > 127) {
						local80 = 127;
					}
					local105 = local80 + (local74 & 0x380) + (local74 - -arg0 & 0xFC00);
					local60 = Static93.anIntArray152[Static88.method3791(96, local105)];
				} else if (local28 >= 0) {
					local60 = Static93.anIntArray152[Static88.method3791(96, Static93.anInterface5_1.method3521(local28))];
				} else if (local23.anInt1619 == -1) {
					local60 = -1;
				} else {
					local74 = local23.anInt1619;
					local80 = arg1 + (local74 & 0x7F);
					if (local80 < 0) {
						local80 = 0;
					} else if (local80 > 127) {
						local80 = 127;
					}
					local105 = (local74 & 0x380) + (local74 + arg0 & 0xFC00) + local80;
					local60 = Static93.anIntArray152[Static88.method3791(96, local105)];
				}
				Static36.anIntArray56[local7 + 1] = local60;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIII)I")
	public static int method4631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		} else {
			@Pc(16) int local16 = 128 - arg2;
			@Pc(30) int local30 = (arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * local16 & 0xFF00FF00;
			@Pc(48) int local48 = arg2 * (arg0 >>> 7 & 0x1FE01FE) + (arg1 >>> 7 & 0x1FE01FE) * local16 & 0xFF00FF00;
			return (local30 >> 7) + local48;
		}
	}
}
