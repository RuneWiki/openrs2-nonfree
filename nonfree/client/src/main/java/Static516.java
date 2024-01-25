import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
	public static int anInt8715;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BI)V")
	public static void method7516(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static304.anInt8391 - Static143.anInt2901;
		if (local8 >= 100) {
			Static189.anInt3565 = -1;
			Static68.anInt1361 = -1;
			Static471.anInt8064 = 1;
			return;
		}
		@Pc(21) int local21 = (int) Static509.aFloat152;
		if (Static208.anInt3810 >> 8 > local21) {
			local21 = Static208.anInt3810 >> 8;
		}
		if (Static186.aBooleanArray12[4] && local21 < Static198.anIntArray409[4] + 128) {
			local21 = Static198.anIntArray409[4] + 128;
		}
		@Pc(62) int local62 = Static138.anInt2852 + (int) Static170.aFloat71 & 0x3FFF;
		Static234.method3999(Static454.anInt7698, local21, Static594.method8211(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158, Static65.anInt1298) - 200, (local21 >> 3) * 3 + 600 << 2, Static94.anInt1851, local62, arg0);
		@Pc(109) float local109 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static13.anInt232 = (int) ((float) Static193.anInt10281 + (float) (Static13.anInt232 - Static193.anInt10281) * local109);
		Static253.anInt4961 = (int) ((float) Static281.anInt5391 + local109 * (float) (Static253.anInt4961 - Static281.anInt5391));
		Static419.anInt7345 = (int) ((float) Static424.anInt7711 + (float) (Static419.anInt7345 - Static424.anInt7711) * local109);
		Static522.anInt8849 = (int) ((float) Static471.anInt8066 + (float) (Static522.anInt8849 - Static471.anInt8066) * local109);
		@Pc(167) int local167 = Static35.anInt545 - Static346.anInt6385;
		if (local167 > 8192) {
			local167 -= 16384;
		} else if (local167 < -8192) {
			local167 += 16384;
		}
		Static35.anInt545 = (int) (local109 * (float) local167 + (float) Static346.anInt6385);
		Static35.anInt545 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lclient!ie;Lclient!dw;B)Lclient!cba;")
	public static Class42 method7517(@OriginalArg(0) Class158[] arg0, @OriginalArg(1) Class82_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] == null || arg0[local12].aLong120 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg0[local36].aLong120);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static156.anIntArray200, 0);
		if (Static156.anIntArray200[0] == 0) {
			if (Static156.anIntArray200[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static156.anIntArray200, 1);
			if (Static156.anIntArray200[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static156.anIntArray200[1]];
				OpenGL.glGetInfoLogARB(local34, Static156.anIntArray200[1], Static156.anIntArray200, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static156.anIntArray200[0] == 0) {
				for (@Pc(116) int local116 = 0; local116 < arg0.length; local116++) {
					OpenGL.glDetachObjectARB(local34, arg0[local116].aLong120);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class42(arg1, local34, arg0);
	}
}
