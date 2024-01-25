import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "I")
	public static int anInt2046;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!bo;I)V")
	public static void method1968(@OriginalArg(0) Class6_Sub2_Sub2 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method8464();
		for (@Pc(15) Class6_Sub2_Sub2 local15 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local15 != null; local15 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
			if (Static506.method7372(arg0.method613(), local15.method613())) {
				local7 = true;
				Static590.method8205(arg0, local15);
				break;
			}
		}
		if (!local7 && true) {
			Static228.aClass82_5.method2076(arg0);
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BII)V")
	public static void method1969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static432.anInt7414 != 0) {
			if (arg0 >= 0) {
				Static331.anIntArray523[arg0] = arg1;
			} else {
				for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
					Static331.anIntArray523[local20] = arg1;
				}
			}
		}
		Static449.aClass6_Sub17_Sub4_3.method6063(arg1, arg0);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(III[B)[B")
	public static byte[] method1970(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static695.method5648(arg1, arg0, local6, 0, 32768);
		return local6;
	}
}
