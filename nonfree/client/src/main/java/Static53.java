import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!df", name = "v", descriptor = "Lclient!wo;")
	public static Class216 aClass216_13;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public static int anInt1592;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "[S")
	public static short[] aShortArray11;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Lclient!wo;")
	public static Class216 aClass216_14;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_13 = new Class87(8);

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	public static int anInt1593 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!ki;)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(2) Class17_Sub1_Sub1 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (Static5.anInt208 < arg1.anInt4873) {
			Static38.method913(arg1);
		} else if (arg1.anInt4868 >= Static5.anInt208) {
			Static171.method3390(arg1);
		} else {
			Static6.method248(arg1, false);
			local12 = Static126.anInt2822;
			local14 = Static318.anInt6132;
		}
		if (arg1.anInt5109 < 128 || arg1.anInt5108 < 128 || arg1.anInt5109 >= (Static233.anInt5573 - 1) * 128 || Static134.anInt2971 * 128 - 128 <= arg1.anInt5108) {
			arg1.anInt4830 = -1;
			arg1.anInt4868 = 0;
			arg1.anInt4873 = 0;
			arg1.anInt4884 = -1;
			arg1.anInt5109 = arg1.anIntArray438[0] * 128 + arg1.method4318() * 64;
			arg1.anInt5108 = arg1.anIntArray439[0] * 128 + arg1.method4318() * 64;
			arg1.method4326();
		}
		if (Static198.aClass17_Sub1_Sub1_Sub1_3 == arg1 && (arg1.anInt5109 < 1536 || arg1.anInt5108 < 1536 || Static233.anInt5573 * 128 - 1536 <= arg1.anInt5109 || Static134.anInt2971 * 128 - 1536 <= arg1.anInt5108)) {
			arg1.anInt4873 = 0;
			arg1.anInt4830 = -1;
			arg1.anInt4868 = 0;
			arg1.anInt4884 = -1;
			arg1.anInt5109 = arg1.anIntArray438[0] * 128 + arg1.method4318() * 64;
			arg1.anInt5108 = arg1.anIntArray439[0] * 128 + arg1.method4318() * 64;
			arg1.method4326();
		}
		@Pc(196) int local196 = Static313.method5182(arg1);
		Static1.method59(local12, local14, arg1, local196);
		Static143.method2868(arg1);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method1370() {
		if (Static63.anInt5669 != 2) {
			try {
				Static359.method1280(Static93.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
