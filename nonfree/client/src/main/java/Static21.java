import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!of;")
	public static final Class174 aClass174_216 = new Class174("M", "M", "M", "M");

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!of;")
	public static final Class174 aClass174_217 = new Class174("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
	public static final int[] anIntArray511 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Z")
	public static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6249(@OriginalArg(1) String arg0) {
		@Pc(17) int local17 = arg0.length();
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 <= '\u007f') {
				local19++;
			} else if (local27 <= '\u07ff') {
				local19 += 2;
			} else {
				local19 += 3;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)Z")
	public static boolean method6250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static240.method5191(arg0, arg1) & Static138.method2124(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ou;I)V")
	public static void method6251(@OriginalArg(0) Class23_Sub5 arg0) {
		arg0.aClass1_1 = null;
		@Pc(12) int local12 = arg0.aClass23_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass23_Sub6Array1[local14].aBoolean442 = false;
		}
		@Pc(28) Class194[] local28 = Class23.aClass194Array12;
		synchronized (Class23.aClass194Array12) {
			if (local12 < Class23.aClass194Array12.length && Static112.anIntArray98[local12] < 200) {
				Class23.aClass194Array12[local12].method4582(arg0);
				@Pc(55) int local55 = Static112.anIntArray98[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)Lclient!nv;")
	public static Class170 method6253() {
		try {
			return (Class170) Class.forName("Class170_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method6254() {
		Static368.aClass268_52.method6160();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIILclient!qa;BLclient!vr;IIIIIILclient!ka;)Lclient!ka;")
	public static Class108 method6255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class167 arg5, @OriginalArg(7) Class261 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class108 arg13) {
		if (arg13 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg6 != null) {
			local11 = arg6.method6051(-1, false, arg1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg2 << 48) + ((long) arg4 << 32) + (long) ((arg9 << 24) + arg12 + (arg8 << 16));
		@Pc(49) Class268 local49 = Static232.aClass268_33;
		@Pc(57) Class108 local57;
		synchronized (Static232.aClass268_33) {
			local57 = (Class108) Static232.aClass268_33.method6166(local47);
		}
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(166) int local166;
		@Pc(170) int local170;
		if (local57 == null || arg5.method6006(local57.ma(), local11) != 0) {
			if (local57 != null) {
				local11 = arg5.method5967(local11, local57.ma());
			}
			@Pc(92) byte local92;
			if (arg12 == 1) {
				local92 = 9;
			} else if (arg12 == 2) {
				local92 = 12;
			} else if (arg12 == 3) {
				local92 = 15;
			} else if (arg12 == 4) {
				local92 = 18;
			} else {
				local92 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class160 local147 = new Class160(local92 * 3 + 1, local92 * 3 * 2 + -local92, 0);
			local154 = local147.method3781(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local92];
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (local160 = 0; local160 < 3; local160++) {
				local166 = local129[local160];
				local170 = local129[local160];
				for (local172 = 0; local172 < local92; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local92;
					@Pc(188) int local188 = Class65.anIntArray88[local180] * local166 >> 15;
					local196 = local170 * Class65.anIntArray87[local180] >> 15;
					local158[local160][local172] = local147.method3781(local188, local196, 0);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(247) byte local247 = (byte) (arg8 * local172 + arg9 * local170 >> 8);
				@Pc(292) short local292 = (short) (((arg4 & 0x380) * local172 + (arg2 & 0x380) * local170 & 0x38000) + ((arg2 & 0xFC00) * local170 + local172 * (arg4 & 0xFC00) & 0xFC0000) + ((arg2 & 0x7F) * local170 + (arg4 & 0x7F) * local172 & 0x7F00) >> 8);
				for (local196 = 0; local196 < local92; local196++) {
					if (local166 == 0) {
						local147.method3779((byte) -1, local158[0][local196], local154, local247, local292, (short) -1, (byte) 1, local158[0][(local196 + 1) % local92]);
					} else {
						local147.method3779((byte) -1, local158[local166][(local196 + 1) % local92], local158[local166 - 1][local196], local247, local292, (short) -1, (byte) 1, local158[local166 - 1][(local196 + 1) % local92]);
						local147.method3779((byte) -1, local158[local166][local196], local158[local166 - 1][local196], local247, local292, (short) -1, (byte) 1, local158[local166][(local196 + 1) % local92]);
					}
				}
			}
			local57 = arg5.method5984(local147, local11, Static214.anInt3717, 64, 768);
			@Pc(419) Class268 local419 = Static232.aClass268_33;
			synchronized (Static232.aClass268_33) {
				Static232.aClass268_33.method6164(local57, local47);
			}
		}
		@Pc(438) int local438 = (arg12 << 6) - 1;
		@Pc(441) int local441 = -local438;
		@Pc(444) int local444 = -local438;
		@Pc(446) int local446 = local438;
		local154 = local438;
		if (arg11 != 0) {
			if ((arg11 & 0x4) != 0) {
				local446 = local438 + 128;
			}
			if ((arg11 & 0x8) != 0) {
				local441 -= 128;
			}
			if ((arg11 & 0x2) != 0) {
				local444 -= 128;
			}
			if ((arg11 & 0x1) != 0) {
				local154 = local438 + 128;
			}
		}
		@Pc(485) int local485 = arg13.da();
		local160 = arg13.J();
		local166 = arg13.K();
		if (local444 > local166) {
			local166 = local444;
		}
		if (local160 > local446) {
			local160 = local446;
		}
		local170 = arg13.ia();
		if (local485 < local441) {
			local485 = local441;
		}
		if (local170 > local154) {
			local170 = local154;
		}
		@Pc(534) Class3_Sub3_Sub17 local534 = null;
		if (arg6 != null) {
			@Pc(541) int local541 = arg6.anIntArray494[arg1];
			local534 = Static444.aClass59_3.method1548(local541 >> 16);
			arg1 = local541 & 0xFFFF;
		}
		if (local534 == null) {
			local57 = local57.method4930((byte) 3, local11, true);
			local57.Z(local160 - local485 >> 1, 128, local170 - local166 >> 1);
			local57.R(local485 + local160 >> 1, 0, local170 + local166 >> 1);
		} else {
			local57 = local57.method4930((byte) 3, local11, true);
			local57.Z(local160 - local485 >> 1, 128, local170 - local166 >> 1);
			local57.R(local485 + local160 >> 1, 0, local170 + local166 >> 1);
			local57.method4932(arg1, local534);
		}
		if (arg10 != 0) {
			local57.E(arg10);
		}
		if (arg7 != 0) {
			local57.S(arg7);
		}
		if (arg3 != 0) {
			local57.R(0, arg3, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;Lclient!nq;IB)Lclient!pb;")
	public static Class184 method6257(@OriginalArg(0) String arg0, @OriginalArg(1) Class167_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static413.anIntArray439, 0);
		if (Static413.anIntArray439[0] == 0) {
			if (Static413.anIntArray439[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static413.anIntArray439, 1);
			if (Static413.anIntArray439[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static413.anIntArray439[1]];
				OpenGL.glGetInfoLogARB(local6, Static413.anIntArray439[1], Static413.anIntArray439, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static413.anIntArray439[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class184(arg1, local6, arg2);
	}
}
