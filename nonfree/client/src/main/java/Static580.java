import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt10246;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "[Lclient!jm;")
	public static Class175[] aClass175Array12;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "[Lclient!iu;")
	public static Class14_Sub2_Sub2_Sub1[] aClass14_Sub2_Sub2_Sub1Array13;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_75 = new Class293(32);

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public static int anInt10244 = 0;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_198 = new Class136(58, 8);

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Z")
	public static boolean aBoolean825 = false;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
	public static final int[] anIntArray818 = new int[1000];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)I")
	public static int method8701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)Z")
	public static boolean method8712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static567.method8018(arg0, arg1) | (arg0 & 0x70000) != 0 || Static188.method8826(arg0, arg1);
	}
}
