import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array42;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_185 = new Class221(76, -1);

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_186 = new Class221(21, 3);

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "S")
	public static short aShort74 = 1;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "[I")
	public static final int[] anIntArray432 = new int[4096];

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)I")
	public static int method4693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIBIII)V")
	public static void method4694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class52[] local3 = Static223.aClass52Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class52 local11 = local3[local5];
			if (local11 != null && local11.anInt1018 == 2) {
				Static243.method4369(local11.anInt1021 * 2, local11.anInt1020 + (local11.anInt1011 - Static150.anInt3453 << 7), arg3 >> 1, local11.anInt1009 + (local11.anInt1022 - Static287.anInt5776 << 7), arg2 >> 1, local11.anInt1024);
				if (Static311.anIntArray474[0] > -1 && Static6.anInt91 % 20 < 10) {
					Static240.aClass46Array38[local11.anInt1017].method5016(arg1 + Static311.anIntArray474[0] - 12, Static311.anIntArray474[1] + (arg0 - 28));
				}
			}
		}
	}
}
