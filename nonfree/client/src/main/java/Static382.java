import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
	public static int anInt6778;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	public static int anInt6782;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
	public static int anInt6788;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Lclient!jha;")
	public static Class28_Sub1_Sub4_Sub2_Sub2 aClass28_Sub1_Sub4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "[Lclient!ho;")
	public static final Class151[] aClass151Array1 = new Class151[37];

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!oq;IILclient!mc;)V")
	public static void method5658(@OriginalArg(0) Class268 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub41 arg2) {
		@Pc(9) Class5_Sub12 local9 = new Class5_Sub12();
		local9.anInt1099 = arg2.method7816();
		local9.anInt1097 = arg2.method7804();
		local9.anIntArray61 = new int[local9.anInt1099];
		local9.aClass331Array1 = new Class331[local9.anInt1099];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt1099][][];
		local9.anIntArray60 = new int[local9.anInt1099];
		local9.anIntArray63 = new int[local9.anInt1099];
		local9.aClass331Array2 = new Class331[local9.anInt1099];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt1099; local51++) {
			try {
				@Pc(57) int local57 = arg2.method7816();
				@Pc(82) String local82;
				@Pc(86) String local86;
				@Pc(90) int local90;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local82 = arg2.method7847();
					local86 = arg2.method7847();
					local90 = 0;
					if (local57 == 1) {
						local90 = arg2.method7804();
					}
					local9.anIntArray63[local51] = local57;
					local9.anIntArray61[local51] = local90;
					local9.aClass331Array2[local51] = arg0.method6336(Static619.method8411(local82), local86);
				} else if (local57 == 3 || local57 == 4) {
					local82 = arg2.method7847();
					local86 = arg2.method7847();
					local90 = arg2.method7816();
					@Pc(93) String[] local93 = new String[local90];
					for (@Pc(95) int local95 = 0; local95 < local90; local95++) {
						local93[local95] = arg2.method7847();
					}
					@Pc(114) byte[][] local114 = new byte[local90][];
					@Pc(127) int local127;
					if (local57 == 3) {
						for (@Pc(121) int local121 = 0; local121 < local90; local121++) {
							local127 = arg2.method7804();
							local114[local121] = new byte[local127];
							arg2.method7802(local127, 0, local114[local121]);
						}
					}
					local9.anIntArray63[local51] = local57;
					@Pc(152) Class[] local152 = new Class[local90];
					for (local127 = 0; local127 < local90; local127++) {
						local152[local127] = Static619.method8411(local93[local127]);
					}
					local9.aClass331Array1[local51] = arg0.method6324(local152, Static619.method8411(local82), local86);
					local9.aByteArrayArrayArray4[local51] = local114;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.anIntArray60[local51] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.anIntArray60[local51] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.anIntArray60[local51] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.anIntArray60[local51] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.anIntArray60[local51] = -5;
			}
		}
		Static475.aClass114_56.method2807(local9);
	}
}
