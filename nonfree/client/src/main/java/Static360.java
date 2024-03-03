import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 8)
	public static void method6030() {
		@Pc(7) int local7 = Class28.anInt751;
		@Pc(9) int[] local9 = Class64.anIntArray121;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class11_Sub5_Sub2_Sub1 local19 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static87.method2001(local19, local19.method4329());
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 34)
	public static void method6032() {
		Static233.method4367();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Class2_Sub3_Sub18.aClass46Array1[local8].method1628();
		}
		Static228.method4300();
		Static197.method3722();
		System.gc();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I", line = 57)
	public static int method6033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static340.aClass6Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Class241.anInt7020 - 1 < local11 || local15 > OutputStream_Sub1.anInt4442 - 1) {
			return 0;
		}
		@Pc(51) int local51 = arg2;
		if (arg2 < 3 && (Static334.aByteArrayArrayArray16[1][local11][local15] & 0x2) != 0) {
			local51 = arg2 + 1;
		}
		return Static340.aClass6Array4[local51].method5729(arg0, arg1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!qg;ZI)Z", line = 88)
	public static boolean method6034(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method4869(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg0.method4869(1) != 0) {
				method6034(arg0, arg1);
			}
			local31 = arg0.method4869(6);
			local36 = arg0.method4869(6);
			@Pc(48) boolean local48 = arg0.method4869(1) == 1;
			if (local48) {
				Class2_Sub2_Sub5.anIntArray100[Class218.anInt6067++] = arg1;
			}
			if (Class9.aClass11_Sub5_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class11_Sub5_Sub2_Sub1 local75 = Class9.aClass11_Sub5_Sub2_Sub1Array1[arg1] = new Class11_Sub5_Sub2_Sub1();
			local75.anInt4610 = arg1;
			if (Class12_Sub4.aClass2_Sub4Array1[arg1] != null) {
				local75.method4067(Class12_Sub4.aClass2_Sub4Array1[arg1]);
			}
			local75.method4331(Class217.anIntArray410[arg1]);
			local75.anInt4602 = Class11_Sub4_Sub1.anIntArray260[arg1];
			local103 = Class2_Sub2_Sub10.anIntArray422[arg1];
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local117 = local103 & 0xFF;
			local75.aByteArray51[0] = Class222.aByteArray92[arg1];
			local75.aByte78 = (byte) local107;
			local75.method4065(local31 + (local113 << 6) - Static154.anInt3136, -Static139.anInt2716 + local36 + (local117 << 6));
			local75.aBoolean276 = false;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method4869(2);
			local36 = Class2_Sub2_Sub10.anIntArray422[arg1];
			Class2_Sub2_Sub10.anIntArray422[arg1] = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(201) int local201;
			@Pc(205) int local205;
			if (local8 != 2) {
				local31 = arg0.method4869(18);
				local36 = local31 >> 16;
				local201 = local31 >> 8 & 0xFF;
				local205 = local31 & 0xFF;
				local103 = Class2_Sub2_Sub10.anIntArray422[arg1];
				local107 = local36 + (local103 >> 28) & 0x3;
				local113 = local201 + (local103 >> 14) & 0xFF;
				local117 = local205 + local103 & 0xFF;
				Class2_Sub2_Sub10.anIntArray422[arg1] = (local113 << 14) + (local107 << 28) + local117;
				return false;
			}
			local31 = arg0.method4869(5);
			local36 = local31 >> 3;
			local201 = local31 & 0x7;
			local205 = Class2_Sub2_Sub10.anIntArray422[arg1];
			local103 = (local205 >> 28) + local36 & 0x3;
			local107 = local205 >> 14 & 0xFF;
			local113 = local205 & 0xFF;
			if (local201 == 0) {
				local107--;
				local113--;
			}
			if (local201 == 1) {
				local113--;
			}
			if (local201 == 2) {
				local113--;
				local107++;
			}
			if (local201 == 3) {
				local107--;
			}
			if (local201 == 4) {
				local107++;
			}
			if (local201 == 5) {
				local107--;
				local113++;
			}
			if (local201 == 6) {
				local113++;
			}
			if (local201 == 7) {
				local107++;
				local113++;
			}
			Class2_Sub2_Sub10.anIntArray422[arg1] = (local107 << 14) + (local103 << 28) + local113;
			return false;
		}
	}
}
