import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
	public static int anInt10304;

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_99 = new Class305(50, 2);

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_241 = new Class359(29, 4);

	@OriginalMember(owner = "client!vha", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString106 = null;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(II[II[I)V")
	public static void method8530(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg2; local53++) {
			if ((local53 & local51) + local20 > arg3[local53]) {
				@Pc(68) int local68 = arg3[local53];
				arg3[local53] = arg3[local16];
				arg3[local16] = local68;
				@Pc(82) int local82 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16++] = local82;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method8530(arg0, arg1, local16 - 1, arg3);
		method8530(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "([BIII)I")
	public static int method8532(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg1; local7++) {
			local5 = Class60.anIntArray57[(local5 ^ arg0[local7]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!fda;I)V")
	public static void method8534(@OriginalArg(0) Class28_Sub1_Sub4_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt5463 - Static26.anInt350;
		@Pc(19) int local19 = arg0.anInt5511 * 512 + arg0.method4599() * 256;
		@Pc(30) int local30 = arg0.anInt5518 * 512 + arg0.method4599() * 256;
		arg0.anInt5522 = 0;
		arg0.anInt10784 += (local30 - arg0.anInt10784) / local8;
		arg0.anInt10781 += (local19 - arg0.anInt10781) / local8;
		if (arg0.anInt5476 == 0) {
			arg0.method4582(8192);
		}
		if (arg0.anInt5476 == 1) {
			arg0.method4582(12288);
		}
		if (arg0.anInt5476 == 2) {
			arg0.method4582(0);
		}
		if (arg0.anInt5476 == 3) {
			arg0.method4582(4096);
		}
	}
}
