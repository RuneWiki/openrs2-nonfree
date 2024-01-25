import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!am", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_40 = new Class269(68, 7);

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_5 = new Class184(0, 1);

	@OriginalMember(owner = "client!am", name = "l", descriptor = "[Lclient!jn;")
	public static final Class179[] aClass179Array2 = new Class179[4];

	@OriginalMember(owner = "client!am", name = "m", descriptor = "S")
	public static short aShort78 = 205;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I")
	public static int method3499(@OriginalArg(1) int arg0) {
		@Pc(16) byte local16;
		if (arg0 > 12000) {
			Static455.method6666();
			local16 = 4;
		} else if (arg0 > 5000) {
			Static596.method8207();
			local16 = 3;
		} else if (arg0 > 2000) {
			Static534.method7470();
			local16 = 2;
		} else {
			local16 = 1;
			Static623.method8043();
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() != 2) {
			Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
			Static352.method5455(false, 2);
		}
		Static209.method3628();
		return local16;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!ee;")
	public static Class86 method3501(@OriginalArg(0) int arg0) {
		@Pc(16) Class86[] local16 = Static459.method7100();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class86 local24 = local16[local18];
			if (arg0 == local24.anInt2188) {
				return local24;
			}
		}
		return null;
	}
}
