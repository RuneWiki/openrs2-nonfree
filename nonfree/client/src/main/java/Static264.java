import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array14;

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "Lclient!rk;")
	public static Class180 aClass180_71;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "S")
	public static short aShort68 = 256;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
	public static boolean method4436(@OriginalArg(1) int arg0) {
		if (Static57.aBooleanArray11[arg0]) {
			return true;
		} else if (Static85.aClass180_22.method4572(arg0)) {
			@Pc(23) int local23 = Static85.aClass180_22.method4553(arg0);
			if (local23 == 0) {
				Static57.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static298.aClass26ArrayArray1[arg0] == null) {
				Static298.aClass26ArrayArray1[arg0] = new Class26[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static298.aClass26ArrayArray1[arg0][local50] == null) {
					@Pc(63) byte[] local63 = Static85.aClass180_22.method4560(local50, arg0);
					if (local63 != null) {
						@Pc(75) Class26 local75 = Static298.aClass26ArrayArray1[arg0][local50] = new Class26();
						local75.anInt492 = local50 + (arg0 << 16);
						if (local63[0] == -1) {
							local75.method434(new Class7_Sub3(local63));
						} else {
							local75.method433(new Class7_Sub3(local63));
						}
					}
				}
			}
			Static57.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!rk;Lclient!pe;I)V")
	public static void method4437(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class89 arg1) {
		@Pc(8) Class56[] local8 = Static358.method1303(arg0, Static223.anInt4458);
		Static143.aClass52Array11 = new Class52[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static143.aClass52Array11[local14] = arg1.method5411(local8[local14]);
		}
		local8 = Static358.method1303(arg0, Static185.anInt3759);
		Static245.aClass52Array13 = new Class52[local8.length];
		for (@Pc(45) int local45 = 0; local45 < local8.length; local45++) {
			Static245.aClass52Array13[local45] = arg1.method5411(local8[local45]);
		}
		local8 = Static358.method1303(arg0, Static144.anInt3127);
		Static130.aClass52Array7 = new Class52[local8.length];
		for (@Pc(75) int local75 = 0; local75 < local8.length; local75++) {
			Static130.aClass52Array7[local75] = arg1.method5411(local8[local75]);
		}
		local8 = Static358.method1303(arg0, Static171.anInt3545);
		Static86.aClass52Array5 = new Class52[local8.length];
		for (@Pc(105) int local105 = 0; local105 < local8.length; local105++) {
			Static86.aClass52Array5[local105] = arg1.method5411(local8[local105]);
		}
		local8 = Static358.method1303(arg0, Static206.anInt4122);
		Static139.aClass52Array8 = new Class52[local8.length];
		for (@Pc(131) int local131 = 0; local131 < local8.length; local131++) {
			Static139.aClass52Array8[local131] = arg1.method5411(local8[local131]);
		}
		local8 = Static358.method1303(arg0, Static8.anInt156);
		Static14.aClass52Array2 = new Class52[local8.length];
		for (@Pc(157) int local157 = 0; local157 < local8.length; local157++) {
			Static14.aClass52Array2[local157] = arg1.method5411(local8[local157]);
		}
		local8 = Static358.method1303(arg0, Static338.anInt6370);
		Static35.aClass52Array3 = new Class52[local8.length];
		for (@Pc(183) int local183 = 0; local183 < local8.length; local183++) {
			Static35.aClass52Array3[local183] = arg1.method5411(local8[local183]);
		}
		local8 = Static358.method1303(arg0, Static131.anInt2851);
		Static350.aClass52Array16 = new Class52[local8.length];
		for (@Pc(213) int local213 = 0; local213 < local8.length; local213++) {
			Static350.aClass52Array16[local213] = arg1.method5411(local8[local213]);
		}
		local8 = Static358.method1303(arg0, Static201.anInt4175);
		Static44.aClass52Array4 = new Class52[local8.length];
		for (@Pc(243) int local243 = 0; local243 < local8.length; local243++) {
			Static44.aClass52Array4[local243] = arg1.method5411(local8[local243]);
		}
		local8 = Static358.method1303(arg0, Static242.anInt3401);
		Static313.aClass52Array15 = new Class52[local8.length];
		for (@Pc(273) int local273 = 0; local273 < local8.length; local273++) {
			Static313.aClass52Array15[local273] = arg1.method5411(local8[local273]);
		}
		local8 = Static358.method1303(arg0, Static303.anInt5804);
		aClass52Array14 = new Class52[local8.length];
		for (@Pc(303) int local303 = 0; local303 < local8.length; local303++) {
			aClass52Array14[local303] = arg1.method5411(local8[local303]);
		}
		local8 = Static358.method1303(arg0, Static218.anInt4349);
		Static160.aClass52Array10 = new Class52[local8.length];
		for (@Pc(329) int local329 = 0; local329 < local8.length; local329++) {
			Static160.aClass52Array10[local329] = arg1.method5411(local8[local329]);
		}
		local8 = Static358.method1303(arg0, Static43.anInt1147);
		Static102.aClass52Array6 = new Class52[local8.length];
		for (@Pc(359) int local359 = 0; local359 < local8.length; local359++) {
			Static102.aClass52Array6[local359] = arg1.method5411(local8[local359]);
		}
		Static294.aClass52_30 = arg1.method5411(Static358.method1307(arg0, Static241.anInt4754, 0));
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
	public static void method4441(@OriginalArg(0) int arg0) {
		@Pc(15) Class7_Sub1_Sub15 local15 = Static315.method5104(7, arg0);
		local15.method4788();
	}
}
