import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "Lclient!wc;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
	public static int anInt7008 = 0;

	@OriginalMember(owner = "client!nca", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
	public static void method5881() {
		for (@Pc(12) Class3_Sub1_Sub17 local12 = (Class3_Sub1_Sub17) Static239.aClass276_36.method6907(); local12 != null; local12 = (Class3_Sub1_Sub17) Static239.aClass276_36.method6912()) {
			@Pc(17) Class2_Sub3_Sub1_Sub1 local17 = local12.aClass2_Sub3_Sub1_Sub1_1;
			if (local17.aBoolean33) {
				local12.method8671();
				local17.method411();
			} else if (local17.anInt350 <= Static251.anInt5580) {
				local17.method408(Static550.anInt9371);
				if (local17.aBoolean33) {
					local12.method8671();
				} else {
					Static286.method4985(local17, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!ow;I)V")
	public static void method5883(@OriginalArg(0) Class253 arg0) {
		Static388.aClass253_1 = arg0;
	}
}
