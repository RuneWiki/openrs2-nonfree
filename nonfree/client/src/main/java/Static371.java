import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public static int anInt5975;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_218 = new Class56(27, 5);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Lclient!lo;")
	public static Class20_Sub5 method4760(@OriginalArg(0) int arg0) {
		@Pc(15) Class248[] local15 = Class4_Sub2_Sub11.aClass248Array1;
		synchronized (Class4_Sub2_Sub11.aClass248Array1) {
			@Pc(31) Class20_Sub5 local31;
			if (arg0 >= Class4_Sub2_Sub11.aClass248Array1.length || Class4_Sub2_Sub11.aClass248Array1[arg0].method5575()) {
				local31 = new Class20_Sub5();
				local31.aClass20_Sub8Array1 = new Class20_Sub8[arg0];
				for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
					local31.aClass20_Sub8Array1[local37] = new Class20_Sub8();
				}
			} else {
				local31 = (Class20_Sub5) Class4_Sub2_Sub11.aClass248Array1[arg0].method5576();
				local31.method5771();
				@Pc(70) int local70 = Static353.anIntArray465[arg0]--;
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!tf;I)Z")
	public static boolean method4764(@OriginalArg(1) Class4_Sub9_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method5071(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(104) int local104;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (local8 == 0) {
			if (arg0.method5071(1) != 0) {
				method4764(arg0, arg1);
			}
			local31 = arg0.method5071(6);
			local36 = arg0.method5071(6);
			@Pc(48) boolean local48 = arg0.method5071(1) == 1;
			if (local48) {
				Static86.anIntArray127[Static176.anInt3194++] = arg1;
			}
			if (Static267.aClass8_Sub3_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class272 local71 = Static302.aClass272Array1[arg1];
			@Pc(79) Class8_Sub3_Sub1_Sub1 local79 = Static267.aClass8_Sub3_Sub1_Sub1Array1[arg1] = new Class8_Sub3_Sub1_Sub1();
			local79.anInt7391 = arg1;
			if (Static384.aClass4_Sub9Array1[arg1] != null) {
				local79.method4554(Static384.aClass4_Sub9Array1[arg1]);
			}
			local79.method5889(local71.anInt7659);
			local79.anInt7394 = local71.anInt7662;
			local104 = local71.anInt7663;
			local108 = local104 >> 28;
			local114 = local104 >> 14 & 0xFF;
			@Pc(118) int local118 = local104 & 0xFF;
			local79.aBoolean399 = local71.aBoolean538;
			local79.aByteArray88[0] = Static37.aByteArray6[arg1];
			local79.aByte99 = (byte) local108;
			local79.method4558(local36 + (local118 << 6) - Static366.anInt6052, (local114 << 6) + local31 + -Static365.anInt6047);
			local79.aBoolean402 = false;
			Static302.aClass272Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method5071(2);
			local36 = Static302.aClass272Array1[arg1].anInt7663;
			Static302.aClass272Array1[arg1].anInt7663 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(209) int local209;
			@Pc(214) int local214;
			@Pc(222) int local222;
			if (local8 != 2) {
				local31 = arg0.method5071(18);
				local36 = local31 >> 16;
				local209 = local31 >> 8 & 0xFF;
				local214 = local31 & 0xFF;
				local222 = Static302.aClass272Array1[arg1].anInt7663;
				local104 = local36 + (local222 >> 28) & 0x3;
				local108 = local209 + (local222 >> 14) & 0xFF;
				local114 = local214 + local222 & 0xFF;
				Static302.aClass272Array1[arg1].anInt7663 = local114 + (local108 << 14) + (local104 << 28);
				return false;
			}
			local31 = arg0.method5071(5);
			local36 = local31 >> 3;
			local209 = local31 & 0x7;
			local214 = Static302.aClass272Array1[arg1].anInt7663;
			local222 = local36 + (local214 >> 28) & 0x3;
			local104 = local214 >> 14 & 0xFF;
			local108 = local214 & 0xFF;
			if (local209 == 0) {
				local104--;
				local108--;
			}
			if (local209 == 1) {
				local108--;
			}
			if (local209 == 2) {
				local108--;
				local104++;
			}
			if (local209 == 3) {
				local104--;
			}
			if (local209 == 4) {
				local104++;
			}
			if (local209 == 5) {
				local108++;
				local104--;
			}
			if (local209 == 6) {
				local108++;
			}
			if (local209 == 7) {
				local104++;
				local108++;
			}
			Static302.aClass272Array1[arg1].anInt7663 = (local222 << 28) + ((local104 << 14) + local108);
			return false;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!vh;III)V")
	public static void method4765(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static81.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt4551 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass4_Sub7Array2[arg0.anInt4551++] = Static367.aClass154Array1[local21 - 1].aClass4_Sub7_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt4551; local21 < 4; local21++) {
			arg0.aClass4_Sub7Array2[local21] = null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	public static void method4767(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static432.aClass75ArrayArrayArray6 = Static221.aClass75ArrayArrayArray3;
			Static278.aClass41Array3 = Static169.aClass41Array1;
		} else {
			Static432.aClass75ArrayArrayArray6 = Static458.aClass75ArrayArrayArray5;
			Static278.aClass41Array3 = Static228.aClass41Array2;
		}
		Static320.anInt5205 = Static432.aClass75ArrayArrayArray6.length;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lclient!ev;")
	public static Class75 method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static432.aClass75ArrayArrayArray6[0][arg1][arg2] != null && Static432.aClass75ArrayArrayArray6[0][arg1][arg2].aClass75_1 != null;
			if (local28 && arg0 >= Static320.anInt5205 - 1) {
				return null;
			}
			Static188.method2765(arg0, arg1, arg2);
		}
		return Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
	}
}
