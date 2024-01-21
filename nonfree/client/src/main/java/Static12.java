import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!eb;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_167 = Static170.method3101("null");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_168 = Static170.method3101("Members only world");

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
	public static int[] anIntArray121 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_169 = aClass28_168;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_170 = Static170.method3101("gleiten:");

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_171 = Static170.method3101("k");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method473(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static152.method2879(local13) : local13;
		} else if (arg1 instanceof Class12) {
			@Pc(27) Class12 local27 = (Class12) arg1;
			return local27.method947();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method474() {
		aClass28_171 = null;
		aClass24_1 = null;
		aClass28_170 = null;
		aClass28_167 = null;
		anIntArray121 = null;
		aClass28_169 = null;
		aClass28_168 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method475(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt4173 == 0) {
			local5 = Static80.method2760(arg0.anInt4181, arg0.anInt4177, arg0.anInt4168);
		}
		if (arg0.anInt4173 == 1) {
			local5 = Static44.method3009(arg0.anInt4181, arg0.anInt4177, arg0.anInt4168);
		}
		if (arg0.anInt4173 == 2) {
			local5 = Static172.method3138(arg0.anInt4181, arg0.anInt4177, arg0.anInt4168);
		}
		if (arg0.anInt4173 == 3) {
			local5 = Static74.method1709(arg0.anInt4181, arg0.anInt4177, arg0.anInt4168);
		}
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = -1;
		@Pc(67) int local67 = 0;
		if (local5 != 0L) {
			local61 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local59 = (int) local5 >> 14 & 0x1F;
			local67 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt4175 = local61;
		arg0.anInt4174 = local67;
		arg0.anInt4169 = local59;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class3_Sub20 local28 = Static149.aClass3_Sub20ArrayArrayArray1[local9][arg0][arg1] = Static149.aClass3_Sub20ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt3341--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt3336; local38++) {
					@Pc(44) Class32 local44 = local28.aClass32Array3[local38];
					if ((local44.aLong49 >> 29 & 0x3L) == 2L && local44.anInt1450 == arg0 && local44.anInt1449 == arg1) {
						local44.anInt1441--;
					}
				}
			}
		}
		if (Static149.aClass3_Sub20ArrayArrayArray1[0][arg0][arg1] == null) {
			Static149.aClass3_Sub20ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub20(0, arg0, arg1);
		}
		Static149.aClass3_Sub20ArrayArrayArray1[0][arg0][arg1].aClass3_Sub20_1 = local7;
		Static149.aClass3_Sub20ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
