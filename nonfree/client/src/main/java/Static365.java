import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	public static int anInt7042;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!pn;")
	public static Class4_Sub21_Sub4 aClass4_Sub21_Sub4_6;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_34 = new Class167(4);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!vca;")
	public static final Class340 aClass340_3 = new Class340(128);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public static int anInt7047 = 0;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public static void method5511() {
		Static425.anInt8157 = 0;
		@Pc(13) int local13 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >> 9) + Static242.anInt10133;
		@Pc(21) int local21 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >> 9) + Static157.anInt3323;
		if (local13 >= 3053 && local13 <= 3156 && local21 >= 3056 && local21 <= 3136) {
			Static425.anInt8157 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local21 >= 9492 && local21 <= 9535) {
			Static425.anInt8157 = 1;
		}
		if (Static425.anInt8157 == 1 && local13 >= 3139 && local13 <= 3199 && local21 >= 3008 && local21 <= 3062) {
			Static425.anInt8157 = 0;
		}
	}
}
