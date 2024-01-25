import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
	public static int anInt605;

	@OriginalMember(owner = "client!bba", name = "B", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_7 = new Class330(4);

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_8 = new Class330(4);

	@OriginalMember(owner = "client!bba", name = "G", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)S")
	public static short method511(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(36) int local36 = local19 <= 64 ? local15 * local19 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(40) int local40 = local36 + local19;
		@Pc(56) int local56;
		if (local40 == 0) {
			local56 = local36 << 1;
		} else {
			local56 = (local36 << 8) / local40;
		}
		return (short) (local40 | local56 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!kw;B)V")
	public static void method512(@OriginalArg(0) Class15_Sub2_Sub4_Sub1 arg0) {
		for (@Pc(18) Class6_Sub34 local18 = (Class6_Sub34) Static377.aClass298_144.method6809(); local18 != null; local18 = (Class6_Sub34) Static377.aClass298_144.method6821()) {
			if (arg0 == local18.aClass15_Sub2_Sub4_Sub1_1) {
				if (local18.aClass6_Sub15_Sub2_3 != null) {
					Static204.aClass6_Sub15_Sub1_1.method2421(local18.aClass6_Sub15_Sub2_3);
					local18.aClass6_Sub15_Sub2_3 = null;
				}
				local18.method7948();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZIILclient!ct;III)V")
	public static void method514(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static300.anInt5490 >= 50 || (arg3 == null || arg3.anIntArrayArray9 == null || arg3.anIntArrayArray9.length <= arg5 || arg3.anIntArrayArray9[arg5] == null)) {
			return;
		}
		@Pc(34) int local34 = arg3.anIntArrayArray9[arg5][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg3.anIntArrayArray9[arg5].length > 1) {
			local61 = (int) (Math.random() * (double) arg3.anIntArrayArray9[arg5].length);
			if (local61 > 0) {
				local38 = arg3.anIntArrayArray9[arg5][local61];
			}
		}
		@Pc(74) int local74 = local34 & 0x1F;
		if (local74 == 0) {
			if (arg0) {
				if (arg3.aBoolean105) {
					Static541.method7364(255, local44, false, 0, local38);
					return;
				}
				Static264.method4005(local38, local44, 255, 0);
			}
		} else if (Static58.aClass6_Sub17_Sub1_1.anInt9286 != 0) {
			local61 = arg1 - 256 >> 9;
			@Pc(112) int local112 = arg4 - 256 >> 9;
			Static486.aClass152Array1[Static300.anInt5490++] = new Class152((byte) (arg3.aBoolean105 ? 2 : 1), local38, local44, 0, 255, local74 + (local61 << 16) + (arg2 << 24) + (local112 << 8));
		}
	}
}
