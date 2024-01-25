import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString31 = "";

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "[I")
	public static final int[] anIntArray294 = new int[1];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIII)V")
	public static void method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15 = arg3 - arg2;
		@Pc(20) int local20 = arg4 - arg1;
		if (local15 == 0) {
			if (local20 != 0) {
				Static405.method5643(arg1, arg4, arg0, arg2);
			}
		} else if (local20 == 0) {
			Static238.method3234(arg3, arg0, arg2, arg1);
		} else {
			@Pc(49) int local49 = (local20 << 12) / local15;
			@Pc(58) int local58 = arg1 - (local49 * arg2 >> 12);
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static347.anInt6160 > arg3) {
				local63 = Static347.anInt6160;
				local71 = (Static347.anInt6160 * local49 >> 12) + local58;
			} else if (arg3 <= Static385.anInt6686) {
				local71 = arg4;
				local63 = arg3;
			} else {
				local71 = (Static385.anInt6686 * local49 >> 12) + local58;
				local63 = Static385.anInt6686;
			}
			@Pc(105) int local105;
			@Pc(103) int local103;
			if (arg2 < Static347.anInt6160) {
				local103 = (local49 * Static347.anInt6160 >> 12) + local58;
				local105 = Static347.anInt6160;
			} else if (Static385.anInt6686 < arg2) {
				local105 = Static385.anInt6686;
				local103 = local58 + (local49 * Static385.anInt6686 >> 12);
			} else {
				local103 = arg1;
				local105 = arg2;
			}
			if (local103 < Static118.anInt2005) {
				local105 = (Static118.anInt2005 - local58 << 12) / local49;
				local103 = Static118.anInt2005;
			} else if (Static123.anInt2069 < local103) {
				local103 = Static123.anInt2069;
				local105 = (Static123.anInt2069 - local58 << 12) / local49;
			}
			if (Static118.anInt2005 > local71) {
				local71 = Static118.anInt2005;
				local63 = (Static118.anInt2005 - local58 << 12) / local49;
			} else if (Static123.anInt2069 < local71) {
				local63 = (Static123.anInt2069 - local58 << 12) / local49;
				local71 = Static123.anInt2069;
			}
			Static185.method2698(local105, local63, arg0, local103, local71);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILclient!jq;B)J")
	public static long method2888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface6 arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class192 local21 = Static249.aClass39_2.method748(arg2.method5718());
		@Pc(42) long local42 = (long) (arg2.method5721() << 14 | arg1 << 7 | arg0 | arg2.method5723() << 20 | 0x40000000);
		if (local21.anInt5419 == 0) {
			local42 |= local14;
		}
		if (local21.anInt5441 == 1) {
			local42 |= local10;
		}
		if (local21.aBoolean378) {
			local42 |= local12;
		}
		return local42 | (long) arg2.method5718() << 32;
	}
}
