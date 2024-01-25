import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public static int anInt3028;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)V")
	public static void method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class2_Sub5_Sub11 local20 = Static316.method4316(9, arg2);
		local20.method3098();
		local20.anInt3911 = arg1;
		local20.anInt3916 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IILclient!dk;ZIII)V")
	public static void method2462(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static64.anInt1192 = arg2;
		Static76.anInt1460 = 1;
		Static101.anInt1907 = 0;
		Static412.aClass54_111 = arg1;
		Static147.anInt2601 = arg3;
		Static430.aBoolean503 = false;
		Static228.anInt3708 = Static84.aClass2_Sub1_Sub2_3.method599() / arg0;
		if (Static228.anInt3708 < 1) {
			Static228.anInt3708 = 1;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method2463() {
		Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
		Static209.anInt3493 = 0;
		Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
		Static248.aClass211_96 = null;
		Static246.aClass211_95 = null;
		Static208.aClass211_83 = null;
		Static375.anInt6248 = 0;
		Static175.aClass211_73 = null;
		Static375.anInt6250 = 0;
		Static331.method4434();
		Static44.method4793();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static152.aClass3_Sub4_Sub1_Sub2Array1[local31] = null;
		}
		Static60.aClass3_Sub4_Sub1_Sub2_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static384.anInt6329; local47++) {
			@Pc(54) Class3_Sub4_Sub1_Sub1 local54 = Static332.aClass2_Sub28Array1[local47].aClass3_Sub4_Sub1_Sub1_1;
			if (local54 != null) {
				local54.anInt4936 = -1;
			}
		}
		Static390.method5290();
		Static414.anInt6776 = 1;
		Static37.method5022(9);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static101.aBooleanArray9[local81] = true;
		}
		Static226.method2970();
		Static131.aClass2_Sub11_1 = null;
		Static81.aLong51 = 0L;
	}
}
