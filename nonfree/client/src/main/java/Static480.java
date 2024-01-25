import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_12 = new Class342(11, 0, 1, 2);

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
	public static final int[] anIntArray599 = new int[200];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	public static void method6621() {
		Static530.anInt8828 = -1;
		Static210.anInt4254 = -1;
		Static296.anInt5524 = -1;
		Static113.anInt2183 = 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BILclient!ji;)Ljava/lang/String;")
	public static String method6622(@OriginalArg(2) Class6_Sub21 arg0) {
		try {
			@Pc(15) int local15 = arg0.method6005();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt7338 += Static458.aClass356_1.method7814(0, local27, arg0.aByteArray93, local15, arg0.anInt7338);
			return Static242.method4221(local15, 0, local27);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}
}
