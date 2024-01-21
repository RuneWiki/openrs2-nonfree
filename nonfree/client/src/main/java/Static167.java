import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1231 = Static161.method2452("Allocated memory");

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1229 = aClass20_1231;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1230 = Static161.method2452("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1232 = Static161.method2452("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!rg", name = "Y", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[104][104];

	@OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
	public static int anInt3347 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!wa;III)Z")
	public static boolean method2532(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) byte[] local5 = arg0.method738(arg2, arg1);
		if (local5 == null) {
			return false;
		} else {
			Static33.method540(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!dc;ZZ)V")
	public static void method2533(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(23) int local23 = Static165.aClass5_Sub2_Sub8_5.method1351(arg0, 250);
		@Pc(30) int local30 = Static165.aClass5_Sub2_Sub8_5.method1353(arg0, 250) * 13;
		Static42.method824(6, 6, local23 + 4 + 4, local30 + 4 + 4, 0);
		Static42.method817(6, 6, local23 + 4 + 4, local30 + 8, 16777215);
		Static165.aClass5_Sub2_Sub8_5.method1349(arg0, 10, 10, local23, local30, 16777215, -1, 1, 1, 0);
		Static213.method3132(local30 + 8, local23 - -4 + 4, 6, 6);
		if (!arg1) {
			Static10.method208(10, local23, local30, 10);
			return;
		}
		@Pc(107) Canvas local107 = Static198.aCanvas1;
		try {
			@Pc(110) Graphics local110 = local107.getGraphics();
			Static197.aClass24_1.method2287(local110);
		} catch (@Pc(118) Exception local118) {
			local107.repaint();
		}
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V")
	public static void method2535() {
		if (Static146.aClass39_2 != null) {
			Static146.aClass39_2.method1175();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([Lclient!dc;III)Lclient!dc;")
	public static Class20 method2536(@OriginalArg(0) Class20[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg0[local9 + arg1] == null) {
				arg0[local9 + arg1] = Static41.aClass20_305;
			}
			local7 += arg0[local9 + arg1].anInt712;
		}
		@Pc(44) byte[] local44 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(56) Class20 local56;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			local56 = arg0[local48 + arg1];
			Static220.method51(local56.aByteArray10, 0, local44, local46, local56.anInt712);
			local46 += local56.anInt712;
		}
		local56 = new Class20();
		local56.anInt712 = local7;
		local56.aByteArray10 = local44;
		return local56;
	}
}
