import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Z")
	public static boolean aBoolean334;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt5031;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!an;")
	public static Class10 aClass10_57 = new Class10();

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static int anInt5027 = 0;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public static int anInt5029 = 0;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public static int anInt5030 = 0;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!dh;")
	public static Class33 aClass33_39 = new Class33(50);

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
	public static int[] anIntArray449 = new int[14];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!lc;Lclient!lc;)I")
	public static int method4008(@OriginalArg(1) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method2391(Static121.anInt2643)) {
			local5++;
		}
		if (arg1.method2391(Static148.anInt3010)) {
			local5++;
		}
		if (arg1.method2391(Static17.anInt373)) {
			local5++;
		}
		if (arg0.method2391(Static121.anInt2643)) {
			local5++;
		}
		if (arg0.method2391(Static148.anInt3010)) {
			local5++;
		}
		if (arg0.method2391(Static17.anInt373)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method4009() {
		Static116.anInt2585 = 0;
		@Pc(20) int local20 = (Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7) + Static170.anInt3385;
		@Pc(27) int local27 = (Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7) + Static239.anInt4613;
		if (local20 >= 3053 && local20 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static116.anInt2585 = 1;
		}
		if (local20 >= 3072 && local20 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static116.anInt2585 = 1;
		}
		if (Static116.anInt2585 == 1 && local20 >= 3139 && local20 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static116.anInt2585 = 0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)I")
	public static int method4010(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3F;
		@Pc(14) int local14 = arg0 >> 6 & 0x3;
		if (local3 == 18) {
			if (local14 == 0) {
				return 1;
			}
			if (local14 == 1) {
				return 2;
			}
			if (local14 == 2) {
				return 4;
			}
			if (local14 == 3) {
				return 8;
			}
		} else if (local3 == 19 || local3 == 21) {
			if (local14 == 0) {
				return 16;
			}
			if (local14 == 1) {
				return 32;
			}
			if (local14 == 2) {
				return 64;
			}
			if (local14 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public static void method4011() {
		aClass33_39 = null;
		aClass10_57 = null;
		anIntArray449 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([BII)I")
	public static int method4012(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static222.method3558(0, arg1, arg0);
	}
}
