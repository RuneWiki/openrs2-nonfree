import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
	public static int anInt3294;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_41 = new Class243(69, 3);

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "[S")
	public static final short[] aShortArray64 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JJ)J")
	public static long method2957(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Lclient!ts;")
	public static Class2_Sub13_Sub16 method2959() {
		return Static201.aClass2_Sub13_Sub16_2;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)I")
	public static int method2960(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return local42 + (arg0 & 0xFF80);
		}
	}
}
