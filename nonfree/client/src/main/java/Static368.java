import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public static int anInt7248;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_94 = new Class276(110, 5);

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[I")
	public static final int[] anIntArray463 = new int[14];

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static int anInt7250 = 0;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Lclient!jba;")
	public static Class69_Sub1 method6032() {
		Static92.anInt2288 = 0;
		return Static120.method2390();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public static int method6033(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!tc;)V")
	public static void method6034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class305 arg2) {
		if (arg2.aByte100 == 0) {
			arg2.anInt9206 = arg2.anInt9228;
		} else if (arg2.aByte100 == 1) {
			arg2.anInt9206 = arg2.anInt9228 + (arg0 - arg2.anInt9160) / 2;
		} else if (arg2.aByte100 == 2) {
			arg2.anInt9206 = arg0 - arg2.anInt9228 - arg2.anInt9160;
		} else if (arg2.aByte100 == 3) {
			arg2.anInt9206 = arg2.anInt9228 * arg0 >> 14;
		} else if (arg2.aByte100 == 4) {
			arg2.anInt9206 = (arg0 * arg2.anInt9228 >> 14) + (arg0 - arg2.anInt9160) / 2;
		} else {
			arg2.anInt9206 = arg0 - arg2.anInt9160 - (arg2.anInt9228 * arg0 >> 14);
		}
		if (arg2.aByte98 == 0) {
			arg2.anInt9197 = arg2.anInt9171;
		} else if (arg2.aByte98 == 1) {
			arg2.anInt9197 = (arg1 - arg2.anInt9242) / 2 + arg2.anInt9171;
		} else if (arg2.aByte98 == 2) {
			arg2.anInt9197 = arg1 - arg2.anInt9242 - arg2.anInt9171;
		} else if (arg2.aByte98 == 3) {
			arg2.anInt9197 = arg2.anInt9171 * arg1 >> 14;
		} else if (arg2.aByte98 == 4) {
			arg2.anInt9197 = (arg1 - arg2.anInt9242) / 2 + (arg1 * arg2.anInt9171 >> 14);
		} else {
			arg2.anInt9197 = arg1 - (arg2.anInt9171 * arg1 >> 14) - arg2.anInt9242;
		}
		if (!Static230.aBoolean352 || Static68.method1694(arg2).anInt1877 == 0 && arg2.anInt9211 != 0) {
			return;
		}
		if (arg2.anInt9197 < 0) {
			arg2.anInt9197 = 0;
		} else if (arg1 < arg2.anInt9242 + arg2.anInt9197) {
			arg2.anInt9197 = arg1 - arg2.anInt9242;
		}
		if (arg2.anInt9206 < 0) {
			arg2.anInt9206 = 0;
		} else if (arg2.anInt9160 + arg2.anInt9206 > arg0) {
			arg2.anInt9206 = arg0 - arg2.anInt9160;
			return;
		}
	}
}
