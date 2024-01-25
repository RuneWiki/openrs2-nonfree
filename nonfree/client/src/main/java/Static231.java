import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!ku;")
	public static final Class138 aClass138_2 = new Class138();

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!bu;II)Lclient!ui;")
	public static Class3_Sub42 method3480(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method811(arg1);
		return local8 == null ? null : new Class3_Sub42(local8);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3481(@OriginalArg(0) String arg0) {
		if (Static271.aStringArray36 == null) {
			Static228.method3429();
		}
		@Pc(17) String[] local17 = Static379.method4945(arg0, '\n');
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			for (@Pc(22) int local22 = Static213.anInt4089; local22 > 0; local22--) {
				Static271.aStringArray36[local22] = Static271.aStringArray36[local22 - 1];
			}
			Static271.aStringArray36[0] = local17[local19];
			if (Static213.anInt4089 < Static271.aStringArray36.length - 1) {
				Static213.anInt4089++;
				if (Static183.anInt3946 > 0) {
					Static183.anInt3946++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIBI)I")
	public static int method3482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static444.aClass159Array3 == null) {
			return 0;
		}
		@Pc(20) int local20 = arg1 >> 7;
		@Pc(24) int local24 = arg2 >> 7;
		if (local20 < 0 || local24 < 0 || Static40.anInt1089 - 1 < local20 || Static44.anInt7276 - 1 < local24) {
			return 0;
		}
		@Pc(46) int local46 = arg0;
		if (arg0 < 3 && (Static9.aByteArrayArrayArray1[1][local20][local24] & 0x2) != 0) {
			local46 = arg0 + 1;
		}
		return Static444.aClass159Array3[local46].va(arg1, arg2);
	}
}
