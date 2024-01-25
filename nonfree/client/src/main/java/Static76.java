import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "Lclient!cm;")
	public static final Class41 aClass41_9 = new Class41(8);

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
	public static int anInt1437 = -1;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "[I")
	public static final int[] anIntArray122 = new int[100];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZBI)Lclient!td;")
	public static Class2_Sub40 method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub40 local7 = new Class2_Sub40();
		local7.anInt6092 = arg1;
		local7.anInt6090 = arg3;
		Static303.aClass41_32.method901(local7, (long) arg0);
		Static364.method5821(arg1);
		@Pc(33) Class68 local33 = Static8.method144(arg0);
		if (local33 != null) {
			Static114.method2241(local33);
		}
		if (Static91.aClass68_12 != null) {
			Static114.method2241(Static91.aClass68_12);
			Static91.aClass68_12 = null;
		}
		Static12.method180();
		if (local33 != null) {
			Static266.method4679(local33, !arg2);
		}
		if (!arg2) {
			Static367.method5888(arg1);
		}
		if (!arg2 && Static269.anInt6658 != -1) {
			Static271.method4703(1, Static269.anInt6658);
		}
		return local7;
	}
}
