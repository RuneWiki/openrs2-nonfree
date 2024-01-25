import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!fk;")
	public static Class71 aClass71_2;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_14 = new Class109(50);

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[250][];

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public static int anInt725 = 0;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public static int anInt726 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII[Lclient!bm;ZLclient!ea;[B)V")
	public static void method638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class55 arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(21) Class5_Sub12 local21 = new Class5_Sub12(arg5);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local21.method5102();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local21.method5060();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(57) int local57 = local38 & 0x3F;
				@Pc(63) int local63 = local38 >> 6 & 0x3F;
				@Pc(67) int local67 = local38 >> 12;
				@Pc(71) int local71 = local21.method5115();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				@Pc(83) int local83 = local63 + arg0;
				@Pc(87) int local87 = local57 + arg1;
				if (local83 > 0 && local87 > 0 && local83 < Static22.anInt481 - 1 && Static269.anInt5281 - 1 > local87) {
					@Pc(110) Class24 local110 = null;
					if (!arg3) {
						@Pc(114) int local114 = local67;
						if ((Static255.aByteArrayArrayArray13[1][local83][local87] & 0x2) == 2) {
							local114 = local67 - 1;
						}
						if (local114 >= 0) {
							local110 = arg2[local114];
						}
					}
					Static86.method1554(local110, local87, local79, local23, local67, arg3, local75, local67, -1, local83, arg4, true);
				}
			}
		}
	}
}
