import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!ua;")
	public static Class2_Sub44 aClass2_Sub44_3;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt7911;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt7912;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "J")
	public static long aLong188;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
	public static final boolean aBoolean582 = false;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_61 = new Class249();

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_79 = new Class243(71, 4);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
	public static boolean method6615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIILclient!dda;IZI)V")
	public static void method6616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(4) int arg3) {
		Static517.anInt9002 = 1;
		Static117.anInt2343 = arg1;
		Static336.aBoolean469 = false;
		Static289.aClass53_83 = arg2;
		Static215.anInt8111 = arg0;
		Static96.anInt1868 = 0;
		Static473.anInt8462 = Static519.aClass2_Sub12_Sub1_3.method1019() / arg3;
		if (Static473.anInt8462 < 1) {
			Static473.anInt8462 = 1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZB)C")
	public static char method6618(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static289.aCharArray7[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}
}
