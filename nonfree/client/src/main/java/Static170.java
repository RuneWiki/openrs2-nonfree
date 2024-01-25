import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "Lclient!tj;")
	public static Class193 aClass193_61;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "Lclient!vq;")
	public static Class47 aClass47_5;

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
	public static int anInt3632;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_129 = new Class198(64);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILclient!tj;)Lclient!qf;")
	public static Class165 method3292(@OriginalArg(2) int arg0, @OriginalArg(3) Class193 arg1) {
		@Pc(9) byte[] local9 = arg1.method5047(arg0, 0);
		return local9 == null ? null : new Class165(local9);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)I")
	public static int method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = local7 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
	public static void method3295() {
		Static15.aClass4_Sub11_Sub1_2.method706(179);
		for (@Pc(18) Class4_Sub25 local18 = (Class4_Sub25) Static270.aClass43_29.method1283(); local18 != null; local18 = (Class4_Sub25) Static270.aClass43_29.method1278()) {
			if (!local18.method5689()) {
				local18 = (Class4_Sub25) Static270.aClass43_29.method1283();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt3697 == 0) {
				Static234.method4154(true, local18, true);
			}
		}
		if (Static16.aClass21_1 != null) {
			Static349.method5536(Static16.aClass21_1);
			Static16.aClass21_1 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!br;)V")
	public static void method3301(@OriginalArg(1) Class21 arg0) {
		if (!Static344.aBoolean219) {
			return;
		}
		Static15.aClass4_Sub11_Sub1_2.method706(175);
		Static15.aClass4_Sub11_Sub1_2.method3452(arg0.anInt728);
		Static15.aClass4_Sub11_Sub1_2.method3438(Static255.anInt5164);
		Static15.aClass4_Sub11_Sub1_2.method3443(Static209.anInt4333);
		Static15.aClass4_Sub11_Sub1_2.method3443(arg0.anInt791);
		Static15.aClass4_Sub11_Sub1_2.method3459(arg0.anInt770);
		Static15.aClass4_Sub11_Sub1_2.method3422(Static82.anInt2376);
	}
}
