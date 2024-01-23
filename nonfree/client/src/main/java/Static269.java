import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!nk;")
	public static Class121 aClass121_56;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "S")
	public static short aShort19 = 1;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public static int anInt2494 = -1;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString142 = "Created gameworld";

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	public static int method2118() {
		return ((Static294.anInt5275 == 0 ? 0 : 1) << 22) + ((Static219.aBoolean281 ? 1 : 0) << 19) + ((Static187.aBoolean243 ? 1 : 0) << 15) + ((Static311.aBoolean384 ? 1 : 0) << 13) + ((Static123.aBoolean160 ? 1 : 0) << 10) + ((Static102.aBoolean113 ? 1 : 0) << 9) + ((Static310.aBoolean382 ? 1 : 0) << 6) + ((Static249.aBoolean306 ? 1 : 0) << 4) + ((Static29.aBoolean19 ? 1 : 0) << 3) + (Static184.anInt3503 & 0x7) + ((Static239.aBoolean299 ? 1 : 0) << 5) + ((Static152.aBoolean35 ? 1 : 0) << 7) + ((Static94.aBoolean232 ? 1 : 0) << 8) + ((Static192.anInt3641 & 0x3) << 11) + ((Static183.aBoolean241 ? 1 : 0) << 16) + (Static27.anInt478 << 17) + ((Static64.anInt1228 == 0 ? 0 : 1) << 20) + ((Static182.anInt3491 == 0 ? 0 : 1) << 21) + (Static158.method2715() << 23);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2119(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static174.method2942(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
