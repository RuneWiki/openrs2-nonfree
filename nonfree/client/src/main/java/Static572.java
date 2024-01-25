import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!in;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "D")
	public static double aDouble31;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([[BILclient!pj;)V")
	public static void method7698(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class137_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg0.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg0[local21];
			if (local27 != null) {
				@Pc(34) Class5_Sub36 local34 = new Class5_Sub36(local27);
				local40 = Static75.anIntArray68[local21] >> 8;
				@Pc(46) int local46 = Static75.anIntArray68[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static315.anInt5380;
				@Pc(59) int local59 = local46 * 64 - Static290.anInt5128;
				Static455.method6423();
				arg1.method6450(Static553.aClass169Array1, local59, local34, Static290.anInt5128, Static315.anInt5380, local53);
				arg1.method6469(local53, local34, local16, Static273.aClass100_6, local59);
				if (!arg1.aBoolean505 && Static549.anInt8709 / 8 == local40 && local46 == Static228.anInt3937 / 8 && local16[0] != -1) {
					aClass173_1 = Static635.aClass356_1.method8133(local16[0], Static332.aClass161_1, local16[1], local16[2], local16[3]);
					Static443.anInt7298 = local16[4];
				}
			}
		}
		for (@Pc(144) int local144 = 0; local144 < local19; local144++) {
			@Pc(157) int local157 = (Static75.anIntArray68[local144] >> 8) * 64 - Static315.anInt5380;
			local40 = (Static75.anIntArray68[local144] & 0xFF) * 64 - Static290.anInt5128;
			@Pc(172) byte[] local172 = arg0[local144];
			if (local172 == null && Static228.anInt3937 < 800) {
				Static455.method6423();
				arg1.method6456(local157, local40);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!tia;[Lclient!taa;B)Lclient!qs;")
	public static Class307 method7700(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class342[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong263 <= 0L) {
				return null;
			}
		}
		@Pc(37) long local37 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(39) int local39 = 0; local39 < arg1.length; local39++) {
			OpenGL.glAttachObjectARB(local37, arg1[local39].aLong263);
		}
		OpenGL.glLinkProgramARB(local37);
		if (116 <= 37) {
			aDouble31 = 2.882757309275916D;
		}
		OpenGL.glGetObjectParameterivARB(local37, 35714, Static477.anIntArray452, 0);
		if (Static477.anIntArray452[0] == 0) {
			if (Static477.anIntArray452[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local37, 35716, Static477.anIntArray452, 1);
			if (Static477.anIntArray452[1] > 1) {
				@Pc(110) byte[] local110 = new byte[Static477.anIntArray452[1]];
				OpenGL.glGetInfoLogARB(local37, Static477.anIntArray452[1], Static477.anIntArray452, 0, local110, 0);
				System.out.println(new String(local110));
			}
			if (Static477.anIntArray452[0] == 0) {
				for (@Pc(131) int local131 = 0; local131 < arg1.length; local131++) {
					OpenGL.glDetachObjectARB(local37, arg1[local131].aLong263);
				}
				OpenGL.glDeleteObjectARB(local37);
				return null;
			}
		}
		return new Class307(arg0, local37, arg1);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method7701(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method7702() {
		return Static490.aBoolean536 || Static396.aClass5_Sub1_Sub13_2 == null ? "" : Static396.aClass5_Sub1_Sub13_2.aString75;
	}
}
