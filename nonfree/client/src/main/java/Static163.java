import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
	public static int anInt3133;

	@OriginalMember(owner = "client!ud", name = "wc", descriptor = "Lclient!f;")
	public static Class13 aClass13_26;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1743 = Static122.method531("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1744 = aClass73_1743;

	@OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1745 = Static122.method531("<)4col> x");

	@OriginalMember(owner = "client!ud", name = "tc", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1749 = Static122.method531("Please enter your password)3");

	@OriginalMember(owner = "client!ud", name = "tb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1746 = aClass73_1749;

	@OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
	public static int anInt3146 = 2;

	@OriginalMember(owner = "client!ud", name = "Jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1748 = Static122.method531("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ud", name = "Ob", descriptor = "[I")
	public static int[] anIntArray325 = new int[100];

	@OriginalMember(owner = "client!ud", name = "Rb", descriptor = "I")
	public static int anInt3163 = 0;

	@OriginalMember(owner = "client!ud", name = "Wb", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array21 = new Class73[1000];

	@OriginalMember(owner = "client!ud", name = "rc", descriptor = "I")
	public static int anInt3185 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ff;)Lclient!gd;")
	public static Class3_Sub2 method2264(@OriginalArg(1) Class3_Sub12 arg0) {
		@Pc(9) int local9 = arg0.method1354();
		@Pc(13) int local13 = arg0.method1354();
		@Pc(17) Class local17 = Static169.method2647(local13);
		try {
			@Pc(21) Class3_Sub2 local21 = (Class3_Sub2) local17.getDeclaredConstructor().newInstance();
			if (local21 != null) {
				local21.anInt3960 = local9;
				local21.anInt3955 = arg0.method1354();
				@Pc(40) int local40 = arg0.method1354();
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(48) int local48 = arg0.method1354();
					local21.method2789(arg0, local48);
				}
			}
			local21.method2786();
			return local21;
		} catch (@Pc(63) IllegalAccessException local63) {
			throw new RuntimeException();
		} catch (@Pc(68) InstantiationException local68) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)I")
	public static int method2266() {
		@Pc(7) int local7 = 3;
		if (Static130.anInt2973 < 310) {
			@Pc(14) int local14 = Static34.anInt834 >> 7;
			@Pc(18) int local18 = Static19.anInt513 >> 7;
			if ((Static110.aByteArrayArrayArray5[Static147.anInt3309][local14][local18] & 0x4) != 0) {
				local7 = Static147.anInt3309;
			}
			@Pc(38) int local38 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 >> 7;
			@Pc(43) int local43 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 >> 7;
			@Pc(50) int local50;
			if (local38 <= local18) {
				local50 = local18 - local38;
			} else {
				local50 = local38 - local18;
			}
			@Pc(65) int local65;
			if (local43 <= local14) {
				local65 = local14 - local43;
			} else {
				local65 = local43 - local14;
			}
			@Pc(85) int local85;
			@Pc(87) int local87;
			if (local65 > local50) {
				local85 = local50 * 65536 / local65;
				local87 = 32768;
				while (local43 != local14) {
					local87 += local85;
					if (local43 > local14) {
						local14++;
					} else if (local14 > local43) {
						local14--;
					}
					if ((Static110.aByteArrayArrayArray5[Static147.anInt3309][local14][local18] & 0x4) != 0) {
						local7 = Static147.anInt3309;
					}
					if (local87 >= 65536) {
						local87 -= 65536;
						if (local38 > local18) {
							local18++;
						} else if (local38 < local18) {
							local18--;
						}
						if ((Static110.aByteArrayArrayArray5[Static147.anInt3309][local14][local18] & 0x4) != 0) {
							local7 = Static147.anInt3309;
						}
					}
				}
			} else {
				local85 = local65 * 65536 / local50;
				local87 = 32768;
				while (local18 != local38) {
					if (local38 > local18) {
						local18++;
					} else if (local38 < local18) {
						local18--;
					}
					if ((Static110.aByteArrayArrayArray5[Static147.anInt3309][local14][local18] & 0x4) != 0) {
						local7 = Static147.anInt3309;
					}
					local87 += local85;
					if (local87 >= 65536) {
						if (local43 > local14) {
							local14++;
						} else if (local14 > local43) {
							local14--;
						}
						if ((Static110.aByteArrayArrayArray5[Static147.anInt3309][local14][local18] & 0x4) != 0) {
							local7 = Static147.anInt3309;
						}
						local87 -= 65536;
					}
				}
			}
		}
		if ((Static110.aByteArrayArrayArray5[Static147.anInt3309][Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 >> 7][Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 >> 7] & 0x4) != 0) {
			local7 = Static147.anInt3309;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!f;B)V")
	public static void method2268(@OriginalArg(0) Class13 arg0) {
		Static48.aClass13_9 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(I)V")
	public static void method2270() {
		aClass73_1748 = null;
		aClass73_1744 = null;
		anIntArray325 = null;
		aClass73_1746 = null;
		aClass13_26 = null;
		aClass73_1743 = null;
		aClass73_1745 = null;
		aClass73_1749 = null;
		aClass73Array21 = null;
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "(I)V")
	public static void method2271() {
		Static13.aClass7_5.method190();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!vd;)Lclient!vd;")
	public static Class83 method2273(@OriginalArg(1) Class83 arg0) {
		@Pc(12) Class83 local12 = Static166.method2618(arg0);
		if (local12 == null) {
			local12 = arg0.aClass83_15;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z")
	public static boolean method2275(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
