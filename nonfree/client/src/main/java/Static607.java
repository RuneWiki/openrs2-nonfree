import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
	public static int anInt10024;

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
	public static int anInt10027;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)Z")
	public static boolean method8245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static502.method7318(arg0, arg1) || Static289.method4998(arg0, arg1) || Static31.method594(arg0, arg1);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILjava/lang/String;)I")
	public static int method8246(@OriginalArg(1) String arg0) {
		return Static395.method6318(arg0, 10);
	}

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "(I)V")
	public static void method8247() {
		for (@Pc(7) int local7 = 0; local7 < Static377.anInt7132; local7++) {
			@Pc(13) int local13 = Static176.anIntArray229[local7];
			@Pc(20) Class3_Sub49 local20 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local13);
			if (local20 != null) {
				@Pc(25) Class2_Sub3_Sub1_Sub2_Sub1 local25 = local20.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				Static230.method4386(local25, local25.aClass22_1.anInt404);
			}
		}
	}
}
