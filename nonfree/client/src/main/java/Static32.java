import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!av", name = "bd", descriptor = "I")
	public static int anInt513 = 0;

	@OriginalMember(owner = "client!av", name = "xc", descriptor = "I")
	public static int anInt518 = 0;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!ela;")
	public static final Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!av", name = "Mc", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B[Ljava/lang/String;[I)V")
	public static void method466(@OriginalArg(1) String[] arg0, @OriginalArg(2) int[] arg1) {
		Static467.method6924(0, arg0.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!rba;ILjava/lang/String;)I")
	public static int method471(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt6241;
		@Pc(10) byte[] local10 = Static312.method4703(arg1);
		arg0.method5328(local10.length);
		arg0.anInt6241 += Static301.aClass151_1.method3697(0, arg0.aByteArray50, arg0.anInt6241, local10.length, local10);
		return arg0.anInt6241 - local6;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public static void method474() {
		@Pc(17) int[] local17 = new int[Static243.aClass406_2.anInt11253];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static243.aClass406_2.anInt11253; local21++) {
			@Pc(28) Class91 local28 = Static243.aClass406_2.method9394(local21);
			if (local28.anInt2712 >= 0 || local28.anInt2709 >= 0) {
				local17[local19++] = local21;
			}
		}
		Static433.anIntArray407 = new int[local19];
		for (@Pc(56) int local56 = 0; local56 < local19; local56++) {
			Static433.anIntArray407[local56] = local17[local56];
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Lclient!qca;")
	public static Class19_Sub1_Sub2 method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass19_Sub1_Sub2_2;
	}
}
