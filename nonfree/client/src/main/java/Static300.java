import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
	public static int[] anIntArray564;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "Lclient!im;")
	public static Class166 aClass166_6;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_65 = new Class340(20);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt10358 = -1;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
	public static final int[] anIntArray565 = new int[50];

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt10361 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method8579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(14) int local14 = arg3 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg2 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg3 + 7) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg4[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local21;
			if (arg4[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	public static void method8581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(6, (long) arg0);
		local9.method7286();
		local9.anInt8546 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8586(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	public static void method8600(@OriginalArg(0) int arg0) {
		Static293.anInt5675 = -1;
		Static193.anInt3730 = arg0;
		Static596.anInt3354 = -1;
		Static126.method2284();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Lclient!bj;")
	public static Class41 method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_3;
	}
}
