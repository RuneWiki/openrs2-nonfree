import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "[I")
	public static int[] anIntArray418 = new int[5];

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
	public static int anInt3860 = 0;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2054 = Static122.method531("Loading fonts )2 ");

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2055 = Static122.method531("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2056 = aClass73_2054;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "[I")
	public static int[] anIntArray419 = new int[500];

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2057 = Static122.method531("gelb:");

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "[I")
	public static int[] anIntArray420 = new int[50];

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
	public static volatile int anInt3866 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method2724(@OriginalArg(0) Class3_Sub9 arg0) {
		if (arg0.aClass3_Sub4_5 != null) {
			arg0.aClass3_Sub4_5.anInt306 = 0;
		}
		arg0.aBoolean208 = false;
		for (@Pc(22) Class3_Sub9 local22 = arg0.method2219(); local22 != null; local22 = arg0.method2218()) {
			method2724(local22);
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public static void method2725() {
		anIntArray419 = null;
		aClass73_2057 = null;
		aClass73_2055 = null;
		aClass73_2056 = null;
		anIntArray420 = null;
		aClass73_2054 = null;
		anIntArray418 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!aa;I)V")
	public static void method2726(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2 arg1) {
		if (Static139.aClass2_5 != null) {
			try {
				Static139.aClass2_5.method12();
			} catch (@Pc(12) Exception local12) {
			}
			Static139.aClass2_5 = null;
		}
		Static139.aClass2_5 = arg1;
		Static44.method789(arg0);
		Static19.aClass3_Sub12_3.anInt1793 = 0;
		Static54.aClass3_Sub12_5 = null;
		Static132.aClass3_Sub1_Sub11_1 = null;
		Static159.anInt3486 = 0;
		while (true) {
			@Pc(37) Class3_Sub1_Sub11 local37 = (Class3_Sub1_Sub11) Static158.aClass16_11.method551();
			if (local37 == null) {
				while (true) {
					local37 = (Class3_Sub1_Sub11) Static40.aClass16_3.method551();
					if (local37 == null) {
						if (Static116.aByte7 != 0) {
							try {
								@Pc(95) Class3_Sub12 local95 = new Class3_Sub12(4);
								local95.method1383(4);
								local95.method1383(Static116.aByte7);
								local95.method1361(0);
								Static139.aClass2_5.method15(4, local95.aByteArray16);
							} catch (@Pc(116) IOException local116) {
								try {
									Static139.aClass2_5.method12();
								} catch (@Pc(121) Exception local121) {
								}
								Static139.aClass2_5 = null;
								Static52.anInt1278++;
							}
						}
						Static37.anInt896 = 0;
						Static17.aLong179 = Static88.method1536();
						return;
					}
					Static123.aClass50_2.method1600(local37);
					Static79.aClass16_8.method546(local37, local37.aLong183);
					Static31.anInt806++;
					Static108.anInt2486--;
				}
			}
			Static6.aClass16_1.method546(local37, local37.aLong183);
			Static163.anInt3163++;
			Static124.anInt2868--;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!ud;)V")
	public static void method2727(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub7 arg1) {
		if (Static44.anInt1024 < arg1.anInt3128) {
			Static128.method2152(arg1);
		} else if (Static44.anInt1024 > arg1.anInt3131) {
			Static38.method2259(arg1);
		} else {
			Static62.method1119(arg1);
		}
		if (arg1.anInt3169 < 128 || arg1.anInt3159 < 128 || arg1.anInt3169 >= 13184 || arg1.anInt3159 >= 13184) {
			arg1.anInt3149 = -1;
			arg1.anInt3159 = arg1.anInt3140 * 64 + arg1.anIntArray326[0] * 128;
			arg1.anInt3128 = 0;
			arg1.anInt3184 = -1;
			arg1.anInt3169 = arg1.anInt3140 * 64 + arg1.anIntArray329[0] * 128;
			arg1.anInt3131 = 0;
			arg1.method2269();
		}
		if (arg1 == Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 && (arg1.anInt3169 < 1536 || arg1.anInt3159 < 1536 || arg1.anInt3169 >= 11776 || arg1.anInt3159 >= 11776)) {
			arg1.anInt3169 = arg1.anIntArray329[0] * 128 + arg1.anInt3140 * 64;
			arg1.anInt3149 = -1;
			arg1.anInt3184 = -1;
			arg1.anInt3159 = arg1.anIntArray326[0] * 128 + arg1.anInt3140 * 64;
			arg1.anInt3128 = 0;
			arg1.anInt3131 = 0;
			arg1.method2269();
		}
		Static107.method1920(arg1);
		Static109.method1958(arg1);
	}
}
