import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_1;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!ec;")
	private static Class22 aClass22_37 = Static60.method1113("flash3:");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_32 = aClass22_37;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_33 = aClass22_37;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_34 = Static60.method1113("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_35 = Static60.method1113("<col=80ff00>");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!ec;")
	public static Class22 aClass22_36 = Static60.method1113("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!ec;")
	private static Class22 aClass22_38 = Static60.method1113("Please remove ");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public static int anInt85 = -1;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_39 = Static60.method1113("leuchten2:");

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!ec;")
	private static Class22 aClass22_45 = Static60.method1113("Choose Option");

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_40 = aClass22_45;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_41 = aClass22_38;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_42 = aClass22_34;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_43 = aClass22_38;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_44 = Static60.method1113("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
	public static int anInt87 = 1;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
	public static int[] anIntArray6 = new int[200];

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!ja;")
	public static Class33 aClass33_3 = new Class33(64);

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Lclient!ec;")
	private static Class22 aClass22_47 = Static60.method1113("white:");

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_46 = aClass22_47;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!ec;")
	public static Class22 aClass22_48 = aClass22_47;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method42() {
		aClass22_43 = null;
		aClass22_47 = null;
		aClass22_32 = null;
		aClass22_42 = null;
		aClass33_3 = null;
		aClass22_36 = null;
		aClass22_34 = null;
		aClass22_35 = null;
		aClass22_39 = null;
		aClass22_41 = null;
		aClass22_37 = null;
		aClass22_38 = null;
		aClass22_40 = null;
		anIntArray5 = null;
		anIntArray6 = null;
		aClass22_45 = null;
		aClass22_44 = null;
		aClass22_46 = null;
		aClass22_33 = null;
		aClass4_Sub7_1 = null;
		aClass22_48 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!da;B)V")
	public static void method43(@OriginalArg(0) Class4_Sub5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt526 == 0) {
			local5 = Static134.aClass77_1.method1957(arg0.anInt529, arg0.anInt531, arg0.anInt542);
		}
		@Pc(19) int local19 = 0;
		if (arg0.anInt526 == 1) {
			local5 = Static134.aClass77_1.method1935(arg0.anInt529, arg0.anInt531, arg0.anInt542);
		}
		if (arg0.anInt526 == 2) {
			local5 = Static134.aClass77_1.method1937(arg0.anInt529, arg0.anInt531, arg0.anInt542);
		}
		@Pc(57) int local57 = -1;
		if (arg0.anInt526 == 3) {
			local5 = Static134.aClass77_1.method1938(arg0.anInt529, arg0.anInt531, arg0.anInt542);
		}
		@Pc(72) int local72 = 0;
		if (local5 != 0) {
			local57 = local5 >> 14 & 0x7FFF;
			@Pc(90) int local90 = Static134.aClass77_1.method1925(arg0.anInt529, arg0.anInt531, arg0.anInt542, local5);
			local19 = local90 & 0x1F;
			local72 = local90 >> 6 & 0x3;
		}
		arg0.anInt534 = local19;
		arg0.anInt536 = local72;
		arg0.anInt532 = local57;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	public static int method44() {
		@Pc(3) int local3 = 3;
		if (Static39.anInt957 < 310) {
			@Pc(16) int local16 = Static87.anInt2318 >> 7;
			@Pc(20) int local20 = Static42.anInt885 >> 7;
			if ((Static3.aByteArrayArrayArray1[Static37.anInt895][local16][local20] & 0x4) != 0) {
				local3 = Static37.anInt895;
			}
			@Pc(37) int local37 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 >> 7;
			@Pc(42) int local42 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 >> 7;
			@Pc(54) int local54;
			if (local16 < local37) {
				local54 = local37 - local16;
			} else {
				local54 = local16 - local37;
			}
			@Pc(73) int local73;
			if (local20 < local42) {
				local73 = local42 - local20;
			} else {
				local73 = local20 - local42;
			}
			@Pc(93) int local93;
			@Pc(95) int local95;
			if (local54 > local73) {
				local93 = local73 * 65536 / local54;
				local95 = 32768;
				while (local16 != local37) {
					if (local37 > local16) {
						local16++;
					} else if (local37 < local16) {
						local16--;
					}
					if ((Static3.aByteArrayArrayArray1[Static37.anInt895][local16][local20] & 0x4) != 0) {
						local3 = Static37.anInt895;
					}
					local95 += local93;
					if (local95 >= 65536) {
						if (local42 > local20) {
							local20++;
						} else if (local42 < local20) {
							local20--;
						}
						if ((Static3.aByteArrayArrayArray1[Static37.anInt895][local16][local20] & 0x4) != 0) {
							local3 = Static37.anInt895;
						}
						local95 -= 65536;
					}
				}
			} else {
				local93 = local54 * 65536 / local73;
				local95 = 32768;
				while (local42 != local20) {
					if (local42 > local20) {
						local20++;
					} else if (local20 > local42) {
						local20--;
					}
					local95 += local93;
					if ((Static3.aByteArrayArrayArray1[Static37.anInt895][local16][local20] & 0x4) != 0) {
						local3 = Static37.anInt895;
					}
					if (local95 >= 65536) {
						if (local16 < local37) {
							local16++;
						} else if (local16 > local37) {
							local16--;
						}
						local95 -= 65536;
						if ((Static3.aByteArrayArrayArray1[Static37.anInt895][local16][local20] & 0x4) != 0) {
							local3 = Static37.anInt895;
						}
					}
				}
			}
		}
		if ((Static3.aByteArrayArrayArray1[Static37.anInt895][Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 >> 7][Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 >> 7] & 0x4) != 0) {
			local3 = Static37.anInt895;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lclient!hd;")
	public static Class4_Sub1_Sub5 method45(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub1_Sub5 local6 = (Class4_Sub1_Sub5) Static38.aClass33_14.method998((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static128.aClass20_60.method597(6, arg0);
		local6 = new Class4_Sub1_Sub5();
		local6.anInt1255 = arg0;
		if (local28 != null) {
			local6.method882(new Class4_Sub11(local28));
		}
		local6.method887();
		if (local6.aBoolean116) {
			local6.aBoolean119 = false;
			local6.anInt1268 = 0;
		}
		Static38.aClass33_14.method997((long) arg0, local6);
		return local6;
	}
}
