import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cs", name = "Z", descriptor = "Lclient!am;")
	public static Class11 aClass11_19;

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
	public static int anInt1173 = -2;

	@OriginalMember(owner = "client!cs", name = "V", descriptor = "[I")
	public static final int[] anIntArray126 = new int[14];

	@OriginalMember(owner = "client!cs", name = "bb", descriptor = "I")
	public static final int anInt1182 = -11713997;

	@OriginalMember(owner = "client!cs", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString34 = "Started 3d Library";

	@OriginalMember(owner = "client!cs", name = "mb", descriptor = "I")
	public static int anInt1189 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub41 local12 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg3);
		if (local12 == null) {
			local12 = new Class4_Sub41();
			Static301.aClass198_34.method5267((long) arg3, local12);
		}
		if (local12.anIntArray538.length <= arg1) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray538.length; local41++) {
				local34[local41] = local12.anIntArray538[local41];
				local39[local41] = local12.anIntArray537[local41];
			}
			for (@Pc(67) int local67 = local12.anIntArray538.length; local67 < arg1; local67++) {
				local34[local67] = -1;
				local39[local67] = 0;
			}
			local12.anIntArray538 = local34;
			local12.anIntArray537 = local39;
		}
		local12.anIntArray538[arg1] = arg0;
		local12.anIntArray537[arg1] = arg2;
	}

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "(I)Z")
	public static boolean method984() {
		try {
			if (Static177.anInt5898 == 2) {
				if (Static116.aClass4_Sub17_2 == null) {
					Static116.aClass4_Sub17_2 = Static361.method2131(Static74.aClass11_38, Static59.anInt1267, Static297.anInt6002);
					if (Static116.aClass4_Sub17_2 == null) {
						return false;
					}
				}
				if (Static316.aClass163_3 == null) {
					Static316.aClass163_3 = new Class163(Static240.aClass11_102, Static233.aClass11_96);
				}
				if (Static129.aClass4_Sub13_Sub3_1.method4885(Static143.aClass11_66, Static316.aClass163_3, Static116.aClass4_Sub17_2)) {
					Static129.aClass4_Sub13_Sub3_1.method4873();
					Static129.aClass4_Sub13_Sub3_1.method4894(Static138.anInt3121);
					Static129.aClass4_Sub13_Sub3_1.method4895(Static252.aBoolean443, Static116.aClass4_Sub17_2);
					Static116.aClass4_Sub17_2 = null;
					Static177.anInt5898 = 0;
					Static74.aClass11_38 = null;
					Static316.aClass163_3 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static129.aClass4_Sub13_Sub3_1.method4890();
			Static116.aClass4_Sub17_2 = null;
			Static316.aClass163_3 = null;
			Static74.aClass11_38 = null;
			Static177.anInt5898 = 0;
		}
		return false;
	}
}
