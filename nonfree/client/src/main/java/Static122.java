import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_218 = Static146.method2172("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_224 = Static146.method2172("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_219 = aClass77_224;

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_220 = Static146.method2172("Enter your username (V password)3");

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_221 = Static146.method2172("(Y");

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_222 = Static146.method2172("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][105][105];

	@OriginalMember(owner = "client!pd", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_223 = aClass77_220;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
	public static void method321() {
		aClass77_223 = null;
		aClass77_219 = null;
		aClass77_218 = null;
		aClass77_221 = null;
		aClass77_224 = null;
		anIntArrayArrayArray2 = null;
		aClass77_220 = null;
		aClass77_222 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!oa;BI)Lclient!sg;")
	public static Class77 method322(@OriginalArg(0) Class2_Sub18 arg0) {
		try {
			@Pc(12) Class77 local12 = new Class77();
			local12.anInt3606 = arg0.method2380();
			if (local12.anInt3606 > 32767) {
				local12.anInt3606 = 32767;
			}
			local12.aByteArray46 = new byte[local12.anInt3606];
			arg0.anInt3423 += Static62.aClass34_1.method1154(local12.aByteArray46, arg0.aByteArray39, 0, local12.anInt3606, arg0.anInt3423);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static80.aClass77_828;
		}
	}
}
