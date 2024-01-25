import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_58 = new Class223(4);

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_118 = new Class61(81, 3);

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_119 = new Class61(48, 4);

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "[I")
	public static final int[] anIntArray677 = new int[1000];

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
	public static int anInt8872 = 0;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V")
	public static void method7288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(11, arg2);
		local8.method3066();
		local8.anInt3348 = arg0;
		local8.anInt3353 = arg1;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
	public static void method7289(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(8, arg0);
		local8.method3062();
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIII)V")
	public static void method7290(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(11) Class26_Sub2 local11 = (Class26_Sub2) Static385.aClass8_5.method110(); local11 != null; local11 = (Class26_Sub2) Static385.aClass8_5.method113()) {
			if (local11.anInt2974 <= Static237.anInt7561) {
				local11.method7575();
			} else {
				Static86.method2042(local11.anInt2968, arg2 >> 1, arg1 >> 1, (local11.anInt2969 << 9) + 256, (local11.anInt2972 << 9) + 256, local11.anInt2970 * 2);
				Static65.aClass91_4.method7467(local11.aString23, arg3 + Static458.anIntArray627[0], arg0 - -Static458.anIntArray627[1], local11.anInt2973 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method7291(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(31) int local31 = arg0[arg1 + local20] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(49) char local49 = Static426.aCharArray8[local31 - 128];
					if (local49 == '\u0000') {
						local49 = '?';
					}
					local31 = local49;
				}
				local8[local10++] = (char) local31;
			}
		}
		return new String(local8, 0, local10);
	}
}
