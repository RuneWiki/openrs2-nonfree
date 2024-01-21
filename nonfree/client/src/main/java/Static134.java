import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!qh", name = "lb", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1178 = Static146.method2172(" has logged in)3");

	@OriginalMember(owner = "client!qh", name = "cb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1179 = Static146.method2172("OFF");

	@OriginalMember(owner = "client!qh", name = "eb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1180 = Static146.method2172("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1181 = Static146.method2172("au");

	@OriginalMember(owner = "client!qh", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1182 = Static146.method2172("(U1");

	@OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1183 = Static146.method2172(":assist:");

	@OriginalMember(owner = "client!qh", name = "kb", descriptor = "I")
	public static final int anInt3283 = 20;

	@OriginalMember(owner = "client!qh", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1184 = aClass77_1179;

	@OriginalMember(owner = "client!qh", name = "nb", descriptor = "I")
	public static int anInt3284 = 0;

	@OriginalMember(owner = "client!qh", name = "ob", descriptor = "I")
	public static int anInt3285 = 0;

	@OriginalMember(owner = "client!qh", name = "pb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1185 = aClass77_1178;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
	public static void method2280() {
		aClass77_1185 = null;
		aClass77_1184 = null;
		aClass77_1181 = null;
		aClass77_1182 = null;
		anIntArray480 = null;
		aClass77_1178 = null;
		aClass77_1179 = null;
		aClass77_1180 = null;
		aClass77_1183 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public static void method2281() {
		try {
			if (Static176.anInt4481 == 1) {
				@Pc(14) int local14 = Static136.aClass2_Sub9_Sub3_1.method2466();
				if (local14 > 0 && Static136.aClass2_Sub9_Sub3_1.method2490()) {
					local14 -= Static100.anInt811;
					if (local14 < 0) {
						local14 = 0;
					}
					Static136.aClass2_Sub9_Sub3_1.method2463(local14);
				} else {
					Static136.aClass2_Sub9_Sub3_1.method2474();
					Static136.aClass2_Sub9_Sub3_1.method2465();
					Static13.aClass2_Sub4_1 = null;
					Static139.aClass33_1 = null;
					if (Static3.aClass43_1 == null) {
						Static176.anInt4481 = 0;
					} else {
						Static176.anInt4481 = 2;
					}
				}
			}
		} catch (@Pc(52) Exception local52) {
			local52.printStackTrace();
			Static136.aClass2_Sub9_Sub3_1.method2474();
			Static3.aClass43_1 = null;
			Static13.aClass2_Sub4_1 = null;
			Static176.anInt4481 = 0;
			Static139.aClass33_1 = null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	public static void method2282(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub13 local10 = (Class2_Sub13) Static3.aClass74_1.method2433((long) arg0);
		if (local10 != null) {
			local10.method3004();
		}
	}
}
