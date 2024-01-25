import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public static int anInt5962;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!pj;")
	public static final Class156 aClass156_13 = new Class156(64);

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public static int anInt5958 = 1;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	public static int anInt5959 = 0;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public static final int anInt5960 = 52;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)I")
	public static int method5221(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method5222(@OriginalArg(1) Class165 arg0) {
		Static127.aClass165_46 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!rg;BZ)V")
	public static void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg2.anInt5179;
		if (arg2.aByte57 == 0) {
			arg2.anInt5179 = arg2.anInt5211;
		} else if (arg2.aByte57 == 1) {
			arg2.anInt5179 = arg0 - arg2.anInt5211;
		} else if (arg2.aByte57 == 2) {
			arg2.anInt5179 = arg2.anInt5211 * arg0 >> 14;
		} else if (arg2.aByte57 == 3) {
			if (arg2.anInt5208 == 2) {
				arg2.anInt5179 = (arg2.anInt5211 - 1) * arg2.anInt5175 + arg2.anInt5211 * 32;
			} else if (arg2.anInt5208 == 7) {
				arg2.anInt5179 = arg2.anInt5211 * 115 + arg2.anInt5175 * (arg2.anInt5211 - 1);
			}
		}
		@Pc(94) int local94 = arg2.anInt5209;
		if (arg2.aByte55 == 0) {
			arg2.anInt5209 = arg2.anInt5191;
		} else if (arg2.aByte55 == 1) {
			arg2.anInt5209 = arg1 - arg2.anInt5191;
		} else if (arg2.aByte55 == 2) {
			arg2.anInt5209 = arg1 * arg2.anInt5191 >> 14;
		} else if (arg2.aByte55 == 3) {
			if (arg2.anInt5208 == 2) {
				arg2.anInt5209 = arg2.anInt5263 * (arg2.anInt5191 - 1) + arg2.anInt5191 * 32;
			} else if (arg2.anInt5208 == 7) {
				arg2.anInt5209 = arg2.anInt5191 * 12 + arg2.anInt5263 * (arg2.anInt5191 - 1);
			}
		}
		if (arg2.aByte57 == 4) {
			arg2.anInt5179 = arg2.anInt5209 * arg2.anInt5184 / arg2.anInt5265;
		}
		if (arg2.aByte55 == 4) {
			arg2.anInt5209 = arg2.anInt5179 * arg2.anInt5265 / arg2.anInt5184;
		}
		if (Static25.aBoolean62 && (Static47.method1096(arg2).anInt5507 != 0 || arg2.anInt5208 == 0)) {
			if (arg2.anInt5209 < 5 && arg2.anInt5179 < 5) {
				arg2.anInt5209 = 5;
				arg2.anInt5179 = 5;
			} else {
				if (arg2.anInt5209 <= 0) {
					arg2.anInt5209 = 5;
				}
				if (arg2.anInt5179 <= 0) {
					arg2.anInt5179 = 5;
				}
			}
		}
		if (arg2.anInt5204 == 1337) {
			Static40.aClass177_15 = arg2;
		}
		if (arg3 && arg2.anObjectArray33 != null && (arg2.anInt5179 != local8 || arg2.anInt5209 != local94)) {
			@Pc(287) Class1_Sub19 local287 = new Class1_Sub19();
			local287.aClass177_9 = arg2;
			local287.anObjectArray3 = arg2.anObjectArray33;
			Static138.aClass195_31.method5018(local287);
		}
	}
}
