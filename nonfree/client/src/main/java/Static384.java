import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!hu;")
	public static Class157 aClass157_7;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array12;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
	public static int anInt5662 = 0;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_10 = new Class210(3, 2);

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
	public static int anInt5665 = 0;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	public static int anInt5666 = 0;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JJ)J")
	public static long method4980(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public static void method4981() {
		Static380.aClass352_47.method7656();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[BIIIII)V")
	public static void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static211.method8993(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static211.method8993(arg0)) {
			@Pc(31) int local31 = Static415.method5231(arg2);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg0 <= arg5 ? arg0 : arg5;
			@Pc(48) int local48 = arg5 >> 1;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(54) byte[] local54 = arg1;
			@Pc(61) byte[] local61 = new byte[local31 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local33, arg4, arg5, arg0, 0, arg2, 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(82) int local82 = arg5 * local31;
				for (@Pc(84) int local84 = 0; local84 < local31; local84++) {
					@Pc(88) int local88 = local84;
					@Pc(90) int local90 = local84;
					@Pc(95) int local95 = local84 + local82;
					for (@Pc(97) int local97 = 0; local97 < local52; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local48; local101++) {
							@Pc(107) byte local107 = local54[local90];
							local90 += local31;
							@Pc(117) int local117 = local107 + local54[local90];
							local90 += local31;
							@Pc(127) int local127 = local117 + local54[local95];
							local95 += local31;
							@Pc(137) int local137 = local127 + local54[local95];
							local61[local88] = (byte) (local137 >> 2);
							local95 += local31;
							local88 += local31;
						}
						local90 += local82;
						local95 += local82;
					}
				}
				@Pc(182) byte[] local182 = local61;
				local61 = local54;
				arg0 = local52;
				local54 = local182;
				arg5 = local48;
				local48 >>= 0x1;
				local44 >>= 0x1;
				local52 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!kg;)V")
	public static void method4983(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub2 arg1) {
		if (arg1.anIntArray690 == null) {
			return;
		}
		@Pc(13) int local13 = arg1.anIntArray690[arg0 + 1];
		if (arg1.anInt9981 == local13) {
			return;
		}
		arg1.anInt9984 = 0;
		arg1.anInt9960 = 0;
		arg1.anInt9946 = 1;
		arg1.anInt9941 = 0;
		arg1.anInt10001 = arg1.anInt10003;
		arg1.anInt9981 = local13;
		if (arg1.anInt9981 != -1) {
			Static633.method8389(arg1.anInt9960, arg1, Static99.aClass2_1.method22(arg1.anInt9981));
		}
	}
}
