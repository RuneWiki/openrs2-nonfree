import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
	public static final int[] anIntArray801 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method5616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static222.anIntArray561[local3] = Static222.anIntArray561[local3 - 1];
			Static33.anIntArray98[local3] = Static33.anIntArray98[local3 - 1];
			Static273.aStringArray37[local3] = Static273.aStringArray37[local3 - 1];
			Static44.aStringArray3[local3] = Static44.aStringArray3[local3 - 1];
			Static297.aStringArray41[local3] = Static297.aStringArray41[local3 - 1];
			Static43.aStringArray24[local3] = Static43.aStringArray24[local3 - 1];
			Static339.anIntArray800[local3] = Static339.anIntArray800[local3 - 1];
		}
		Static222.anIntArray561[0] = arg1;
		Static33.anIntArray98[0] = arg3;
		Static273.aStringArray37[0] = arg6;
		Static44.aStringArray3[0] = arg4;
		Static297.aStringArray41[0] = arg5;
		Static160.anInt3190++;
		Static125.anInt2465 = Static119.anInt2038;
		Static339.anIntArray800[0] = arg0;
		Static43.aStringArray24[0] = arg2;
	}
}
