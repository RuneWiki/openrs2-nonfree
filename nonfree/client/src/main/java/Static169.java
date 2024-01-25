import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Z")
	public static boolean aBoolean182 = true;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method2464(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static454.anIntArray625[local3] = Static454.anIntArray625[local3 - 1];
			Static171.anIntArray268[local3] = Static171.anIntArray268[local3 - 1];
			Static121.aStringArray16[local3] = Static121.aStringArray16[local3 - 1];
			Static87.aStringArray9[local3] = Static87.aStringArray9[local3 - 1];
			Static381.aStringArray49[local3] = Static381.aStringArray49[local3 - 1];
			Static225.aStringArray38[local3] = Static225.aStringArray38[local3 - 1];
			Static377.anIntArray551[local3] = Static377.anIntArray551[local3 - 1];
		}
		Static454.anIntArray625[0] = arg1;
		Static121.aStringArray16[0] = arg6;
		Static171.anIntArray268[0] = arg2;
		Static87.aStringArray9[0] = arg0;
		Static381.aStringArray49[0] = arg3;
		Static225.aStringArray38[0] = arg5;
		Static353.anInt5646 = Static90.anInt1865;
		Static377.anIntArray551[0] = arg4;
		Static223.anInt3931++;
	}
}
