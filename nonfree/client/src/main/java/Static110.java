import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method1761(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static101.anIntArray167[local3] = Static101.anIntArray167[local3 - 1];
			Static262.anIntArray175[local3] = Static262.anIntArray175[local3 - 1];
			Static137.aStringArray35[local3] = Static137.aStringArray35[local3 - 1];
			Static93.aStringArray15[local3] = Static93.aStringArray15[local3 - 1];
			Static318.aStringArray40[local3] = Static318.aStringArray40[local3 - 1];
			Static50.aStringArray6[local3] = Static50.aStringArray6[local3 - 1];
			Static89.anIntArray146[local3] = Static89.anIntArray146[local3 - 1];
		}
		Static101.anIntArray167[0] = arg1;
		Static137.aStringArray35[0] = arg6;
		Static262.anIntArray175[0] = arg4;
		Static93.aStringArray15[0] = arg5;
		Static318.aStringArray40[0] = arg2;
		Static186.anInt3871 = Static244.anInt6207;
		Static89.anIntArray146[0] = arg3;
		Static50.aStringArray6[0] = arg0;
		Static117.anInt2270++;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public static void method1763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static326.anIntArray552[arg1] = arg0;
		@Pc(18) Class1_Sub25 local18 = (Class1_Sub25) Static346.aClass207_36.method5555((long) arg1);
		if (local18 == null) {
			local18 = new Class1_Sub25(4611686018427387905L);
			Static346.aClass207_36.method5552(local18, (long) arg1);
		} else if (local18.aLong105 != 4611686018427387905L) {
			local18.aLong105 = Static292.method5114() + 500L | 0x4000000000000000L;
			return;
		}
	}
}
