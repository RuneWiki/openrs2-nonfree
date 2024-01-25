import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
	public static int anInt4283;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_98 = new Class136(65, -1);

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
	public static int anInt4284 = 0;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "[I")
	public static final int[] anIntArray354 = new int[13];

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)I")
	public static int method3927() {
		if (Static251.aBoolean343) {
			return 6;
		} else if (Static510.aClass5_Sub4_Sub14_1 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static510.aClass5_Sub4_Sub14_1.anInt5598;
			if (Static272.method4137(local14)) {
				return 1;
			} else if (Static40.method723(local14)) {
				return 2;
			} else if (Static488.method7158(local14)) {
				return 3;
			} else if (Static453.method6733(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
