import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray26 = new byte[250][];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!gw;)Lclient!ig;")
	public static Class82_Sub3 method6050(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class82_Sub3(arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3039(), arg0.method3039(), arg0.method3043());
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method6051() {
		if (Static510.anIntArray737 != null && Static82.anIntArray177 != null) {
			return;
		}
		Static510.anIntArray737 = new int[256];
		Static82.anIntArray177 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(33) double local33 = (double) local24 / 255.0D * 6.283185307179586D;
			Static510.anIntArray737[local24] = (int) (Math.sin(local33) * 4096.0D);
			Static82.anIntArray177[local24] = (int) (Math.cos(local33) * 4096.0D);
		}
	}
}
