import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oha", name = "F", descriptor = "I")
	public static int anInt7650;

	@OriginalMember(owner = "client!oha", name = "Q", descriptor = "Lclient!rja;")
	public static Class304 aClass304_1;

	@OriginalMember(owner = "client!oha", name = "S", descriptor = "Lclient!jd;")
	public static Class20 aClass20_27;

	@OriginalMember(owner = "client!oha", name = "T", descriptor = "I")
	public static int anInt7659;

	@OriginalMember(owner = "client!oha", name = "O", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_44 = new Class262();

	@OriginalMember(owner = "client!oha", name = "P", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_140 = new Class44(127, 4);

	@OriginalMember(owner = "client!oha", name = "R", descriptor = "[I")
	public static final int[] anIntArray565 = new int[14];

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIB[B)I")
	public static int method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg0; local14++) {
			local7 = Class285.anIntArray641[(local7 ^ arg2[local14]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIII)V")
	public static void method6284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115() * arg2 >> 8;
		if (arg0 == -1 && !Static275.aBoolean329) {
			Static610.method8580();
		} else if (arg0 != -1 && (Static344.anInt11217 != arg0 || !Static427.method6300()) && local8 != 0 && !Static275.aBoolean329) {
			Static218.method3413(arg0, Static40.aClass386_19, local8, arg1);
			Static669.method9260();
		}
		if (arg0 != Static344.anInt11217) {
			Static177.aClass14_Sub5_Sub2_1 = null;
		}
		Static344.anInt11217 = arg0;
	}
}
