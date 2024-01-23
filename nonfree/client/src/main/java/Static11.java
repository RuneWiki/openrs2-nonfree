import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "Lclient!nk;")
	public static Class121 aClass121_7;

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
	public static int anInt163;

	@OriginalMember(owner = "client!ak", name = "V", descriptor = "Lclient!fg;")
	public static Class1_Sub2_Sub6 aClass1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!ak", name = "X", descriptor = "Lclient!nk;")
	public static Class121 aClass121_8;

	@OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
	public static int anInt171;

	@OriginalMember(owner = "client!ak", name = "Z", descriptor = "Lclient!nk;")
	public static Class121 aClass121_9;

	@OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
	public static int anInt170 = 100;

	@OriginalMember(owner = "client!ak", name = "U", descriptor = "Lclient!vh;")
	public static Class187 aClass187_7 = new Class187(32);

	@OriginalMember(owner = "client!ak", name = "W", descriptor = "[I")
	public static int[] anIntArray12 = new int[25];

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lclient!fk;")
	public static Class52 method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class52 local14 = local7.aClass52_1;
			local7.aClass52_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
	public static void method155() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static304.aBooleanArray23[local3] = true;
		}
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(B)V")
	public static void method160() {
		while (true) {
			if (Static13.aClass1_Sub14_Sub1_1.method1412(Static88.anInt1723) >= 11) {
				@Pc(16) int local16 = Static13.aClass1_Sub14_Sub1_1.method1411(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static17.aClass15_Sub5_Sub2Array1[local16] == null) {
						Static17.aClass15_Sub5_Sub2Array1[local16] = new Class15_Sub5_Sub2();
						local23 = true;
						if (Static252.aClass1_Sub14Array1[local16] != null) {
							Static17.aClass15_Sub5_Sub2Array1[local16].method4706(Static252.aClass1_Sub14Array1[local16]);
						}
					}
					Static275.anIntArray440[Static304.anInt5394++] = local16;
					@Pc(61) Class15_Sub5_Sub2 local61 = Static17.aClass15_Sub5_Sub2Array1[local16];
					local61.anInt5563 = Static313.anInt2966;
					@Pc(69) int local69 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
					if (local69 == 1) {
						Static263.anIntArray425[Static224.anInt4118++] = local16;
					}
					@Pc(85) int local85 = Static13.aClass1_Sub14_Sub1_1.method1411(5);
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(95) int local95 = Static13.aClass1_Sub14_Sub1_1.method1411(5);
					if (local95 > 15) {
						local95 -= 32;
					}
					@Pc(105) int local105 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
					@Pc(112) int local112 = Static190.anIntArray300[Static13.aClass1_Sub14_Sub1_1.method1411(3)];
					if (local23) {
						local61.anInt5593 = local61.anInt5554 = local112;
					}
					local61.method4704(Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] + local85, local95 + Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], local105 == 1);
					continue;
				}
			}
			Static13.aClass1_Sub14_Sub1_1.method1407();
			return;
		}
	}
}
