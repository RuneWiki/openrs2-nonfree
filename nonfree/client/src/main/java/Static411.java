import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Lclient!ri;")
	public static Class284 aClass284_117;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public static int anInt7378 = 0;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "[I")
	public static final int[] anIntArray419 = new int[4096];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!bea;[Lclient!dg;)Lclient!md;")
	public static Class200 method5767(@OriginalArg(1) Class31_Sub1_Sub1 arg0, @OriginalArg(2) Class67[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong40 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg1.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg1[local42].aLong40);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static191.anIntArray175, 0);
		if (Static191.anIntArray175[0] == 0) {
			if (Static191.anIntArray175[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static191.anIntArray175, 1);
			if (Static191.anIntArray175[1] > 1) {
				@Pc(100) byte[] local100 = new byte[Static191.anIntArray175[1]];
				OpenGL.glGetInfoLogARB(local40, Static191.anIntArray175[1], Static191.anIntArray175, 0, local100, 0);
				System.out.println(new String(local100));
			}
			if (Static191.anIntArray175[0] == 0) {
				for (@Pc(121) int local121 = 0; local121 < arg1.length; local121++) {
					OpenGL.glDetachObjectARB(local40, arg1[local121].aLong40);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class200(arg0, local40, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IC)B")
	public static byte method5771(@OriginalArg(1) char arg0) {
		@Pc(38) byte local38;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local38 = (byte) arg0;
		} else if (arg0 == '€') {
			local38 = -128;
		} else if (arg0 == '‚') {
			local38 = -126;
		} else if (arg0 == 'ƒ') {
			local38 = -125;
		} else if (arg0 == '„') {
			local38 = -124;
		} else if (arg0 == '…') {
			local38 = -123;
		} else if (arg0 == '†') {
			local38 = -122;
		} else if (arg0 == '‡') {
			local38 = -121;
		} else if (arg0 == 'ˆ') {
			local38 = -120;
		} else if (arg0 == '‰') {
			local38 = -119;
		} else if (arg0 == 'Š') {
			local38 = -118;
		} else if (arg0 == '‹') {
			local38 = -117;
		} else if (arg0 == 'Œ') {
			local38 = -116;
		} else if (arg0 == 'Ž') {
			local38 = -114;
		} else if (arg0 == '‘') {
			local38 = -111;
		} else if (arg0 == '’') {
			local38 = -110;
		} else if (arg0 == '“') {
			local38 = -109;
		} else if (arg0 == '”') {
			local38 = -108;
		} else if (arg0 == '•') {
			local38 = -107;
		} else if (arg0 == '–') {
			local38 = -106;
		} else if (arg0 == '—') {
			local38 = -105;
		} else if (arg0 == '˜') {
			local38 = -104;
		} else if (arg0 == '™') {
			local38 = -103;
		} else if (arg0 == 'š') {
			local38 = -102;
		} else if (arg0 == '›') {
			local38 = -101;
		} else if (arg0 == 'œ') {
			local38 = -100;
		} else if (arg0 == 'ž') {
			local38 = -98;
		} else if (arg0 == 'Ÿ') {
			local38 = -97;
		} else {
			local38 = 63;
		}
		return local38;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)I")
	public static int method5772(@OriginalArg(1) int arg0) {
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
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local75 < 0.5D) {
				local69 = (local46 - local32) / (local32 + local46);
			}
			if (local75 >= 0.5D) {
				local69 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local67 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local67 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local67 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local67 /= 6.0D;
		@Pc(162) int local162 = (int) (local67 * 256.0D);
		@Pc(167) int local167 = (int) (local69 * 256.0D);
		@Pc(172) int local172 = (int) (local75 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local172 > 243) {
			local167 >>= 0x4;
		} else if (local172 > 217) {
			local167 >>= 0x3;
		} else if (local172 > 192) {
			local167 >>= 0x2;
		} else if (local172 > 179) {
			local167 >>= 0x1;
		}
		return (local172 >> 1) + ((local162 >> 2 & 0x3F) << 10) + (local167 >> 5 << 7);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	public static void method5773() throws IOException {
		if (Static451.aClass223_6 == null || Static303.anInt5651 <= 0) {
			return;
		}
		@Pc(10) int local10 = 0;
		while (true) {
			@Pc(15) Class3_Sub10 local15 = (Class3_Sub10) Static566.aClass244_69.method5572();
			if (local15 == null) {
				Static171.anInt3775 = 0;
				Static266.anInt5089 += local10;
				break;
			}
			Static451.aClass223_6.method5109(local15.aClass3_Sub26_Sub1_1.aByteArray213, local15.anInt2129);
			Static303.anInt5651 -= local15.anInt2129;
			local10 += local15.anInt2129;
			local15.method8128();
			local15.aClass3_Sub26_Sub1_1.method6818();
			local15.method1851();
		}
	}
}
