import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "Lclient!bl;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "[Lclient!mk;")
	public static final Class228[] aClass228Array2 = new Class228[14];

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
	public static int anInt7517 = 0;

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
	public static int anInt7520 = 2;

	@OriginalMember(owner = "client!qfa", name = "J", descriptor = "F")
	public static float aFloat130 = 1024.0F;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)V")
	public static void method6566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class2_Sub7_Sub2 local11 = Static188.method3210(16, arg0);
		local11.method925();
		local11.anInt852 = arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[BILclient!tk;)Lclient!ap;")
	public static Class21 method6567(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class13_Sub3_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static386.anIntArray433, 0);
		if (Static386.anIntArray433[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class21(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static559.method7857(arg0);
		@Pc(8) int local8 = 0;
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg0;
		@Pc(25) int local25 = -arg0;
		@Pc(27) int local27 = local13;
		@Pc(30) int local30 = -local13;
		@Pc(37) int local37 = -1;
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (arg3 >= Static346.anInt5494 && arg3 <= Static640.anInt10333) {
			@Pc(51) int[] local51 = Static349.anIntArrayArray71[arg3];
			local59 = Static117.method5173(Static566.anInt9279, arg5 - arg0, Static392.anInt6753);
			local68 = Static117.method5173(Static566.anInt9279, arg5 + arg0, Static392.anInt6753);
			local77 = Static117.method5173(Static566.anInt9279, arg5 - local13, Static392.anInt6753);
			local86 = Static117.method5173(Static566.anInt9279, arg5 + local13, Static392.anInt6753);
			Static188.method3208(local77, arg4, local59, local51);
			Static188.method3208(local86, arg2, local77, local51);
			Static188.method3208(local68, arg4, local86, local51);
		}
		@Pc(106) int local106 = -1;
		while (local22 > local8) {
			local37 += 2;
			local106 += 2;
			local30 += local106;
			local25 += local37;
			if (local30 >= 0 && local27 >= 1) {
				local27--;
				Static299.anIntArray342[local27] = local8;
				local30 -= local27 << 1;
			}
			local8++;
			@Pc(195) int local195;
			@Pc(203) int local203;
			@Pc(210) int[] local210;
			@Pc(153) int local153;
			if (local25 >= 0) {
				local22--;
				local25 -= local22 << 1;
				local153 = arg3 - local22;
				local59 = arg3 + local22;
				if (local59 >= Static346.anInt5494 && Static640.anInt10333 >= local153) {
					if (local22 < local13) {
						local68 = Static299.anIntArray342[local22];
						local77 = Static117.method5173(Static566.anInt9279, arg5 + local8, Static392.anInt6753);
						local86 = Static117.method5173(Static566.anInt9279, arg5 - local8, Static392.anInt6753);
						local195 = Static117.method5173(Static566.anInt9279, arg5 + local68, Static392.anInt6753);
						local203 = Static117.method5173(Static566.anInt9279, arg5 - local68, Static392.anInt6753);
						if (local59 <= Static640.anInt10333) {
							local210 = Static349.anIntArrayArray71[local59];
							Static188.method3208(local203, arg4, local86, local210);
							Static188.method3208(local195, arg2, local203, local210);
							Static188.method3208(local77, arg4, local195, local210);
						}
						if (Static346.anInt5494 <= local153) {
							local210 = Static349.anIntArrayArray71[local153];
							Static188.method3208(local203, arg4, local86, local210);
							Static188.method3208(local195, arg2, local203, local210);
							Static188.method3208(local77, arg4, local195, local210);
						}
					} else {
						local68 = Static117.method5173(Static566.anInt9279, arg5 + local8, Static392.anInt6753);
						local77 = Static117.method5173(Static566.anInt9279, arg5 - local8, Static392.anInt6753);
						if (local59 <= Static640.anInt10333) {
							Static188.method3208(local68, arg4, local77, Static349.anIntArrayArray71[local59]);
						}
						if (local153 >= Static346.anInt5494) {
							Static188.method3208(local68, arg4, local77, Static349.anIntArrayArray71[local153]);
						}
					}
				}
			}
			local153 = arg3 - local8;
			local59 = arg3 + local8;
			if (local59 >= Static346.anInt5494 && Static640.anInt10333 >= local153) {
				local68 = local22 + arg5;
				local77 = arg5 - local22;
				if (local68 >= Static566.anInt9279 && local77 <= Static392.anInt6753) {
					local68 = Static117.method5173(Static566.anInt9279, local68, Static392.anInt6753);
					local77 = Static117.method5173(Static566.anInt9279, local77, Static392.anInt6753);
					if (local8 < local13) {
						local86 = local8 > local27 ? Static299.anIntArray342[local8] : local27;
						local195 = Static117.method5173(Static566.anInt9279, local86 + arg5, Static392.anInt6753);
						local203 = Static117.method5173(Static566.anInt9279, arg5 - local86, Static392.anInt6753);
						if (local59 <= Static640.anInt10333) {
							local210 = Static349.anIntArrayArray71[local59];
							Static188.method3208(local203, arg4, local77, local210);
							Static188.method3208(local195, arg2, local203, local210);
							Static188.method3208(local68, arg4, local195, local210);
						}
						if (Static346.anInt5494 <= local153) {
							local210 = Static349.anIntArrayArray71[local153];
							Static188.method3208(local203, arg4, local77, local210);
							Static188.method3208(local195, arg2, local203, local210);
							Static188.method3208(local68, arg4, local195, local210);
						}
					} else {
						if (Static640.anInt10333 >= local59) {
							Static188.method3208(local68, arg4, local77, Static349.anIntArrayArray71[local59]);
						}
						if (Static346.anInt5494 <= local153) {
							Static188.method3208(local68, arg4, local77, Static349.anIntArrayArray71[local153]);
						}
					}
				}
			}
		}
	}
}
