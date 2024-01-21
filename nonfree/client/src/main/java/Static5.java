import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!qc;")
	public static Class3_Sub1_Sub4_Sub3_Sub1 aClass3_Sub1_Sub4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
	public static int[] anIntArray29;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Z")
	public static boolean aBoolean17;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static int anInt201 = 127;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public static int anInt206 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)V")
	public static void method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		@Pc(13) int[] local13 = new int[4];
		local8[0] = arg0;
		local13[0] = arg1;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			if (arg0 != Static143.anIntArray395[local31]) {
				local8[local10] = Static143.anIntArray395[local31];
				local13[local10] = Static133.anIntArray384[local31];
				local10++;
			}
		}
		Static133.anIntArray384 = local13;
		Static143.anIntArray395 = local8;
		Static139.method2159(Static176.aClass21Array1.length - 1, Static133.anIntArray384, Static176.aClass21Array1, 0, Static143.anIntArray395);
	}
}
