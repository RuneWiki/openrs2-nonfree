import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public static int anInt1332;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!e;")
	public static final Class58 aClass58_2 = new Class58(1);

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_48 = new Class214(20, 5);

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_44 = new Class151(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "[I")
	public static final int[] anIntArray60 = new int[100];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBILclient!du;)V")
	public static void method1131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub13 arg3) {
		@Pc(14) long local14 = (long) (arg1 << 14 | arg2 << 28 | arg0);
		@Pc(20) Class1_Sub19 local20 = (Class1_Sub19) Static194.aClass257_13.method5503(local14);
		if (local20 == null) {
			local20 = new Class1_Sub19();
			Static194.aClass257_13.method5504(local20, local14);
			local20.aClass254_15.method5430(arg3);
			return;
		}
		@Pc(43) Class74 local43 = Static227.aClass65_2.method1327(arg3.anInt1501);
		@Pc(46) int local46 = local43.anInt1880;
		if (local43.anInt1894 == 1) {
			local46 *= arg3.anInt1503 + 1;
		}
		for (@Pc(67) Class1_Sub13 local67 = (Class1_Sub13) local20.aClass254_15.method5437(); local67 != null; local67 = (Class1_Sub13) local20.aClass254_15.method5433()) {
			local43 = Static227.aClass65_2.method1327(local67.anInt1501);
			@Pc(80) int local80 = local43.anInt1880;
			if (local43.anInt1894 == 1) {
				local80 *= local67.anInt1503 + 1;
			}
			if (local46 > local80) {
				Static359.method4651(arg3, local67);
				return;
			}
		}
		local20.aClass254_15.method5430(arg3);
	}
}
