import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!sg;")
	private static Class77 aClass77_365 = Static146.method2172("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public static int anInt883 = 127;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_366 = Static146.method2172("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt885 = 0;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!sg;")
	public static Class77 aClass77_367 = Static146.method2172("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_368 = Static146.method2172("::fpsoff");

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static int anInt887 = 0;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_369 = aClass77_365;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public static int anInt888 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIILclient!oa;III)V")
	public static void method612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub18 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20;
		if (arg0 < 0 || arg0 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local20 = arg3.method2387();
				if (local20 == 0) {
					break;
				}
				if (local20 == 1) {
					arg3.method2387();
					break;
				}
				if (local20 <= 49) {
					arg3.method2387();
				}
			}
			return;
		}
		Static140.aByteArrayArrayArray6[arg1][arg0][arg2] = 0;
		while (true) {
			local20 = arg3.method2387();
			if (local20 == 0) {
				if (arg1 == 0) {
					Static122.anIntArrayArrayArray2[0][arg0][arg2] = -Static75.method1421(arg0 + arg6 + 932731, arg5 + 556238 + arg2) * 8;
				} else {
					Static122.anIntArrayArrayArray2[arg1][arg0][arg2] = Static122.anIntArrayArrayArray2[arg1 - 1][arg0][arg2] - 240;
				}
				break;
			}
			if (local20 == 1) {
				@Pc(116) int local116 = arg3.method2387();
				if (local116 == 1) {
					local116 = 0;
				}
				if (arg1 == 0) {
					Static122.anIntArrayArrayArray2[0][arg0][arg2] = -local116 * 8;
				} else {
					Static122.anIntArrayArrayArray2[arg1][arg0][arg2] = Static122.anIntArrayArrayArray2[arg1 - 1][arg0][arg2] - local116 * 8;
				}
				break;
			}
			if (local20 <= 49) {
				Static129.aByteArrayArrayArray5[arg1][arg0][arg2] = arg3.method2392();
				Static27.aByteArrayArrayArray2[arg1][arg0][arg2] = (byte) ((local20 - 2) / 4);
				Static101.aByteArrayArrayArray4[arg1][arg0][arg2] = (byte) (arg4 + local20 - 2 & 0x3);
			} else if (local20 <= 81) {
				Static140.aByteArrayArrayArray6[arg1][arg0][arg2] = (byte) (local20 - 49);
			} else {
				Static147.aByteArrayArrayArray7[arg1][arg0][arg2] = (byte) (local20 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ke;BZLclient!ke;Lclient!hg;)V")
	public static void method613(@OriginalArg(0) Class43 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) Class2_Sub2_Sub3_Sub4_Sub1 arg3) {
		Static166.aClass43_42 = arg0;
		Static46.aClass43_12 = arg2;
		Static20.aBoolean31 = arg1;
		Static105.anInt2572 = Static166.aClass43_42.method2223(10);
		Static114.aClass2_Sub2_Sub3_Sub4_Sub1_6 = arg3;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method614() {
		aClass77_369 = null;
		aClass77_367 = null;
		aClass77_368 = null;
		aClass77_365 = null;
		aBooleanArray4 = null;
		aClass77_366 = null;
	}
}
