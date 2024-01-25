import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!jj;")
	public static final Class187 aClass187_3 = new Class187();

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!re;")
	public static final Class5_Sub48 aClass5_Sub48_1 = new Class5_Sub48(0, 0);

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt4702 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)J")
	public static long method4271(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4273(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub36 local8 = new Class5_Sub36(arg0);
		@Pc(18) int local18 = local8.method7291();
		@Pc(22) int local22 = local8.method7268();
		if (local22 < 0 || Static137.anInt2740 != 0 && Static137.anInt2740 < local22) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(115) byte[] local115 = new byte[local22];
			local8.method7297(local115, 0, local22);
			return local115;
		} else {
			@Pc(50) int local50 = local8.method7268();
			if (local50 < 0 || Static137.anInt2740 != 0 && Static137.anInt2740 < local50) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local50];
			if (local18 == 1) {
				Static430.method6198(local79, local50, arg0, local22);
			} else {
				@Pc(97) Class147 local97 = Static333.aClass147_1;
				synchronized (Static333.aClass147_1) {
					Static333.aClass147_1.method3396(local79, local8);
				}
			}
			return local79;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method4274(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) char[] local15 = new char[arg2];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg2; local19++) {
			@Pc(29) int local29 = arg0[arg1 + local19] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(52) char local52 = Static85.aCharArray15[local29 - 128];
					if (local52 == '\u0000') {
						local52 = '?';
					}
					local29 = local52;
				}
				local15[local17++] = (char) local29;
			}
		}
		return new String(local15, 0, local17);
	}
}
