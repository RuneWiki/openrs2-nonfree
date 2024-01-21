import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
	public static int anInt61;

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "Lclient!da;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "[Lclient!mb;")
	public static Class10_Sub1[] aClass10_Sub1Array1 = new Class10_Sub1[256];

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "[Lclient!dh;")
	public static Class2_Sub3_Sub5_Sub1_Sub1[] aClass2_Sub3_Sub5_Sub1_Sub1Array1 = new Class2_Sub3_Sub5_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_21 = Static38.method685("Members object");

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Lclient!ai;")
	public static Class6 aClass6_20 = aClass6_21;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
	public static void method44() {
		aClass6_20 = null;
		aClass6_21 = null;
		aClass10_Sub1Array1 = null;
		aClass2_Sub3_Sub5_Sub1_Sub1Array1 = null;
		anInterface1_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
	public static int method45() {
		@Pc(7) int local7 = 3;
		if (Static107.anInt2560 < 310) {
			@Pc(16) int local16 = Static106.anInt4184 >> 7;
			@Pc(20) int local20 = Static28.anInt722 >> 7;
			if ((Static164.aByteArrayArrayArray7[Static36.anInt1020][local16][local20] & 0x4) != 0) {
				local7 = Static36.anInt1020;
			}
			@Pc(37) int local37 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 >> 7;
			@Pc(42) int local42 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7;
			@Pc(50) int local50;
			if (local37 > local20) {
				local50 = local37 - local20;
			} else {
				local50 = local20 - local37;
			}
			@Pc(69) int local69;
			if (local42 <= local16) {
				local69 = local16 - local42;
			} else {
				local69 = local42 - local16;
			}
			@Pc(88) int local88;
			@Pc(90) int local90;
			if (local69 > local50) {
				local88 = local50 * 65536 / local69;
				local90 = 32768;
				while (local42 != local16) {
					local90 += local88;
					if (local16 < local42) {
						local16++;
					} else if (local42 < local16) {
						local16--;
					}
					if ((Static164.aByteArrayArrayArray7[Static36.anInt1020][local16][local20] & 0x4) != 0) {
						local7 = Static36.anInt1020;
					}
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local37 > local20) {
							local20++;
						} else if (local20 > local37) {
							local20--;
						}
						if ((Static164.aByteArrayArrayArray7[Static36.anInt1020][local16][local20] & 0x4) != 0) {
							local7 = Static36.anInt1020;
						}
					}
				}
			} else {
				local90 = 32768;
				local88 = local69 * 65536 / local50;
				while (local37 != local20) {
					if (local20 < local37) {
						local20++;
					} else if (local37 < local20) {
						local20--;
					}
					if ((Static164.aByteArrayArrayArray7[Static36.anInt1020][local16][local20] & 0x4) != 0) {
						local7 = Static36.anInt1020;
					}
					local90 += local88;
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local42 > local16) {
							local16++;
						} else if (local16 > local42) {
							local16--;
						}
						if ((Static164.aByteArrayArrayArray7[Static36.anInt1020][local16][local20] & 0x4) != 0) {
							local7 = Static36.anInt1020;
						}
					}
				}
			}
		}
		if ((Static164.aByteArrayArrayArray7[Static36.anInt1020][Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7][Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 >> 7] & 0x4) != 0) {
			local7 = Static36.anInt1020;
		}
		return local7;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ai;Lclient!ai;Lclient!c;)[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] method46(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(6) int local6 = arg2.method1602(arg1);
		@Pc(12) int local12 = arg2.method1600(local6, arg0);
		return Static104.method1721(arg2, local12, local6);
	}
}
