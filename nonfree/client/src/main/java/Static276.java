import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
	public static int anInt5738;

	@OriginalMember(owner = "client!rg", name = "Bb", descriptor = "I")
	public static int anInt5762;

	@OriginalMember(owner = "client!rg", name = "Cb", descriptor = "I")
	public static int anInt5763;

	@OriginalMember(owner = "client!rg", name = "rb", descriptor = "Lclient!tn;")
	public static Class190 aClass190_30 = new Class190(128);

	@OriginalMember(owner = "client!rg", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray562 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(I)V")
	public static void method5079() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static22.anInt481; local11++) {
			for (@Pc(14) int local14 = 0; local14 < Static269.anInt5281; local14++) {
				if (Static99.method1780(Static178.aClass174ArrayArrayArray3, local14, local11, local5, true)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "(I)Lclient!cd;")
	public static Class32_Sub1 method5091() {
		@Pc(13) Class32_Sub1 local13 = (Class32_Sub1) Static343.aClass39_7.method805();
		if (local13 == null) {
			return new Class32_Sub1();
		} else {
			Static187.anInt3709--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)V")
	public static void method5092(@OriginalArg(1) int arg0) {
		Static229.anInt4619 = 100;
		Static73.anInt1412 = arg0;
		Static191.anInt3783 = 3;
		Static320.anInt6195 = -1;
	}
}
