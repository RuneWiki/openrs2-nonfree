import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!nb;")
	public static Class24 aClass24_10;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!vc;")
	private static Class71 aClass71_452 = Static38.method736("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_453 = Static38.method736(" )2> @whi@");

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_454 = Static38.method736("Benutzername: ");

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public static int anInt776 = 0;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_455 = aClass71_452;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_458 = Static38.method736("Sorry invited players only)3");

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_456 = aClass71_458;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_457 = Static38.method736("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_459 = Static38.method736("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method577() {
		aClass71_453 = null;
		aClass24_10 = null;
		aClass71_459 = null;
		aClass71_457 = null;
		aClass71_458 = null;
		aClass71_454 = null;
		aClass71_452 = null;
		aClass71_455 = null;
		aClass71_456 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method578() {
		Static57.anInt1493 = 0;
		Static47.anInt1293 = 0;
		Static86.method1980();
		Static30.method583();
		Static65.method1129();
		Static48.method928();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static47.anInt1293; local19++) {
			local25 = Static27.anIntArray95[local19];
			if (Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local25].anInt2469 != Static95.anInt2285) {
				Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local25] = null;
			}
		}
		if (Static57.anInt1482 != Static86.aClass5_Sub11_Sub1_12.anInt2233) {
			throw new RuntimeException("gpp1 pos:" + Static86.aClass5_Sub11_Sub1_12.anInt2233 + " psize:" + Static57.anInt1482);
		}
		for (local25 = 0; local25 < Static37.anInt594; local25++) {
			if (Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static37.anInt594);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	public static int method579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub7 local10 = (Class5_Sub7) Static71.aClass57_10.method1575((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray211.length) {
			return local10.anIntArray211[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method580(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static127.method1745(arg0, 0, local14, 0, local6);
		return local14;
	}
}
