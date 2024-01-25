import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	public static int anInt2998;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "Lclient!co;")
	public static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_3;

	@OriginalMember(owner = "client!in", name = "db", descriptor = "Lclient!rt;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_46 = new Class25(14, -1);

	@OriginalMember(owner = "client!in", name = "ib", descriptor = "[I")
	public static final int[] anIntArray275 = new int[2048];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2724(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static298.method4373(Static7.aClass25_3);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg0));
			Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
	public static void method2725() {
		if (Static367.aFloat104 < 1024.0F) {
			Static367.aFloat104 = 1024.0F;
		}
		while (Static397.aFloat99 >= 16384.0F) {
			Static397.aFloat99 -= 16384.0F;
		}
		if (Static367.aFloat104 > 3072.0F) {
			Static367.aFloat104 = 3072.0F;
		}
		while (Static397.aFloat99 < 0.0F) {
			Static397.aFloat99 += 16384.0F;
		}
		@Pc(45) int local45 = Static153.anInt2718 >> 7;
		@Pc(49) int local49 = Static237.anInt4066 >> 7;
		@Pc(55) int local55 = Static165.method2689(Static153.anInt2718, Static4.anInt30, Static237.anInt4066);
		@Pc(57) int local57 = 0;
		@Pc(83) int local83;
		if (local45 > 3 && local49 > 3 && local45 < Static84.anInt1632 - 4 && Static261.anInt4480 - 4 > local49) {
			for (local83 = local45 - 4; local83 <= local45 + 4; local83++) {
				for (@Pc(89) int local89 = local49 - 4; local89 <= local49 + 4; local89++) {
					@Pc(93) int local93 = Static4.anInt30;
					if (local93 < 3 && Static132.method2150(local83, local89)) {
						local93++;
					}
					@Pc(104) int local104 = 0;
					if (Static160.aClass204_Sub1_1.aByteArrayArrayArray13 != null && Static160.aClass204_Sub1_1.aByteArrayArrayArray13[local93] != null) {
						local104 = (Static160.aClass204_Sub1_1.aByteArrayArrayArray13[local93][local83][local89] & 0xFF) * 8;
					}
					@Pc(137) int local137 = local104 + local55 - Static420.aClass84Array4[local93].method5322(local83, local89);
					if (local57 < local137) {
						local57 = local137;
					}
				}
			}
		}
		local83 = (local57 >> 0) * 1536;
		if (local83 > 786432) {
			local83 = 786432;
		}
		if (local83 < 262144) {
			local83 = 262144;
		}
		if (Static249.anInt4245 < local83) {
			Static249.anInt4245 += (local83 - Static249.anInt4245) / 24;
		} else if (local83 < Static249.anInt4245) {
			Static249.anInt4245 += (local83 - Static249.anInt4245) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZBI)Ljava/lang/String;")
	public static String method2730(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static311.method4450(arg0);
	}
}
