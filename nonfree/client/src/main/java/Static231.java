import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_78 = new Class156(130, 12);

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "Lclient!ak;")
	public static final Class16 aClass16_18 = new Class16();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method3631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static577.aClass5_Sub19_25.aClass17_Sub15_2.method5251() != 0 && arg5 != 0 && Static65.anInt1087 < 50 && arg3 != -1) {
			Static24.aClass248Array1[Static65.anInt1087++] = new Class248((byte) 2, arg3, arg5, arg1, arg0, arg4, arg2, (Class4_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
	public static void method3636() {
		if (Static186.method3179(Static652.anInt10664) || Static285.method4551(false, Static652.anInt10664)) {
			Static3.method31(Static282.anInt5025 >> 12, Static141.anInt2764 >> 12, 5000);
		} else {
			@Pc(25) int local25 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] >> 3;
			@Pc(32) int local32 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0] >> 3;
			if (local25 >= 0 && local25 < Static271.anInt4910 >> 3 && local32 >= 0 && local32 < Static613.anInt9909 >> 3) {
				Static3.method31(local32, local25, 5000);
			} else {
				Static3.method31(Static613.anInt9909 >> 4, Static271.anInt4910 >> 4, 0);
			}
		}
		Static321.method4908();
		Static612.method8399();
		Static318.method4869();
		Static210.method3403();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lclient!wga;")
	public static Class5_Sub13 method3637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(13) Class local13 = Class.forName("dea");
			@Pc(17) Class5_Sub13 local17 = (Class5_Sub13) local13.getDeclaredConstructor().newInstance();
			local17.method4490(arg1, arg2, arg0);
			return local17;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class5_Sub13_Sub2 local30 = new Class5_Sub13_Sub2();
			local30.method4490(arg1, arg2, arg0);
			return local30;
		}
	}
}
