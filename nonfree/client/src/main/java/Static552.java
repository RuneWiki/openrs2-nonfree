import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "F")
	public static float aFloat176 = 1024.0F;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIZIIIII)Z")
	public static boolean method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0];
		@Pc(13) int local13 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0];
		if (local8 < 0 || local8 >= Static326.anInt5541 || local13 < 0 || local13 >= Static448.anInt7637) {
			return false;
		} else if (arg0 >= 0 && arg0 < Static326.anInt5541 && arg6 >= 0 && Static448.anInt7637 > arg6) {
			@Pc(86) int local86 = Static426.method6544(local8, arg6, arg1, local13, arg2, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018(), arg7, arg0, Static322.aClass352Array1[Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132], Static535.anIntArray503, arg5, Static53.anIntArray72, arg4, arg3);
			if (local86 < 1) {
				return false;
			}
			Static511.anInt8845 = Static535.anIntArray503[local86 - 1];
			Static16.anInt249 = Static53.anIntArray72[local86 - 1];
			Static302.aBoolean387 = false;
			Static608.method8682();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!fc;Ljava/awt/Component;III)Lclient!en;")
	public static Class93 method8052(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static491.anInt8290 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class93 local36 = (Class93) Class.forName("Class93_Sub1").getDeclaredConstructor().newInstance();
			local36.anInt7209 = arg3;
			local36.anIntArray382 = new int[(Static21.aBoolean12 ? 2 : 1) * 256];
			local36.method6362(arg1);
			local36.anInt7206 = (arg3 & 0xFFFFFC00) + 1024;
			if (local36.anInt7206 > 16384) {
				local36.anInt7206 = 16384;
			}
			local36.method6371(local36.anInt7206);
			if (Static227.anInt3909 > 0 && Static256.aClass69_1 == null) {
				Static256.aClass69_1 = new Class69();
				Static256.aClass69_1.aClass100_3 = arg0;
				arg0.method2095(Static256.aClass69_1, Static227.anInt3909);
			}
			if (Static256.aClass69_1 != null) {
				if (Static256.aClass69_1.aClass93Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static256.aClass69_1.aClass93Array1[arg2] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class93_Sub2 local117 = new Class93_Sub2(arg0, arg2);
				local117.anInt7209 = arg3;
				local117.anIntArray382 = new int[(Static21.aBoolean12 ? 2 : 1) * 256];
				local117.method6362(arg1);
				local117.anInt7206 = 16384;
				local117.method6371(local117.anInt7206);
				if (Static227.anInt3909 > 0 && Static256.aClass69_1 == null) {
					Static256.aClass69_1 = new Class69();
					Static256.aClass69_1.aClass100_3 = arg0;
					arg0.method2095(Static256.aClass69_1, Static227.anInt3909);
				}
				if (Static256.aClass69_1 != null) {
					if (Static256.aClass69_1.aClass93Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static256.aClass69_1.aClass93Array1[arg2] = local117;
				}
				return local117;
			} catch (@Pc(193) Throwable local193) {
				return new Class93();
			}
		}
	}
}
