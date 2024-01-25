import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nj", name = "sb", descriptor = "Lclient!uu;")
	public static Class250 aClass250_69;

	@OriginalMember(owner = "client!nj", name = "wb", descriptor = "Lclient!uu;")
	public static Class250 aClass250_70;

	@OriginalMember(owner = "client!nj", name = "Ab", descriptor = "I")
	public static int anInt5005;

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "Lclient!la;")
	public static final Class136 aClass136_132 = new Class136(28, 10);

	@OriginalMember(owner = "client!nj", name = "qb", descriptor = "Lclient!of;")
	public static final Class174 aClass174_136 = new Class174("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg0;
		@Pc(14) int local14 = arg1 - arg6;
		for (@Pc(20) int local20 = arg0; local20 < local9; local20++) {
			Static201.method3084(Static296.anIntArrayArray42[local20], arg3, arg5, arg4);
		}
		@Pc(38) int local38 = arg3 + arg6;
		for (@Pc(40) int local40 = arg1; local40 > local14; local40--) {
			Static201.method3084(Static296.anIntArrayArray42[local40], arg3, arg5, arg4);
		}
		@Pc(59) int local59 = arg5 - arg6;
		for (@Pc(61) int local61 = local9; local61 <= local14; local61++) {
			@Pc(67) int[] local67 = Static296.anIntArrayArray42[local61];
			Static201.method3084(local67, arg3, local38, arg4);
			Static201.method3084(local67, local38, local59, arg2);
			Static201.method3084(local67, local59, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "(I)V")
	public static void method4114() {
		if (Static52.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static229.anInt3847;
		@Pc(22) int local22 = Static159.anInt2944;
		@Pc(30) int local30 = anInt5005 - local8 - Static310.anInt5307;
		@Pc(38) int local38 = Static199.anInt3571 - local22 - Static166.anInt3014;
		if (local8 <= 0 && local30 <= 0 && local22 <= 0 && local38 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static456.aFrame2 == null) {
				local53 = Static32.aClass51_1.anApplet1;
			} else {
				local53 = Static456.aFrame2;
			}
			@Pc(60) int local60 = 0;
			@Pc(62) int local62 = 0;
			if (Static456.aFrame2 == local53) {
				@Pc(68) Insets local68 = Static456.aFrame2.getInsets();
				local60 = local68.left;
				local62 = local68.top;
			}
			@Pc(77) Graphics local77 = local53.getGraphics();
			local77.setColor(Color.black);
			if (local8 > 0) {
				local77.fillRect(local60, local62, local8, Static199.anInt3571);
			}
			if (local22 > 0) {
				local77.fillRect(local60, local62, anInt5005, local22);
			}
			if (local30 > 0) {
				local77.fillRect(local60 + anInt5005 - local30, local62, local30, Static199.anInt3571);
			}
			if (local38 > 0) {
				local77.fillRect(local60, Static199.anInt3571 + local62 - local38, anInt5005, local38);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}
}
