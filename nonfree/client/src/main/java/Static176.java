import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
	public static int anInt3420;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_22 = new Class102(8);

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	public static int anInt3422 = -1;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
	public static int anInt3424 = -1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!hga;Ljava/awt/Component;BI)Lclient!mda;")
	public static Class188 method3076(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3) {
		if (Static276.anInt4980 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(42) Class188 local42 = (Class188) Class.forName("Class188_Sub2").getDeclaredConstructor().newInstance();
			local42.anIntArray571 = new int[(Static447.aBoolean556 ? 2 : 1) * 256];
			local42.anInt9049 = arg3;
			local42.method7769(arg2);
			local42.anInt9043 = (arg3 & -1024) + 1024;
			if (local42.anInt9043 > 16384) {
				local42.anInt9043 = 16384;
			}
			local42.method7759(local42.anInt9043);
			if (Static197.anInt3857 > 0 && Static284.aClass273_1 == null) {
				Static284.aClass273_1 = new Class273();
				Static284.aClass273_1.aClass138_4 = arg1;
				arg1.method3577(Static197.anInt3857, Static284.aClass273_1);
			}
			if (Static284.aClass273_1 != null) {
				if (Static284.aClass273_1.aClass188Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static284.aClass273_1.aClass188Array1[arg0] = local42;
			}
			return local42;
		} catch (@Pc(114) Throwable local114) {
			try {
				@Pc(120) Class188_Sub1 local120 = new Class188_Sub1(arg1, arg0);
				local120.anIntArray571 = new int[(Static447.aBoolean556 ? 2 : 1) * 256];
				local120.anInt9049 = arg3;
				local120.method7769(arg2);
				local120.anInt9043 = 16384;
				local120.method7759(local120.anInt9043);
				if (Static197.anInt3857 > 0 && Static284.aClass273_1 == null) {
					Static284.aClass273_1 = new Class273();
					Static284.aClass273_1.aClass138_4 = arg1;
					arg1.method3577(Static197.anInt3857, Static284.aClass273_1);
				}
				if (Static284.aClass273_1 != null) {
					if (Static284.aClass273_1.aClass188Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static284.aClass273_1.aClass188Array1[arg0] = local120;
				}
				return local120;
			} catch (@Pc(182) Throwable local182) {
				return new Class188();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B)[B")
	public static byte[] method3077(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(12) byte[] local12 = new byte[arg0];
		Static653.method6858(arg1, 0, local12, 0, arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B)V")
	public static void method3078(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class3_Sub3 local18 = new Class3_Sub3(arg0);
		while (true) {
			@Pc(22) int local22;
			@Pc(50) int local50;
			@Pc(45) int local45;
			label45: do {
				while (true) {
					while (true) {
						local22 = local18.method4225();
						if (local22 == 0) {
							return;
						}
						if (local22 == 1) {
							@Pc(110) int[] local110 = Static274.anIntArray262 = new int[6];
							local110[0] = local18.method4221();
							local110[1] = local18.method4221();
							local110[2] = local18.method4221();
							local110[3] = local18.method4221();
							local110[4] = local18.method4221();
							local110[5] = local18.method4221();
						} else {
							if (local22 != 4) {
								continue label45;
							}
							local45 = local18.method4225();
							Static435.anIntArray479 = new int[local45];
							for (local50 = 0; local50 < local45; local50++) {
								Static435.anIntArray479[local50] = local18.method4221();
								if (Static435.anIntArray479[local50] == 65535) {
									Static435.anIntArray479[local50] = -1;
								}
							}
						}
					}
				}
			} while (local22 != 5);
			local45 = local18.method4225();
			Static449.anIntArray497 = new int[local45];
			for (local50 = 0; local50 < local45; local50++) {
				Static449.anIntArray497[local50] = local18.method4221();
				if (Static449.anIntArray497[local50] == 65535) {
					Static449.anIntArray497[local50] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	public static void method3079(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static597.aClass280_45.method7107((long) arg0);
		if (local15 != null) {
			local15.aClass119_Sub1_1.method3526();
			Static618.method8554(local15.anInt3577, local15.aBoolean231);
			local15.method8769();
		}
	}
}
