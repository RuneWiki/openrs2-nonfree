import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!ad;")
	public static Class1_Sub3 aClass1_Sub3_5;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!eo;")
	public static Class65 aClass65_7;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static final int anInt7013 = 1406;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_153 = new Class7("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method5746() {
		Static152.aClient1.method1230();
		Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
		Static152.aClass107_95 = null;
		Static255.aClass107_135 = null;
		Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
		Static126.anInt2566 = 0;
		Static358.aClass107_182 = null;
		Static264.anInt4690 = 0;
		Static425.anInt6874 = 0;
		Static269.aClass107_139 = null;
		for (@Pc(33) int local33 = 0; local33 < 100; local33++) {
			Static429.aStringArray43[local33] = null;
		}
		Static432.anInt7010 = 0;
		Static313.anInt5409 = 0;
		Static266.anInt6939 = 0;
		Static161.anInt3015 = 0;
		Static118.aClass154Array1 = null;
		Static348.aString61 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method5748(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static400.method5337(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local42 <= local45);
			return Static412.method5521(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIII[B)V")
	public static void method5749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg2 > 0 && !Static400.method5337(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static400.method5337(arg0)) {
			@Pc(35) int local35 = Static57.method1234(arg4);
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg2 < arg0 ? arg2 : arg0;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(63) byte[] local63 = arg5;
			@Pc(70) byte[] local70 = new byte[local57 * local61 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local42, arg3, arg2, arg0, 0, arg4, 5121, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(91) int local91 = local35 * arg2;
				@Pc(93) byte[] local93 = local70;
				for (@Pc(95) int local95 = 0; local95 < local35; local95++) {
					@Pc(98) int local98 = local95;
					@Pc(100) int local100 = local95;
					@Pc(104) int local104 = local95 + local91;
					for (@Pc(106) int local106 = 0; local106 < local61; local106++) {
						for (@Pc(109) int local109 = 0; local109 < local57; local109++) {
							@Pc(114) byte local114 = local63[local100];
							local100 += local35;
							@Pc(124) int local124 = local114 + local63[local100];
							local100 += local35;
							@Pc(134) int local134 = local124 + local63[local104];
							local104 += local35;
							@Pc(144) int local144 = local134 + local63[local104];
							local70[local98] = (byte) (local144 >> 2);
							local104 += local35;
							local98 += local35;
						}
						local100 += local91;
						local104 += local91;
					}
				}
				local70 = local63;
				local63 = local93;
				arg0 = local61;
				arg2 = local57;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local61 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
