import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wo", name = "Db", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array17;

	@OriginalMember(owner = "client!wo", name = "Fb", descriptor = "I")
	public static int anInt7510;

	@OriginalMember(owner = "client!wo", name = "C", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_271 = new Class186(78, 10);

	@OriginalMember(owner = "client!wo", name = "nb", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
	public static int method5757(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V")
	public static void method5768() {
		if (Static416.aFloat208 < 1024.0F) {
			Static416.aFloat208 = 1024.0F;
		}
		if (Static416.aFloat208 > 3072.0F) {
			Static416.aFloat208 = 3072.0F;
		}
		while (Static146.aFloat82 >= 16384.0F) {
			Static146.aFloat82 -= 16384.0F;
		}
		while (Static146.aFloat82 < 0.0F) {
			Static146.aFloat82 += 16384.0F;
		}
		@Pc(41) int local41 = Static156.anInt2980 >> 7;
		@Pc(45) int local45 = Static322.anInt5750 >> 7;
		@Pc(51) int local51 = Static222.method3109(Static156.anInt2980, Static221.anInt4855, Static322.anInt5750);
		@Pc(53) int local53 = 0;
		@Pc(79) int local79;
		if (local41 > 3 && local45 > 3 && local41 < Static126.anInt2569 - 4 && Static190.anInt3697 - 4 > local45) {
			for (local79 = local41 - 4; local79 <= local41 + 4; local79++) {
				for (@Pc(85) int local85 = local45 - 4; local85 <= local45 + 4; local85++) {
					@Pc(89) int local89 = Static221.anInt4855;
					if (local89 < 3 && Static317.method4378(local85, local79)) {
						local89++;
					}
					@Pc(100) int local100 = 0;
					if (Static237.aClass134_Sub1_1.aByteArrayArrayArray16 != null && Static237.aClass134_Sub1_1.aByteArrayArrayArray16[local89] != null) {
						local100 = (Static237.aClass134_Sub1_1.aByteArrayArrayArray16[local89][local79][local85] & 0xFF) * 8;
					}
					@Pc(134) int local134 = local100 + local51 - Static346.aClass146Array2[local89].I(local79, local85);
					if (local134 > local53) {
						local53 = local134;
					}
				}
			}
		}
		local79 = (local53 >> 0) * 1536;
		if (local79 > 786432) {
			local79 = 786432;
		}
		if (local79 < 262144) {
			local79 = 262144;
		}
		if (local79 > Static448.anInt7459) {
			Static448.anInt7459 += (local79 - Static448.anInt7459) / 24;
		} else if (Static448.anInt7459 > local79) {
			Static448.anInt7459 += (local79 - Static448.anInt7459) / 80;
		}
	}
}
