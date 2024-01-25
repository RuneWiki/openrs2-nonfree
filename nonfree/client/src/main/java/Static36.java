import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
	public static int anInt599;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method494(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BIIIIIII)V")
	public static void method497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg2 - 334;
		if (local14 < 0) {
			local14 = 0;
		} else if (local14 > 100) {
			local14 = 100;
		}
		@Pc(37) int local37 = Static314.aShort71 + local14 * (Static81.aShort24 - Static314.aShort71) / 100;
		@Pc(43) int local43 = local37 * arg5 >> 8;
		@Pc(50) int local50 = 16384 - arg4 & 0x3FFF;
		@Pc(57) int local57 = 16384 - arg1 & 0x3FFF;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local43;
		if (local50 != 0) {
			local61 = -local43 * Class100.anIntArray206[local50] >> 15;
			local63 = Class100.anIntArray208[local50] * local43 >> 15;
		}
		if (local57 != 0) {
			local59 = local63 * Class100.anIntArray206[local57] >> 15;
			local63 = Class100.anIntArray208[local57] * local63 >> 15;
		}
		Static226.anInt3896 = 0;
		Static222.anInt3814 = arg3 - local61;
		Static411.anInt6947 = arg1;
		Static235.anInt4004 = arg0 - local59;
		Static133.anInt2435 = arg4;
		Static393.anInt7135 = arg6 - local63;
	}
}
