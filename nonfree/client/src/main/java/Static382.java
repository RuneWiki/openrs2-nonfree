import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_228 = new Class186(76, -1);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method5203() {
		Static209.method2982(Static184.aClass36_73);
		Static116.aClass4_Sub30_Sub1_1.method4871(0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!of;II)Z")
	public static boolean method5205(@OriginalArg(0) Class4_Sub30_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0.method3924(2);
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(107) int local107;
		@Pc(111) int local111;
		@Pc(117) int local117;
		if (local13 == 0) {
			if (arg0.method3924(1) != 0) {
				method5205(arg0, arg1);
			}
			local36 = arg0.method3924(6);
			local41 = arg0.method3924(6);
			@Pc(51) boolean local51 = arg0.method3924(1) == 1;
			if (local51) {
				Static149.anIntArray236[Static182.anInt3388++] = arg1;
			}
			if (Static171.aClass6_Sub2_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(74) Class171 local74 = Static114.aClass171Array1[arg1];
			@Pc(82) Class6_Sub2_Sub1_Sub1 local82 = Static171.aClass6_Sub2_Sub1_Sub1Array1[arg1] = new Class6_Sub2_Sub1_Sub1();
			local82.anInt6078 = arg1;
			if (Static165.aClass4_Sub30Array1[arg1] != null) {
				local82.method716(Static165.aClass4_Sub30Array1[arg1]);
			}
			local82.method4766(local74.anInt4899);
			local82.anInt6081 = local74.anInt4901;
			local107 = local74.anInt4895;
			local111 = local107 >> 28;
			local117 = local107 >> 14 & 0xFF;
			local82.aBoolean54 = local74.aBoolean346;
			@Pc(125) int local125 = local107 & 0xFF;
			local82.aByteArray69[0] = Static251.aByteArray45[arg1];
			local82.aByte86 = (byte) local111;
			local82.method715(local36 + (local117 << 6) - Static381.anInt6688, -Static285.anInt5187 + (local125 << 6) + local41);
			local82.aBoolean52 = false;
			Static114.aClass171Array1[arg1] = null;
			return true;
		} else if (local13 == 1) {
			local36 = arg0.method3924(2);
			local41 = Static114.aClass171Array1[arg1].anInt4895;
			Static114.aClass171Array1[arg1].anInt4895 = (local41 & 0xFFFFFFF) + (((local41 >> 28) + local36 & 0x3) << 28);
			return false;
		} else {
			@Pc(215) int local215;
			@Pc(220) int local220;
			@Pc(228) int local228;
			if (local13 != 2) {
				local36 = arg0.method3924(18);
				local41 = local36 >> 16;
				local215 = local36 >> 8 & 0xFF;
				local220 = local36 & 0xFF;
				local228 = Static114.aClass171Array1[arg1].anInt4895;
				local107 = (local228 >> 28) + local41 & 0x3;
				local111 = local215 + (local228 >> 14) & 0xFF;
				local117 = local220 + local228 & 0xFF;
				Static114.aClass171Array1[arg1].anInt4895 = (local107 << 28) + ((local111 << 14) + local117);
				return false;
			}
			local36 = arg0.method3924(5);
			local41 = local36 >> 3;
			local215 = local36 & 0x7;
			local220 = Static114.aClass171Array1[arg1].anInt4895;
			local228 = local41 + (local220 >> 28) & 0x3;
			local107 = local220 >> 14 & 0xFF;
			local111 = local220 & 0xFF;
			if (local215 == 0) {
				local107--;
				local111--;
			}
			if (local215 == 1) {
				local111--;
			}
			if (local215 == 2) {
				local111--;
				local107++;
			}
			if (local215 == 3) {
				local107--;
			}
			if (local215 == 4) {
				local107++;
			}
			if (local215 == 5) {
				local107--;
				local111++;
			}
			if (local215 == 6) {
				local111++;
			}
			if (local215 == 7) {
				local107++;
				local111++;
			}
			Static114.aClass171Array1[arg1].anInt4895 = (local107 << 14) + ((local228 << 28) + local111);
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	public static void method5206() {
		Static412.aFont1 = null;
		Static418.anImage3 = null;
	}
}
