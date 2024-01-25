import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "Lclient!tga;")
	public static Class349 aClass349_6;

	@OriginalMember(owner = "client!wu", name = "S", descriptor = "[[[Lclient!gf;")
	public static Class128[][][] aClass128ArrayArrayArray3;

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
	public static int anInt10911 = 0;

	@OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
	public static int anInt10914 = 0;

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
	public static final int anInt10916 = -1;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
	public static void method9214() {
		Static655.anImage13 = null;
		Static311.aFont2 = null;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V")
	public static void method9215() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static322.aBooleanArray14[local7] = false;
		}
		Static224.anInt3867 = Static565.anInt8921;
		Static555.anInt8761 = -1;
		Static134.anInt2209 = 0;
		Static177.anInt3350 = 0;
		Static459.anInt7422 = Static96.anInt10862;
		Static426.anInt7111 = 5;
		Static92.anInt9656 = Static42.anInt703;
		Static417.anInt7039 = -1;
		Static227.anInt9451 = -1;
		Static353.anInt5829 = Static282.anInt5025;
		Static35.anInt522 = -1;
		Static420.anInt7085 = Static542.anInt8612;
		Static360.anInt5879 = Static141.anInt2764;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "()V")
	public static void method9216() {
		for (@Pc(1) int local1 = Static255.anInt6561; local1 < Static237.anInt4100; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static672.anInt10829; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static532.anInt8517; local7++) {
					@Pc(16) Class128 local16 = Static283.aClass128ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub1_Sub2 local21 = local16.aClass4_Sub1_Sub2_2;
						@Pc(24) Class4_Sub1_Sub2 local24 = local16.aClass4_Sub1_Sub2_1;
						if (local21 != null && local21.method8339()) {
							Static620.method7040(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8339()) {
								Static620.method7040(local24, local1, local4, local7, 1, 1);
								local24.method8354(false, 0, Static44.aClass100_1, 0, local21, -83, 0);
								local24.method8351((byte) -68);
							}
							local21.method8351((byte) -99);
						}
						for (@Pc(76) Class299 local76 = local16.aClass299_2; local76 != null; local76 = local76.aClass299_3) {
							@Pc(80) Class4_Sub1_Sub1 local80 = local76.aClass4_Sub1_Sub1_1;
							if (local80 != null && local80.method8339()) {
								Static620.method7040(local80, local1, local4, local7, local80.aShort103 + 1 - local80.aShort104, local80.aShort102 - local80.aShort105 + 1);
								local80.method8351((byte) -110);
							}
						}
						@Pc(120) Class4_Sub1_Sub3 local120 = local16.aClass4_Sub1_Sub3_1;
						if (local120 != null && local120.method8339()) {
							Static352.method5181(local120, local1, local4, local7);
							local120.method8351((byte) -106);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIII)V")
	public static void method9217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static402.method5857(arg0, arg1, arg2, arg4);
		} else if (Static230.anInt3962 <= arg0 - arg4 && arg0 + arg4 <= Static463.anInt7530 && Static573.anInt8986 <= arg2 - arg3 && arg2 + arg3 <= Static319.anInt5445) {
			Static205.method3370(arg0, arg3, arg1, arg4, arg2);
		} else {
			Static35.method562(arg4, arg2, arg1, arg0, arg3);
		}
	}
}
