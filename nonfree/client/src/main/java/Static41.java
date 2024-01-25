import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_18 = new Class119(103, -2);

	@OriginalMember(owner = "client!bu", name = "O", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_30 = new Class189("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[BIIIII)V")
	public static void method787(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static137.method2172(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static137.method2172(arg1)) {
			@Pc(33) int local33 = Static392.method5077(arg3);
			@Pc(35) int local35 = 0;
			@Pc(46) int local46 = arg1 > arg2 ? arg2 : arg1;
			@Pc(50) int local50 = arg2 >> 1;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(56) byte[] local56 = arg0;
			@Pc(63) byte[] local63 = new byte[local54 * local50 * local33];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local35, arg5, arg2, arg1, 0, arg3, 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(81) int local81 = arg2 * local33;
				for (@Pc(83) int local83 = 0; local83 < local33; local83++) {
					@Pc(86) int local86 = local83;
					@Pc(88) int local88 = local83;
					@Pc(92) int local92 = local81 + local83;
					for (@Pc(94) int local94 = 0; local94 < local54; local94++) {
						for (@Pc(97) int local97 = 0; local97 < local50; local97++) {
							@Pc(102) byte local102 = local56[local88];
							local88 += local33;
							@Pc(112) int local112 = local102 + local56[local88];
							@Pc(118) int local118 = local112 + local56[local92];
							local88 += local33;
							local92 += local33;
							@Pc(132) int local132 = local118 + local56[local92];
							local92 += local33;
							local63[local86] = (byte) (local132 >> 2);
							local86 += local33;
						}
						local88 += local81;
						local92 += local81;
					}
				}
				@Pc(173) byte[] local173 = local63;
				local63 = local56;
				local56 = local173;
				arg1 = local54;
				arg2 = local50;
				local54 >>= 0x1;
				local46 >>= 0x1;
				local35++;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
