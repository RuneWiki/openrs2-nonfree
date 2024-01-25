import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	public static int anInt817;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "[Lclient!fb;")
	public static Class14_Sub1_Sub1[] aClass14_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
	public static int anInt814 = 0;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public static int anInt815 = 0;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!bca;")
	public static final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_13 = new Class181(20, 8);

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
	public static int anInt818 = 4;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!qfa;IIII)V")
	public static void method847(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(19) Class5_Sub52 local19 = (Class5_Sub52) Static250.aClass306_16.method7313(); local19 != null; local19 = (Class5_Sub52) Static250.aClass306_16.method7301()) {
			if (local19.anInt10424 == arg1 && local19.anInt10413 == arg3 << 9 && local19.anInt10409 == arg2 << 9 && local19.aClass283_1.anInt7807 == arg0.anInt7807) {
				if (local19.aClass5_Sub16_Sub2_4 != null) {
					Static287.aClass5_Sub16_Sub3_1.method6144(local19.aClass5_Sub16_Sub2_4);
					local19.aClass5_Sub16_Sub2_4 = null;
				}
				if (local19.aClass5_Sub16_Sub2_3 != null) {
					Static287.aClass5_Sub16_Sub3_1.method6144(local19.aClass5_Sub16_Sub2_3);
					local19.aClass5_Sub16_Sub2_3 = null;
				}
				local19.method8911();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!kn;IIIIILclient!kn;IZI)V")
	public static void method849(@OriginalArg(0) Class14_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class14_Sub1_Sub1_Sub3 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0.method2517();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class44 local21 = (Class44) Static247.aClass293_30.method6921((long) local7);
		if (local21 == null) {
			@Pc(28) Class176[] local28 = Static654.method4059(Static488.aClass384_112, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static485.aClass126_17.method6994(local28[0], true);
			Static247.aClass293_30.method6925((long) local7, local21);
		}
		Static530.method7584(0, arg1 >> 1, arg5.aByte125, arg5.anInt9317, arg5.anInt9315, arg6 >> 1, arg5.method2509() * 256);
		@Pc(74) int local74 = Static515.anIntArray676[0] + arg3 - 18;
		@Pc(84) int local84 = arg4 + Static515.anIntArray676[1] - 54 - 16;
		@Pc(92) int local92 = local74 + arg2 / 4 * 18;
		@Pc(100) int local100 = local84 + arg2 % 4 * 18;
		local21.method5312(local92, local100);
		if (arg5 == arg0) {
			Static485.aClass126_17.method7005(18, -256, 18, local100 - 1, local92 - 1);
		}
		Static354.method5603(local92 + 18, local92 + -1, local100 + 18, local100 - 1);
		@Pc(136) Class14_Sub4 local136 = Static172.method2650();
		local136.anInt711 = local92 + 16;
		local136.anInt713 = local100;
		local136.anInt709 = local100 + 16;
		local136.anInt710 = local92;
		local136.aClass14_Sub1_Sub1_Sub3_1 = arg0;
		Static441.aClass363_8.method8480(local136);
	}
}
