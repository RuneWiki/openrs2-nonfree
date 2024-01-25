import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
	public static int anInt6466;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_143 = new Class85("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "[I")
	public static final int[] anIntArray601 = new int[14];

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "[I")
	public static final int[] anIntArray602 = new int[32];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vg;BIILclient!wn;Lclient!de;II)V")
	public static void method5777(@OriginalArg(0) Class201 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static53.anInt992 == 4) {
			local14 = (int) Static164.aFloat24 & 0x3FFF;
		} else {
			local14 = (int) Static164.aFloat24 + Static170.anInt3407 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg0.anInt6505 / 2, arg0.anInt6510 / 2) + 10;
		@Pc(44) int local44 = arg2 * arg2 + arg1 * arg1;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(62) int local62 = Class187.anIntArray571[local14];
		@Pc(66) int local66 = Class187.anIntArray570[local14];
		if (Static53.anInt992 != 4) {
			local62 = local62 * 256 / (Static9.anInt191 + 256);
			local66 = local66 * 256 / (Static9.anInt191 + 256);
		}
		@Pc(97) int local97 = local66 * arg1 + arg2 * local62 >> 15;
		@Pc(108) int local108 = arg2 * local66 - local62 * arg1 >> 15;
		arg3.method5498(local97 + arg5 + arg0.anInt6505 / 2 - arg3.method5507() / 2, -local108 + (arg6 - -(arg0.anInt6510 / 2)) - arg3.method5494() / 2, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!gg;IIIII)V")
	public static void method5778(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5456 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass5_Sub9_Sub1Array3[local4] != null) {
				arg0.anInt5456++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5456; local22++) {
			@Pc(31) int local31 = Static308.anIntArrayArrayArray9[arg1][arg2][arg3];
			@Pc(40) Class5_Sub9_Sub1 local40;
			while (local31 != 0) {
				local40 = Static182.aClass5_Sub9_Sub1Array2[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass5_Sub9_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static308.anIntArrayArrayArray9[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static182.aClass5_Sub9_Sub1Array2[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass5_Sub9_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt5456 - 1; local85++) {
				arg0.aClass5_Sub9_Sub1Array3[local85] = arg0.aClass5_Sub9_Sub1Array3[local85 + 1];
			}
			arg0.anInt5456--;
		}
	}
}
