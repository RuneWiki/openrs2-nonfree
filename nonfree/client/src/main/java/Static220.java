import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public static int anInt4855;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!al;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	public static int anInt4856 = -50;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	public static void method4160() {
		if (Static298.anInt5924 < 0) {
			Static160.anInt3750 = -1;
			Static49.anInt819 = -1;
			Static298.anInt5924 = 0;
		}
		if (Static202.anInt4956 < Static298.anInt5924) {
			Static49.anInt819 = -1;
			Static160.anInt3750 = -1;
			Static298.anInt5924 = Static202.anInt4956;
		}
		if (Static105.anInt2196 < 0) {
			Static105.anInt2196 = 0;
			Static160.anInt3750 = -1;
			Static49.anInt819 = -1;
		}
		if (Static202.anInt4957 < Static105.anInt2196) {
			Static49.anInt819 = -1;
			Static105.anInt2196 = Static202.anInt4957;
			Static160.anInt3750 = -1;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V")
	public static void method4161(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(16, arg0);
		local8.method1799();
	}
}
