import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[Lclient!vh;")
	public static Class359[] aClass359Array1;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!cea;I)Ljava/lang/String;")
	public static String method808(@OriginalArg(1) Class2_Sub11 arg0) {
		try {
			@Pc(15) int local15 = arg0.method8378();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt10066 += Static279.aClass369_5.method9061(local27, arg0.anInt10066, arg0.aByteArray128, local15, 0);
			return Static299.method5335(local27, local15, 0);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}
}
