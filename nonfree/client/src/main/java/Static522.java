import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_253 = new Class272(2, 8);

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Z")
	public static final boolean aBoolean640 = false;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(CB)Z")
	public static boolean method6947(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static260.method4319(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static570.aCharArray11;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static357.aCharArray7;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ua;IIILclient!lk;Lclient!la;IILjava/lang/String;ILclient!daa;I)V")
	public static void method6948(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class203 arg4, @OriginalArg(5) Class117 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class58 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static446.anInt7363 == 4) {
			local13 = (int) Static439.aFloat151 & 0x3FFF;
		} else {
			local13 = Static278.anInt5101 + (int) Static439.aFloat151 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg4.anInt5513 / 2, arg4.anInt5476 / 2) + 10;
		@Pc(40) int local40 = arg2 * arg2 + arg8 * arg8;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(50) int local50 = Class3_Sub17.anIntArray175[local13];
		@Pc(54) int local54 = Class3_Sub17.anIntArray177[local13];
		if (Static446.anInt7363 != 4) {
			local54 = local54 * 256 / (Static435.anInt7196 + 256);
			local50 = local50 * 256 / (Static435.anInt7196 + 256);
		}
		@Pc(83) int local83 = local54 * arg8 + arg2 * local50 >> 14;
		@Pc(94) int local94 = local54 * arg2 - arg8 * local50 >> 14;
		@Pc(101) int local101 = arg9.method1766(arg7, null, 100);
		@Pc(117) int local117 = arg9.method1771(arg7, 100, 0, null);
		@Pc(123) int local123 = local83 - local101 / 2;
		if (-arg4.anInt5513 <= local123 && arg4.anInt5513 >= local123 && -arg4.anInt5476 <= local94 && arg4.anInt5476 >= local94) {
			arg5.method7650(0, arg4.anInt5476 / 2 + arg1 - local117 - arg6 - local94, arg0, 0, arg10, 50, arg7, null, null, 0, local101, arg3, local123 + arg3 + arg4.anInt5513 / 2, 1, arg1);
		}
	}
}
