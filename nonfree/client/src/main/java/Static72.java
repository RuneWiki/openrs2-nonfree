import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public static int anInt1488;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_15 = new Class163();

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static int anInt1487 = 0;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_38 = new Class217(10, 6);

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!je;")
	public static final Class127 aClass127_5 = new Class127(9, 0, 4, 1);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
	public static int method1370(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(44) int local44 = (arg0 & 0x7F) * 96 >> 7;
			if (local44 < 2) {
				local44 = 2;
			} else if (local44 > 126) {
				local44 = 126;
			}
			return (arg0 & 0xFF80) + local44;
		}
	}
}
