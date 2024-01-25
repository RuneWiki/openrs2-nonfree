import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public static int anInt5964;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "F")
	public static float aFloat135;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public static int anInt5970;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Lclient!ek;")
	public static Class85 aClass85_6;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public static int anInt5975 = -1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;Lclient!pea;Z)Lclient!vl;")
	public static Class335 method5101(@OriginalArg(1) String arg0, @OriginalArg(2) Class121_Sub3 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static383.anIntArray557, 0);
		if (Static383.anIntArray557[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class335(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIILclient!uca;)V")
	public static void method5102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class313 arg3) {
		for (@Pc(10) Class6_Sub22 local10 = (Class6_Sub22) Static429.aClass275_156.method6366(); local10 != null; local10 = (Class6_Sub22) Static429.aClass275_156.method6364()) {
			if (local10.anInt3159 == arg0 && local10.anInt3147 == arg1 << 9 && arg2 << 9 == local10.anInt3157 && arg3.anInt8480 == local10.aClass313_1.anInt8480) {
				if (local10.aClass6_Sub19_Sub2_2 != null) {
					Static144.aClass6_Sub19_Sub3_2.method6424(local10.aClass6_Sub19_Sub2_2);
					local10.aClass6_Sub19_Sub2_2 = null;
				}
				if (local10.aClass6_Sub19_Sub2_1 != null) {
					Static144.aClass6_Sub19_Sub3_2.method6424(local10.aClass6_Sub19_Sub2_1);
					local10.aClass6_Sub19_Sub2_1 = null;
				}
				local10.method7849();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method5111(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static165.anInt3019;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class347 local22 = Static322.aClass180_1.method3991(arg0[local13]);
			if (local22.anInt9606 != -1) {
				@Pc(35) Class4 local35 = (Class4) Static377.aClass332_157.method7502((long) local22.anInt9606);
				if (local35 == null) {
					@Pc(43) Class196 local43 = Static589.method4745(Static447.aClass251_141, local22.anInt9606, 0);
					if (local43 != null) {
						local35 = Static176.aClass121_5.method7157(local43);
						Static377.aClass332_157.method7498((long) local22.anInt9606, local35);
					}
				}
				if (local35 != null) {
					Static156.aClass4Array5[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JIIIZ)Ljava/lang/String;")
	public static String method5112(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg0 < 0L) {
			local24 = true;
			arg0 = -arg0;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(42) int local42;
		@Pc(47) int local47;
		if (arg2 > 0) {
			for (local42 = 0; local42 < arg2; local42++) {
				local47 = (int) arg0;
				arg0 /= 10L;
				local38.append((char) (local47 + 48 - (int) arg0 * 10));
			}
			local38.append(local7);
		}
		local42 = 0;
		while (true) {
			local47 = (int) arg0;
			arg0 /= 10L;
			local38.append((char) (local47 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local24) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg3) {
				local42++;
				if (local42 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}
}
