import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!bc;")
	public static Class1 aClass1_22;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!bc;")
	public static Class1 aClass1_23;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt2896 = 0;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1140 = Static120.method1824("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1141 = Static120.method1824("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1142 = aClass80_1140;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public static void method2067() {
		while (true) {
			if (Static63.aClass3_Sub17_Sub1_2.method2145(Static41.anInt905) >= 11) {
				@Pc(12) int local12 = Static63.aClass3_Sub17_Sub1_2.method2152(11);
				if (local12 != 2047) {
					@Pc(17) boolean local17 = false;
					if (Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local12] == null) {
						Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local12] = new Class3_Sub1_Sub5_Sub4_Sub2();
						if (Static69.aClass3_Sub17Array1[local12] != null) {
							Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local12].method3071(Static69.aClass3_Sub17Array1[local12]);
						}
						local17 = true;
					}
					Static168.anIntArray460[Static15.anInt327++] = local12;
					@Pc(53) Class3_Sub1_Sub5_Sub4_Sub2 local53 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local12];
					local53.anInt4314 = Static193.anInt4411;
					@Pc(63) int local63 = Static122.anIntArray354[Static63.aClass3_Sub17_Sub1_2.method2152(3)];
					if (local17) {
						local53.anInt4309 = local53.anInt4301 = local63;
					}
					@Pc(76) int local76 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
					@Pc(81) int local81 = Static63.aClass3_Sub17_Sub1_2.method2152(5);
					@Pc(86) int local86 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
					if (local81 > 15) {
						local81 -= 32;
					}
					if (local86 == 1) {
						Static3.anIntArray24[Static33.anInt779++] = local12;
					}
					@Pc(110) int local110 = Static63.aClass3_Sub17_Sub1_2.method2152(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					local53.method3061(local76 == 1, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0] + local110, local81 + Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0]);
					continue;
				}
			}
			Static63.aClass3_Sub17_Sub1_2.method2148();
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILclient!dd;JLclient!dd;Lclient!dd;)V")
	public static void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class3_Sub1_Sub5 arg6, @OriginalArg(7) Class3_Sub1_Sub5 arg7) {
		@Pc(3) Class71 local3 = new Class71();
		local3.aClass3_Sub1_Sub5_6 = arg4;
		local3.anInt2832 = arg1 * 128 + 64;
		local3.anInt2836 = arg2 * 128 + 64;
		local3.anInt2834 = arg3;
		local3.aLong96 = arg5;
		local3.aClass3_Sub1_Sub5_8 = arg6;
		local3.aClass3_Sub1_Sub5_7 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class3_Sub15 local42 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2014; local46++) {
				if ((local42.aClass4Array3[local46].aLong4 & 0x400000L) == 4194304L && local42.aClass4Array3[local46].aClass3_Sub1_Sub5_1 instanceof Class3_Sub1_Sub5_Sub3) {
					@Pc(71) Class3_Sub1_Sub5_Sub3 local71 = (Class3_Sub1_Sub5_Sub3) local42.aClass4Array3[local46].aClass3_Sub1_Sub5_1;
					local71.method1385();
					if (local71.aShort34 < local34) {
						local34 = local71.aShort34;
					}
				}
			}
		}
		local3.anInt2838 = -local34;
		if (Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub15(arg0, arg1, arg2);
		}
		Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)I")
	public static int method2071(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Component;IB)Lclient!id;")
	public static Class32 method2076(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class32_Sub1");
			@Pc(15) Class32 local15 = (Class32) local11.getDeclaredConstructor().newInstance();
			local15.method1274(arg0, arg2, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class32_Sub2 local28 = new Class32_Sub2();
			local28.method1274(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILclient!dd;JZ)V")
	public static void method2077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class13 local6 = new Class13();
		local6.aClass3_Sub1_Sub5_2 = arg4;
		local6.anInt470 = arg1 * 128 + 64;
		local6.anInt468 = arg2 * 128 + 64;
		local6.anInt466 = arg3;
		local6.aLong16 = arg5;
		if (Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub15(arg0, arg1, arg2);
		}
		Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local6;
	}
}
