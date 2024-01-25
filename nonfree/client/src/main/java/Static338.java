import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_79 = new Class215(39, 7);

	@OriginalMember(owner = "client!rd", name = "Bb", descriptor = "I")
	public static int anInt5846 = -1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method4595(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static413.anInt6823 >= 100) {
			Static415.method5323(Static438.aClass83_147.method2267(Static178.anInt3423));
			return;
		}
		@Pc(26) String local26 = Static123.method4868(arg1);
		if (local26 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(31) int local31 = 0; local31 < Static413.anInt6823; local31++) {
			@Pc(39) String local39 = Static123.method4868(Static326.aStringArray27[local31]);
			if (local39 != null && local39.equals(local26)) {
				Static415.method5323(arg1 + Static188.aClass83_113.method2267(Static178.anInt3423));
				return;
			}
			if (Static315.aStringArray26[local31] != null) {
				local69 = Static123.method4868(Static315.aStringArray26[local31]);
				if (local69 != null && local69.equals(local26)) {
					Static415.method5323(arg1 + Static188.aClass83_113.method2267(Static178.anInt3423));
					return;
				}
			}
		}
		for (@Pc(99) int local99 = 0; local99 < Static49.anInt2346; local99++) {
			local69 = Static123.method4868(Static194.aStringArray14[local99]);
			if (local69 != null && local69.equals(local26)) {
				Static415.method5323(Static256.aClass83_99.method2267(Static178.anInt3423) + arg1 + Static232.aClass83_92.method2267(Static178.anInt3423));
				return;
			}
			if (Static57.aStringArray6[local99] != null) {
				@Pc(142) String local142 = Static123.method4868(Static57.aStringArray6[local99]);
				if (local142 != null && local142.equals(local26)) {
					Static415.method5323(Static256.aClass83_99.method2267(Static178.anInt3423) + arg1 + Static232.aClass83_92.method2267(Static178.anInt3423));
					return;
				}
			}
		}
		if (Static123.method4868(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44).equals(local26)) {
			Static415.method5323(Static340.aClass83_119.method2267(Static178.anInt3423));
		} else {
			Static429.method5476(Static81.aClass215_17);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(arg1) + 1);
			Static3.aClass4_Sub12_Sub1_5.method2518(arg1);
			Static3.aClass4_Sub12_Sub1_5.method2551(arg0 ? 1 : 0);
		}
	}
}
