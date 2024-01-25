import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_215 = new Class362(82, 6);

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
	public static int anInt9640 = 0;

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_216 = new Class362(0, 8);

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_116 = new Class173(74, 4);

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)V")
	public static void method7871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static342.anInt6643 != 0) {
			if (arg0 < 0) {
				for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
					Static342.anIntArray341[local11] = arg1;
				}
			} else {
				Static342.anIntArray341[arg0] = arg1;
			}
		}
		Static405.aClass4_Sub7_Sub3_4.method5442(arg1, arg0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!un;B)Lclient!pv;")
	public static Class108_Sub2 method7872(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(14) Class108 local14 = Static555.method8026(arg0);
		@Pc(18) int local18 = arg0.method4931();
		@Pc(22) int local22 = arg0.method4931();
		@Pc(26) int local26 = arg0.method4936();
		return new Class108_Sub2(local14.aClass258_13, local14.aClass250_13, local14.anInt10009, local14.anInt10011, local14.anInt10015, local14.anInt10007, local14.anInt10008, local14.anInt10013, local14.anInt10014, local18, local22, local26);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(CB)C")
	public static char method7874(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
