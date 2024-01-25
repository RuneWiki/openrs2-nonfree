import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "Lclient!nk;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
	public static int anInt1502 = 1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILclient!qr;B)V")
	public static void method1405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub1_Sub2_Sub2 arg2) {
		@Pc(33) int local33 = Static294.method4659(arg2.anIntArray658[0], -4, 0, Static190.aClass239Array1[arg2.aByte74], arg1, arg2.anIntArray659[0], true, Static267.aClass12_Sub1_Sub2_Sub2_1.method4706(), 0, Static315.anIntArray686, arg0, 0, 0, Static360.anIntArray766);
		if (local33 >= 1) {
			for (@Pc(39) int local39 = 0; local39 < local33 - 1; local39++) {
				arg2.method4721(Static315.anIntArray686[local39], Static360.anIntArray766[local39], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	public static void method1407(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static297.aClass227ArrayArrayArray7 = Static91.aClass227ArrayArrayArray1;
			Static17.aClass33Array1 = Static345.aClass33Array3;
		} else {
			Static297.aClass227ArrayArrayArray7 = Static242.aClass227ArrayArrayArray4;
			Static17.aClass33Array1 = Static39.aClass33Array2;
		}
		Static32.anInt6037 = Static297.aClass227ArrayArrayArray7.length;
	}
}
