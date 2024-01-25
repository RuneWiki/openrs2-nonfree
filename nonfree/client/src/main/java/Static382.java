import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
	public static int anInt6708;

	@OriginalMember(owner = "client!mv", name = "t", descriptor = "J")
	public static final long aLong181 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_30 = new Class62(512);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIB)Z")
	public static boolean method5595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)Z")
	public static boolean method5596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!cn;Z[[[BIB)Z")
	public static boolean method5597(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static281.aBoolean409) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10108 >> Static436.anInt7634;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10109 >> Static436.anInt7634;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class23_Sub2_Sub1) {
			local10 = ((Class23_Sub2_Sub1) arg0).aShort125;
			local17 = ((Class23_Sub2_Sub1) arg0).aShort122;
			local8 = ((Class23_Sub2_Sub1) arg0).aShort123;
			local15 = ((Class23_Sub2_Sub1) arg0).aShort124;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte143 < Static373.anInt6613 && local38 >= Static518.anInt8668 && local38 < Static426.anInt7220 && local41 >= Static664.anInt6954 && local41 < Static507.anInt8481) {
					if ((arg2 == null || arg0.aByte142 < arg3 || arg2[arg0.aByte142][local38][local41] != arg4) && arg0.method8598() && !arg0.method8599(Static486.aClass16_8)) {
						return false;
					}
					if (!arg1 && local38 >= Static177.anInt3330 - 16 && local38 <= Static177.anInt3330 + 16 && local41 >= Static227.anInt4358 - 16 && local41 <= Static227.anInt4358 + 16) {
						if (Static284.aBoolean410) {
							Static94.aClass224Array1[Static518.anInt8665++].method5158(arg0);
							Static518.anInt8665 %= Static189.anInt7974;
						} else {
							arg0.method8590(Static486.aClass16_8);
						}
					}
				}
			}
		}
		return true;
	}
}
