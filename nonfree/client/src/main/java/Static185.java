import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!ct;")
	public static Class30 aClass30_28;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!tg;")
	public static Class195 aClass195_5;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Lclient!ic;")
	public static Interface3 anInterface3_4;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	public static int anInt1930 = -2;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_70 = new Class18(44, -1);

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[S")
	public static final short[] aShortArray46 = new short[] { 8, 25, 10, 9, 15, 20, 6, 51 };

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public static int anInt1932 = -1;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_72 = new Class217(58, 8);

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "[I")
	public static final int[] anIntArray149 = new int[100];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)I")
	public static int method1821(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
