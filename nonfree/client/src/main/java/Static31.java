import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public static int anInt497;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Lclient!fo;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "Lclient!o;")
	public static Class6 aClass6_9;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_13 = new Class119(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "S")
	public static short aShort5 = 256;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[I")
	public static final int[] anIntArray30 = new int[1024];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method399() {
		Static383.aClass34_11.JA(((float) Static453.aClass136_Sub1_1.anInt4451 * 0.1F + 0.7F) * Static290.aFloat65);
		Static383.aClass34_11.B(Static56.anInt1065, Static287.aFloat64, Static62.aFloat14, (float) (Static267.anInt4827 << 0), (float) (Static99.anInt1779 << 0), (float) (Static297.anInt5870 << 0));
		Static383.aClass34_11.method5746(Static456.aClass3_4);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public static void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg0 + arg2);
		@Pc(34) int local34 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg0 - arg2);
		Static2.method38(local22, arg1, Static67.anIntArrayArray13[arg3], local34);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local63 = arg3 - local9;
				local67 = arg3 + local9;
				if (Static289.anInt5053 <= local67 && local63 <= Static93.anInt1676) {
					local90 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg0 + local7);
					local99 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg0 - local7);
					if (local67 <= Static93.anInt1676) {
						Static2.method38(local90, arg1, Static67.anIntArrayArray13[local67], local99);
					}
					if (local63 >= Static289.anInt5053) {
						Static2.method38(local90, arg1, Static67.anIntArrayArray13[local63], local99);
					}
				}
			}
			local7++;
			local63 = arg3 - local7;
			local67 = arg3 + local7;
			if (local67 >= Static289.anInt5053 && local63 <= Static93.anInt1676) {
				local90 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local9 + arg0);
				local99 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg0 - local9);
				if (Static93.anInt1676 >= local67) {
					Static2.method38(local90, arg1, Static67.anIntArrayArray13[local67], local99);
				}
				if (Static289.anInt5053 <= local63) {
					Static2.method38(local90, arg1, Static67.anIntArrayArray13[local63], local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
	public static int method401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static338.anIntArray397[arg1 & 0x3] : 256;
	}
}
