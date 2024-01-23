import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!im", name = "eb", descriptor = "[I")
	public static int[] anIntArray298 = new int[100];

	@OriginalMember(owner = "client!im", name = "m", descriptor = "(II)V")
	public static void method2643(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub28 local12 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg0);
		if (local12 != null) {
			for (@Pc(18) int local18 = 0; local18 < local12.anIntArray500.length; local18++) {
				local12.anIntArray500[local18] = -1;
				local12.anIntArray499[local18] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method2661(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static62.anIntArray167[local7] = Static62.anIntArray167[local7 - 1];
			Static98.aStringArray9[local7] = Static98.aStringArray9[local7 - 1];
			Static246.aStringArray30[local7] = Static246.aStringArray30[local7 - 1];
			Static133.aStringArray15[local7] = Static133.aStringArray15[local7 - 1];
			Static44.anIntArray119[local7] = Static44.anIntArray119[local7 - 1];
		}
		Static140.anInt3223++;
		Static98.aStringArray9[0] = arg4;
		Static281.anInt6015 = Static27.anInt754;
		Static246.aStringArray30[0] = arg0;
		Static133.aStringArray15[0] = arg2;
		Static62.anIntArray167[0] = arg1;
		Static44.anIntArray119[0] = arg3;
	}
}
