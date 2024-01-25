import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_22 = new Class197(15, 0, 1, 0);

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public static int anInt8385 = -1;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public static int anInt8386 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!et;I)Ljava/lang/String;")
	public static String method7444(@OriginalArg(1) Class2_Sub20 arg0) {
		try {
			@Pc(14) int local14 = arg0.method8592(255);
			if (local14 > 32767) {
				local14 = 32767;
			}
			@Pc(26) byte[] local26 = new byte[local14];
			arg0.anInt9723 += Static25.aClass102_1.method2147(local26, arg0.anInt9723, local14, arg0.aByteArray111, 0);
			return Static155.method2227(0, local14, local26);
		} catch (@Pc(50) Exception local50) {
			return "Cabbage";
		}
	}
}
