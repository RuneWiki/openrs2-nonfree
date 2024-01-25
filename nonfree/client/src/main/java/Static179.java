import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Lclient!c;")
	public static Class33 aClass33_11;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
	public static int anInt7441 = -2;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	public static int anInt7446 = 0;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "[Lclient!ep;")
	public static final Class70[] aClass70Array3 = new Class70[4];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!vd;B)V")
	public static void method5737(@OriginalArg(0) Class51_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static163.anObject5 == null) {
			@Pc(9) Class65_Sub1_Sub1 local9 = new Class65_Sub1_Sub1();
			local16 = local9.method1593();
			Static163.anObject5 = Static335.method4376(local16);
		}
		if (Static5.anObject1 == null) {
			@Pc(34) Class65_Sub2_Sub1 local34 = new Class65_Sub2_Sub1();
			local16 = local34.method3924();
			Static5.anObject1 = Static335.method4376(local16);
		}
		@Pc(51) Class3 local51 = arg0.aClass3_1;
		if (local51.method10() && Static438.anObject11 == null) {
			local16 = Static264.method3567(new Class72_Sub1(419684), 4.0F, 16.0F, 4.0F, 0.6F, 0.5F);
			Static438.anObject11 = Static335.method4376(local16);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!dr;II)Z")
	public static boolean method5738(@OriginalArg(0) Class7_Sub14_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method1358(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method1358(1) != 0) {
				method5738(arg0, arg1);
			}
			local31 = arg0.method1358(6);
			local36 = arg0.method1358(6);
			@Pc(46) boolean local46 = arg0.method1358(1) == 1;
			if (local46) {
				Static419.anIntArray587[Static345.anInt5547++] = arg1;
			}
			if (Static410.aClass26_Sub2_Sub4_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class89 local69 = Static136.aClass89Array1[arg1];
			@Pc(77) Class26_Sub2_Sub4_Sub2 local77 = Static410.aClass26_Sub2_Sub4_Sub2Array1[arg1] = new Class26_Sub2_Sub4_Sub2();
			local77.anInt7080 = arg1;
			if (Static102.aClass7_Sub14Array1[arg1] != null) {
				local77.method5525(Static102.aClass7_Sub14Array1[arg1]);
			}
			local77.method5505(local69.anInt2430);
			local77.anInt7060 = local69.anInt2432;
			local102 = local69.anInt2433;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			local77.aBoolean482 = local69.aBoolean136;
			@Pc(120) int local120 = local102 & 0xFF;
			local77.aByteArray94[0] = Static373.aByteArray86[arg1];
			local77.aByte102 = (byte) local106;
			local77.method5526((local120 << 6) + local36 - Static314.anInt5181, -Static359.anInt5713 + (local112 << 6) + local31);
			local77.aBoolean480 = false;
			Static136.aClass89Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method1358(2);
			local36 = Static136.aClass89Array1[arg1].anInt2433;
			Static136.aClass89Array1[arg1].anInt2433 = (local36 & 0xFFFFFFF) + ((local31 + (local36 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(209) int local209;
			@Pc(214) int local214;
			@Pc(223) int local223;
			if (local8 != 2) {
				local31 = arg0.method1358(18);
				local36 = local31 >> 16;
				local209 = local31 >> 8 & 0xFF;
				local214 = local31 & 0xFF;
				local223 = Static136.aClass89Array1[arg1].anInt2433;
				local102 = local36 + (local223 >> 28) & 0x3;
				local106 = local209 + (local223 >> 14) & 0xFF;
				local112 = local223 + local214 & 0xFF;
				Static136.aClass89Array1[arg1].anInt2433 = (local106 << 14) + (local102 << 28) + local112;
				return false;
			}
			local31 = arg0.method1358(5);
			local36 = local31 >> 3;
			local209 = local31 & 0x7;
			local214 = Static136.aClass89Array1[arg1].anInt2433;
			local223 = (local214 >> 28) + local36 & 0x3;
			local102 = local214 >> 14 & 0xFF;
			local106 = local214 & 0xFF;
			if (local209 == 0) {
				local102--;
				local106--;
			}
			if (local209 == 1) {
				local106--;
			}
			if (local209 == 2) {
				local106--;
				local102++;
			}
			if (local209 == 3) {
				local102--;
			}
			if (local209 == 4) {
				local102++;
			}
			if (local209 == 5) {
				local102--;
				local106++;
			}
			if (local209 == 6) {
				local106++;
			}
			if (local209 == 7) {
				local106++;
				local102++;
			}
			Static136.aClass89Array1[arg1].anInt2433 = local106 + (local223 << 28) + (local102 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
	public static void method5739(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static93.aClass7_Sub4_Sub9_3 != null) {
			Static92.anInt1900 = Static93.aClass7_Sub4_Sub9_3.anInt3002;
		} else {
			Static92.anInt1900 = -1;
		}
		Static238.aClass85_27 = null;
		Static93.aClass7_Sub4_Sub9_3 = null;
		Static282.aClass95_11 = null;
		Static24.anInt346 = 0;
		Static93.method3419();
		Static93.aClass85_28.method2008();
		Static168.anInt3036 = -1;
		Static5.anInt16 = -1;
		Static129.aClass241_5 = null;
		Static36.aClass241_1 = null;
		Static82.aClass241_4 = null;
		Static71.aClass241_3 = null;
		Static46.aClass241_2 = null;
		Static54.aClass11_3 = null;
		Static291.aClass241_8 = null;
		Static234.aClass241_7 = null;
		Static186.aClass241_6 = null;
		Static93.aClass109_3 = null;
		Static93.aClass62_4.method1479();
		Static93.aClass176_3.method3713(64, 64);
		Static93.aClass62_4.method1484(128, 64);
		Static93.aClass142_2.method3152(64);
		Static446.aClass53_1.method1176(64);
	}
}
