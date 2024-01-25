import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!iq;")
	public static Class104 aClass104_11;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_26 = new Class221(79, 4);

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_14 = new Class157(7, -1);

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public static int anInt273 = 0;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "[Lclient!ug;")
	public static final Class202[] aClass202Array1 = new Class202[16];

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public static int anInt274 = 2;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "[I")
	public static final int[] anIntArray30 = new int[4096];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[J[II)V")
	public static void method249(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg0; local47++) {
			if (local21 + (long) (local47 & 0x1) > arg1[local47]) {
				@Pc(69) long local69 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local69;
				@Pc(83) int local83 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local83;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method249(local17 - 1, arg1, arg2, arg3);
		method249(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method250(@OriginalArg(0) String arg0) {
		return Static209.method5769(arg0, 10);
	}
}
