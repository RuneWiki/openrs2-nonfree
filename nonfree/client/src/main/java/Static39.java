import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!wa;")
	public static Class6_Sub3_Sub17 aClass6_Sub3_Sub17_3;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!rd;")
	private static Class63 aClass63_672 = Static80.method1463("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_671 = aClass63_672;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_673 = aClass63_672;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_3 = new Class1();

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!rd;")
	private static Class63 aClass63_674 = Static80.method1463("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	public static int anInt1244 = 0;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!rd;")
	private static Class63 aClass63_677 = Static80.method1463("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_675 = aClass63_677;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_676 = aClass63_674;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!rd;")
	private static Class63 aClass63_679 = Static80.method1463("Please remove ");

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_678 = aClass63_679;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array9 = new Class63[100];

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_680 = aClass63_679;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public static void method881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg3 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg4 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg5;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local10 != 0) {
			local29 = Class6_Sub3_Sub3_Sub4.anIntArray342[local10];
			local33 = Class6_Sub3_Sub3_Sub4.anIntArray343[local10];
			local44 = local29 * 0 - local33 * arg5 >> 16;
			local21 = local33 * 0 + arg5 * local29 >> 16;
			local23 = local44;
		}
		if (local17 != 0) {
			local29 = Class6_Sub3_Sub3_Sub4.anIntArray342[local17];
			local33 = Class6_Sub3_Sub3_Sub4.anIntArray343[local17];
			local44 = local29 * 0 + local33 * local21 >> 16;
			local21 = local21 * local29 - local33 * 0 >> 16;
			local19 = local44;
		}
		Static35.anInt1172 = arg3;
		Static94.anInt2627 = arg4;
		Static4.anInt45 = arg2 - local21;
		Static34.anInt1163 = arg1 - local23;
		Static41.anInt1273 = arg0 - local19;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;IILclient!ba;)Lclient!ce;")
	public static Class10 method882(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3) {
		if (Static73.anInt2059 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class10 local38 = (Class10) Class.forName("Class10_Sub1").getDeclaredConstructor().newInstance();
			local38.anInt2647 = arg0;
			local38.anIntArray287 = new int[(Static52.aBoolean78 ? 2 : 1) * 256];
			local38.method1714(arg1);
			local38.anInt2649 = (-1024 & arg0) + 1024;
			if (local38.anInt2649 > 16384) {
				local38.anInt2649 = 16384;
			}
			local38.method1719(local38.anInt2649);
			if (Static68.anInt1975 > 0 && Static71.aClass38_1 == null) {
				Static71.aClass38_1 = new Class38();
				arg3.method145(Static68.anInt1975, Static71.aClass38_1);
			}
			if (Static71.aClass38_1 != null) {
				if (Static71.aClass38_1.aClass10Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static71.aClass38_1.aClass10Array1[arg2] = local38;
			}
			return local38;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(116) Class10_Sub2 local116 = new Class10_Sub2(arg3, arg2);
				local116.anIntArray287 = new int[(Static52.aBoolean78 ? 2 : 1) * 256];
				local116.anInt2647 = arg0;
				local116.method1714(arg1);
				local116.anInt2649 = 16384;
				local116.method1719(local116.anInt2649);
				if (Static68.anInt1975 > 0 && Static71.aClass38_1 == null) {
					Static71.aClass38_1 = new Class38();
					arg3.method145(Static68.anInt1975, Static71.aClass38_1);
				}
				if (Static71.aClass38_1 != null) {
					if (Static71.aClass38_1.aClass10Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static71.aClass38_1.aClass10Array1[arg2] = local116;
				}
				return local116;
			} catch (@Pc(172) Throwable local172) {
				return new Class10();
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZJ)V")
	public static void method883(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static5.anInt52; local14++) {
			if (arg0 == Static49.aLongArray2[local14]) {
				Static5.anInt52--;
				Static10.aBoolean20 = true;
				for (@Pc(38) int local38 = local14; local38 < Static5.anInt52; local38++) {
					Static65.aClass63Array16[local38] = Static65.aClass63Array16[local38 + 1];
					Static31.anIntArray127[local38] = Static31.anIntArray127[local38 + 1];
					Static49.aLongArray2[local38] = Static49.aLongArray2[local38 + 1];
					Static12.anIntArray50[local38] = Static12.anIntArray50[local38 + 1];
				}
				Static72.anInt2047 = Static73.anInt2064 + 1;
				Static23.aClass6_Sub4_Sub1_4.method1347(0);
				Static23.aClass6_Sub4_Sub1_4.method1331(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class6_Sub18 local3 = null;
		for (@Pc(12) Class6_Sub18 local12 = (Class6_Sub18) aClass1_3.method3(); local12 != null; local12 = (Class6_Sub18) aClass1_3.method14()) {
			if (local12.anInt3031 == arg0 && arg4 == local12.anInt3020 && local12.anInt3018 == arg2 && local12.anInt3030 == arg1) {
				local3 = local12;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class6_Sub18();
			local3.anInt3031 = arg0;
			local3.anInt3030 = arg1;
			local3.anInt3020 = arg4;
			local3.anInt3018 = arg2;
			Static120.method2138(local3);
			aClass1_3.method10(local3);
		}
		local3.anInt3026 = arg7;
		local3.anInt3024 = arg5;
		local3.anInt3029 = arg6;
		local3.anInt3017 = arg8;
		local3.anInt3016 = arg3;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method885() {
		aClass63_671 = null;
		aClass6_Sub3_Sub17_3 = null;
		aClass63_674 = null;
		anIntArray143 = null;
		aClass63Array9 = null;
		aClass63_673 = null;
		aClass63_679 = null;
		aClass63_675 = null;
		aClass63_676 = null;
		aClass63_677 = null;
		aClass1_3 = null;
		aClass63_678 = null;
		aClass63_672 = null;
		aClass63_680 = null;
	}
}
