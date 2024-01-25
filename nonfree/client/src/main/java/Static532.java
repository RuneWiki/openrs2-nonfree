import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public static int anInt9101 = 1;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
	public static boolean aBoolean663 = false;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_16 = new Class376(0, 3);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
	public static boolean method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static208.method3590(arg1, arg0)) {
			return Static12.method218(arg1, arg0) | (arg0 & 0x9000) != 0 | Static130.method1948(arg0, arg1) ? true : (Static351.method5255(arg0, arg1) | (arg0 & 0x2000) != 0 | Static313.method4818(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ov;Z[[[BIB)Z")
	public static boolean method7866(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static154.aBoolean202) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10231 >> Static115.anInt2156;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10229 >> Static115.anInt2156;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class4_Sub2_Sub1) {
			local10 = ((Class4_Sub2_Sub1) arg0).aShort109;
			local17 = ((Class4_Sub2_Sub1) arg0).aShort110;
			local8 = ((Class4_Sub2_Sub1) arg0).aShort107;
			local15 = ((Class4_Sub2_Sub1) arg0).aShort108;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte131 < Static68.anInt1380 && local38 >= Static306.anInt5332 && local38 < Static114.anInt2151 && local41 >= Static177.anInt3154 && local41 < Static518.anInt8914) {
					if ((arg2 == null || arg0.aByte132 < arg3 || arg2[arg0.aByte132][local38][local41] != arg4) && arg0.method8717() && !arg0.method8714(Static517.aClass133_13)) {
						return false;
					}
					if (!arg1 && local38 >= Static260.anInt4712 - 16 && local38 <= Static260.anInt4712 + 16 && local41 >= Static598.anInt10044 - 16 && local41 <= Static598.anInt10044 + 16) {
						if (Static576.aBoolean696) {
							Static288.aClass175Array1[Static97.anInt1567++].method4191(arg0);
							Static97.anInt1567 %= Static645.anInt10657;
						} else {
							arg0.method8732(Static517.aClass133_13);
						}
					}
				}
			}
		}
		return true;
	}
}
