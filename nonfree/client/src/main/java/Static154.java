import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_23 = new Class32(8);

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lclient!kea;")
	public static final Class188 aClass188_7 = new Class188(1);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ig;Z[[[BIB)Z")
	public static boolean method2285(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static63.aBoolean731) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10090 >> Static609.anInt9827;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10089 >> Static609.anInt9827;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class13_Sub1_Sub1) {
			local10 = ((Class13_Sub1_Sub1) arg0).aShort120;
			local17 = ((Class13_Sub1_Sub1) arg0).aShort118;
			local8 = ((Class13_Sub1_Sub1) arg0).aShort117;
			local15 = ((Class13_Sub1_Sub1) arg0).aShort119;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte126 < Static10.anInt139 && local38 >= Static65.anInt1178 && local38 < Static85.anInt6703 && local41 >= Static264.anInt4263 && local41 < Static326.anInt5206) {
					if ((arg2 == null || arg0.aByte127 < arg3 || arg2[arg0.aByte127][local38][local41] != arg4) && arg0.method8403() && !arg0.method8406()) {
						return false;
					}
					if (!arg1 && local38 >= Static566.anInt9234 - 16 && local38 <= Static566.anInt9234 + 16 && local41 >= Static370.anInt5837 - 16 && local41 <= Static370.anInt5837 + 16) {
						if (Static268.aBoolean293) {
							Static602.aClass358Array1[Static93.anInt1716++].method8049(arg0);
							Static93.anInt1716 %= Static453.anInt7261;
						} else {
							arg0.method8415(Static207.aClass95_6);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2286(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
