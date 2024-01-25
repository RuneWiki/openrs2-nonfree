import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "[S")
	public static short[] aShortArray58;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!wo;")
	public static Class216 aClass216_51;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public static int anInt3144 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	public static void method2870() {
		Static190.aClass197_16.method5155();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2871(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static85.method4681(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!il;III)V")
	public static void method2875(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static150.anIntArrayArrayArray9[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt6684 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass1_Sub30_Sub1Array3[arg0.anInt6684++] = Static309.aClass1_Sub30_Sub1Array2[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt6684; local19 < 4; local19++) {
			arg0.aClass1_Sub30_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)I")
	public static int method2876() {
		return Static327.anInt6280;
	}
}
