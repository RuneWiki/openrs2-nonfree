import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	public static int anInt6238;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[1000][];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method5241() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static322.aBooleanArray13[local5] = false;
		}
		Static394.anInt6803 = 0;
		Static133.anInt2254 = 1;
		Static235.anInt3819 = -1;
		Static307.anInt5474 = -1;
		Static19.anInt269 = 0;
		Static67.anInt1033 = -1;
		Static297.anInt571 = -1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!wq;B)V")
	public static void method5242(@OriginalArg(0) Class394 arg0) {
		@Pc(7) Class394 local7 = Static351.method5230(arg0);
		@Pc(20) int local20;
		@Pc(17) int local17;
		if (local7 == null) {
			local17 = Static316.anInt8165;
			local20 = Static563.anInt9176;
		} else {
			local17 = local7.anInt10532;
			local20 = local7.anInt10536;
		}
		Static179.method2637(false, local20, local17, arg0);
		Static583.method7975(arg0, local20, local17);
	}
}
