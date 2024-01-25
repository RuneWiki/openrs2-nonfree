import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	public static int anInt1468;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public static int anInt1469;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!dk;")
	public static Class54 aClass54_26;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_24 = new Class134("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZIIII)V")
	public static void method1144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg6 < 0 || arg4 >= Static166.anInt2852 - 1 || arg6 >= Static426.anInt6923 - 1) {
			return;
		}
		if (Static309.aClass270ArrayArrayArray3 == null) {
			return;
		}
		@Pc(36) Interface2 local36;
		if (arg3 == 0) {
			local36 = (Interface2) Static113.method1718(arg0, arg4, arg6);
			@Pc(42) Interface2 local42 = (Interface2) Static4.method75(arg0, arg4, arg6);
			if (local36 != null && arg2 != 2) {
				if (local36 instanceof Class3_Sub2_Sub3) {
					((Class3_Sub2_Sub3) local36).aClass53_2.method1092(arg5);
				} else {
					Static410.method5194(arg0, arg6, arg3, arg4, arg2, local36.method5292(), arg1, arg5);
				}
			}
			if (local42 != null) {
				if (local42 instanceof Class3_Sub2_Sub3) {
					((Class3_Sub2_Sub3) local42).aClass53_2.method1092(arg5);
				} else {
					Static410.method5194(arg0, arg6, arg3, arg4, arg2, local42.method5292(), arg1, arg5);
				}
			}
		} else if (arg3 == 1) {
			local36 = (Interface2) Static333.method4460(arg0, arg4, arg6);
			if (local36 != null) {
				if (local36 instanceof Class3_Sub3_Sub3) {
					((Class3_Sub3_Sub3) local36).aClass53_3.method1092(arg5);
				} else {
					@Pc(115) int local115 = local36.method5292();
					if (arg2 == 4 || arg2 == 5) {
						Static410.method5194(arg0, arg6, arg3, arg4, 4, local115, arg1, arg5);
					} else if (arg2 == 6) {
						Static410.method5194(arg0, arg6, arg3, arg4, 4, local115, arg1 + 4, arg5);
					} else if (arg2 == 7) {
						Static410.method5194(arg0, arg6, arg3, arg4, 4, local115, (arg1 + 2 & 0x3) + 4, arg5);
					} else if (arg2 == 8) {
						Static410.method5194(arg0, arg6, arg3, arg4, 4, local115, arg1 + 4, arg5);
						Static410.method5194(arg0, arg6, arg3, arg4, 4, local115, (arg1 + 2 & 0x3) + 4, arg5);
					}
				}
			}
		} else if (arg3 == 2) {
			local36 = (Interface2) Static144.method2120(arg0, arg4, arg6, bn.class);
			if (local36 != null) {
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (local36 instanceof Class3_Sub4_Sub5) {
					((Class3_Sub4_Sub5) local36).aClass53_4.method1092(arg5);
				} else {
					Static410.method5194(arg0, arg6, arg3, arg4, arg2, local36.method5292(), arg1, arg5);
				}
			}
		} else if (arg3 == 3) {
			local36 = (Interface2) Static350.method4653(arg0, arg4, arg6);
			if (local36 != null) {
				if (local36 instanceof Class3_Sub5_Sub2) {
					((Class3_Sub5_Sub2) local36).aClass53_1.method1092(arg5);
				} else {
					Static410.method5194(arg0, arg6, arg3, arg4, arg2, local36.method5292(), arg1, arg5);
				}
			}
		}
	}
}
