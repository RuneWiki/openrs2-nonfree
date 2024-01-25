import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_12 = new Class358(8, 0, 4, 1);

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!qg;")
	public static final Class272 aClass272_8 = new Class272("WTI", 5);

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!ko;")
	public static final Class183 aClass183_5 = new Class183("RC", 1);

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public static final int anInt6069 = 2;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	public static void method5118() {
		for (@Pc(1) int local1 = 0; local1 < Static460.anInt6105; local1++) {
			@Pc(6) Class41_Sub2_Sub1 local6 = Static294.aClass41_Sub2_Sub1Array7[local1];
			Static411.method5913(local6, true);
			Static294.aClass41_Sub2_Sub1Array7[local1] = null;
		}
		Static460.anInt6105 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ki;Lclient!ki;I)V")
	public static void method5125(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		if (arg1.aClass41_67 != null) {
			arg1.method7833();
		}
		arg1.aClass41_67 = arg0.aClass41_67;
		arg1.aClass41_68 = arg0;
		arg1.aClass41_67.aClass41_68 = arg1;
		arg1.aClass41_68.aClass41_67 = arg1;
	}
}
