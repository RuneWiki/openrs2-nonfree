import java.applet.Applet;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet4;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt8146;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
	public static void method6859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) Class63 local22 = Static554.aClass63ArrayArrayArray4[arg0][arg2][arg4];
		if (local22 == null) {
			local22 = new Class63(arg0);
		}
		if (arg1 == 1) {
			local22.aShort29 = (short) arg5;
			local22.aShort26 = (short) arg3;
		} else if (arg1 == 2) {
			local22.aShort28 = (short) arg3;
			local22.aShort27 = (short) arg5;
		}
		if (Static164.aBoolean268) {
			Static69.method1638();
		}
	}
}
