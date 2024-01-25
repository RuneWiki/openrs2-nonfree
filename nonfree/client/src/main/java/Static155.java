import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_94 = new Class208(48, 0);

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_45 = new Class183(58, 2);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method2766() {
		if (Static40.anIntArray60 != null && Static89.anIntArray149 != null) {
			return;
		}
		Static89.anIntArray149 = new int[256];
		Static40.anIntArray60 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static40.anIntArray60[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static89.anIntArray149[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z")
	public static boolean method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static329.aByteArrayArrayArray17[1][arg0][arg1] & 0x2) != 0;
	}
}
