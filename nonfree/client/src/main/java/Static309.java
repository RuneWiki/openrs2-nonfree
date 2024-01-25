import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array15;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
	public static int anInt5687 = -1;

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "[I")
	public static final int[] anIntArray316 = new int[14];

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)I")
	public static int method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4632(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 + 1 - 97;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 + 27 - 48;
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

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIILclient!r;Lclient!js;)V")
	public static void method4633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) Class178 arg4) {
		@Pc(9) Class40 local9 = Static191.aClass33_2.method794(arg4.anInt4633);
		if (local9.anInt1134 == -1) {
			return;
		}
		if (arg4.aBoolean349) {
			@Pc(27) int local27 = arg2 + arg4.anInt4647;
			arg2 = local27 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class5 local39 = local9.method1002(arg2, arg3, arg4.aBoolean345);
		if (local39 == null) {
			return;
		}
		@Pc(50) int local50 = arg4.anInt4627;
		@Pc(53) int local53 = arg4.anInt4634;
		if ((arg2 & 0x1) == 1) {
			local50 = arg4.anInt4634;
			local53 = arg4.anInt4627;
		}
		@Pc(67) int local67 = local39.A();
		@Pc(70) int local70 = local39.ca();
		if (local9.aBoolean57) {
			local70 = local53 * 4;
			local67 = local50 * 4;
		}
		if (local9.anInt1135 == 0) {
			local39.method7801(arg1, arg0 - (local53 - 1) * 4, local67, local70);
		} else {
			local39.method7804(arg1, arg0 - (local53 - 1) * 4, local67, local70, 0, local9.anInt1135 | 0xFF000000, 1);
		}
	}
}
