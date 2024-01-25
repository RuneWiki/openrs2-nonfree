import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public static int anInt4137;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	public static int anInt4143;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public static int anInt4139 = -1;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public static int anInt4140 = 0;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public static int anInt4145 = -2;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public static void method3301() {
		if (Static84.anInt1815 <= 0) {
			Static168.aString26 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static80.aStringArray13.length; local19++) {
			if (Static80.aStringArray13[local19].startsWith("--> ")) {
				@Pc(30) int local30 = ~Static84.anInt1815;
				local17++;
				if (local30 == ~local17) {
					Static168.aString26 = Static80.aStringArray13[local19].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method3302() {
		if (!Static219.aBoolean281) {
			return;
		}
		while (true) {
			while (Static264.aClass56_Sub1Array1.length > Static417.anInt6984) {
				@Pc(26) Class56_Sub1 local26 = Static264.aClass56_Sub1Array1[Static417.anInt6984];
				if (local26 != null && local26.anInt4661 == -1) {
					if (Static46.aClass10_Sub28_1 == null) {
						Static46.aClass10_Sub28_1 = Static179.aClass31_1.method652(local26.aString49);
					}
					@Pc(49) int local49 = Static46.aClass10_Sub28_1.anInt4505;
					if (local49 == -1) {
						return;
					}
					Static46.aClass10_Sub28_1 = null;
					local26.anInt4661 = local49;
					Static417.anInt6984++;
				} else {
					Static417.anInt6984++;
				}
			}
			return;
		}
	}
}
