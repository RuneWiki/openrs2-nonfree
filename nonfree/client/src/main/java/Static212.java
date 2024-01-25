import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_96 = new Class215(70, -2);

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "[Lclient!po;")
	public static final Class267[] aClass267Array1 = new Class267[16];

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_97 = new Class215(15, 16);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4176(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class3_Sub5 local6 = (Class3_Sub5) Static513.aClass325_8.method8016(); local6 != null; local6 = (Class3_Sub5) Static513.aClass325_8.method8022()) {
			if (local6.anInt6203 <= Static407.anInt7704) {
				local6.method8909();
			} else {
				Static294.method5267(arg0 >> 1, local6.anInt6202 * 2, arg1 >> 1, local6.anInt6200, (local6.anInt6204 << 9) + 256, (local6.anInt6201 << 9) + 256);
				Static571.aClass68_12.method8106(arg2 + Static613.anIntArray690[0], local6.anInt6198 | 0xFF000000, local6.aString66, 0, arg3 + Static613.anIntArray690[1]);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)[Lclient!ad;")
	public static Class6[] method4178() {
		return new Class6[] { Static505.aClass6_11, Static66.aClass6_12, Static70.aClass6_2, Static454.aClass6_8, Static192.aClass6_4, Static496.aClass6_10, Static225.aClass6_5, Static435.aClass6_7, Static397.aClass6_6, Static457.aClass6_9 };
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!wea;)[Lclient!b;")
	public static Class25[] method4179(@OriginalArg(1) Class370 arg0) {
		if (!arg0.method9082()) {
			return new Class25[0];
		}
		@Pc(24) Class240 local24 = arg0.method9075();
		while (local24.anInt7566 == 0) {
			Static190.method3914(10L);
		}
		if (local24.anInt7566 == 2) {
			return new Class25[0];
		}
		@Pc(45) int[] local45 = (int[]) local24.anObject13;
		@Pc(51) Class25[] local51 = new Class25[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class25 local59 = new Class25();
			local51[local53] = local59;
			local59.anInt577 = local45[local53 << 2];
			local59.anInt581 = local45[(local53 << 2) + 1];
			local59.anInt576 = local45[(local53 << 2) + 2];
			local59.anInt579 = local45[(local53 << 2) + 3];
		}
		return local51;
	}
}
