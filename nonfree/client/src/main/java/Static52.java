import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Lclient!vg;")
	public static Class123 aClass123_5;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "J")
	public static long aLong131;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1079 = Static186.method3527("settings=");

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt3318 = 0;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
	public static int[] anIntArray356 = new int[2048];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZ)I")
	public static int method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 - 1 & arg0 >> 31;
		return (arg0 + (arg0 >>> 31)) % arg1 + local18;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!hh;I)Lclient!hh;")
	public static Class50 method2673(@OriginalArg(0) Class50 arg0) {
		@Pc(9) int local9 = Static192.method3139(arg0);
		return local9 == -1 ? Static35.aClass50_278 : Static131.aClass62_2.aClass50Array38[local9];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
	public static int method2674(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	public static int method2675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!gj;)V")
	public static void method2679(@OriginalArg(1) Class20_Sub3_Sub1 arg0) {
		@Pc(12) Class1_Sub16 local12 = (Class1_Sub16) Static153.aClass90_16.method2819(arg0.aClass50_493.method1221());
		if (local12 == null) {
			Static95.method1496(Static212.anInt4195, null, arg0.anIntArray313[0], null, 0, arg0, arg0.anIntArray311[0]);
		} else {
			local12.method1466();
		}
	}
}
