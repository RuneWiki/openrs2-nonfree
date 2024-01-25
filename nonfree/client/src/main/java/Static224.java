import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_164 = new Class198(4);

	@OriginalMember(owner = "client!od", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray125 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_237 = new Class159("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!pl;IIIII)V")
	public static void method4037(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5989 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static134.anIntArrayArrayArray17[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class4_Sub33_Sub1 local33 = Static25.aClass4_Sub33_Sub1Array1[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt5989; local35++) {
							if (arg0.aClass4_Sub33_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass4_Sub33_Sub1Array3[arg0.anInt5989++] = local33;
						if (arg0.anInt5989 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt5989; local7 < 4; local7++) {
			arg0.aClass4_Sub33_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)I")
	public static int method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + ((arg1 >> 5 << 7) + (arg2 >> 1));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4040(@OriginalArg(1) String arg0) {
		if (Static278.aStringArray85 == null) {
			Static355.method5663();
		}
		@Pc(20) String[] local20 = Static212.method2554(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			for (@Pc(26) int local26 = Static169.anInt3605; local26 > 0; local26--) {
				Static278.aStringArray85[local26] = Static278.aStringArray85[local26 - 1];
			}
			Static278.aStringArray85[0] = local20[local22];
			if (Static278.aStringArray85.length - 1 > Static169.anInt3605) {
				if (Static25.anInt501 > 0) {
					Static25.anInt501++;
				}
				Static169.anInt3605++;
			}
		}
	}
}
