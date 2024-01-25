import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
	public static final int anInt7633 = -1;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_9 = new Class122("", 16);

	@OriginalMember(owner = "client!oo", name = "T", descriptor = "[Lclient!jea;")
	public static final Class6_Sub5_Sub18[] aClass6_Sub5_Sub18Array3 = new Class6_Sub5_Sub18[14];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!ji;I)Ljava/lang/String;")
	public static String method6447(@OriginalArg(1) Class6_Sub8 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8214();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt10061 += Static479.aClass229_1.method6045(arg0.anInt10061, local19, local7, arg0.aByteArray102, 0);
			return Static99.method2380(local7, 0, local19);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}
}
