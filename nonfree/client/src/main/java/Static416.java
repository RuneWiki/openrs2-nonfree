import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_60 = new Class181();

	@OriginalMember(owner = "client!us", name = "d", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_203 = new Class107(57, 12);

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_16 = new Class237(1, 5);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5556(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static155.anInt2952;
		@Pc(7) int[] local7 = Static381.anIntArray619;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < local5; local11++) {
			@Pc(18) Class31_Sub2_Sub1_Sub1 local18 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local7[local11]];
			if (local18 != null && local18 != Static452.aClass31_Sub2_Sub1_Sub1_2 && local18.aString10 != null && local18.aString10.equalsIgnoreCase(arg0)) {
				local9 = true;
				if (arg1 == 1) {
					Static193.method2984(Static306.aClass179_63);
					Static92.aClass1_Sub5_Sub1_1.method5359(local7[local11]);
					Static92.aClass1_Sub5_Sub1_1.method5381(0);
				} else if (arg1 == 4) {
					Static193.method2984(Static321.aClass179_65);
					Static92.aClass1_Sub5_Sub1_1.method5390(local7[local11]);
					Static92.aClass1_Sub5_Sub1_1.method5381(0);
				} else if (arg1 == 5) {
					Static193.method2984(Static59.aClass179_8);
					Static92.aClass1_Sub5_Sub1_1.method5376(0);
					Static92.aClass1_Sub5_Sub1_1.method5390(local7[local11]);
				} else if (arg1 == 6) {
					Static193.method2984(Static246.aClass179_60);
					Static92.aClass1_Sub5_Sub1_1.method5396(0);
					Static92.aClass1_Sub5_Sub1_1.method5359(local7[local11]);
				} else if (arg1 == 7) {
					Static193.method2984(Static358.aClass179_74);
					Static92.aClass1_Sub5_Sub1_1.method5394(0);
					Static92.aClass1_Sub5_Sub1_1.method5390(local7[local11]);
				}
				break;
			}
		}
		if (!local9) {
			Static135.method2324(Static81.aClass7_42.method331(Static341.anInt5770) + arg0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5558(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
