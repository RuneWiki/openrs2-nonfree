import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	public static int anInt6719 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "()V")
	public static void method5676() {
		for (@Pc(1) int local1 = 0; local1 < Static249.anInt4974; local1++) {
			@Pc(6) Class67_Sub3 local6 = Static220.aClass67_Sub3Array3[local1];
			Static213.method3839(local6);
			Static220.aClass67_Sub3Array3[local1] = null;
		}
		Static249.anInt4974 = 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method5677() {
		Static25.anInt6264 = 0;
		@Pc(12) int local12 = (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7) + Static182.anInt3662;
		@Pc(19) int local19 = Static169.anInt6312 + (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static25.anInt6264 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static25.anInt6264 = 1;
		}
		if (Static25.anInt6264 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static25.anInt6264 = 0;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!jm;IZI)V")
	public static void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static306.anInt6038 >= 50 || (arg2 == null || arg2.anIntArrayArray30 == null || arg2.anIntArrayArray30.length <= arg4 || arg2.anIntArrayArray30[arg4] == null)) {
			return;
		}
		@Pc(44) int local44 = arg2.anIntArrayArray30[arg4][0];
		@Pc(48) int local48 = local44 >> 8;
		@Pc(54) int local54 = local44 >> 5 & 0x7;
		@Pc(71) int local71;
		if (arg2.anIntArrayArray30[arg4].length > 1) {
			local71 = (int) ((double) arg2.anIntArrayArray30[arg4].length * Math.random());
			if (local71 > 0) {
				local48 = arg2.anIntArrayArray30[arg4][local71];
			}
		}
		@Pc(84) int local84 = local44 & 0x1F;
		if (local84 == 0) {
			if (arg3) {
				Static350.method5656(local48, 255, local54, 0);
			}
		} else if (Static326.anInt5865 != 0) {
			Static253.anIntArray393[Static306.anInt6038] = local48;
			Static270.anIntArray416[Static306.anInt6038] = local54;
			Static291.anIntArray446[Static306.anInt6038] = 0;
			Static53.aClass102Array1[Static306.anInt6038] = null;
			Static75.anIntArray93[Static306.anInt6038] = 255;
			local71 = (arg1 - 64) / 128;
			@Pc(133) int local133 = (arg0 - 64) / 128;
			Static64.anIntArray76[Static306.anInt6038] = local84 + (local133 << 8) + (local71 << 16);
			Static306.anInt6038++;
		}
	}
}
