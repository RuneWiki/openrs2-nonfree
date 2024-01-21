import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_535 = Static120.method1824("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Lclient!lc;")
	public static final Class54 aClass54_6 = new Class54(4096);

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_536 = Static120.method1824("Fertigkeit)2");

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)I")
	public static int method915() {
		@Pc(3) int local3 = 3;
		if (Static165.anInt3680 < 310) {
			@Pc(16) int local16 = Static56.anInt1216 >> 7;
			@Pc(20) int local20 = Static86.anInt1786 >> 7;
			@Pc(25) int local25 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 >> 7;
			if ((Static18.aByteArrayArrayArray1[Static153.anInt673][local16][local20] & 0x4) != 0) {
				local3 = Static153.anInt673;
			}
			@Pc(45) int local45;
			if (local16 >= local25) {
				local45 = local16 - local25;
			} else {
				local45 = local25 - local16;
			}
			@Pc(56) int local56 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 >> 7;
			@Pc(64) int local64;
			if (local56 <= local20) {
				local64 = local20 - local56;
			} else {
				local64 = local56 - local20;
			}
			@Pc(80) int local80;
			@Pc(82) int local82;
			if (local45 <= local64) {
				local80 = local45 * 65536 / local64;
				local82 = 32768;
				while (local56 != local20) {
					if (local56 > local20) {
						local20++;
					} else if (local56 < local20) {
						local20--;
					}
					if ((Static18.aByteArrayArrayArray1[Static153.anInt673][local16][local20] & 0x4) != 0) {
						local3 = Static153.anInt673;
					}
					local82 += local80;
					if (local82 >= 65536) {
						local82 -= 65536;
						if (local16 < local25) {
							local16++;
						} else if (local25 < local16) {
							local16--;
						}
						if ((Static18.aByteArrayArrayArray1[Static153.anInt673][local16][local20] & 0x4) != 0) {
							local3 = Static153.anInt673;
						}
					}
				}
			} else {
				local80 = local64 * 65536 / local45;
				local82 = 32768;
				while (local25 != local16) {
					local82 += local80;
					if (local16 < local25) {
						local16++;
					} else if (local16 > local25) {
						local16--;
					}
					if ((Static18.aByteArrayArrayArray1[Static153.anInt673][local16][local20] & 0x4) != 0) {
						local3 = Static153.anInt673;
					}
					if (local82 >= 65536) {
						local82 -= 65536;
						if (local20 < local56) {
							local20++;
						} else if (local20 > local56) {
							local20--;
						}
						if ((Static18.aByteArrayArrayArray1[Static153.anInt673][local16][local20] & 0x4) != 0) {
							local3 = Static153.anInt673;
						}
					}
				}
			}
		}
		if ((Static18.aByteArrayArrayArray1[Static153.anInt673][Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 >> 7][Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 >> 7] & 0x4) != 0) {
			local3 = Static153.anInt673;
		}
		return local3;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)V")
	public static void method916(@OriginalArg(1) int arg0) {
		Static60.anInt1332 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[BI)I")
	public static int method918(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static139.method2162(0, arg1, arg0);
	}
}
