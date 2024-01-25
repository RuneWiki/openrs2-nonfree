import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!si", name = "O", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "I")
	private static int anInt1272;

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
	private static int anInt1273;

	@OriginalMember(owner = "client!si", name = "R", descriptor = "I")
	private static int anInt1274;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public static int anInt1245 = 1;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "[I")
	public static final int[] anIntArray200 = new int[14];

	@OriginalMember(owner = "client!si", name = "z", descriptor = "[S")
	public static final short[] aShortArray25 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public static void method1007() {
		@Pc(5) Class207 local5 = null;
		try {
			@Pc(9) Class99 local9 = Static116.aClass21_4.method372();
			while (local9.anInt2836 == 0) {
				Static129.method2634(1L);
			}
			if (local9.anInt2836 == 1) {
				local5 = (Class207) local9.anObject2;
				@Pc(33) Class7_Sub3 local33 = new Class7_Sub3(Static20.anInt407 * 6 + 3);
				local33.method2735(1);
				local33.method2788(Static20.anInt407);
				for (@Pc(43) int local43 = 0; local43 < Static165.anIntArray464.length; local43++) {
					if (Static120.aBooleanArray17[local43]) {
						local33.method2788(local43);
						local33.method2765(Static165.anIntArray464[local43]);
					}
				}
				local5.method5337(local33.aByteArray33, 0, local33.anInt3005);
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local5 != null) {
				local5.method5336();
			}
		} catch (@Pc(89) Exception local89) {
		}
		Static153.aLong112 = Static335.method5308();
		Static261.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lclient!th;")
	public static Class7_Sub1_Sub16 method1010(@OriginalArg(0) int arg0) {
		@Pc(10) Class7_Sub1_Sub16 local10 = (Class7_Sub1_Sub16) Static203.aClass154_6.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static343.aClass180_96.method4560(Static82.method1756(arg0), Static51.method1101(arg0));
		local10 = new Class7_Sub1_Sub16();
		if (local24 != null) {
			local10.method4899(new Class7_Sub3(local24));
		}
		Static203.aClass154_6.method4078(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZ)Lclient!sb;")
	public static Class22_Sub2_Sub1 method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class49 local11 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class22_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class47 local27 = local11.aClass47_3; local27 != null; local27 = local27.aClass47_2) {
			@Pc(31) Class22_Sub2 local31 = local27.aClass22_Sub2_1;
			if (local31 instanceof Class22_Sub2_Sub1) {
				@Pc(37) Class22_Sub2_Sub1 local37 = (Class22_Sub2_Sub1) local31;
				@Pc(47) int local47 = (local37.method4421() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt5973 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt5967 - local47 >> 7;
				@Pc(71) int local71 = local37.anInt5973 + local47 >> 7;
				@Pc(78) int local78 = local47 + local37.anInt5967 >> 7;
				if (arg1 >= local55 && arg2 >= local63 && arg1 <= local71 && arg2 <= local78) {
					@Pc(111) int local111 = (local78 + 1 - arg2) * (-arg1 + local71 + 1);
					if (local19 < local111) {
						local17 = local37;
						local19 = local111;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!rk;ILclient!rk;Lclient!rk;)V")
	public static void method1022(@OriginalArg(0) Class180 arg0, @OriginalArg(2) Class180 arg1, @OriginalArg(3) Class180 arg2) {
		Static196.aClass180_52 = arg1;
		Static277.method4669(arg2, arg0);
	}

	@OriginalMember(owner = "client!si", name = "providesignlink", descriptor = "(Lclient!bd;)V")
	private static void method1023(@OriginalArg(0) Class21 arg0) {
		Static116.aClass21_4 = arg0;
		Static21.aClass21_1 = arg0;
	}
}
