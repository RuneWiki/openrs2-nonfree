import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!uc", name = "Hb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!uc", name = "sc", descriptor = "I")
	public static int anInt3583;

	@OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
	public static int[] anIntArray317 = new int[2000];

	@OriginalMember(owner = "client!uc", name = "mc", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1603 = Static32.method683("Loaded fonts");

	@OriginalMember(owner = "client!uc", name = "Qb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1601 = aClass49_1603;

	@OriginalMember(owner = "client!uc", name = "ic", descriptor = "I")
	public static int anInt3574 = -1;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public static void method2732() {
		anIntArrayArrayArray6 = null;
		aClass49_1601 = null;
		aClass49_1603 = null;
		anIntArray317 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLclient!bg;Lclient!bg;I)Lclient!td;")
	public static Class2_Sub2_Sub16 method2736(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int[] local17 = arg1.method2051(arg0);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(31) byte[] local31 = arg1.method2050(local17[local19], arg0);
			if (local31 == null) {
				local7 = false;
			} else {
				@Pc(51) int local51 = local31[1] & 0xFF | (local31[0] & 0xFF) << 8;
				@Pc(67) byte[] local67 = arg2.method2050(0, local51);
				if (local67 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub16(arg1, arg2, arg0, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method2737(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static159.aBoolean147) {
			try {
				@Pc(20) Class68 local20 = (Class68) Class.forName("Class68_Sub1").getDeclaredConstructor().newInstance();
				local20.method2876(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static159.aBoolean147 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIII)I")
	public static int method2740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 2 << 10) - (-(arg1 >> 5 << 7) - (arg2 >> 1));
	}
}
