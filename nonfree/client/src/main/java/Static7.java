import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "F")
	public static float aFloat12 = 0.0F;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZLclient!jr;I)Ljava/lang/String;")
	public static String method93(@OriginalArg(1) Class6_Sub12 arg0) {
		try {
			@Pc(15) int local15 = arg0.method6034();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local15];
			arg0.anInt7556 += Static204.aClass301_1.method6855(local23, local15, arg0.aByteArray97, 0, arg0.anInt7556);
			return Static497.method6882(0, local15, local23);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
