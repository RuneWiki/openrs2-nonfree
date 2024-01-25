import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "Lclient!m;")
	public static Class128 aClass128_7;

	@OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
	public static int anInt4598 = 0;

	@OriginalMember(owner = "client!saa", name = "z", descriptor = "Lclient!mf;")
	public static final Class184 aClass184_24 = new Class184();

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!tm;B[BI)Lclient!oi;")
	public static Class215 method4248(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static7.anIntArray17, 0);
		if (Static7.anIntArray17[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class215(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)I")
	public static int method4249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (local15 + arg0) / arg1 - local15;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([BBI)[B")
	public static byte[] method4250(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static556.method7044(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIBZII)V")
	public static void method4251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static44.anInt9296 = arg5;
		Static481.anInt6918 = arg4;
		Static241.anInt4647 = arg2;
		Static460.anInt7959 = arg0;
		Static154.anInt3014 = arg1;
		if (arg3 && Static44.anInt9296 >= 100) {
			Static46.anInt1256 = Static460.anInt7959 * 128 + 64;
			Static321.anInt6064 = Static241.anInt4647 * 128 + 64;
			Static276.anInt8653 = Static508.method7754(Static46.anInt1256, Static321.anInt6064, Static322.anInt6113) - Static481.anInt6918;
		}
		Static170.anInt3418 = 2;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)V")
	public static void method4252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1003) {
			Static173.method3216(Static376.aClass155_3, arg1, arg0);
		} else if (arg2 == 1006) {
			Static173.method3216(Static91.aClass155_25, arg1, arg0);
		} else if (arg2 == 1004) {
			Static173.method3216(Static521.aClass155_24, arg1, arg0);
		} else if (arg2 == 1001) {
			Static173.method3216(Static451.aClass155_23, arg1, arg0);
		} else if (arg2 == 1007) {
			Static173.method3216(Static297.aClass155_18, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III[BIZI)Z")
	public static boolean method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg0 % 8;
		@Pc(18) int local18;
		if (local14 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local14;
		}
		@Pc(34) int local34 = -((arg1 + 8 - 1) / 8);
		@Pc(43) int local43 = -((arg0 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local34; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg3[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local18;
			if (arg3[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg2;
		}
		return false;
	}
}
