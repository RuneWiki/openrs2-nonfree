import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
	public static int anInt6488;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "[I")
	public static final int[] anIntArray465 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_51 = new Class5(4);

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_9 = new Class180("", 12);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)V")
	public static void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(14, arg1);
		local8.method1570();
		local8.anInt1933 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lclient!bn;")
	public static Class24 method5112() {
		try {
			return (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
