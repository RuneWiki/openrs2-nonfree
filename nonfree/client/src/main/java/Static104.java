import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public static int anInt2158;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_34 = new Class32("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_14 = new Class30();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2176(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = Static254.method3992(arg0, arg1);
		@Pc(17) String[] local17 = new String[local12 + 1];
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12; local23++) {
			@Pc(27) int local27;
			for (local27 = local21; arg1.charAt(local27) != arg0; local27++) {
			}
			local17[local19++] = arg1.substring(local21, local27);
			local21 = local27 + 1;
		}
		local17[local12] = arg1.substring(local21);
		return local17;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
	public static void method2178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class2_Sub10_Sub2 local18 = Static217.method3611(arg1, 9);
		local18.method864();
		local18.anInt1037 = arg2;
		local18.anInt1027 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	public static void method2180(@OriginalArg(0) int arg0) {
		if (Static391.anInt6627 == arg0) {
			return;
		}
		if (Static391.anInt6627 == 0) {
			Static2.method31();
		}
		if (arg0 == 40) {
			Static302.method2601();
		}
		if (arg0 != 40 && Static94.aClass221_2 != null) {
			Static94.aClass221_2.method4801();
			Static94.aClass221_2 = null;
		}
		if (Static391.anInt6627 == 25 || Static391.anInt6627 == 28) {
			Static29.aClass171_10.anInt4076 = 2;
			Static135.aClass171_46.anInt4076 = 2;
			Static308.aClass171_81.anInt4076 = 2;
			Static275.aClass171_74.anInt4076 = 2;
			Static81.aClass171_29.anInt4076 = 2;
			Static41.aClass171_13.anInt4076 = 2;
			Static201.aClass171_52.anInt4076 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static339.anInt5782 = 0;
			Static20.anInt5422 = 0;
			Static90.anInt1733 = 1;
			Static146.anInt2916 = 1;
			Static162.anInt3139 = 0;
			Static358.method1970(true);
			Static29.aClass171_10.anInt4076 = 1;
			Static135.aClass171_46.anInt4076 = 1;
			Static308.aClass171_81.anInt4076 = 1;
			Static275.aClass171_74.anInt4076 = 1;
			Static81.aClass171_29.anInt4076 = 1;
			Static41.aClass171_13.anInt4076 = 1;
			Static201.aClass171_52.anInt4076 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static200.method3361();
		}
		if (arg0 == 5) {
			Static251.method3966(Static111.aClass63_3, Static263.aClass171_64);
		} else {
			Static100.method1950();
		}
		@Pc(137) boolean local137 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(154) boolean local154 = Static391.anInt6627 == 5 || Static391.anInt6627 == 10 || Static391.anInt6627 == 28;
		if (local154 != local137) {
			if (local137) {
				Static220.anInt3948 = Static145.anInt5377;
				if (Static322.anInt5529 == 0) {
					Static32.method597();
				} else {
					Static281.method4296(255, Static233.aClass171_53, Static145.anInt5377);
				}
				Static333.aClass106_2.method2693(false);
			} else {
				Static32.method597();
				Static333.aClass106_2.method2693(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static111.aClass63_3.method2022();
		}
		Static391.anInt6627 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZZI)Lclient!nl;")
	public static Class171 method2186(@OriginalArg(2) boolean arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(5) Class197 local5 = null;
		if (Static226.aClass128_6 != null) {
			local5 = new Class197(arg2, Static226.aClass128_6, Static294.aClass128Array1[arg2], 1000000);
		}
		Static105.aClass16_Sub1Array1[arg2] = Static59.aClass233_1.method5205(local5, Static81.aClass197_1, arg2);
		if (arg1) {
			Static105.aClass16_Sub1Array1[arg2].method4725();
		}
		return new Class171(Static105.aClass16_Sub1Array1[arg2], arg0, 1);
	}
}
