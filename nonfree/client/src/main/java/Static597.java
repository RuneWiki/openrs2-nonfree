import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!fh;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Z")
	public static final boolean aBoolean678 = false;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_252 = new Class160(12, -2);

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
	public static int anInt9858 = -1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method8452(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static261.anInt4885; local16++) {
			if (arg0.equalsIgnoreCase(Static265.aStringArray23[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!nh;I)V")
	public static void method8453(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub3_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static530.anInt9105 < arg1.anInt3287) {
			Static374.method5793(arg1);
		} else if (arg1.anInt3286 >= Static530.anInt9105) {
			Static478.method7169(arg1);
		} else {
			Static556.method8037(arg1, false);
			local7 = Static583.anInt9645;
			local9 = Static198.anInt3445;
		}
		@Pc(98) int local98;
		if (arg1.anInt11184 < 512 || arg1.anInt11178 < 512 || arg1.anInt11184 >= (Static380.anInt6689 - 1) * 512 || arg1.anInt11178 >= (Static542.anInt9214 - 1) * 512) {
			arg1.aClass181_8.method8964(-1, 0);
			for (local98 = 0; local98 < arg1.aClass214Array3.length; local98++) {
				arg1.aClass214Array3[local98].anInt5678 = -1;
				arg1.aClass214Array3[local98].aClass181_10.method8964(-1, 0);
			}
			arg1.anInt3286 = 0;
			local9 = 0;
			arg1.anInt3287 = 0;
			local7 = -1;
			arg1.anIntArray198 = null;
			arg1.anInt11184 = arg1.anIntArray200[0] * 512 + arg1.method2870(0) * 256;
			arg1.anInt11178 = arg1.anIntArray201[0] * 512 + arg1.method2870(0) * 256;
			arg1.method2875();
		}
		if (arg1 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 && (arg1.anInt11184 < 6144 || arg1.anInt11178 < 6144 || (Static380.anInt6689 - 12) * 512 <= arg1.anInt11184 || arg1.anInt11178 >= (Static542.anInt9214 - 12) * 512)) {
			arg1.aClass181_8.method8964(-1, 0);
			for (local98 = 0; local98 < arg1.aClass214Array3.length; local98++) {
				arg1.aClass214Array3[local98].anInt5678 = -1;
				arg1.aClass214Array3[local98].aClass181_10.method8964(-1, 0);
			}
			arg1.anInt3286 = 0;
			local9 = 0;
			arg1.anInt3287 = 0;
			local7 = -1;
			arg1.anIntArray198 = null;
			arg1.anInt11184 = arg1.anIntArray200[0] * 512 + arg1.method2870(0) * 256;
			arg1.anInt11178 = arg1.anIntArray201[0] * 512 + arg1.method2870(0) * 256;
			arg1.method2875();
		}
		local98 = Static395.method6021(arg1);
		Static216.method5719(arg1);
		Static73.method1221(local98, local9, arg1, local7);
		Static633.method9092(local7, arg1);
		Static147.method2177(arg1);
	}
}
