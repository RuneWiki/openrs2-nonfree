import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!gb", name = "vc", descriptor = "J")
	public static long aLong48;

	@OriginalMember(owner = "client!gb", name = "xc", descriptor = "Lclient!cd;")
	public static Class10 aClass10_597 = Static51.method932("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!gb", name = "Ac", descriptor = "I")
	public static int anInt1338 = 2;

	@OriginalMember(owner = "client!gb", name = "Bc", descriptor = "I")
	public static int anInt1339 = 0;

	@OriginalMember(owner = "client!gb", name = "Jc", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!gb", name = "Rc", descriptor = "I")
	public static int anInt1352 = 0;

	@OriginalMember(owner = "client!gb", name = "Tc", descriptor = "I")
	public static int anInt1354 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIZ)I")
	public static int method981() {
		return Static77.anInt1801 + Static130.anInt2900;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[B)Lclient!cd;")
	public static Class10 method982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class10 local9 = new Class10();
		local9.aByteArray7 = new byte[arg0];
		local9.anInt513 = 0;
		for (@Pc(23) int local23 = arg1; local23 < arg1 + arg0; local23++) {
			if (arg2[local23] != 0) {
				local9.aByteArray7[local9.anInt513++] = arg2[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
	public static boolean method983(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
	public static void method984() {
		aClass10_597 = null;
	}
}
