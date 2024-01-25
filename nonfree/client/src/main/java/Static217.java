import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_43 = new Class236(65, -1);

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_64 = new Class40("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!ir", name = "G", descriptor = "Z")
	public static boolean aBoolean247 = true;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V")
	public static void method3498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 16);
		local8.method1327();
		local8.anInt1437 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!jba;IIIII)V")
	public static void method3500(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5117 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass5_Sub10Array5[local4] != null) {
				arg0.anInt5117++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5117; local22++) {
			@Pc(31) long local31 = Static479.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class250 local41;
			while (local31 != 0L) {
				local41 = Static24.aClass250Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass5_Sub10_3 == arg0.aClass5_Sub10Array5[local22]) {
					continue label51;
				}
			}
			local31 = Static479.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static24.aClass250Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass5_Sub10_3 == arg0.aClass5_Sub10Array5[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5117 - 1; local93++) {
				arg0.aClass5_Sub10Array5[local93] = arg0.aClass5_Sub10Array5[local93 + 1];
			}
			arg0.anInt5117--;
		}
	}
}
