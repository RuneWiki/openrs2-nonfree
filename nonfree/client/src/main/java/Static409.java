import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "Lclient!ha;")
	public static Class75 aClass75_13;

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "F")
	public static float aFloat135 = 0.0F;

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
	public static int anInt7136 = 0;

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
	public static int anInt7140 = 0;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method6270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILclient!vo;)V")
	public static void method6271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class381 arg2) {
		if (arg2.aByte145 == 0) {
			arg2.anInt10116 = arg2.anInt10143;
		} else if (arg2.aByte145 == 1) {
			arg2.anInt10116 = (arg0 - arg2.anInt10131) / 2 + arg2.anInt10143;
		} else if (arg2.aByte145 == 2) {
			arg2.anInt10116 = arg0 - arg2.anInt10143 - arg2.anInt10131;
		} else if (arg2.aByte145 == 3) {
			arg2.anInt10116 = arg0 * arg2.anInt10143 >> 14;
		} else if (arg2.aByte145 == 4) {
			arg2.anInt10116 = (arg2.anInt10143 * arg0 >> 14) + (arg0 - arg2.anInt10131) / 2;
		} else {
			arg2.anInt10116 = arg0 - arg2.anInt10131 - (arg2.anInt10143 * arg0 >> 14);
		}
		if (arg2.aByte143 == 0) {
			arg2.anInt10155 = arg2.anInt10135;
		} else if (arg2.aByte143 == 1) {
			arg2.anInt10155 = arg2.anInt10135 + (arg1 - arg2.anInt10159) / 2;
		} else if (arg2.aByte143 == 2) {
			arg2.anInt10155 = arg1 - arg2.anInt10135 - arg2.anInt10159;
		} else if (arg2.aByte143 == 3) {
			arg2.anInt10155 = arg2.anInt10135 * arg1 >> 14;
		} else if (arg2.aByte143 == 4) {
			arg2.anInt10155 = (arg2.anInt10135 * arg1 >> 14) + (arg1 - arg2.anInt10159) / 2;
		} else {
			arg2.anInt10155 = arg1 - arg2.anInt10159 - (arg2.anInt10135 * arg1 >> 14);
		}
		if (!Static628.aBoolean728) {
			return;
		}
		if (Static78.method1061(arg2).anInt5776 == 0 && arg2.anInt10156 != 0) {
			return;
		}
		if (arg2.anInt10116 < 0) {
			arg2.anInt10116 = 0;
		} else if (arg2.anInt10131 + arg2.anInt10116 > arg0) {
			arg2.anInt10116 = arg0 - arg2.anInt10131;
		}
		if (arg2.anInt10155 < 0) {
			arg2.anInt10155 = 0;
			return;
		}
		if (arg2.anInt10159 + arg2.anInt10155 > arg1) {
			arg2.anInt10155 = arg1 - arg2.anInt10159;
			return;
		}
	}
}
