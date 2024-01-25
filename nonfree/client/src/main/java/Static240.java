import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray76 = new int[128][128];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt4827 = 0;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public static int anInt4828 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method4270(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method5060();
		Static163.aClass128Array1 = new Class128[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static163.aClass128Array1[local12] = new Class128();
			Static163.aClass128Array1[local12].anInt3705 = arg0.method5060();
			Static163.aClass128Array1[local12].aString24 = arg0.method5087();
		}
		Static84.anInt4253 = arg0.method5060();
		Static284.anInt5595 = arg0.method5060();
		Static117.anInt2167 = arg0.method5060();
		Static1.aClass6_Sub1Array1 = new Class6_Sub1[Static284.anInt5595 + 1 - Static84.anInt4253];
		for (@Pc(64) int local64 = 0; local64 < Static117.anInt2167; local64++) {
			@Pc(69) int local69 = arg0.method5060();
			@Pc(77) Class6_Sub1 local77 = Static1.aClass6_Sub1Array1[local69] = new Class6_Sub1();
			local77.anInt76 = arg0.method5115();
			local77.anInt81 = arg0.method5067();
			local77.anInt85 = local69 + Static84.anInt4253;
			local77.aString2 = arg0.method5087();
			local77.aString1 = arg0.method5087();
		}
		Static168.anInt3379 = arg0.method5067();
		Static244.aBoolean410 = true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
	public static int method4272(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
