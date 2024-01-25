import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public static int anInt7905;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Lclient!wm;")
	public static Class390 aClass390_89;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
	public static int anInt7914;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public static int anInt7908 = -1;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_173 = new Class359(1, 8);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
	public static int method6688() {
		if (Static625.aFrame3 == null) {
			return Static150.aBoolean258 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method6689() {
		for (@Pc(7) int local7 = 0; local7 < Static36.anInt607; local7++) {
			@Pc(13) int local13 = Static588.anIntArray533[local7];
			@Pc(20) Class5_Sub25 local20 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local13);
			if (local20 != null) {
				@Pc(25) Class28_Sub1_Sub4_Sub2_Sub1 local25 = local20.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static209.method7249(local25.aClass134_1.anInt3851, local25);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
	public static void method6692() {
		if (!Static261.aBoolean412) {
			return;
		}
		while (true) {
			while (Static415.anInt7348 < Static394.aClass6_Sub1Array2.length) {
				@Pc(29) Class6_Sub1 local29 = Static394.aClass6_Sub1Array2[Static415.anInt7348];
				if (local29 != null && local29.anInt64 == -1) {
					if (Static125.aClass5_Sub29_1 == null) {
						Static125.aClass5_Sub29_1 = Static546.aClass249_1.method5825(local29.aString2);
					}
					@Pc(52) int local52 = Static125.aClass5_Sub29_1.anInt4567;
					if (local52 == -1) {
						return;
					}
					Static415.anInt7348++;
					local29.anInt64 = local52;
					Static125.aClass5_Sub29_1 = null;
				} else {
					Static415.anInt7348++;
				}
			}
			return;
		}
	}
}
