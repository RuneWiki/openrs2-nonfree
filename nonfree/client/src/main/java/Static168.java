import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ug", name = "jb", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!ug", name = "kb", descriptor = "I")
	public static int anInt3786;

	@OriginalMember(owner = "client!ug", name = "mb", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!ug", name = "pb", descriptor = "Lclient!ff;")
	public static Class24 aClass24_12;

	@OriginalMember(owner = "client!ug", name = "ub", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!ug", name = "tb", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!ug", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2243 = Static107.method1838("Konfig geladen)3");

	@OriginalMember(owner = "client!ug", name = "xb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2245 = Static107.method1838(" is already on your ignore list)3");

	@OriginalMember(owner = "client!ug", name = "wb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2244 = aClass28_2245;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([BIII)I")
	public static int method2642(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg2; local9++) {
			local7 = Class2_Sub10.anIntArray201[(arg0[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!nf;)V")
	public static void method2644(@OriginalArg(1) Class2_Sub19 arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = 0;
		if (arg0.anInt2720 == 0) {
			local1 = Static41.method740(arg0.anInt2721, arg0.anInt2708, arg0.anInt2723);
		}
		@Pc(26) int local26 = 0;
		if (arg0.anInt2720 == 1) {
			local1 = Static141.method2249(arg0.anInt2721, arg0.anInt2708, arg0.anInt2723);
		}
		if (arg0.anInt2720 == 2) {
			local1 = Static107.method1837(arg0.anInt2721, arg0.anInt2708, arg0.anInt2723);
		}
		if (arg0.anInt2720 == 3) {
			local1 = Static21.method469(arg0.anInt2721, arg0.anInt2708, arg0.anInt2723);
		}
		if (local1 != 0L) {
			local3 = (int) (local1 >>> 32) & Integer.MAX_VALUE;
			local26 = (int) local1 >> 20 & 0x3;
			local5 = (int) local1 >> 14 & 0x1F;
		}
		arg0.anInt2719 = local26;
		arg0.anInt2710 = local3;
		arg0.anInt2715 = local5;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)I")
	public static int method2645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public static void method2646() {
		anIntArray352 = null;
		anIntArray353 = null;
		aClass28_2245 = null;
		aClass28_2243 = null;
		aClass24_12 = null;
		aByteArrayArray10 = null;
		aClass28_2244 = null;
		anIntArray354 = null;
	}
}
