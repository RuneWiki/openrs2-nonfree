import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_146 = new Class67("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
	public static int anInt9115 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V")
	public static void method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg1, 9);
		local8.method6211();
		local8.anInt7557 = arg0;
		local8.anInt7561 = arg2;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/awt/Frame;Lclient!tq;)V")
	public static void method7515(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class285 arg1) {
		while (true) {
			@Pc(6) Class212 local6 = arg1.method7047(arg0);
			while (local6.anInt6547 == 0) {
				Static327.method5231(10L);
			}
			if (local6.anInt6547 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static327.method5231(100L);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(FBFF)I")
	public static int method7516(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(20) float local20 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(29) float local29 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(38) float local38 = arg2 < 0.0F ? -arg2 : arg2;
		if (local29 > local20 && local29 > local38) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local38 > local20 && local38 > local29) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
