import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "F")
	public static float aFloat149;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZIIZIIJLjava/lang/String;ILjava/lang/String;)V")
	public static void method4554(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9) {
		if (!Static167.aBoolean291 && Static347.anInt6255 < 500) {
			@Pc(19) int local19 = arg5 == -1 ? Static78.anInt9033 : arg5;
			@Pc(33) Class2_Sub5 local33 = new Class2_Sub5(arg9, arg7, local19, arg8, arg3, arg6, arg0, arg2, arg4, arg1);
			Static375.aClass8_38.method212(local33);
			Static347.anInt6255++;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZZZ)V")
	public static void method4555(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static12.anInt425--;
			if (Static12.anInt425 == 0) {
				Static250.anIntArray314 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static499.anInt8385--;
		if (Static499.anInt8385 == 0) {
			Static568.anIntArray675 = null;
			return;
		}
	}
}
