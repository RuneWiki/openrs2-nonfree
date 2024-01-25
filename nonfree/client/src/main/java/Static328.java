import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
	public static int anInt6576 = 0;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)Z")
	public static boolean method5502() {
		return Static443.anInt8026 > 0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)Lclient!uw;")
	public static Class346 method5503(@OriginalArg(1) int arg0) {
		@Pc(10) Class346 local10 = (Class346) Static534.aClass112_59.method3640((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static501.aClass181_120.method5023(0, arg0);
		local10 = new Class346();
		if (local28 != null) {
			local10.method8068(arg0, new Class3_Sub15(local28));
		}
		Static534.aClass112_59.method3636((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZI)Z")
	public static boolean method5504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBIZJ)Ljava/lang/String;")
	public static String method5505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local27 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(58) int local58;
		@Pc(63) int local63;
		if (arg0 > 0) {
			for (local58 = 0; local58 < arg0; local58++) {
				local63 = (int) arg3;
				arg3 /= 10L;
				local43.append((char) (local63 + 48 - (int) arg3 * 10));
			}
			local43.append(local7);
		}
		local58 = 0;
		while (true) {
			local63 = (int) arg3;
			arg3 /= 10L;
			local43.append((char) (local63 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg2) {
				local58++;
				if (local58 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}
}
