import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!d", name = "X", descriptor = "Lclient!nb;")
	public static Class15 aClass15_6;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "[Lclient!lj;")
	public static Class60[] aClass60Array8;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1 aClass2_Sub2_Sub16_Sub1_1;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "S")
	public static short aShort9 = 256;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_222 = Static184.method2923(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	public static int anInt845 = 0;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "Lclient!i;")
	public static Class41 aClass41_223 = Static184.method2923("::fpsoff");

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_224 = Static184.method2923("(R");

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "Lclient!i;")
	private static Class41 aClass41_226 = Static184.method2923("Discard");

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Lclient!i;")
	public static Class41 aClass41_225 = aClass41_226;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
	public static int anInt850 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!i;Lclient!i;Lclient!i;)V")
	public static void method629(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) Class41 arg2) {
		Static185.aClass41_1123 = arg1;
		Static185.aClass41_1122 = arg0;
		Static185.aClass41_1121 = arg2;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)[Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1[] method631() {
		@Pc(13) Class2_Sub2_Sub16_Sub1[] local13 = new Class2_Sub2_Sub16_Sub1[Static154.anInt3619];
		for (@Pc(15) int local15 = 0; local15 < Static154.anInt3619; local15++) {
			@Pc(25) int local25 = Static89.anIntArray224[local15] * Static60.anIntArray498[local15];
			@Pc(29) byte[] local29 = Static102.aByteArrayArray6[local15];
			@Pc(32) int[] local32 = new int[local25];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local32[local34] = Static25.anIntArray494[local29[local34] & 0xFF];
			}
			local13[local15] = new Class2_Sub2_Sub16_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[local15], Static120.anIntArray310[local15], Static89.anIntArray224[local15], Static60.anIntArray498[local15], local32);
		}
		Static212.method3255();
		return local13;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!nb;II)[Lclient!rc;")
	public static Class2_Sub2_Sub16[] method632(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) int arg2) {
		return Static43.method900(arg1, arg2, arg0) ? Static19.method346() : null;
	}
}
