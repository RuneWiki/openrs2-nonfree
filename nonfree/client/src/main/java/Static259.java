import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt5136;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public static int anInt5132 = 0;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public static int anInt5135 = 0;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
	public static int anInt5137 = 0;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public static int anInt5138 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method4086() {
		Static97.method1700((long) Static268.anInt5236);
		if (Static303.anInt5868 != -1) {
			Static25.method487(Static303.anInt5868);
		}
		for (@Pc(21) int local21 = 0; local21 < Static148.anInt3247; local21++) {
			if (Static293.aBooleanArray23[local21]) {
				Static214.aBooleanArray19[local21] = true;
			}
			Static55.aBooleanArray2[local21] = Static293.aBooleanArray23[local21];
			Static293.aBooleanArray23[local21] = false;
		}
		Static269.anInt5269 = -1;
		Static52.anInt1303 = -1;
		Static34.aClass56_5 = null;
		Static42.anInt1111 = Static268.anInt5236;
		if (Static116.aBoolean184) {
			Static257.aBoolean334 = true;
		}
		if (Static303.anInt5868 != -1) {
			Static148.anInt3247 = 0;
			Static24.method479();
		}
		if (Static116.aBoolean184) {
			Static111.method1884();
		} else {
			Static77.method1463();
		}
		Static247.anInt1733 = 0;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method4088() {
		Static185.aClass2_Sub3_Sub1_7.method193();
		Static95.aClass42_23 = null;
		Static73.anInt1821 = 1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!oe;B)Ljava/lang/String;")
	public static String method4089(@OriginalArg(1) Class2_Sub16 arg0) {
		try {
			@Pc(12) int local12 = arg0.method2161();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(21) byte[] local21 = new byte[local12];
			arg0.anInt2789 += Static173.aClass159_1.method4045(local12, arg0.aByteArray17, arg0.anInt2789, local21, 0);
			return Static122.method2047(0, local12, local21);
		} catch (@Pc(45) Exception local45) {
			return "Cabbage";
		}
	}
}
