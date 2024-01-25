import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!sv", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
	public static int anInt8619;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString71 = null;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "[Lclient!jca;")
	public static Class152[] aClass152Array1 = new Class152[50];

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "Z")
	public static boolean aBoolean560 = true;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIII)V")
	public static void method6842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static92.method1387(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(32) int local32 = arg5;
		@Pc(35) int local35 = -arg5;
		@Pc(37) int local37 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(86) int local86;
		@Pc(94) int local94;
		if (Static133.anInt2531 <= arg1 && arg1 <= Static52.anInt1226) {
			@Pc(60) int[] local60 = Static155.anIntArrayArray32[arg1];
			local69 = Static502.method6952(Static205.anInt3906, arg4 - arg5, Static529.anInt9806);
			local77 = Static502.method6952(Static205.anInt3906, arg4 + arg5, Static529.anInt9806);
			local86 = Static502.method6952(Static205.anInt3906, arg4 - local15, Static529.anInt9806);
			local94 = Static502.method6952(Static205.anInt3906, local15 + arg4, Static529.anInt9806);
			Static264.method4006(local86, arg0, local69, local60);
			Static264.method4006(local94, arg2, local86, local60);
			Static264.method4006(local77, arg0, local94, local60);
		}
		@Pc(114) int local114 = -1;
		while (local10 < local32) {
			local42 += 2;
			local114 += 2;
			local35 += local42;
			local40 += local114;
			if (local40 >= 0 && local37 >= 1) {
				local37--;
				Static528.anIntArray643[local37] = local10;
				local40 -= local37 << 1;
			}
			local10++;
			@Pc(215) int local215;
			@Pc(223) int local223;
			@Pc(234) int[] local234;
			@Pc(165) int local165;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				local165 = arg1 - local32;
				local69 = local32 + arg1;
				if (local69 >= Static133.anInt2531 && Static52.anInt1226 >= local165) {
					if (local32 < local15) {
						local77 = Static528.anIntArray643[local32];
						local86 = Static502.method6952(Static205.anInt3906, local10 + arg4, Static529.anInt9806);
						local94 = Static502.method6952(Static205.anInt3906, arg4 - local10, Static529.anInt9806);
						local215 = Static502.method6952(Static205.anInt3906, arg4 + local77, Static529.anInt9806);
						local223 = Static502.method6952(Static205.anInt3906, arg4 - local77, Static529.anInt9806);
						if (local69 <= Static52.anInt1226) {
							local234 = Static155.anIntArrayArray32[local69];
							Static264.method4006(local223, arg0, local94, local234);
							Static264.method4006(local215, arg2, local223, local234);
							Static264.method4006(local86, arg0, local215, local234);
						}
						if (Static133.anInt2531 <= local165) {
							local234 = Static155.anIntArrayArray32[local165];
							Static264.method4006(local223, arg0, local94, local234);
							Static264.method4006(local215, arg2, local223, local234);
							Static264.method4006(local86, arg0, local215, local234);
						}
					} else {
						local77 = Static502.method6952(Static205.anInt3906, local10 + arg4, Static529.anInt9806);
						local86 = Static502.method6952(Static205.anInt3906, arg4 - local10, Static529.anInt9806);
						if (Static52.anInt1226 >= local69) {
							Static264.method4006(local77, arg0, local86, Static155.anIntArrayArray32[local69]);
						}
						if (Static133.anInt2531 <= local165) {
							Static264.method4006(local77, arg0, local86, Static155.anIntArrayArray32[local165]);
						}
					}
				}
			}
			local165 = arg1 - local10;
			local69 = arg1 + local10;
			if (Static133.anInt2531 <= local69 && Static52.anInt1226 >= local165) {
				local77 = arg4 + local32;
				local86 = arg4 - local32;
				if (local77 >= Static529.anInt9806 && local86 <= Static205.anInt3906) {
					local77 = Static502.method6952(Static205.anInt3906, local77, Static529.anInt9806);
					local86 = Static502.method6952(Static205.anInt3906, local86, Static529.anInt9806);
					if (local10 < local15) {
						local94 = local10 <= local37 ? local37 : Static528.anIntArray643[local10];
						local215 = Static502.method6952(Static205.anInt3906, arg4 + local94, Static529.anInt9806);
						local223 = Static502.method6952(Static205.anInt3906, arg4 - local94, Static529.anInt9806);
						if (local69 <= Static52.anInt1226) {
							local234 = Static155.anIntArrayArray32[local69];
							Static264.method4006(local223, arg0, local86, local234);
							Static264.method4006(local215, arg2, local223, local234);
							Static264.method4006(local77, arg0, local215, local234);
						}
						if (Static133.anInt2531 <= local165) {
							local234 = Static155.anIntArrayArray32[local165];
							Static264.method4006(local223, arg0, local86, local234);
							Static264.method4006(local215, arg2, local223, local234);
							Static264.method4006(local77, arg0, local215, local234);
						}
					} else {
						if (Static52.anInt1226 >= local69) {
							Static264.method4006(local77, arg0, local86, Static155.anIntArrayArray32[local69]);
						}
						if (local165 >= Static133.anInt2531) {
							Static264.method4006(local77, arg0, local86, Static155.anIntArrayArray32[local165]);
						}
					}
				}
			}
		}
	}
}
