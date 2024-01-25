import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!up", name = "P", descriptor = "I")
	public static int anInt6234;

	@OriginalMember(owner = "client!up", name = "R", descriptor = "Lclient!ct;")
	public static Class30 aClass30_93;

	@OriginalMember(owner = "client!up", name = "I", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_210 = new Class18(75, 4);

	@OriginalMember(owner = "client!up", name = "O", descriptor = "[I")
	public static final int[] anIntArray481 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!up", name = "Q", descriptor = "[I")
	public static final int[] anIntArray482 = new int[200];

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
	public static void method5558() {
		@Pc(9) int[] local9 = new int[Static243.aClass220_2.anInt6933];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static243.aClass220_2.anInt6933; local13++) {
			@Pc(20) Class22 local20 = Static243.aClass220_2.method5972(local13);
			if (local20.anInt892 >= 0 || local20.anInt889 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static133.anIntArray216 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static133.anIntArray216[local52] = local9[local52];
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(CI)C")
	public static char method5559(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZC)Z")
	public static boolean method5560(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	public static void method5562(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub4_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class36 local8 = Static50.aClass36Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static354.anInt6714; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static300.anInt5778; local15++) {
						local1 = local8.method4435(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static153.anInt3177;
							@Pc(32) int local32 = local12 << Static153.anInt3177;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class36 local41 = Static50.aClass36Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4431(local15, local12) - local41.method4431(local15, local12);
									@Pc(67) int local67 = local8.method4431(local15 + 1, local12) - local41.method4431(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4431(local15 + 1, local12 + 1) - local41.method4431(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4431(local15, local12 + 1) - local41.method4431(local15, local12 + 1);
									local41.method4444(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
	public static void method5563() {
		Static280.method5009(Static71.aClass18_54);
		Static339.aClass1_Sub7_Sub2_4.method2121(Static300.method5230());
		Static339.aClass1_Sub7_Sub2_4.method2144(Static213.anInt4274);
		Static339.aClass1_Sub7_Sub2_4.method2144(Static130.anInt2825);
		Static339.aClass1_Sub7_Sub2_4.method2121(Static289.anInt5617);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)Lclient!nk;")
	public static Class1_Sub4_Sub19 method5564(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub4_Sub19 local16 = (Class1_Sub4_Sub19) Static306.aClass44_9.method1612((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) byte[] local30 = Static34.aClass30_7.method1161(Static240.method4478(arg0), Static230.method1864(arg0));
		local16 = new Class1_Sub4_Sub19();
		if (local30 != null) {
			local16.method3972(new Class1_Sub7(local30));
		}
		Static306.aClass44_9.method1616((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(JI)V")
	public static void method5566(@OriginalArg(0) long arg0) {
		Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
		Static339.aClass1_Sub7_Sub2_4.method2121(Static204.aClass103_7.anInt3138);
		Static339.aClass1_Sub7_Sub2_4.method2124(arg0);
		Static2.anInt125 = -3;
		Static280.anInt5464 = 0;
		Static100.anInt2306 = 0;
		Static180.anInt3696 = 1;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)I")
	public static int method5567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static284.method5721(4, arg1 + 45365, arg0 + 91923) + (Static284.method5721(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static284.method5721(1, arg1, arg0) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V")
	public static void method5568() {
		Static27.aClass21_25.method857();
		Static336.aClass21_169.method857();
	}
}
