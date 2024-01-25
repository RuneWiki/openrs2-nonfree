import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!jf;")
	public static Class119 aClass119_5;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "Lclient!vh;")
	public static final Class2_Sub16_Sub2 aClass2_Sub16_Sub2_3 = new Class2_Sub16_Sub2(5000);

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public static int anInt4548 = 0;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public static void method4025() {
		Static358.method1970(false);
		if (Static343.anInt5838 >= 0 && Static343.anInt5838 != 0) {
			Static150.method2787(Static343.anInt5838);
			Static343.anInt5838 = -1;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)I")
	public static int method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
	public static int method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static68.anIntArrayArray13 == null ? 0 : Static68.anIntArrayArray13[arg0][arg1] & 0xFFFFFF;
	}
}
