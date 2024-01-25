import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Z")
	public static boolean aBoolean615 = false;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "Z")
	public static boolean aBoolean616 = false;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	public static void method6650() {
		Static341.anInt6021 = -1;
		Static329.anInt5894 = -1;
		Static355.anInt6148 = 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public static void method6651() {
		Static131.aClass43_5.ra(((float) Static278.aClass3_Sub13_Sub1_1.anInt5148 * 0.1F + 0.7F) * Static84.aFloat33);
		Static131.aClass43_5.VA(Static39.anInt951, Static348.aFloat126, Static474.aFloat157, (float) (Static250.anInt4575 << 2), (float) (Static163.anInt3264 << 2), (float) (Static79.anInt2013 << 2));
		Static131.aClass43_5.method7148(Static447.aClass55_3);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
	public static int method6652(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([BIIII[BIII)V")
	public static void method6653(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg6++;
				arg0[local39] = (byte) (arg0[local39] - arg5[arg7++]);
				@Pc(52) int local52 = arg6++;
				arg0[local52] = (byte) (arg0[local52] - arg5[arg7++]);
				@Pc(65) int local65 = arg6++;
				arg0[local65] = (byte) (arg0[local65] - arg5[arg7++]);
				@Pc(78) int local78 = arg6++;
				arg0[local78] = (byte) (arg0[local78] - arg5[arg7++]);
			}
			for (@Pc(97) int local97 = local15; local97 < 0; local97++) {
				local39 = arg6++;
				arg0[local39] = (byte) (arg0[local39] - arg5[arg7++]);
			}
			arg6 += arg3;
			arg7 += arg2;
		}
	}
}
