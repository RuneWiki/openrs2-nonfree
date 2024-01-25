import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
	public static int[] anIntArray58;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method582(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static240.anIntArray380[local3] = Static240.anIntArray380[local3 - 1];
			Static162.anIntArray204[local3] = Static162.anIntArray204[local3 - 1];
			Static329.aStringArray51[local3] = Static329.aStringArray51[local3 - 1];
			Static200.aStringArray32[local3] = Static200.aStringArray32[local3 - 1];
			Static24.aStringArray2[local3] = Static24.aStringArray2[local3 - 1];
			Static236.aStringArray35[local3] = Static236.aStringArray35[local3 - 1];
			Static277.anIntArray426[local3] = Static277.anIntArray426[local3 - 1];
		}
		Static240.anIntArray380[0] = arg4;
		Static162.anIntArray204[0] = arg5;
		Static329.aStringArray51[0] = arg1;
		Static200.aStringArray32[0] = arg6;
		Static24.aStringArray2[0] = arg0;
		Static277.anIntArray426[0] = arg2;
		Static322.anInt6251 = Static301.anInt5969;
		Static276.anInt5526++;
		Static236.aStringArray35[0] = arg3;
	}
}
