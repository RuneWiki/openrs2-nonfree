import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_67 = new Class231("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_68 = new Class231(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
	public static int anInt3748 = 999999;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!ta;Z)I")
	public static int method3338(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		if (arg0.anInt6679 == 0) {
			return 0;
		}
		@Pc(55) int local55;
		@Pc(62) int local62;
		if (arg0.anInt6690 != -1) {
			@Pc(23) Class3_Sub3_Sub6 local23 = null;
			if (arg0.anInt6690 < 32768) {
				local23 = Static450.aClass3_Sub3_Sub6_Sub2Array1[arg0.anInt6690];
			} else if (arg0.anInt6690 >= 32768) {
				local23 = Static355.aClass3_Sub3_Sub6_Sub1Array1[arg0.anInt6690 - 32768];
			}
			if (local23 != null) {
				local55 = arg0.anInt6675 - local23.anInt6675;
				local62 = arg0.anInt6677 - local23.anInt6677;
				if (local55 != 0 || local62 != 0) {
					arg0.method5516((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class3_Sub3_Sub6_Sub1) {
			@Pc(91) Class3_Sub3_Sub6_Sub1 local91 = (Class3_Sub3_Sub6_Sub1) arg0;
			if (local91.anInt5530 != -1 && (local91.anInt6756 == 0 || local91.anInt6757 > 0)) {
				local91.method5516(local91.anInt5530);
				local91.anInt5530 = -1;
			}
		} else if (arg0 instanceof Class3_Sub3_Sub6_Sub2) {
			@Pc(121) Class3_Sub3_Sub6_Sub2 local121 = (Class3_Sub3_Sub6_Sub2) arg0;
			if (local121.anInt6760 != -1 && (local121.anInt6756 == 0 || local121.anInt6757 > 0)) {
				local55 = local121.anInt6675 - (local121.anInt6760 - Static206.anInt3592 - Static206.anInt3592) * 64;
				local62 = local121.anInt6677 - (local121.anInt6761 - Static99.anInt1814 - Static99.anInt1814) * 64;
				if (local55 != 0 || local62 != 0) {
					local121.method5516((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local121.anInt6760 = -1;
			}
		}
		return arg0.method5517();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(FIIFIFIFFILclient!gg;)[B")
	public static byte[] method3342(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) Class95 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static279.method4215(arg1, arg4, arg3, 0, arg0, arg5, arg2, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZIIIII)V")
	public static void method3343(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(19) int local19 = arg4 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(45) int local45 = Static6.aShort2 + local19 * (Static303.aShort68 - Static6.aShort2) / 100;
		if (Static313.aShort69 > local45) {
			local45 = Static313.aShort69;
		} else if (local45 > Static89.aShort11) {
			local45 = Static89.aShort11;
		}
		@Pc(71) int local71 = arg4 * 512 * local45 / (arg1 * 334);
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(80) short local80;
		if (Static136.aShort42 > local71) {
			local80 = Static136.aShort42;
			local45 = local80 * 334 * arg1 / (arg4 * 512);
			if (local45 > Static89.aShort11) {
				local45 = Static89.aShort11;
				local109 = local45 * 512 * arg4 / (local80 * 334);
				local115 = (arg1 - local109) / 2;
				if (arg0) {
					Static44.aClass28_14.method3554();
					Static44.aClass28_14.method3531(arg3, -16777216, arg2, arg4, local115);
					Static44.aClass28_14.method3531(arg1 + arg3 - local115, -16777216, arg2, arg4, local115);
				}
				arg3 += local115;
				arg1 -= local115 * 2;
			}
		} else if (local71 > Static8.aShort3) {
			local80 = Static8.aShort3;
			local45 = arg1 * local80 * 334 / (arg4 * 512);
			if (Static313.aShort69 > local45) {
				local45 = Static313.aShort69;
				local109 = arg1 * local80 * 334 / (local45 * 512);
				local115 = (arg4 - local109) / 2;
				if (arg0) {
					Static44.aClass28_14.method3554();
					Static44.aClass28_14.method3531(arg3, -16777216, arg2, local115, arg1);
					Static44.aClass28_14.method3531(arg3, -16777216, arg4 + arg2 - local115, local115, arg1);
				}
				arg4 -= local115 * 2;
				arg2 += local115;
			}
		}
		Static19.anInt324 = (short) arg4;
		Static145.anInt2640 = (short) arg1;
		Static62.anInt1308 = arg3;
		Static261.anInt4479 = local45 * arg4 / 334;
		Static6.anInt86 = arg2;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZLclient!qq;)V")
	public static void method3344(@OriginalArg(1) Class28 arg0) {
		if (Static206.aBoolean239) {
			Static60.method1110(arg0);
		} else {
			Static59.method1105(arg0);
		}
	}
}
