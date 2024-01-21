import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public static int anInt3049;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array18;

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "Lclient!kh;")
	public static Class29 aClass29_59;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1327 = Static51.method932("flash2:");

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1328 = aClass10_1327;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1329 = Static51.method932(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1330 = aClass10_1327;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1331 = Static51.method932("T");

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "J")
	public static long aLong105 = 0L;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1332 = Static51.method932("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method2174(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static16.method268(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(44) int local44 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(47) int local47;
			do {
				local47 = arg0.nextInt();
			} while (local44 <= local47);
			return Static7.method139(local47, arg1);
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	public static void method2176() {
		aClass10_1328 = null;
		aClass10_1331 = null;
		aClass2_Sub1_Sub4_Sub3Array18 = null;
		aClass10_1330 = null;
		aClass10_1329 = null;
		aClass29_59 = null;
		aClass10_1327 = null;
		aClass10_1332 = null;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] method2177() {
		@Pc(8) Class2_Sub1_Sub4_Sub2[] local8 = new Class2_Sub1_Sub4_Sub2[Static73.anInt1747];
		for (@Pc(10) int local10 = 0; local10 < Static73.anInt1747; local10++) {
			@Pc(16) Class2_Sub1_Sub4_Sub2 local16 = new Class2_Sub1_Sub4_Sub2();
			local16.anInt889 = Static171.anInt3704;
			local16.anInt891 = Static148.anInt3209;
			local16.anInt890 = Static96.anIntArray401[local10];
			local16.anInt888 = Static14.anIntArray26[local10];
			local16.anInt893 = Static68.anIntArray178[local10];
			local16.anInt892 = Static98.anIntArray240[local10];
			@Pc(46) byte[] local46 = Static115.aByteArrayArray9[local10];
			@Pc(52) int local52 = local16.anInt893 * local16.anInt892;
			local16.anIntArray71 = new int[local52];
			for (@Pc(58) int local58 = 0; local58 < local52; local58++) {
				local16.anIntArray71[local58] = Static118.anIntArray284[local46[local58] & 0xFF];
			}
			local8[local10] = local16;
		}
		Static155.method2394();
		return local8;
	}
}
