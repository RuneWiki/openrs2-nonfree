import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "Lclient!gda;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
	public static int anInt5536;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
	public static int anInt5538;

	@OriginalMember(owner = "client!jv", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_56 = new Class230(39, 8);

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_22 = new Class25(512);

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_57 = new Class230(7, 3);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V")
	public static void method4581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(6, arg1);
		local8.method1898();
		local8.anInt1945 = arg0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)Z")
	public static boolean method4583(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4584(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static18.method744("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)V")
	public static void method4585() {
		for (@Pc(15) Class3_Sub4_Sub18 local15 = (Class3_Sub4_Sub18) Static591.aClass183_64.method4795(); local15 != null; local15 = (Class3_Sub4_Sub18) Static591.aClass183_64.method4793()) {
			@Pc(19) Class2_Sub2_Sub5 local19 = local15.aClass2_Sub2_Sub5_1;
			if (Static129.anInt10429 > local19.anInt7964) {
				local15.method8412();
				local19.method6584();
			} else if (Static129.anInt10429 >= local19.anInt7952) {
				if (local19.anInt7944 > 0) {
					@Pc(44) Class3_Sub46 local44 = (Class3_Sub46) Static331.aClass25_25.method946((long) (local19.anInt7944 - 1));
					if (local44 != null) {
						@Pc(49) Class2_Sub2_Sub1_Sub2 local49 = local44.aClass2_Sub2_Sub1_Sub2_2;
						if (local49.anInt9398 >= 0 && Static460.anInt8640 * 512 > local49.anInt9398 && local49.anInt9396 >= 0 && local49.anInt9396 < Static292.anInt7682 * 512) {
							local19.method6583(local49.anInt9396, Static129.anInt10429, Static274.method4782(local49.anInt9396, local19.aByte103, local49.anInt9398) - local19.anInt7953, local49.anInt9398);
						}
					}
				}
				if (local19.anInt7944 < 0) {
					@Pc(106) int local106 = -local19.anInt7944 - 1;
					@Pc(111) Class2_Sub2_Sub1_Sub1 local111;
					if (Static381.anInt1560 == local106) {
						local111 = Static443.aClass2_Sub2_Sub1_Sub1_2;
					} else {
						local111 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local106];
					}
					if (local111 != null && local111.anInt9398 >= 0 && local111.anInt9398 < Static460.anInt8640 * 512 && local111.anInt9396 >= 0 && Static292.anInt7682 * 512 > local111.anInt9396) {
						local19.method6583(local111.anInt9396, Static129.anInt10429, Static274.method4782(local111.anInt9396, local19.aByte103, local111.anInt9398) - local19.anInt7953, local111.anInt9398);
					}
				}
				local19.method6580(Static377.anInt7320);
				Static319.method5520(local19, true);
			}
		}
	}
}
