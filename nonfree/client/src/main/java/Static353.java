import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public static int anInt6722;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	public static int anInt6727 = -2;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_195 = new Class34("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_196 = new Class34("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!pi;)I")
	public static int method5618(@OriginalArg(1) Class17_Sub1_Sub1_Sub2 arg0) {
		@Pc(16) Class213 local16 = arg0.aClass213_1;
		if (local16.anIntArray517 != null) {
			local16 = local16.method5480();
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local16.anInt6535;
		@Pc(34) Class123 local34 = arg0.method4319();
		if (arg0.aBoolean471) {
			local30 = local16.anInt6526;
		} else if (arg0.anInt4824 == local34.anInt3700 || arg0.anInt4824 == local34.anInt3686 || local34.anInt3683 == arg0.anInt4824 || arg0.anInt4824 == local34.anInt3698) {
			local30 = local16.anInt6515;
		} else if (arg0.anInt4824 == local34.anInt3693 || arg0.anInt4824 == local34.anInt3672 || arg0.anInt4824 == local34.anInt3667 || local34.anInt3685 == arg0.anInt4824) {
			local30 = local16.anInt6548;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!wo;Lclient!gd;)V")
	public static void method5622(@OriginalArg(1) Class216 arg0, @OriginalArg(2) Interface2 arg1) {
		Static68.anInterface2_3 = arg1;
		Static269.aClass216_85 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJ)V")
	public static void method5625(@OriginalArg(1) long arg0) {
		if (Static77.aClass194ArrayArrayArray1 != null) {
			if (Static147.anInt3204 == 1 || Static147.anInt3204 == 5) {
				Static320.method4639(arg0);
			} else if (Static147.anInt3204 == 4) {
				Static269.method4737(arg0);
			}
		}
		Static258.method4651((long) Static5.anInt208, Static208.aClass32_11);
		if (Static89.anInt2231 != -1) {
			Static147.method2937(Static89.anInt2231);
		}
		for (@Pc(42) int local42 = 0; local42 < Static47.anInt1510; local42++) {
			if (Static223.aBooleanArray28[local42]) {
				Static161.aBooleanArray16[local42] = true;
			}
			Static320.aBooleanArray24[local42] = Static223.aBooleanArray28[local42];
			Static223.aBooleanArray28[local42] = false;
		}
		Static180.anInt3888 = Static5.anInt208;
		if (Static208.aClass32_11.method2178()) {
			Static87.aBoolean205 = true;
		}
		if (Static89.anInt2231 != -1) {
			Static47.anInt1510 = 0;
			Static211.method4079();
		}
		Static208.aClass32_11.method2184();
		Static1.method36(Static208.aClass32_11);
		@Pc(94) int local94 = Static189.method3685();
		if (local94 == -1) {
			local94 = Static46.anInt1504;
		}
		Static270.method4744(local94);
		Static308.method2774(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108, Static242.anInt6745, Static303.anInt2311, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109);
		Static303.anInt2311 = 0;
	}
}
