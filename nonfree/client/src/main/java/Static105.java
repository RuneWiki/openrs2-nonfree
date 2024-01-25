import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!he;")
	public static Class100 aClass100_15;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_115 = new Class123(76, 7);

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_31 = new Class267(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[BII)V")
	public static void method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static99.method4914(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static99.method4914(arg1)) {
			@Pc(34) int local34 = Static443.method6419(arg0);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg1 > arg2 ? arg2 : arg1;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(57) byte[] local57 = arg4;
			@Pc(64) byte[] local64 = new byte[local34 * local51 * local47];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local36, arg3, arg2, arg1, 0, arg0, 5121, local57, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(82) int local82 = local34 * arg2;
				@Pc(84) byte[] local84 = local64;
				for (@Pc(86) int local86 = 0; local86 < local34; local86++) {
					@Pc(90) int local90 = local86;
					@Pc(92) int local92 = local86;
					@Pc(96) int local96 = local86 + local82;
					for (@Pc(98) int local98 = 0; local98 < local51; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local47; local102++) {
							@Pc(108) byte local108 = local57[local92];
							local92 += local34;
							@Pc(118) int local118 = local108 + local57[local92];
							@Pc(124) int local124 = local118 + local57[local96];
							local92 += local34;
							local96 += local34;
							@Pc(138) int local138 = local124 + local57[local96];
							local64[local90] = (byte) (local138 >> 2);
							local96 += local34;
							local90 += local34;
						}
						local96 += local82;
						local92 += local82;
					}
				}
				local64 = local57;
				arg2 = local47;
				arg1 = local51;
				local57 = local84;
				local36++;
				local47 >>= 0x1;
				local51 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public static void method1869() {
		@Pc(8) Class111[] local8 = Class6_Sub2_Sub4.aClass111Array3;
		synchronized (Class6_Sub2_Sub4.aClass111Array3) {
			for (@Pc(12) int local12 = 0; local12 < Class6_Sub2_Sub4.aClass111Array3.length; local12++) {
				Class6_Sub2_Sub4.aClass111Array3[local12] = new Class111();
				Static29.anIntArray50[local12] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)B")
	public static byte method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!tb;I)Ljava/lang/String;")
	public static String method1871(@OriginalArg(0) Class6_Sub40 arg0) {
		return arg0.aString55 == null || arg0.aString55.length() <= 0 ? arg0.aString56 : arg0.aString56 + Static407.aClass267_99.method6581(Static161.anInt3239) + arg0.aString55;
	}
}
