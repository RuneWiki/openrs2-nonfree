import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	public static int anInt3876;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "Lclient!ve;")
	public static Class69 aClass69_34;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 aClass1_Sub2_Sub8_Sub3_5;

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "[S")
	public static final short[] aShortArray50 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "Lclient!fj;")
	public static final Class1_Sub7 aClass1_Sub7_5 = new Class1_Sub7(8);

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1120 = Static81.method1507("No reply from loginserver)3");

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1119 = aClass24_1120;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
	public static int anInt3879 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
	public static boolean method2997() {
		try {
			return Static67.method1332();
		} catch (@Pc(14) IOException local14) {
			Static147.method2537();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static39.anInt1027 + "," + Static8.anInt202 + "," + Static178.anInt3968 + " - " + Static80.anInt1916 + "," + (Static196.anInt4343 + Static87.aClass5_Sub2_Sub1_1.anIntArray199[0]) + "," + (Static87.aClass5_Sub2_Sub1_1.anIntArray196[0] + Static127.anInt2789) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static80.anInt1916 && local61 < 50; local61++) {
				local59 = local59 + Static192.aClass1_Sub7_Sub1_31.aByteArray38[local61] + ",";
			}
			Static151.method2591(local59, local19);
			Static34.method663();
			return true;
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
	public static int method2998() {
		@Pc(12) int local12 = 3;
		if (Static175.anInt3914 < 310) {
			@Pc(22) int local22 = Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7;
			@Pc(26) int local26 = Static92.anInt2140 >> 7;
			@Pc(30) int local30 = Static146.anInt3111 >> 7;
			if ((Static43.aByteArrayArrayArray3[Static170.anInt3799][local30][local26] & 0x4) != 0) {
				local12 = Static170.anInt3799;
			}
			@Pc(50) int local50 = Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7;
			@Pc(62) int local62;
			if (local26 >= local50) {
				local62 = local26 - local50;
			} else {
				local62 = local50 - local26;
			}
			@Pc(76) int local76;
			if (local22 > local30) {
				local76 = local22 - local30;
			} else {
				local76 = local30 - local22;
			}
			@Pc(94) int local94;
			@Pc(88) int local88;
			if (local76 > local62) {
				local88 = 32768;
				local94 = local62 * 65536 / local76;
				while (local30 != local22) {
					if (local30 < local22) {
						local30++;
					} else if (local22 < local30) {
						local30--;
					}
					if ((Static43.aByteArrayArrayArray3[Static170.anInt3799][local30][local26] & 0x4) != 0) {
						local12 = Static170.anInt3799;
					}
					local88 += local94;
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local26 < local50) {
							local26++;
						} else if (local50 < local26) {
							local26--;
						}
						if ((Static43.aByteArrayArrayArray3[Static170.anInt3799][local30][local26] & 0x4) != 0) {
							local12 = Static170.anInt3799;
						}
					}
				}
			} else {
				local88 = 32768;
				local94 = local76 * 65536 / local62;
				while (local26 != local50) {
					local88 += local94;
					if (local50 > local26) {
						local26++;
					} else if (local26 > local50) {
						local26--;
					}
					if ((Static43.aByteArrayArrayArray3[Static170.anInt3799][local30][local26] & 0x4) != 0) {
						local12 = Static170.anInt3799;
					}
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local22 > local30) {
							local30++;
						} else if (local30 > local22) {
							local30--;
						}
						if ((Static43.aByteArrayArrayArray3[Static170.anInt3799][local30][local26] & 0x4) != 0) {
							local12 = Static170.anInt3799;
						}
					}
				}
			}
		}
		if ((Static43.aByteArrayArrayArray3[Static170.anInt3799][Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7][Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7] & 0x4) != 0) {
			local12 = Static170.anInt3799;
		}
		return local12;
	}
}
