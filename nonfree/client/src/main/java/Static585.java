import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_142 = new Class289(40, 4);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method8093(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static96.anInt1739; local18++) {
			if (arg0.equalsIgnoreCase(Static480.aStringArray50[local18])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I")
	public static int method8094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static115.anInt2066 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static528.anInt5361;
		@Pc(25) int local25 = arg0 - Static528.anInt5366;
		for (@Pc(32) Class6_Sub24 local32 = (Class6_Sub24) Static528.aClass362_26.method8538(); local32 != null; local32 = (Class6_Sub24) Static528.aClass362_26.method8530()) {
			if (arg1 == local32.anInt3909) {
				@Pc(45) int local45 = local32.anInt3903;
				@Pc(48) int local48 = local32.anInt3910;
				@Pc(58) int local58 = Static528.anInt5361 + local45 << 14 | Static528.anInt5366 + local48;
				@Pc(77) int local77 = (local25 - local48) * (-local48 + local25) + (local21 - local45) * (local21 - local45);
				if (local14 < 0 || local77 < local16) {
					local14 = local58;
					local16 = local77;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	public static void method8095() {
		if (Static402.aClass103_6 == null) {
			return;
		}
		if (Static402.aClass103_6.anInt2541 == 1) {
			Static402.aClass103_6 = null;
			return;
		}
		if (Static402.aClass103_6.anInt2541 == 2) {
			Static645.method8801(Static500.aClass380_5, Static3.aString18, 2);
			Static402.aClass103_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!gga;I)Lclient!uba;")
	public static Class6_Sub1 method8097(@OriginalArg(0) Class6_Sub23 arg0) {
		arg0.method8374();
		@Pc(13) int local13 = arg0.method8374();
		@Pc(17) Class6_Sub1 local17 = Static432.method6401(local13);
		local17.anInt10563 = arg0.method8374();
		@Pc(28) int local28 = arg0.method8374();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(36) int local36 = arg0.method8374();
			local17.method8962(arg0, local36);
		}
		local17.method8964();
		return local17;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Lclient!su;Lclient!oaa;)Lclient!pt;")
	public static Class276 method8099(@OriginalArg(1) Class327[] arg0, @OriginalArg(2) Class132_Sub1_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong265 <= 0L) {
				return null;
			}
		}
		@Pc(38) long local38 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
			OpenGL.glAttachObjectARB(local38, arg0[local40].aLong265);
		}
		OpenGL.glLinkProgramARB(local38);
		OpenGL.glGetObjectParameterivARB(local38, 35714, Static505.anIntArray555, 0);
		if (Static505.anIntArray555[0] == 0) {
			if (Static505.anIntArray555[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local38, 35716, Static505.anIntArray555, 1);
			if (Static505.anIntArray555[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static505.anIntArray555[1]];
				OpenGL.glGetInfoLogARB(local38, Static505.anIntArray555[1], Static505.anIntArray555, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static505.anIntArray555[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local38, arg0[local113].aLong265);
				}
				OpenGL.glDeleteObjectARB(local38);
				return null;
			}
		}
		return new Class276(arg1, local38, arg0);
	}
}
