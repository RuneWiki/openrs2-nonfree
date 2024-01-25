import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array4;

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_34 = new Class179(52, 4);

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
	public static int anInt2855 = 10;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "(I)V")
	public static void method2440() {
		if (Static136.anInt2710 < 0) {
			return;
		}
		@Pc(7) long local7 = Static279.method4058();
		Static136.anInt2710 = (int) ((long) Static136.anInt2710 + Static355.aLong181 - local7);
		if (Static136.anInt2710 <= 0) {
			Static432.anInt7011 = Static385.aClass93_2.anInt2702;
			Static233.aFloat11 = Static385.aClass93_2.aFloat21;
			Static420.aFloat98 = Static385.aClass93_2.aFloat20;
			Static136.anInt2710 = -1;
			Static98.aFloat14 = Static385.aClass93_2.aFloat16;
			Static367.aFloat92 = Static385.aClass93_2.aFloat18;
			Static328.aFloat90 = Static385.aClass93_2.aFloat19;
			Static368.anInt6047 = Static385.aClass93_2.anInt2703;
			Static200.anInt3837 = Static385.aClass93_2.anInt2695;
			Static149.aFloat94 = Static385.aClass93_2.aFloat17;
			Static459.aClass16_6 = Static385.aClass93_2.aClass16_4;
		} else {
			@Pc(58) int local58 = (Static136.anInt2710 << 8) / Static383.anInt6211;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			Static368.anInt6047 = (local58 * (Static15.anInt439 & 0xFF00) + local63 * (Static385.aClass93_2.anInt2703 & 0xFF00) & 0xFF0000) + (local63 * (Static385.aClass93_2.anInt2703 & 0xFF00FF) + (Static15.anInt439 & 0xFF00FF) * local58 & 0xFF00FF00) >>> 8;
			@Pc(105) float local105 = 1.0F - local68;
			Static200.anInt3837 = ((Static80.anInt1794 & 0xFF00FF) * local58 + local63 * (Static385.aClass93_2.anInt2695 & 0xFF00FF) & 0xFF00FF00) + (local58 * (Static80.anInt1794 & 0xFF00) + (Static385.aClass93_2.anInt2695 & 0xFF00) * local63 & 0xFF0000) >>> 8;
			Static328.aFloat90 = Static243.aFloat65 + local105 * (Static385.aClass93_2.aFloat19 - Static243.aFloat65);
			Static420.aFloat98 = (Static385.aClass93_2.aFloat20 - Static206.aFloat57) * local105 + Static206.aFloat57;
			Static367.aFloat92 = Static140.aFloat23 + (Static385.aClass93_2.aFloat18 - Static140.aFloat23) * local105;
			Static149.aFloat94 = Static187.aFloat34 + local105 * (Static385.aClass93_2.aFloat17 - Static187.aFloat34);
			Static98.aFloat14 = local105 * (Static385.aClass93_2.aFloat16 - Static379.aFloat63) + Static379.aFloat63;
			Static233.aFloat11 = (Static385.aClass93_2.aFloat21 - Static379.aFloat64) * local105 + Static379.aFloat64;
			Static432.anInt7011 = local63 * Static385.aClass93_2.anInt2702 + local58 * Static411.anInt6631 >> 8;
			if (Static385.aClass93_2.aClass16_4 != Static442.aClass16_7) {
				Static459.aClass16_6 = Static201.aClass39_6.method4545(Static442.aClass16_7, Static385.aClass93_2.aClass16_4, local105, Static459.aClass16_6);
			}
		}
		Static355.aLong181 = local7;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	public static void method2441() {
		Static53.anInt991 = 0;
		Static286.anInt5015 = -1;
		Static59.aBoolean86 = false;
		Static390.anInt6278 = 1;
		Static157.aClass246_114 = null;
		Static23.anInt5191 = 2;
		Static152.anInt2905 = -1;
	}
}
