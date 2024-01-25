import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "Lclient!ac;")
	public static Class5 aClass5_36;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIBZ)I")
	public static int method7257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class3_Sub17 local10 = Static77.method3511(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(30) int local30 = 0; local30 < local10.anIntArray98.length; local30++) {
				if (arg0 == local10.anIntArray99[local30]) {
					local22 += local10.anIntArray98[local30];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B[Ljava/lang/String;)V")
	public static void method7262(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static197.aString45 = Static197.aString45 + arg0[0];
			Static230.anInt5186 += arg0[0].length();
			return;
		}
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			if (arg0[local35].startsWith("pause")) {
				@Pc(54) int local54 = 5;
				try {
					local54 = Integer.parseInt(arg0[local35].substring(6));
				} catch (@Pc(63) Exception local63) {
				}
				Static117.method2792("Pausing for " + local54 + " seconds...");
				Static306.aStringArray23 = arg0;
				Static257.anInt5674 = local35 + 1;
				Static297.aLong143 = (long) (local54 * 1000) + Static444.method6719();
				return;
			}
			Static197.aString45 = arg0[local35];
			Static200.method3947(false);
		}
	}
}
