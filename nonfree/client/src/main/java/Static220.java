import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_5 = new Class262(14, 7);

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "Lclient!au;")
	public static final Class21 aClass21_37 = new Class21(3000000, 200);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)Z")
	public static boolean method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)I")
	public static int method2685() {
		if (Static572.aBoolean774) {
			return 6;
		} else if (Static506.aClass2_Sub27_3 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static506.aClass2_Sub27_3.anInt4323;
			if (Static469.method6042(local19)) {
				return 1;
			} else if (Static427.method5678(local19)) {
				return 2;
			} else if (Static219.method2681(local19)) {
				return 3;
			} else if (Static577.method7485(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
	public static void method2686() {
		Static15.aClass162_1.ra(Static498.aFloat204 * ((float) Static257.aClass2_Sub35_Sub1_1.anInt7508 * 0.1F + 0.7F));
		Static15.aClass162_1.VA(Static366.anInt6169, Static77.aFloat31, Static384.aFloat180, (float) (Static279.anInt4788 << 2), (float) (Static182.anInt2689 << 2), (float) (Static236.anInt3929 << 2));
		Static15.aClass162_1.method6812(Static496.aClass17_3);
	}
}
