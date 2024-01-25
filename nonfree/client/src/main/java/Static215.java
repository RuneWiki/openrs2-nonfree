import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_33 = new Class244();

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
	public static final int anInt5488 = 1337;

	@OriginalMember(owner = "client!ku", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIB)V")
	public static void method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class4_Sub2_Sub17 local10 = Static34.method1709(9, arg1);
		local10.method5529();
		local10.anInt6871 = arg0;
		local10.anInt6873 = arg2;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
	public static boolean method4450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static4.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(CII)I")
	public static int method4452(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local15 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local15 = 1762;
		}
		return local15;
	}
}
