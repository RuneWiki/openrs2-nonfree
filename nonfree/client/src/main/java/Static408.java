import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public static int anInt7103;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "Lclient!pu;")
	public static Class270 aClass270_81;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!kda;")
	public static final Class185 aClass185_4 = new Class185();

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_213 = new Class235(23, 8);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V")
	public static void method5641(@OriginalArg(1) byte arg0) {
		if (Static165.aByteArrayArrayArray13 == null) {
			Static165.aByteArrayArrayArray13 = new byte[4][Static71.anInt1410][Static471.anInt8012];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static71.anInt1410; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static471.anInt8012; local22++) {
					Static165.aByteArrayArrayArray13[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method5643() {
		if (Static594.anInt9653 < 0) {
			return;
		}
		@Pc(12) long local12 = Static413.method5668();
		Static594.anInt9653 = (int) ((long) Static594.anInt9653 + Static172.aLong97 - local12);
		if (Static594.anInt9653 <= 0) {
			Static590.anInt9619 = Static362.aClass119_2.anInt2932;
			Static262.aFloat116 = Static362.aClass119_2.aFloat53;
			Static594.anInt9653 = -1;
			Static130.aFloat36 = Static362.aClass119_2.aFloat55;
			Static236.aClass83_3 = Static362.aClass119_2.aClass83_2;
			Static125.anInt2496 = Static362.aClass119_2.anInt2931;
			Static561.anInt9348 = Static362.aClass119_2.anInt2929;
			Static154.aFloat51 = Static362.aClass119_2.aFloat54;
			Static2.aFloat1 = Static362.aClass119_2.aFloat57;
			Static322.aFloat124 = Static362.aClass119_2.aFloat56;
			Static306.aFloat112 = Static362.aClass119_2.aFloat58;
		} else {
			@Pc(62) int local62 = (Static594.anInt9653 << 8) / Static115.anInt2241;
			@Pc(67) int local67 = 255 - local62;
			@Pc(72) float local72 = (float) local62 / 255.0F;
			Static125.anInt2496 = (local67 * (Static362.aClass119_2.anInt2931 & 0xFF00) + (Static524.anInt2123 & 0xFF00) * local62 & 0xFF0000) + (local62 * (Static524.anInt2123 & 0xFF00FF) + local67 * (Static362.aClass119_2.anInt2931 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(108) float local108 = 1.0F - local72;
			Static306.aFloat112 = local108 * (Static362.aClass119_2.aFloat58 - Static473.aFloat183) + Static473.aFloat183;
			Static2.aFloat1 = local108 * (Static362.aClass119_2.aFloat57 - Static216.aFloat107) + Static216.aFloat107;
			Static322.aFloat124 = (Static362.aClass119_2.aFloat56 - Static67.aFloat15) * local108 + Static67.aFloat15;
			Static590.anInt9619 = local67 * Static362.aClass119_2.anInt2932 + local62 * Static347.anInt5777 >> 8;
			Static262.aFloat116 = Static290.aFloat118 + local108 * (Static362.aClass119_2.aFloat53 - Static290.aFloat118);
			Static561.anInt9348 = (local67 * (Static362.aClass119_2.anInt2929 & 0xFF00FF) + (Static266.anInt4704 & 0xFF00FF) * local62 & 0xFF00FF00) + ((Static266.anInt4704 & 0xFF00) * local62 + (local67 * (Static362.aClass119_2.anInt2929 & 0xFF00)) & 0xFF0000) >>> 8;
			Static130.aFloat36 = Static496.aFloat202 + (Static362.aClass119_2.aFloat55 - Static496.aFloat202) * local108;
			Static154.aFloat51 = Static259.aFloat115 + (Static362.aClass119_2.aFloat54 - Static259.aFloat115) * local108;
			if (Static362.aClass119_2.aClass83_2 != Static56.aClass83_1) {
				Static236.aClass83_3 = Static307.aClass134_8.method6895(Static56.aClass83_1, Static362.aClass119_2.aClass83_2, local108, Static236.aClass83_3);
			}
		}
		Static172.aLong97 = local12;
	}
}
