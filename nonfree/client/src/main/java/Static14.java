import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!wm;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_6 = new Class154(4);

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "[B")
	public static final byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public static int anInt314 = 0;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "S")
	public static short aShort8 = 32767;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString9 = "flash1:";

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method311(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static181.anInt3977 = arg2;
		Static235.anInt6708 = arg0;
		Static239.anInt6165 = arg5;
		Static264.anInt3386 = arg4;
		Static335.anInt6656 = arg3;
		Static109.anInt2409 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public static void method313() {
		Static258.method4401();
		Static330.method5401();
		Static216.method5344();
		Static247.method4268();
		Static279.method4788();
		Static129.method2604();
		Static174.method3269();
		Static173.method3267();
		Static87.method1555();
		Static194.method3528();
		Static83.method1462();
		Static312.method2397();
		Static1.method2();
		Static18.method362();
		Static130.method2618();
		Static128.method2578();
		Static113.method5417();
		Static93.method1643();
		Static108.method2014();
		Static170.method3198();
		Static144.method2831();
		Static121.method2451();
		Static328.method5394();
		Static296.aClass154_90.method4220(5);
		aClass154_6.method4220(5);
		Static46.aClass154_14.method4220(5);
		Static83.aClass154_27.method4220(5);
		Static97.aClass154_34.method4220(5);
	}
}
