import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lclient!em;")
	public static final Class83 aClass83_99 = new Class83(71, 0);

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!kaa", name = "s", descriptor = "[I")
	public static final int[] anIntArray262 = new int[5];

	@OriginalMember(owner = "client!kaa", name = "t", descriptor = "[B")
	public static final byte[] aByteArray40 = new byte[520];

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_5 = new Class4();

	@OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
	public static int anInt4747 = 0;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!wp;BLclient!vda;IIILclient!lf;Lclient!r;)V")
	public static void method3775(@OriginalArg(0) Class1_Sub51 arg0, @OriginalArg(2) Class345 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class204 arg5, @OriginalArg(7) Class78 arg6) {
		@Pc(19) int local19 = arg0.anInt9676 - arg3 / 2 - 5;
		@Pc(23) int local23 = arg2 + 2;
		if (arg1.anInt9167 != 0) {
			arg6.method6800(arg1.anInt9167, arg5.method4356() * arg4 + arg2 + 1 - local23, local19, arg3 + 10, local23);
		}
		if (arg1.anInt9193 != 0) {
			arg6.method6779(local23, arg1.anInt9193, local19, arg3 + 10, -local23 + arg2 - -(arg4 * arg5.method4356()) + 1);
		}
		@Pc(83) int local83 = arg1.anInt9169;
		if (arg0.aBoolean715 && arg1.anInt9182 != -1) {
			local83 = arg1.anInt9182;
		}
		for (@Pc(96) int local96 = 0; local96 < arg4; local96++) {
			@Pc(102) String local102 = Static218.aStringArray8[local96];
			if (local96 < arg4 - 1) {
				local102 = local102.substring(0, local102.length() - 4);
			}
			arg5.method4357(arg6, local102, arg0.anInt9676, arg2, local83);
			arg2 += arg5.method4356();
		}
	}
}
