import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public static int anInt1414;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "Lclient!ic;")
	public static Class113 aClass113_26;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public static int anInt1410 = 999999;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_54 = new Class214(19, 8);

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!dh;")
	public static final Class1_Sub11 aClass1_Sub11_3 = new Class1_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public static int anInt1415 = 0;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	public static int anInt1416 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!wp;IZI)V")
	public static void method1179(@OriginalArg(0) Class1_Sub45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static50.aClass254_8.aClass1_249) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt7397;
		@Pc(18) int local18 = arg0.anInt7400;
		@Pc(21) int local21 = arg0.anInt7398;
		@Pc(25) int local25 = (int) arg0.aLong225;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong225;
		if (local21 == 1006) {
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static426.anInt6943 = 0;
			Static168.anInt2765 = arg2;
			Static5.method94(Static363.aClass137_231);
			Static75.aClass1_Sub11_Sub1_1.method4448(local25);
		}
		@Pc(63) Class20_Sub3_Sub3_Sub1 local63;
		if (local21 == 9) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static168.anInt2765 = arg2;
				Static426.anInt6943 = 0;
				Static77.anInt1449 = 2;
				Static154.anInt5699 = arg1;
				Static5.method94(Static109.aClass137_89);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4474(local25);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 18) {
			Static426.anInt6943 = 0;
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static5.method94(Static257.aClass137_256);
			Static75.aClass1_Sub11_Sub1_1.method4448((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static315.anInt5215);
			Static75.aClass1_Sub11_Sub1_1.method4472(Static364.anInt6148);
			Static75.aClass1_Sub11_Sub1_1.method4492(Static234.anInt3782);
			Static75.aClass1_Sub11_Sub1_1.method4464(local18 + Static278.anInt4392);
			Static75.aClass1_Sub11_Sub1_1.method4448(local15 + Static101.anInt6646);
			Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static236.method3109(local34, local18, local15);
		}
		if (local21 == 4) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static426.anInt6943 = 0;
				Static77.anInt1449 = 2;
				Static168.anInt2765 = arg2;
				Static154.anInt5699 = arg1;
				Static5.method94(Static87.aClass137_79);
				Static75.aClass1_Sub11_Sub1_1.method4492(Static234.anInt3782);
				Static75.aClass1_Sub11_Sub1_1.method4464(Static364.anInt6148);
				Static75.aClass1_Sub11_Sub1_1.method4464(local25);
				Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4474(Static315.anInt5215);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		@Pc(264) Class250 local264;
		if (local21 == 30) {
			local264 = Static359.method4655(local15, local18);
			if (local264 != null) {
				Static314.method4062(local264);
			}
		}
		if (local21 == 46 && Static394.aClass250_13 == null) {
			Static277.method3517(local18, local15);
			Static394.aClass250_13 = Static359.method4655(local15, local18);
			Static94.method1357(Static394.aClass250_13);
		}
		if (local21 == 15 || local21 == 1007) {
			Static362.method4702(arg0.aString69, local25, local18, local15);
		}
		if (local21 == 6) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static77.anInt1449 = 2;
				Static154.anInt5699 = arg1;
				Static426.anInt6943 = 0;
				Static168.anInt2765 = arg2;
				Static5.method94(Static168.aClass137_117);
				Static75.aClass1_Sub11_Sub1_1.method4448(local25);
				Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 57) {
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static426.anInt6943 = 0;
			Static5.method94(Static374.aClass137_236);
			Static75.aClass1_Sub11_Sub1_1.method4448((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static75.aClass1_Sub11_Sub1_1.method4472(local15 + Static101.anInt6646);
			Static75.aClass1_Sub11_Sub1_1.method4448(Static278.anInt4392 + local18);
			Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static236.method3109(local34, local18, local15);
		}
		if (local21 == 5) {
			if (Static411.anInt6701 > 0 && Static321.aClass31_4.method3798(82) && Static321.aClass31_4.method3798(81)) {
				Static414.method5164(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, local15 + Static101.anInt6646, Static278.anInt4392 - -local18);
			} else {
				Static43.method4049(local18, local15, local25);
				if (local25 == 1) {
					Static75.aClass1_Sub11_Sub1_1.method4445(-1);
					Static75.aClass1_Sub11_Sub1_1.method4445(-1);
					Static75.aClass1_Sub11_Sub1_1.method4448((int) Static95.aFloat27);
					Static75.aClass1_Sub11_Sub1_1.method4445(57);
					Static75.aClass1_Sub11_Sub1_1.method4445(Static171.anInt2824);
					Static75.aClass1_Sub11_Sub1_1.method4445(Static305.anInt5082);
					Static75.aClass1_Sub11_Sub1_1.method4445(89);
					Static75.aClass1_Sub11_Sub1_1.method4448(Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613);
					Static75.aClass1_Sub11_Sub1_1.method4448(Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616);
					Static75.aClass1_Sub11_Sub1_1.method4445(63);
				} else {
					Static168.anInt2765 = arg2;
					Static426.anInt6943 = 0;
					Static77.anInt1449 = 1;
					Static154.anInt5699 = arg1;
				}
				Static308.method4012(local18, 1, local15, 1, true, 0, 0, -4);
			}
		}
		if (local21 == 19) {
			Static426.anInt6943 = 0;
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static5.method94(Static87.aClass137_79);
			Static75.aClass1_Sub11_Sub1_1.method4492(Static234.anInt3782);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static364.anInt6148);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6045);
			Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4474(Static315.anInt5215);
		}
		if (local21 == 16) {
			Static426.anInt6943 = 0;
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static5.method94(Static73.aClass137_66);
			Static75.aClass1_Sub11_Sub1_1.method4448((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static75.aClass1_Sub11_Sub1_1.method4464(local15 + Static101.anInt6646);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static278.anInt4392 + local18);
			Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static236.method3109(local34, local18, local15);
		}
		if (local21 == 49) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static168.anInt2765 = arg2;
				Static154.anInt5699 = arg1;
				Static77.anInt1449 = 2;
				Static426.anInt6943 = 0;
				Static5.method94(Static351.aClass137_217);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4464(local25);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		@Pc(692) Class20_Sub3_Sub3_Sub2 local692;
		if (local21 == 11) {
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				Static154.anInt5699 = arg1;
				Static168.anInt2765 = arg2;
				Static426.anInt6943 = 0;
				Static77.anInt1449 = 2;
				Static5.method94(Static435.aClass137_260);
				Static75.aClass1_Sub11_Sub1_1.method4448(local25);
				Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static308.method4012(local692.anIntArray369[0], local692.method4678(), local692.anIntArray370[0], local692.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 47) {
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				Static168.anInt2765 = arg2;
				Static154.anInt5699 = arg1;
				Static77.anInt1449 = 2;
				Static426.anInt6943 = 0;
				Static5.method94(Static453.aClass137_265);
				Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4474(local25);
				Static308.method4012(local692.anIntArray369[0], local692.method4678(), local692.anIntArray370[0], local692.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 20) {
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static426.anInt6943 = 0;
			Static168.anInt2765 = arg2;
			Static5.method94(Static254.aClass137_171);
			Static75.aClass1_Sub11_Sub1_1.method4448(Static278.anInt4392 + local18);
			Static75.aClass1_Sub11_Sub1_1.method4474(local25);
			Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4472(Static101.anInt6646 + local15);
			Static455.method5633(local15, local18);
		}
		if (local21 == 48) {
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				Static154.anInt5699 = arg1;
				Static426.anInt6943 = 0;
				Static77.anInt1449 = 2;
				Static168.anInt2765 = arg2;
				Static5.method94(Static33.aClass137_40);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4448(local25);
				Static308.method4012(local692.anIntArray369[0], local692.method4678(), local692.anIntArray370[0], local692.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 8) {
			Static154.anInt5699 = arg1;
			Static77.anInt1449 = 2;
			Static168.anInt2765 = arg2;
			Static426.anInt6943 = 0;
			Static5.method94(Static36.aClass137_43);
			Static75.aClass1_Sub11_Sub1_1.method4472(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4472(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static75.aClass1_Sub11_Sub1_1.method4464(Static278.anInt4392 + local18);
			Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static236.method3109(local34, local18, local15);
		}
		if (local21 == 50) {
			Static154.anInt5699 = arg1;
			Static168.anInt2765 = arg2;
			Static426.anInt6943 = 0;
			Static77.anInt1449 = 2;
			Static5.method94(Static116.aClass137_210);
			Static75.aClass1_Sub11_Sub1_1.method4502(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static278.anInt4392 + local18);
			Static75.aClass1_Sub11_Sub1_1.method4448(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4464(local25);
			Static455.method5633(local15, local18);
		}
		if (local21 == 22) {
			Static154.anInt5699 = arg1;
			Static168.anInt2765 = arg2;
			Static426.anInt6943 = 0;
			Static77.anInt1449 = 2;
			Static5.method94(Static77.aClass137_71);
			Static75.aClass1_Sub11_Sub1_1.method4464(local15 + Static101.anInt6646);
			Static75.aClass1_Sub11_Sub1_1.method4472(local18 + Static278.anInt4392);
			Static75.aClass1_Sub11_Sub1_1.method4474(local25);
			Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static455.method5633(local15, local18);
		}
		if (local21 == 1009 || local21 == 1010 || local21 == 1003 || local21 == 1001 || local21 == 1002) {
			Static119.method1632(local25, local21, local15);
		}
		if (local21 == 17) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static77.anInt1449 = 2;
				Static154.anInt5699 = arg1;
				Static168.anInt2765 = arg2;
				Static426.anInt6943 = 0;
				Static5.method94(Static214.aClass137_267);
				Static75.aClass1_Sub11_Sub1_1.method4464(local25);
				Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 1012) {
			Static168.anInt2765 = arg2;
			Static154.anInt5699 = arg1;
			Static426.anInt6943 = 0;
			Static77.anInt1449 = 2;
			Static5.method94(Static289.aClass137_188);
			Static75.aClass1_Sub11_Sub1_1.method4472(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4474(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4464(local18 + Static278.anInt4392);
			Static236.method3109(local34, local18, local15);
		}
		if (local21 == 21) {
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				Static168.anInt2765 = arg2;
				Static154.anInt5699 = arg1;
				Static77.anInt1449 = 2;
				Static426.anInt6943 = 0;
				Static5.method94(Static2.aClass137_131);
				Static75.aClass1_Sub11_Sub1_1.method4464(local25);
				Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4464(Static364.anInt6148);
				Static75.aClass1_Sub11_Sub1_1.method4450(Static234.anInt3782);
				Static75.aClass1_Sub11_Sub1_1.method4474(Static315.anInt5215);
				Static308.method4012(local692.anIntArray369[0], local692.method4678(), local692.anIntArray370[0], local692.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 1004) {
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static154.anInt5699 = arg1;
			Static426.anInt6943 = 0;
			Static5.method94(Static16.aClass137_138);
			Static75.aClass1_Sub11_Sub1_1.method4448(local25);
		}
		if (local21 == 25) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static77.anInt1449 = 2;
				Static168.anInt2765 = arg2;
				Static426.anInt6943 = 0;
				Static154.anInt5699 = arg1;
				Static5.method94(Static272.aClass137_178);
				Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4448(local25);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 45) {
			Static77.anInt1449 = 1;
			Static426.anInt6943 = 0;
			Static168.anInt2765 = arg2;
			Static154.anInt5699 = arg1;
			Static5.method94(Static138.aClass137_151);
			Static75.aClass1_Sub11_Sub1_1.method4474(local18 + Static278.anInt4392);
			Static75.aClass1_Sub11_Sub1_1.method4474(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static315.anInt5215);
			Static75.aClass1_Sub11_Sub1_1.method4474(Static364.anInt6148);
			Static75.aClass1_Sub11_Sub1_1.method4450(Static234.anInt3782);
			Static308.method4012(local18, 1, local15, 1, true, 0, 0, -4);
		}
		if (local21 == 13) {
			Static154.anInt5699 = arg1;
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static426.anInt6943 = 0;
			Static5.method94(Static368.aClass137_234);
			Static75.aClass1_Sub11_Sub1_1.method4474(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static75.aClass1_Sub11_Sub1_1.method4472(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4474(local18 + Static278.anInt4392);
			Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static236.method3109(local34, local18, local15);
		}
		if (local21 == 51) {
			local264 = Static359.method4655(local15, local18);
			if (local264 != null) {
				Static172.method2334();
				@Pc(1498) Class1_Sub15 local1498 = Static52.method804(local264);
				Static72.method1140(local1498.method1723(), local1498.anInt2174, local264);
				Static149.aString68 = Static105.method1480(local264);
				if (Static149.aString68 == null) {
					Static149.aString68 = "Null";
				}
				Static419.aString58 = local264.aString63 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 2) {
			Static426.anInt6943 = 0;
			Static77.anInt1449 = 2;
			Static168.anInt2765 = arg2;
			Static154.anInt5699 = arg1;
			Static5.method94(Static200.aClass137_135);
			Static75.aClass1_Sub11_Sub1_1.method4448(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4474(local18 + Static278.anInt4392);
			Static75.aClass1_Sub11_Sub1_1.method4472(local25);
			Static455.method5633(local15, local18);
		}
		if (local21 == 3) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static168.anInt2765 = arg2;
				Static77.anInt1449 = 2;
				Static426.anInt6943 = 0;
				Static154.anInt5699 = arg1;
				Static5.method94(Static356.aClass137_221);
				Static75.aClass1_Sub11_Sub1_1.method4502(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4472(local25);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 1011) {
			Static168.anInt2765 = arg2;
			Static77.anInt1449 = 2;
			Static426.anInt6943 = 0;
			Static154.anInt5699 = arg1;
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				@Pc(1661) Class246 local1661 = local692.aClass246_1;
				if (local1661.anIntArray459 != null) {
					local1661 = local1661.method5255(Static364.aClass259_1);
				}
				if (local1661 != null) {
					Static5.method94(Static227.aClass137_159);
					Static75.aClass1_Sub11_Sub1_1.method4448(local1661.anInt6859);
				}
			}
		}
		if (local21 == 23) {
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				Static154.anInt5699 = arg1;
				Static77.anInt1449 = 2;
				Static426.anInt6943 = 0;
				Static168.anInt2765 = arg2;
				Static5.method94(Static298.aClass137_190);
				Static75.aClass1_Sub11_Sub1_1.method4448(local25);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static308.method4012(local692.anIntArray369[0], local692.method4678(), local692.anIntArray370[0], local692.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 10) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static168.anInt2765 = arg2;
				Static77.anInt1449 = 2;
				Static154.anInt5699 = arg1;
				Static426.anInt6943 = 0;
				Static5.method94(Static324.aClass137_204);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4474(local25);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 58) {
			Static154.anInt5699 = arg1;
			Static168.anInt2765 = arg2;
			Static426.anInt6943 = 0;
			Static77.anInt1449 = 2;
			Static5.method94(Static266.aClass137_137);
			Static75.aClass1_Sub11_Sub1_1.method4474(Static101.anInt6646 + local15);
			Static75.aClass1_Sub11_Sub1_1.method4502(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4474(local25);
			Static75.aClass1_Sub11_Sub1_1.method4472(Static278.anInt4392 + local18);
			Static455.method5633(local15, local18);
		}
		if (local21 == 12) {
			Static426.anInt6943 = 0;
			Static154.anInt5699 = arg1;
			Static77.anInt1449 = 2;
			Static168.anInt2765 = arg2;
			Static5.method94(Static244.aClass137_166);
			Static75.aClass1_Sub11_Sub1_1.method4464(Static364.anInt6148);
			Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
			Static75.aClass1_Sub11_Sub1_1.method4464(local15 + Static101.anInt6646);
			Static75.aClass1_Sub11_Sub1_1.method4448(Static315.anInt5215);
			Static75.aClass1_Sub11_Sub1_1.method4472(Static278.anInt4392 + local18);
			Static75.aClass1_Sub11_Sub1_1.method4474(local25);
			Static75.aClass1_Sub11_Sub1_1.method4450(Static234.anInt3782);
			Static455.method5633(local15, local18);
		}
		if (local21 == 60) {
			local63 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local25];
			if (local63 != null) {
				Static426.anInt6943 = 0;
				Static168.anInt2765 = arg2;
				Static154.anInt5699 = arg1;
				Static77.anInt1449 = 2;
				Static5.method94(Static197.aClass137_134);
				Static75.aClass1_Sub11_Sub1_1.method4443(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4474(local25);
				Static308.method4012(local63.anIntArray369[0], local63.method4678(), local63.anIntArray370[0], local63.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 59) {
			local692 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local25];
			if (local692 != null) {
				Static168.anInt2765 = arg2;
				Static154.anInt5699 = arg1;
				Static426.anInt6943 = 0;
				Static77.anInt1449 = 2;
				Static5.method94(Static152.aClass137_108);
				Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4464(local25);
				Static308.method4012(local692.anIntArray369[0], local692.method4678(), local692.anIntArray370[0], local692.method4678(), true, 0, 0, -2);
			}
		}
		if (local21 == 44) {
			if (Static411.anInt6701 > 0 && Static321.aClass31_4.method3798(82) && Static321.aClass31_4.method3798(81)) {
				Static414.method5164(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, Static101.anInt6646 + local15, Static278.anInt4392 + local18);
			} else {
				Static168.anInt2765 = arg2;
				Static77.anInt1449 = 1;
				Static426.anInt6943 = 0;
				Static154.anInt5699 = arg1;
				Static5.method94(Static225.aClass137_157);
				Static75.aClass1_Sub11_Sub1_1.method4474(Static101.anInt6646 + local15);
				Static75.aClass1_Sub11_Sub1_1.method4464(Static278.anInt4392 + local18);
			}
		}
		if (Static360.aBoolean498) {
			Static172.method2334();
		}
		if (Static346.aClass250_11 != null && Static344.anInt5626 == 0) {
			Static94.method1357(Static346.aClass250_11);
		}
	}
}
