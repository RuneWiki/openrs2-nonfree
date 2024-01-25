import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_127 = new Class337(4, 1);

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "[I")
	public static final int[] anIntArray401 = new int[4];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Z")
	public static boolean method6578(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIZ)[B")
	public static byte[] method6587(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static652.method4548(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)I")
	public static int method6588(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(161) int local161 = (int) (local62 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(187) int local187 = (int) (local68 * 256.0D);
		if (local187 < 0) {
			local187 = 0;
		} else if (local187 > 255) {
			local187 = 255;
		}
		if (local187 > 243) {
			local161 >>= 0x4;
		} else if (local187 > 217) {
			local161 >>= 0x3;
		} else if (local187 > 192) {
			local161 >>= 0x2;
		} else if (local187 > 179) {
			local161 >>= 0x1;
		}
		return ((local156 >> 2 & 0x3F) << 10) + (local161 >> 5 << 7) + (local187 >> 1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Lclient!rs;BI)Lclient!waa;")
	public static Class369 method6590(@OriginalArg(0) String arg0, @OriginalArg(1) Class133_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static48.anIntArray65, 0);
		if (Static48.anIntArray65[0] == 0) {
			if (Static48.anIntArray65[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static48.anIntArray65, 1);
			if (Static48.anIntArray65[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static48.anIntArray65[1]];
				OpenGL.glGetInfoLogARB(local6, Static48.anIntArray65[1], Static48.anIntArray65, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static48.anIntArray65[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class369(arg1, local6, arg2);
	}
}
