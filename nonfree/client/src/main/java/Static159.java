import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "[S")
	public static final short[] aShortArray46 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!st;ILclient!ya;)I")
	public static int method2575(@OriginalArg(0) Class226 arg0, @OriginalArg(2) Class39 arg1) {
		if (arg0.anInt6134 != -1) {
			return arg0.anInt6134;
		}
		if (arg0.anInt6119 != -1) {
			@Pc(33) Class183 local33 = arg1.anInterface4_12.method2450(arg1.method4551() ? arg0.anInt6119 : arg0.anInt6126);
			if (!local33.aBoolean332) {
				return local33.aShort75;
			}
		}
		return arg0.anInt6125;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
	public static boolean method2576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
