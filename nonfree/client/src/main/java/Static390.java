import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public static int anInt6094;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	public static int anInt6088 = 0;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
	public static final int[] anIntArray650 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_37 = new Class44(32);

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_79 = new Class139(4);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JI)V")
	public static void method5415(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
	public static void method5417() {
		if (Static304.anInt3133 < 0) {
			return;
		}
		@Pc(8) long local8 = Static288.method4512();
		Static304.anInt3133 = (int) ((long) Static304.anInt3133 + Static224.aLong154 - local8);
		if (Static304.anInt3133 > 0) {
			@Pc(25) int local25 = (Static304.anInt3133 << 8) / Static3.anInt79;
			@Pc(30) int local30 = 255 - local25;
			@Pc(35) float local35 = (float) local25 / 255.0F;
			@Pc(39) float local39 = 1.0F - local35;
			Static56.anInt1131 = (local25 * (Static240.anInt5453 & 0xFF00FF) + local30 * (Static122.aClass102_3.anInt2508 & 0xFF00FF) & 0xFF00FF00) + ((Static122.aClass102_3.anInt2508 & 0xFF00) * local30 + local25 * (Static240.anInt5453 & 0xFF00) & 0xFF0000) >>> 8;
			Static186.aFloat35 = Static177.aFloat34 + local39 * (Static122.aClass102_3.aFloat20 - Static177.aFloat34);
			Static71.aFloat10 = (Static122.aClass102_3.aFloat18 - Static41.aFloat8) * local39 + Static41.aFloat8;
			Static206.aFloat36 = Static17.aFloat1 + local39 * (Static122.aClass102_3.aFloat17 - Static17.aFloat1);
			Static375.aFloat76 = (Static122.aClass102_3.aFloat21 - Static86.aFloat12) * local39 + Static86.aFloat12;
			Static136.anInt2618 = (local25 * (Static362.anInt6084 & 0xFF00FF) + (Static122.aClass102_3.anInt2503 & 0xFF00FF) * local30 & 0xFF00FF00) + ((Static122.aClass102_3.anInt2503 & 0xFF00) * local30 + (Static362.anInt6084 & 0xFF00) * local25 & 0xFF0000) >>> 8;
			Static117.aFloat15 = local39 * (Static122.aClass102_3.aFloat19 - Static32.aFloat6) + Static32.aFloat6;
			Static108.anInt2131 = Static122.aClass102_3.anInt2505 * local30 + local25 * Static377.anInt6281 >> 8;
			Static277.aFloat58 = local39 * (Static122.aClass102_3.aFloat16 - Static104.aFloat14) + Static104.aFloat14;
			if (Static122.aClass102_3.aClass8_4 != Static71.aClass8_2) {
				Static53.aClass8_1 = Static278.aClass155_6.method4933(Static71.aClass8_2, Static122.aClass102_3.aClass8_4, local39, Static53.aClass8_1);
			}
		} else {
			Static56.anInt1131 = Static122.aClass102_3.anInt2508;
			Static206.aFloat36 = Static122.aClass102_3.aFloat17;
			Static71.aFloat10 = Static122.aClass102_3.aFloat18;
			Static304.anInt3133 = -1;
			Static117.aFloat15 = Static122.aClass102_3.aFloat19;
			Static108.anInt2131 = Static122.aClass102_3.anInt2505;
			Static277.aFloat58 = Static122.aClass102_3.aFloat16;
			Static375.aFloat76 = Static122.aClass102_3.aFloat21;
			Static53.aClass8_1 = Static122.aClass102_3.aClass8_4;
			Static136.anInt2618 = Static122.aClass102_3.anInt2503;
			Static186.aFloat35 = Static122.aClass102_3.aFloat20;
		}
		Static224.aLong154 = local8;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method5418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(15, 0);
		local8.method3219();
		local8.anInt3669 = arg1;
		local8.anInt3670 = arg0;
	}
}
