import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public static int anInt4554;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public static int anInt4551 = 1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)I")
	public static int method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static299.aClass40Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(23) int local23 = arg0 >> 9;
			@Pc(27) int local27 = arg3 >> 9;
			if (arg1 < 0 || arg4 < 0 || Static111.anInt1752 - 1 < arg1 || arg4 > Static279.anInt4567 - 1) {
				return 0;
			} else if (local23 >= 1 && local27 >= 1 && local23 <= Static111.anInt1752 - 1 && Static279.anInt4567 - 1 >= local27) {
				@Pc(85) boolean local85 = (Static480.aByteArrayArrayArray19[1][arg0 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(110) boolean local110;
				@Pc(129) boolean local129;
				if ((arg0 & 0x1FF) == 0) {
					local110 = (Static480.aByteArrayArrayArray19[1][local23 - 1][arg3 >> 9] & 0x2) != 0;
					local129 = (Static480.aByteArrayArrayArray19[1][local23][arg3 >> 9] & 0x2) != 0;
					if (local129 != local110) {
						local85 = (Static480.aByteArrayArrayArray19[1][arg1][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local110 = (Static480.aByteArrayArrayArray19[1][arg0 >> 9][local27 - 1] & 0x2) != 0;
					local129 = (Static480.aByteArrayArrayArray19[1][arg0 >> 9][local27] & 0x2) != 0;
					if (local110 != local129) {
						local85 = (Static480.aByteArrayArrayArray19[1][arg1][arg4] & 0x2) != 0;
					}
				}
				if (local85) {
					arg2++;
				}
				return Static299.aClass40Array1[arg2].method8447(arg0, arg3);
			} else {
				return 0;
			}
		} else {
			return Static299.aClass40Array1[arg2].method8447(arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!fb;)Lclient!daa;")
	public static Class66 method4174(@OriginalArg(1) Class14_Sub1_Sub1 arg0) {
		@Pc(7) Class66 local7;
		if (Static358.aClass66_4 == null) {
			local7 = new Class66();
		} else {
			local7 = Static358.aClass66_4;
			Static358.aClass66_4 = Static358.aClass66_4.aClass66_1;
			Static648.anInt10488--;
			local7.aClass66_1 = null;
		}
		local7.aClass14_Sub1_Sub1_1 = arg0;
		return local7;
	}
}
