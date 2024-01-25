import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "Lclient!nha;")
	public static final Class229 aClass229_9 = new Class229("", 14);

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
	public static int anInt7250 = 0;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	public static void method6052() {
		for (@Pc(13) int local13 = 0; local13 < Static224.anInt5125; local13++) {
			@Pc(19) Class208 local19 = Static620.aClass208Array1[local13];
			if (local19.aByte88 == 3) {
				if (local19.aClass3_Sub7_Sub1_4 == null) {
					local19.anInt6569 = Integer.MIN_VALUE;
				} else {
					Static581.aClass3_Sub7_Sub3_2.method2210(local19.aClass3_Sub7_Sub1_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIII)V")
	public static void method6053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static429.method6586(arg3, Static583.anInt9761, Static246.anInt5506);
		@Pc(17) int local17 = Static429.method6586(arg2, Static583.anInt9761, Static246.anInt5506);
		@Pc(23) int local23 = Static429.method6586(arg0, Static202.anInt4720, Static472.anInt6105);
		@Pc(29) int local29 = Static429.method6586(arg1, Static202.anInt4720, Static472.anInt6105);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static580.method8027(Static104.anIntArrayArray24[local39], local29, local23, arg4);
		}
	}
}
