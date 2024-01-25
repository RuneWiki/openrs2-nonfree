import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!vh", name = "bc", descriptor = "Lclient!ua;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)I")
	public static int method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static350.aClass107Array4 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(21) int local21 = arg2 >> 7;
			@Pc(25) int local25 = arg0 >> 7;
			if (arg4 < 0 || arg1 < 0 || Static246.anInt4374 - 1 < arg4 || Static185.anInt3485 - 1 < arg1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static246.anInt4374 - 1 && local25 <= Static185.anInt3485 - 1) {
				@Pc(95) boolean local95 = (Static96.aByteArrayArrayArray8[1][arg2 >> 7][arg0 >> 7] & 0x2) != 0;
				@Pc(123) boolean local123;
				@Pc(142) boolean local142;
				if ((arg2 & 0x7F) == 0) {
					local123 = (Static96.aByteArrayArrayArray8[1][local21 - 1][arg0 >> 7] & 0x2) != 0;
					local142 = (Static96.aByteArrayArrayArray8[1][local21][arg0 >> 7] & 0x2) != 0;
					if (local123 != local142) {
						local95 = (Static96.aByteArrayArrayArray8[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x7F) == 0) {
					local123 = (Static96.aByteArrayArrayArray8[1][arg2 >> 7][local25 - 1] & 0x2) != 0;
					local142 = (Static96.aByteArrayArrayArray8[1][arg2 >> 7][local25] & 0x2) != 0;
					if (local142 != local123) {
						local95 = (Static96.aByteArrayArrayArray8[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if (local95) {
					arg3++;
				}
				return Static350.aClass107Array4[arg3].method4673(arg2, arg0);
			} else {
				return 0;
			}
		} else {
			return Static350.aClass107Array4[arg3].method4673(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "(II)Lclient!jd;")
	public static Class117 method5386(@OriginalArg(1) int arg0) {
		@Pc(13) Class117[] local13 = Static231.method3772();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class117 local21 = local13[local15];
			if (arg0 == local21.anInt3031) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5387(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "(II)I")
	public static int method5389(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
