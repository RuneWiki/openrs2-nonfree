import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!cga", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
	public static int anInt1437;

	@OriginalMember(owner = "client!cga", name = "s", descriptor = "I")
	public static int anInt1430 = -1;

	@OriginalMember(owner = "client!cga", name = "v", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Z")
	public static boolean method976() {
		try {
			if (Static409.anInt7111 == 2) {
				if (Static15.aClass2_Sub49_1 == null) {
					Static15.aClass2_Sub49_1 = Static605.method7745(Static554.aClass259_166, Static185.anInt9183, Static219.anInt4151);
					if (Static15.aClass2_Sub49_1 == null) {
						return false;
					}
				}
				if (Static77.aClass257_140 == null) {
					Static77.aClass257_140 = new Class257(Static314.aClass259_164, Static444.aClass259_139);
				}
				if (Static396.aClass2_Sub10_Sub2_3.method1552(Static456.aClass259_141, Static15.aClass2_Sub49_1, Static77.aClass257_140)) {
					Static396.aClass2_Sub10_Sub2_3.method1563();
					if (Static103.anInt2117 > 0) {
						Static409.anInt7111 = 3;
						Static396.aClass2_Sub10_Sub2_3.method1531(0);
					} else {
						Static409.anInt7111 = 0;
						Static396.aClass2_Sub10_Sub2_3.method1531(Static526.anInt8654);
					}
					if (Static586.aLong266 > 0L) {
						Static396.aClass2_Sub10_Sub2_3.method1529(Static586.aLong266, Static15.aClass2_Sub49_1, Static362.aBoolean487);
					} else {
						Static396.aClass2_Sub10_Sub2_3.method1534(Static15.aClass2_Sub49_1, Static362.aBoolean487);
					}
					Static15.aClass2_Sub49_1 = null;
					Static586.aLong266 = 0L;
					Static554.aClass259_166 = null;
					Static77.aClass257_140 = null;
					return true;
				}
			}
		} catch (@Pc(92) Exception local92) {
			local92.printStackTrace();
			Static396.aClass2_Sub10_Sub2_3.method1533();
			Static77.aClass257_140 = null;
			Static409.anInt7111 = 0;
			Static15.aClass2_Sub49_1 = null;
			Static554.aClass259_166 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V")
	public static void method978() {
		Static268.aClass313_63.method6977();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!kp;II)V")
	public static void method979(@OriginalArg(1) Class196 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class20 local14 = arg0.method4250(Static307.aClass100_6);
		if (local14 == null) {
			return;
		}
		Static307.aClass100_6.da(arg1, arg2, arg1 + arg0.anInt5130, arg0.anInt5078 + arg2);
		if (Static422.anInt7227 >= 3) {
			Static307.aClass100_6.FA(-16777216, local14, arg1, arg2);
		} else {
			Static410.aClass39_29.method7853((float) arg1 + (float) arg0.anInt5130 / 2.0F, (float) arg0.anInt5078 / 2.0F + (float) arg2, ((int) -Static447.aFloat233 & 0x3FFF) << 2, local14, arg1, arg2);
		}
	}
}
