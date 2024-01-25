import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	public static int anInt3800;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
	public static int anInt3801;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	public static int anInt3805 = -1;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "[I")
	public static final int[] anIntArray335 = new int[500];

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([BI)[B")
	public static byte[] method3044(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class7_Sub14 local13 = new Class7_Sub14(arg0);
		@Pc(17) int local17 = local13.method3981();
		@Pc(21) int local21 = local13.method3938();
		if (local21 < 0 || Static410.anInt6483 != 0 && Static410.anInt6483 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(86) byte[] local86 = new byte[local21];
			local13.method3932(local86, local21);
			return local86;
		} else {
			@Pc(44) int local44 = local13.method3938();
			if (local44 < 0 || Static410.anInt6483 != 0 && Static410.anInt6483 < local44) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local44];
			if (local17 == 1) {
				Static318.method4124(local62, local44, arg0, local21);
			} else {
				Static47.aClass214_1.method4427(local13, local62);
			}
			return local62;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method3045(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg1 ? Static209.aClass204_1.anInt5354 : Static209.aClass204_1.anInt5356);
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class7_Sub4_Sub13 local38 = Static209.aClass204_1.method4288(local31);
			if (local38.aBoolean358 && local38.method4274().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static89.aShortArray29 = null;
					Static238.anInt4078 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(71) short[] local71 = new short[local11.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local13; local73++) {
						local71[local73] = local11[local73];
					}
					local11 = local71;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static117.anInt2381 = 0;
		Static89.aShortArray29 = local11;
		Static238.anInt4078 = local13;
		@Pc(114) String[] local114 = new String[Static238.anInt4078];
		for (@Pc(121) int local121 = 0; local121 < Static238.anInt4078; local121++) {
			local114[local121] = Static209.aClass204_1.method4288(local11[local121]).method4274();
		}
		Static116.method3920(Static89.aShortArray29, local114);
	}
}
