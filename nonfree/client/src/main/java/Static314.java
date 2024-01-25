import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "[I")
	public static final int[] anIntArray403 = new int[14];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method4293(@OriginalArg(1) Class1_Sub14_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static204.anInt3633; local3++) {
			@Pc(9) int local9 = Static21.anIntArray24[local3];
			@Pc(13) Class47_Sub1_Sub5_Sub2 local13 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method4548();
			if ((local17 & 0x2) != 0) {
				local17 += arg0.method4548() << 8;
			}
			if ((local17 & 0x2000) != 0) {
				local17 += arg0.method4548() << 16;
			}
			Static253.method849(local9, local17, local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V")
	public static void method4295(@OriginalArg(0) int arg0) {
		Static44.anInt680 = -1;
		if (arg0 == 37) {
			Static350.aFloat112 = 3.0F;
		} else if (arg0 == 50) {
			Static350.aFloat112 = 4.0F;
		} else if (arg0 == 75) {
			Static350.aFloat112 = 6.0F;
		} else if (arg0 == 100) {
			Static350.aFloat112 = 8.0F;
		} else if (arg0 == 200) {
			Static350.aFloat112 = 16.0F;
		}
		Static44.anInt680 = -1;
	}
}
