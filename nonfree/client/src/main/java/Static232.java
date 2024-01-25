import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!a;")
	public static final Class1_Sub1_Sub1 aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1(5000);

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_72 = new Class237(78, 3);

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_57 = new Class84("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "S")
	public static short aShort43 = 1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method3435(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static87.anInt1697 >= 100) {
			Static443.method5893(Static290.aClass84_68.method1678(Static167.anInt3118));
			return;
		}
		@Pc(24) String local24 = Static22.method3265(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static87.anInt1697; local29++) {
			@Pc(37) String local37 = Static22.method3265(Static32.aStringArray5[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static443.method5893(arg1 + Static439.aClass84_100.method1678(Static167.anInt3118));
				return;
			}
			if (Static113.aStringArray47[local29] != null) {
				local67 = Static22.method3265(Static113.aStringArray47[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static443.method5893(arg1 + Static439.aClass84_100.method1678(Static167.anInt3118));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static193.anInt1026; local97++) {
			local67 = Static22.method3265(Static397.aStringArray53[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static443.method5893(Static331.aClass84_75.method1678(Static167.anInt3118) + arg1 + Static208.aClass84_52.method1678(Static167.anInt3118));
				return;
			}
			if (Static282.aStringArray41[local97] != null) {
				@Pc(140) String local140 = Static22.method3265(Static282.aStringArray41[local97]);
				if (local140 != null && local140.equals(local24)) {
					Static443.method5893(Static331.aClass84_75.method1678(Static167.anInt3118) + arg1 + Static208.aClass84_52.method1678(Static167.anInt3118));
					return;
				}
			}
		}
		if (Static22.method3265(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51).equals(local24)) {
			Static443.method5893(Static260.aClass84_61.method1678(Static167.anInt3118));
		} else {
			Static55.method989(Static6.aClass131_3);
			aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg1) + 1);
			aClass1_Sub1_Sub1_2.method4104(arg1);
			aClass1_Sub1_Sub1_2.method4115(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBIII)V")
	public static void method3436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		aClass1_Sub1_Sub1_2.anInt5056 = 0;
		aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_6.anInt2675);
		aClass1_Sub1_Sub1_2.method4115(arg3);
		aClass1_Sub1_Sub1_2.method4115(arg0);
		aClass1_Sub1_Sub1_2.method4101(arg2);
		aClass1_Sub1_Sub1_2.method4101(arg1);
		Static423.anInt7327 = -3;
		Static402.anInt6944 = 1;
		Static53.anInt1070 = 0;
		Static148.anInt2522 = 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!mi;[[B)V")
	public static void method3438(@OriginalArg(1) Class155_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static264.aByteArrayArray90.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) byte[] local24 = arg1[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static157.anIntArray255[local18] >> 8) * 64 - Static437.anInt7555;
				@Pc(48) int local48 = (Static157.anIntArray255[local18] & 0xFF) * 64 - Static134.anInt5502;
				Static81.method1403();
				arg0.method3664(local37, Static276.aClass109_10, local24, local48, Static170.aClass112Array1);
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
	public static void method3439() {
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) Static225.aClass266_35.method6000(); local15 != null; local15 = (Class1_Sub19) Static225.aClass266_35.method5994()) {
			if (local15.anInt3375 == -1) {
				local15.anInt3382 = 0;
				if (local15.anInt3387 >= 0 && local15.anInt3386 >= 0 && local15.anInt3387 < Static135.anInt2314 && local15.anInt3386 < Static352.anInt6022) {
					Static178.method2762(local15);
				}
			} else {
				local15.method6071();
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I")
	public static int method3440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static162.method2596(local7, local17);
		@Pc(35) int local35 = Static162.method2596(local7 + 1, local17);
		@Pc(42) int local42 = Static162.method2596(local7, local17 + 1);
		@Pc(51) int local51 = Static162.method2596(local7 + 1, local17 + 1);
		@Pc(67) int local67 = Static27.method489(local13, arg2, local35, local28);
		@Pc(74) int local74 = Static27.method489(local13, arg2, local51, local42);
		return Static27.method489(local23, arg2, local74, local67);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method3441(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static23.method429(arg0.length - 1, 0, arg1, arg0);
	}
}
