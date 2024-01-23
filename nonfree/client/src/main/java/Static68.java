import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	public static int anInt1753;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Lclient!lk;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!mh;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "[Lclient!ga;")
	public static Class56[] aClass56Array2 = new Class56[50];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V")
	public static void method1443(@OriginalArg(1) int arg0) {
		Static290.method4524(Static290.anInt5645, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static290.method4526(-50.0F, -60.0F, -50.0F);
		Static290.method4527(Static290.anInt5641, 0, false);
		Static290.method4518();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I")
	public static int method1445(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class149 local7 = Static194.method3177(arg1);
		@Pc(10) int local10 = local7.anInt4768;
		@Pc(13) int local13 = local7.anInt4772;
		@Pc(16) int local16 = local7.anInt4771;
		@Pc(29) int local29 = Class13_Sub2.anIntArray71[local16 - local10];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local10;
		Static140.method2239(local13, Static287.anIntArray454[local13] & ~local29 | arg0 << local10 & local29);
	}
}
