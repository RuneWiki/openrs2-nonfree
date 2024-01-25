import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!gj;")
	public static Class4_Sub14_Sub1 aClass4_Sub14_Sub1_2;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_89 = new Class146(12, -1);

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
	public static final int[] anIntArray499 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(39) char local39 = Static55.aCharArray1[local22 - 128];
					if (local39 == '\u0000') {
						local39 = '?';
					}
					local22 = local39;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZIIII[BI[B)V")
	public static void method5082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg3++;
				arg7[local31] = (byte) (arg7[local31] - arg5[arg2++]);
				@Pc(44) int local44 = arg3++;
				arg7[local44] = (byte) (arg7[local44] - arg5[arg2++]);
				@Pc(57) int local57 = arg3++;
				arg7[local57] = (byte) (arg7[local57] - arg5[arg2++]);
				@Pc(70) int local70 = arg3++;
				arg7[local70] = (byte) (arg7[local70] - arg5[arg2++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg3++;
				arg7[local31] = (byte) (arg7[local31] - arg5[arg2++]);
			}
			arg3 += arg0;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method5084() {
		Static55.aClass137_9.method2739();
		Static454.aClass137_59.method2739();
		Static157.aClass137_28.method2739();
		Static49.aClass137_8.method2739();
		Static221.aClass137_41.method2739();
	}
}
