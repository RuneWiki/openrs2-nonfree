import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
	public static int anInt4640;

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
	public static int anInt4645;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZII)V")
	public static void method3836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static552.anInt9486 != 1) {
			return;
		}
		@Pc(13) int local13 = arg2 / Static361.anInt6971;
		@Pc(17) int local17 = arg3 / Static361.anInt6971;
		@Pc(21) int local21 = arg1 / Static633.anInt10652;
		@Pc(25) int local25 = arg0 / Static633.anInt10652;
		if (local13 >= Static354.anInt6877 || local17 < 0 || local21 >= Static123.anInt3102 || local25 < 0) {
			return;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (Static123.anInt3102 <= local25) {
			local25 = Static123.anInt3102 - 1;
		}
		if (local17 >= Static354.anInt6877) {
			local17 = Static354.anInt6877 - 1;
		}
		for (@Pc(86) int local86 = local21; local86 <= local25; local86++) {
			@Pc(97) int local97 = Static364.method5868(local86 + Static471.anInt5158, Static123.anInt3102) * Static354.anInt6877;
			for (@Pc(99) int local99 = local13; local99 <= local17; local99++) {
				@Pc(111) int local111 = local97 + Static364.method5868(local99 + Static309.anInt6228, Static354.anInt6877);
				Static326.anIntArray304[local111] = Static409.anInt7607;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIII)V")
	public static void method3837(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static224.aFrame5 != null && (arg0 != 3 || Static202.anInt4434 != arg3 || arg4 != Static206.anInt4483)) {
			Static495.method7177(Static224.aFrame5, Static496.aClass104_4);
			Static224.aFrame5 = null;
		}
		if (arg0 == 3 && Static224.aFrame5 == null) {
			Static224.aFrame5 = Static107.method2448(0, arg3, arg4, Static496.aClass104_4);
			if (Static224.aFrame5 != null) {
				Static202.anInt4434 = arg3;
				Static206.anInt4483 = arg4;
				Static541.method7640();
			}
		}
		if (arg0 == 3 && Static224.aFrame5 == null) {
			method3837(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), true, arg2, -1, -1);
			return;
		}
		@Pc(79) Container local79;
		@Pc(96) Insets local96;
		if (Static224.aFrame5 != null) {
			Static351.anInt6858 = arg3;
			local79 = Static224.aFrame5;
			Static59.anInt1894 = arg4;
		} else if (Static500.aFrame9 == null) {
			if (Static635.anApplet2 == null) {
				local79 = Static560.anApplet_Sub1_1;
			} else {
				local79 = Static635.anApplet2;
			}
			Static351.anInt6858 = local79.getSize().width;
			Static59.anInt1894 = local79.getSize().height;
		} else {
			local96 = Static500.aFrame9.getInsets();
			@Pc(102) int local102 = -local96.left;
			Static351.anInt6858 = Static500.aFrame9.getSize().width + local102 - local96.right;
			@Pc(116) int local116 = local96.bottom + local96.top;
			Static59.anInt1894 = Static500.aFrame9.getSize().height - local116;
			local79 = Static500.aFrame9;
		}
		if (arg0 == 1) {
			Static354.anInt6878 = 0;
			Static294.anInt6026 = Static182.anInt4018;
			Static277.anInt5899 = Static52.anInt1780;
			Static184.anInt4050 = (Static351.anInt6858 - Static182.anInt4018) / 2;
		} else {
			Static521.method8025();
		}
		if (Static86.aClass212_19 != Static630.aClass212_18) {
			@Pc(160) boolean local160;
			if (Static294.anInt6026 < 1024 && Static277.anInt5899 < 768) {
				local160 = true;
			} else {
				local160 = false;
			}
		}
		if (arg1) {
			Static490.method4315();
		} else {
			Static428.aCanvas12.setSize(Static294.anInt6026, Static277.anInt5899);
			if (Static238.aBoolean425) {
				Static513.method7358(Static428.aCanvas12);
			} else {
				Static467.aClass5_13.method6145(Static428.aCanvas12, Static294.anInt6026, Static277.anInt5899);
			}
			if (Static500.aFrame9 == local79) {
				local96 = Static500.aFrame9.getInsets();
				Static428.aCanvas12.setLocation(local96.left + Static184.anInt4050, local96.top + Static354.anInt6878);
			} else {
				Static428.aCanvas12.setLocation(Static184.anInt4050, Static354.anInt6878);
			}
		}
		if (arg0 < 2) {
			Static259.aBoolean555 = false;
		} else {
			Static259.aBoolean555 = true;
		}
		if (Static30.anInt830 != -1) {
			Static80.method2189(true);
		}
		if (Static226.aClass41_1 != null && Static238.method4328(Static333.anInt6626)) {
			Static182.method3421();
		}
		for (@Pc(240) int local240 = 0; local240 < 100; local240++) {
			Static366.aBooleanArray16[local240] = true;
		}
		Static459.aBoolean659 = true;
	}
}
