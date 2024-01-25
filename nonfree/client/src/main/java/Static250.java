import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "Z")
	public static boolean aBoolean465 = true;

	@OriginalMember(owner = "client!jn", name = "M", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)V")
	public static void method4491(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(7, arg0);
		local8.method1896();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!dg;ZIIB)V")
	public static void method4492(@OriginalArg(0) Class2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray487[0];
		@Pc(13) int local13 = arg0.anIntArray488[0];
		if (local8 < 0 || Static460.anInt8640 <= local8 || local13 < 0 || local13 >= Static292.anInt7682 || (arg2 < 0 || Static460.anInt8640 <= arg2 || arg1 < 0 || Static292.anInt7682 <= arg1)) {
			return;
		}
		@Pc(75) int local75 = Static515.method7678(arg2, 0, 0, Static248.anIntArray320, arg1, -4, 0, Static485.anIntArray585, 0, true, Static403.aClass350Array1[arg0.aByte103], local8, local13, arg0.method6311());
		if (local75 >= 1 && local75 <= 3) {
			for (@Pc(95) int local95 = 0; local95 < local75 - 1; local95++) {
				arg0.method2032(Static485.anIntArray585[local95], Static248.anIntArray320[local95], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)I")
	public static int method4493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg1 > 0) {
			local5 = local5 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!fd;)Lclient!rm;")
	public static Class284 method4495(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(14) int local14 = arg0.method6535();
		@Pc(23) Class100 local23 = Static414.method6700()[arg0.method6538()];
		@Pc(30) Class237 local30 = Static557.method1636()[arg0.method6538()];
		@Pc(34) int local34 = arg0.method6525();
		@Pc(38) int local38 = arg0.method6525();
		return new Class284(local14, local23, local30, local34, local38);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4497(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < Static346.anInt7032; local14++) {
			if (arg0.equalsIgnoreCase(Static520.aStringArray34[local14])) {
				return local14;
			}
		}
		return -1;
	}
}
