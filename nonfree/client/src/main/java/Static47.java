import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "Lclient!jn;")
	public static final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method823() {
		@Pc(12) String local12 = "www";
		if (Static567.aClass15_9 == Static211.aClass15_2) {
			local12 = "www-wtrc";
		} else if (Static33.aClass15_1 == Static211.aClass15_2) {
			local12 = "www-wtqa";
		} else if (Static288.aClass15_5 == Static211.aClass15_2) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static463.aString84 != null) {
			local33 = "/p=" + Static463.aString84;
		}
		return "http://" + local12 + "." + Static156.aClass63_2.aString21 + ".com/l=" + Static266.anInt4796 + "/a=" + Static451.anInt7697 + local33 + "/";
	}

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)[Lclient!ln;")
	public static Class216[] method824() {
		return new Class216[] { Static635.aClass216_18, Static136.aClass216_5, Static44.aClass216_3, Static384.aClass216_11, Static33.aClass216_2, Static576.aClass216_16, Static330.aClass216_7, Static371.aClass216_9, Static542.aClass216_15, Static378.aClass216_10, Static581.aClass216_17, Static79.aClass216_4, Static244.aClass216_6, Static1.aClass216_14 };
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ov;ZZ)V")
	public static void method825(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean731 = arg1;
		if (Static576.aBoolean696) {
			Static288.aClass175Array1[Static288.aClass175Array1.length - 1].method4187(arg0);
		} else {
			Static461.method6851(arg0, Static155.aClass5_Sub11Array3);
		}
	}
}
