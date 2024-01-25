import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public static int anInt7883;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_86 = new Class46(3, 4);

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	public static int anInt7886 = 7000;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	public static int anInt7885 = anInt7886;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
	public static void method6943(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static631.anInt10493 - Static529.anInt9092;
		if (local8 >= 100) {
			Static254.anInt4612 = 1;
			Static396.anInt6606 = -1;
			Static304.anInt5319 = -1;
			return;
		}
		@Pc(23) int local23 = (int) Static552.aFloat176;
		if (local23 < Static304.anInt5321 >> 8) {
			local23 = Static304.anInt5321 >> 8;
		}
		if (Static433.aBooleanArray22[4] && local23 < Static91.anIntArray118[4] + 128) {
			local23 = Static91.anIntArray118[4] + 128;
		}
		@Pc(60) int local60 = Static387.anInt6399 + (int) Static311.aFloat95 & 0x3FFF;
		Static442.method6691(local60, Static57.anInt1135, arg0, Static343.anInt5775, local23, Static644.method9021(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231, Static636.anInt10567) - 200, (local23 >> 3) * 3 + 600 << 2);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static441.anInt7550 = (int) ((float) Static584.anInt9818 + local103 * (float) (Static441.anInt7550 - Static584.anInt9818));
		Static210.anInt4029 = (int) ((float) (Static210.anInt4029 - Static583.anInt9804) * local103 + (float) Static583.anInt9804);
		Static117.anInt2170 = (int) ((float) (Static117.anInt2170 - Static249.anInt4553) * local103 + (float) Static249.anInt4553);
		Static19.anInt277 = (int) (local103 * (float) (Static19.anInt277 - Static522.anInt8984) + (float) Static522.anInt8984);
		@Pc(159) int local159 = Static491.anInt8292 - Static88.anInt1811;
		if (local159 > 8192) {
			local159 -= 16384;
		} else if (local159 < -8192) {
			local159 += 16384;
		}
		Static491.anInt8292 = (int) ((float) local159 * local103 + (float) Static88.anInt1811);
		Static491.anInt8292 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ)V")
	public static void method6945(@OriginalArg(0) int arg0) {
		if (Static97.aClass5_Sub25_8.aClass6_Sub19_1.method5268() == 0) {
			arg0 = -1;
		}
		if (Static403.anInt6726 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(30) Class77 local30 = Static232.aClass189_2.method4428(arg0);
			@Pc(34) Class131 local34 = local30.method1645();
			if (local34 == null) {
				arg0 = -1;
			} else {
				Static470.aClass100_14.method2099(new Point(local30.anInt1999, local30.anInt1995), local34.method2898(), local34.method2889(), local34.method2894(), Static83.aCanvas14);
				Static403.anInt6726 = arg0;
			}
		}
		if (arg0 == -1 && Static403.anInt6726 != -1) {
			Static470.aClass100_14.method2099(new Point(), -1, null, -1, Static83.aCanvas14);
			Static403.anInt6726 = -1;
		}
	}
}
