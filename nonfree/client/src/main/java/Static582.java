import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(FFFIFF[BIIIIILclient!qa;)V")
	public static void method8089(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(11) int arg6, @OriginalArg(12) Class111 arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static586.method8130(arg4, arg5, arg1, arg2, arg3, arg6, arg7, local7, arg0);
			arg6 += 16384;
		}
		if (-15 <= -41) {
			method8096();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Lclient!qj;")
	public static Class311 method8090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static632.aClass311ArrayArrayArray3[0][arg1][arg2] != null && Static632.aClass311ArrayArrayArray3[0][arg1][arg2].aClass311_1 != null;
			if (local33 && arg0 >= Static97.anInt1761 - 1) {
				return null;
			}
			Static572.method7965(arg0, arg1, arg2);
		}
		return Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!jm;[[BI)V")
	public static void method8092(@OriginalArg(0) Class199_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(23) Class2_Sub20 local23 = new Class2_Sub20(local16);
				local29 = Static148.anIntArray187[local10] >> 8;
				@Pc(35) int local35 = Static148.anIntArray187[local10] & 0xFF;
				@Pc(41) int local41 = local29 * 64 - Static243.anInt3820;
				@Pc(48) int local48 = local35 * 64 - Static224.anInt11062;
				Static165.method2505();
				arg0.method4270(local23, Static626.aClass226Array1, Static243.anInt3820, local41, Static224.anInt11062, local48);
				arg0.method4279(local41, local23, local48, Static396.aClass145_6);
			}
		}
		for (@Pc(81) int local81 = 0; local81 < local8; local81++) {
			@Pc(94) int local94 = (Static148.anIntArray187[local81] >> 8) * 64 - Static243.anInt3820;
			local29 = (Static148.anIntArray187[local81] & 0xFF) * 64 - Static224.anInt11062;
			@Pc(108) byte[] local108 = arg1[local81];
			if (local108 == null && Static663.anInt9247 < 800) {
				Static165.method2505();
				arg0.method4262(local29, local94);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()V")
	public static void method8096() {
		Static511.method7247(Static97.anInt1761);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I")
	public static int method8098(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public static void method8103() {
		Static22.anIntArray35 = Static13.method211(0.4F);
	}
}
