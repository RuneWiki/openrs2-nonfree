import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public static int anInt3102;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!tq;")
	public static Class191 aClass191_97;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public static int anInt3112 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!on;B)V")
	public static void method2932(@OriginalArg(0) Class146 arg0) {
		if (arg0.anInt4443 == Static346.anInt6892) {
			Static200.aBooleanArray29[arg0.anInt4428] = true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZ)I")
	public static int method2933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class2_Sub26 local10 = Static42.method991(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(31) int local31 = 0; local31 < local10.anIntArray269.length; local31++) {
				if (arg0 == local10.anIntArray270[local31]) {
					local22 += local10.anIntArray269[local31];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
	public static void method2935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static53.anInt1131; local3++) {
			@Pc(9) Rectangle local9 = Class20_Sub1.aRectangleArray1[local3];
			if (arg1 < local9.x + local9.width && local9.x < arg1 + arg3 && local9.height + local9.y > arg2 && local9.y < arg2 + arg0) {
				Static200.aBooleanArray29[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)Lclient!ss;")
	public static Class2_Sub11_Sub18 method2936(@OriginalArg(1) int arg0) {
		@Pc(19) Class2_Sub11_Sub18 local19 = (Class2_Sub11_Sub18) Static295.aClass119_179.method3311((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static2.aClass191_5.method5459(26, arg0);
		local19 = new Class2_Sub11_Sub18();
		if (local29 != null) {
			local19.method5232(new Class2_Sub10(local29));
		}
		Static295.aClass119_179.method3308(local19, (long) arg0);
		return local19;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public static void method2938() {
		Static221.aClass119_132.method3312();
	}
}
