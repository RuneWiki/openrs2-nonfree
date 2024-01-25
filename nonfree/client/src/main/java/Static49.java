import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public static int anInt1181;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public static int anInt1182 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z")
	public static boolean method870() {
		if (Static364.aBoolean534) {
			try {
				if ((Boolean) Static456.method852("showingVideoAd", Static66.aClass143_2.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI[B)I")
	public static int method871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg1; local7++) {
			local5 = local5 >>> 8 ^ Class111.anIntArray217[(local5 ^ arg2[local7]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BIII[BIII)V")
	public static void method872(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg2++;
				arg4[local26] = (byte) (arg4[local26] - arg1[arg0++]);
				@Pc(39) int local39 = arg2++;
				arg4[local39] = (byte) (arg4[local39] - arg1[arg0++]);
				@Pc(52) int local52 = arg2++;
				arg4[local52] = (byte) (arg4[local52] - arg1[arg0++]);
				@Pc(65) int local65 = arg2++;
				arg4[local65] = (byte) (arg4[local65] - arg1[arg0++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg2++;
				arg4[local26] = (byte) (arg4[local26] - arg1[arg0++]);
			}
			arg0 += arg7;
			arg2 += arg3;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lclient!nc;")
	public static Class160 method873(@OriginalArg(1) int arg0) {
		@Pc(10) Class160 local10 = (Class160) Static373.aClass126_52.method3141((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static228.aClass32_52.method785(arg0, 0);
		local10 = new Class160();
		if (local20 != null) {
			local10.method3812(new Class3_Sub7(local20));
		}
		local10.method3817();
		Static373.aClass126_52.method3132((long) arg0, local10);
		return local10;
	}
}
