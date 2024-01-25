import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "[Lclient!lq;")
	public static Class31_Sub2[] aClass31_Sub2Array3;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_93 = new Class179(40, 16);

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
	public static final int anInt6935 = 50;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "[I")
	public static final int[] anIntArray621 = new int[anInt6935];

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "[I")
	public static final int[] anIntArray622 = new int[anInt6935];

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "[I")
	public static final int[] anIntArray623 = new int[anInt6935];

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "[I")
	public static final int[] anIntArray624 = new int[anInt6935];

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[anInt6935];

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "[I")
	public static final int[] anIntArray625 = new int[anInt6935];

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "[I")
	public static final int[] anIntArray626 = new int[anInt6935];

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "J")
	public static long aLong209 = -1L;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)Lclient!kk;")
	public static Class31_Sub2_Sub1 method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class80 local11 = client.lb[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class31_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class22 local27 = local11.aClass22_2; local27 != null; local27 = local27.aClass22_1) {
			@Pc(31) Class31_Sub2 local31 = local27.aClass31_Sub2_1;
			if (local31 instanceof Class31_Sub2_Sub1) {
				@Pc(37) Class31_Sub2_Sub1 local37 = (Class31_Sub2_Sub1) local31;
				@Pc(49) int local49 = (local37.method5989() - 1) * 64 + 60;
				@Pc(57) int local57 = local37.anInt7300 - local49 >> 7;
				@Pc(65) int local65 = local37.anInt7298 - local49 >> 7;
				@Pc(73) int local73 = local37.anInt7300 + local49 >> 7;
				@Pc(80) int local80 = local49 + local37.anInt7298 >> 7;
				if (local57 <= arg1 && local65 <= arg0 && local73 >= arg1 && local80 >= arg0) {
					@Pc(112) int local112 = (local73 + 1 - arg1) * (local80 + 1 - arg0);
					if (local112 > local19) {
						local17 = local37;
						local19 = local112;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZBIZI)Lclient!ul;")
	public static Class246 method5688(@OriginalArg(0) boolean arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(5) Class65 local5 = null;
		if (Static79.aClass26_1 != null) {
			local5 = new Class65(arg2, Static79.aClass26_1, Static246.aClass26Array2[arg2], 1000000);
		}
		Static299.aClass90_Sub1Array2[arg2] = Static340.aClass254_1.method5561(local5, arg2, Static300.aClass65_7);
		if (arg0) {
			Static299.aClass90_Sub1Array2[arg2].method3344();
		}
		return new Class246(Static299.aClass90_Sub1Array2[arg2], arg1, 1);
	}
}
