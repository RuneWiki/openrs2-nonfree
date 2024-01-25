import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[128][128];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V")
	public static void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static399.anInt2866 <= arg0 && arg2 <= Static372.anInt6316 && Static316.anInt5349 <= arg3 && Static418.anInt7030 >= arg4) {
			Static197.method3058(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static423.method5769(arg3, arg0, arg4, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	public static void method3684() {
		Static155.method2396();
		Static387.method5395(Static39.aClass79_Sub1_1.aBoolean147);
		Static151.aClass96_2 = Static81.method1464(Static32.aClass51_1, 22050, Static151.aCanvas2, 0);
		Static151.aClass96_2.method3468(Static293.aClass3_Sub1_Sub4_2);
		Static63.aClass96_3 = Static81.method1464(Static32.aClass51_1, 2048, Static151.aCanvas2, 1);
		Static63.aClass96_3.method3468(Static440.aClass3_Sub1_Sub2_2);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!ik;)V")
	public static void method3685(@OriginalArg(1) Class3_Sub25_Sub1 arg0) {
		arg0.method2785();
		@Pc(17) int local17 = Static317.anInt5364;
		@Pc(27) Class1_Sub2_Sub6_Sub2 local27 = Static203.aClass1_Sub2_Sub6_Sub2_1 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local17] = new Class1_Sub2_Sub6_Sub2();
		local27.anInt7621 = local17;
		@Pc(37) int local37 = arg0.method2783(30);
		@Pc(42) byte local42 = (byte) (local37 >> 28);
		@Pc(48) int local48 = local37 >> 14 & 0x3FFF;
		@Pc(52) int local52 = local37 & 0x3FFF;
		local27.anIntArray510[0] = local48 - Static59.anInt1127;
		local27.anInt7560 = (local27.anIntArray510[0] << 7) + (local27.method6204() << 6);
		local27.anIntArray509[0] = local52 - Static49.anInt873;
		local27.anInt7557 = (local27.anIntArray509[0] << 7) + (local27.method6204() << 6);
		Static276.anInt4606 = local27.aByte101 = local42;
		if (Static278.aClass3_Sub25Array1[local17] != null) {
			local27.method6214(Static278.aClass3_Sub25Array1[local17]);
		}
		Static271.anInt4534 = 0;
		Static215.anIntArray267[Static271.anInt4534++] = local17;
		Static166.aByteArray57[local17] = 0;
		Static105.anInt1898 = 0;
		for (@Pc(131) int local131 = 1; local131 < 2048; local131++) {
			if (local17 != local131) {
				@Pc(145) int local145 = arg0.method2783(18);
				@Pc(149) int local149 = local145 >> 16;
				@Pc(155) int local155 = local145 >> 8 & 0xFF;
				@Pc(159) int local159 = local145 & 0xFF;
				@Pc(167) Class197 local167 = Static147.aClass197Array1[local131] = new Class197();
				local167.anInt5547 = 0;
				local167.anInt5548 = (local149 << 28) + (local155 << 14) + local159;
				local167.anInt5546 = -1;
				local167.aBoolean400 = false;
				Static55.anIntArray55[Static105.anInt1898++] = local131;
				Static166.aByteArray57[local131] = 0;
			}
		}
		arg0.method2786();
	}
}
