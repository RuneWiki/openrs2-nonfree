import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
	public static int anInt3672;

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "[[[Lclient!ffa;")
	public static Class97[][][] aClass97ArrayArrayArray1;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "[I")
	public static final int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_31 = new Class208(81, 3);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(JI)V")
	public static void method3254(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static107.method1758(arg0 - 1L);
			Static107.method1758(1L);
		} else {
			Static107.method1758(arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method3255() {
		if (Static162.aClass100_7 == null) {
			return;
		}
		if (Static389.aBoolean497) {
			Static373.method5888();
		}
		Static94.aClass65_1.method1719();
		Static174.method3212();
		Static147.method2345();
		Static614.method8520();
		Static324.method5383();
		Static515.method7728();
		if (Static382.aClass264_1 != null) {
			Static382.aClass264_1.method6928();
		}
		Static602.method8460();
		Static223.method3776();
		Static466.method6575();
		Static398.method9024();
		Static78.method1370(false);
		for (@Pc(46) int local46 = 0; local46 < 2048; local46++) {
			@Pc(52) Class20_Sub2_Sub2_Sub1_Sub1 local52 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local46];
			if (local52 != null) {
				for (@Pc(56) int local56 = 0; local56 < local52.aClass24Array3.length; local56++) {
					local52.aClass24Array3[local56] = null;
				}
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static273.anInt5420; local77++) {
			@Pc(84) Class20_Sub2_Sub2_Sub1_Sub2 local84 = Static1.aClass6_Sub46Array5[local77].aClass20_Sub2_Sub2_Sub1_Sub2_1;
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < local84.aClass24Array3.length; local88++) {
					local84.aClass24Array3[local88] = null;
				}
			}
		}
		Static187.aClass154_3 = null;
		Static562.aClass154_9 = null;
		Static162.aClass100_7.method8789();
		Static162.aClass100_7 = null;
	}
}
