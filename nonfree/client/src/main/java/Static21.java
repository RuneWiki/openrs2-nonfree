import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public static int anInt756;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_366 = Static9.method266("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!wd;")
	public static Class1_Sub19_Sub1 aClass1_Sub19_Sub1_1 = new Class1_Sub19_Sub1(5000);

	@OriginalMember(owner = "client!d", name = "z", descriptor = "Lclient!id;")
	public static Class34 aClass34_367 = Static9.method266(":duelreq:");

	@OriginalMember(owner = "client!d", name = "B", descriptor = "[I")
	public static int[] anIntArray76 = new int[32];

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
	public static int anInt766 = 0;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_368 = Static9.method266("Standort");

	@OriginalMember(owner = "client!d", name = "db", descriptor = "I")
	public static int anInt769 = 0;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)Z")
	public static boolean method446() {
		@Pc(10) Class76 local10 = Static114.aClass76_1;
		synchronized (Static114.aClass76_1) {
			if (Static1.anInt266 == Static77.anInt2077) {
				return false;
			} else {
				Static116.anInt2808 = Static46.anIntArray142[Static1.anInt266];
				Static127.anInt2073 = Static115.anIntArray347[Static1.anInt266];
				Static1.anInt266 = Static1.anInt266 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method447() {
		aClass34_368 = null;
		anIntArray76 = null;
		aByteArrayArrayArray6 = null;
		aClass34_366 = null;
		aClass1_Sub1_Sub2_Sub1_1 = null;
		aClass34_367 = null;
		aClass1_Sub19_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!ie;)Z")
	public static boolean method448(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1) {
		@Pc(13) byte[] local13 = arg1.method1571(arg0);
		if (local13 == null) {
			return false;
		} else {
			Static11.method282(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B[Lclient!fd;I)V")
	public static void method449(@OriginalArg(1) Class1_Sub9[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) Class1_Sub9 local11 = arg0[local3];
			if (local11 != null && local11.anInt1062 == arg1 && (!local11.aBoolean57 || !Static41.method698(local11))) {
				if (local11.anInt1013 == 0) {
					if (!local11.aBoolean57 && Static41.method698(local11) && Static61.aClass1_Sub9_9 != local11) {
						continue;
					}
					method449(arg0, local11.anInt1050);
					if (local11.aClass1_Sub9Array2 != null) {
						method449(local11.aClass1_Sub9Array2, local11.anInt1050);
					}
					@Pc(62) Class1_Sub16 local62 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local11.anInt1050);
					if (local62 != null) {
						Static38.method674(local62.anInt1893);
					}
				}
				if (local11.anInt1013 == 6) {
					@Pc(90) int local90;
					if (local11.anInt1014 != -1 || local11.anInt1058 != -1) {
						@Pc(85) boolean local85 = Static34.method626(local11);
						if (local85) {
							local90 = local11.anInt1058;
						} else {
							local90 = local11.anInt1014;
						}
						if (local90 != -1) {
							@Pc(103) Class1_Sub1_Sub6 local103 = Static40.method687(local90);
							local11.anInt1052 += Static67.anInt1767;
							while (local11.anInt1052 > local103.anIntArray120[local11.anInt1082]) {
								local11.anInt1052 -= local103.anIntArray120[local11.anInt1082];
								local11.anInt1082++;
								if (local103.anIntArray123.length <= local11.anInt1082) {
									local11.anInt1082 -= local103.anInt1201;
									if (local11.anInt1082 < 0 || local103.anIntArray123.length <= local11.anInt1082) {
										local11.anInt1082 = 0;
									}
								}
								Static10.method277(local11);
							}
						}
					}
					if (local11.anInt1043 != 0 && !local11.aBoolean57) {
						@Pc(185) int local185 = local11.anInt1043 >> 16;
						local90 = local11.anInt1043 << 16 >> 16;
						@Pc(196) int local196 = local185 * Static67.anInt1767;
						local90 *= Static67.anInt1767;
						local11.anInt1022 = local11.anInt1022 + local196 & 0x7FF;
						local11.anInt1039 = local11.anInt1039 + local90 & 0x7FF;
						Static10.method277(local11);
					}
				}
			}
		}
	}
}
