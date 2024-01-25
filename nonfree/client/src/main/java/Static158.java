import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_112 = new Class62("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!db;")
	public static final Class49 aClass49_3 = new Class49("LIVE", 0);

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public static int anInt3256 = 0;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!wb;")
	public static final Class243 aClass243_13 = new Class243(8);

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static int anInt3258 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg3; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg0; local11++) {
				if (Static250.anIntArrayArray33[local7][local11] == arg4 && Static6.anIntArrayArray1[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method2790(@OriginalArg(0) Class3 arg0) {
		if (Static312.anInt5704 != arg0.anInt59) {
			return;
		}
		if (Static182.aClass1_Sub2_Sub1_Sub1_1.aString12 == null) {
			arg0.anInt69 = 0;
			arg0.anInt101 = 0;
			return;
		}
		arg0.anInt44 = 150;
		arg0.anInt105 = (int) (Math.sin((double) Static339.anInt6265 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt63 = 5;
		arg0.anInt101 = Static93.anInt1976;
		arg0.anInt69 = Static318.method5138(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12);
		arg0.anInt48 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt5421;
		arg0.anInt82 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt5375;
		arg0.anInt80 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt5377;
		arg0.anInt112 = 0;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
	public static void method2792(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = Static339.anInt6265 - Static264.anInt3855;
		if (local12 >= 100) {
			Static198.anInt4108 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static323.aFloat71;
		if (Static119.anInt2636 >> 8 > local23) {
			local23 = Static119.anInt2636 >> 8;
		}
		if (Static159.aBooleanArray15[4] && Static354.anIntArray556[4] + 128 > local23) {
			local23 = Static354.anIntArray556[4] + 128;
		}
		@Pc(61) int local61 = (int) Static350.aFloat74 + Static347.anInt6374 & 0x3FFF;
		Static302.method4922(Static36.method2335(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798, Static241.anInt2711, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800) - 50, (local23 >> 3) * 3 + 600, Static74.anInt1635, local23, Static211.anInt4264, local61, arg0);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local12) * (-local12 + 100) * (100 - local12)) / 1000000.0F;
		Static237.anInt4684 = (int) ((float) Static67.anInt1509 + (float) (Static237.anInt4684 - Static67.anInt1509) * local104);
		Static266.anInt5034 = (int) ((float) (Static266.anInt5034 - Static328.anInt6051) * local104 + (float) Static328.anInt6051);
		Static27.anInt2842 = (int) ((float) Static34.anInt593 + (float) (Static27.anInt2842 - Static34.anInt593) * local104);
		Static145.anInt5345 = (int) ((float) (Static145.anInt5345 - Static257.anInt4929) * local104 + (float) Static257.anInt4929);
		@Pc(154) int local154 = Static29.anInt444 - Static73.anInt1629;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static29.anInt444 = (int) (local104 * (float) local154 + (float) Static73.anInt1629);
		Static29.anInt444 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	public static void method2793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub41 local6 = (Class2_Sub41) Static314.aClass238_34.method5795(); local6 != null; local6 = (Class2_Sub41) Static314.aClass238_34.method5799()) {
			Static104.method1853(arg1, arg0, local6, arg3, arg2);
		}
		for (@Pc(31) Class2_Sub41 local31 = (Class2_Sub41) Static126.aClass238_8.method5795(); local31 != null; local31 = (Class2_Sub41) Static126.aClass238_8.method5799()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class227 local40 = local31.aClass1_Sub2_Sub1_Sub2_1.method4799();
			if (local31.aClass1_Sub2_Sub1_Sub2_1.aBoolean394) {
				local35 = 0;
			} else if (local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421 == local40.anInt6455 || local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421 == local40.anInt6462 || local40.anInt6459 == local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421 || local40.anInt6435 == local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421) {
				local35 = 2;
			} else if (local40.anInt6437 == local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421 || local40.anInt6453 == local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421 || local40.anInt6431 == local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421 || local40.anInt6457 == local31.aClass1_Sub2_Sub1_Sub2_1.anInt5421) {
				local35 = 3;
			}
			if (local31.anInt6935 != local35) {
				@Pc(133) int local133 = Static350.method5583(local31.aClass1_Sub2_Sub1_Sub2_1);
				if (local31.anInt6936 != local133) {
					if (local31.aClass2_Sub11_Sub2_3 != null) {
						Static192.aClass2_Sub11_Sub4_1.method4879(local31.aClass2_Sub11_Sub2_3);
						local31.aClass2_Sub11_Sub2_3 = null;
					}
					local31.anInt6936 = local133;
				}
				local31.anInt6935 = local35;
			}
			local31.anInt6938 = local31.aClass1_Sub2_Sub1_Sub2_1.anInt6800;
			local31.anInt6939 = local31.aClass1_Sub2_Sub1_Sub2_1.anInt6800 + local31.aClass1_Sub2_Sub1_Sub2_1.method4792() * 64;
			local31.anInt6932 = local31.aClass1_Sub2_Sub1_Sub2_1.anInt6798;
			local31.anInt6941 = local31.aClass1_Sub2_Sub1_Sub2_1.anInt6798 + local31.aClass1_Sub2_Sub1_Sub2_1.method4792() * 64;
			Static104.method1853(arg1, arg0, local31, arg3, arg2);
		}
		for (@Pc(209) Class2_Sub41 local209 = (Class2_Sub41) Static309.aClass243_26.method5975(); local209 != null; local209 = (Class2_Sub41) Static309.aClass243_26.method5973()) {
			@Pc(213) byte local213 = 1;
			@Pc(218) Class227 local218 = local209.aClass1_Sub2_Sub1_Sub1_2.method4799();
			if (local209.aClass1_Sub2_Sub1_Sub1_2.aBoolean394) {
				local213 = 0;
			} else if (local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421 == local218.anInt6455 || local218.anInt6462 == local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421 || local218.anInt6459 == local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421 || local218.anInt6435 == local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421) {
				local213 = 2;
			} else if (local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421 == local218.anInt6437 || local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421 == local218.anInt6453 || local218.anInt6431 == local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421 || local218.anInt6457 == local209.aClass1_Sub2_Sub1_Sub1_2.anInt5421) {
				local213 = 3;
			}
			if (local209.anInt6935 != local213) {
				@Pc(299) int local299 = Static369.method5879(local209.aClass1_Sub2_Sub1_Sub1_2);
				if (local299 != local209.anInt6936) {
					if (local209.aClass2_Sub11_Sub2_3 != null) {
						Static192.aClass2_Sub11_Sub4_1.method4879(local209.aClass2_Sub11_Sub2_3);
						local209.aClass2_Sub11_Sub2_3 = null;
					}
					local209.anInt6936 = local299;
				}
				local209.anInt6935 = local213;
			}
			local209.anInt6938 = local209.aClass1_Sub2_Sub1_Sub1_2.anInt6800;
			local209.anInt6939 = local209.aClass1_Sub2_Sub1_Sub1_2.anInt6800 + local209.aClass1_Sub2_Sub1_Sub1_2.method4792() * 64;
			local209.anInt6932 = local209.aClass1_Sub2_Sub1_Sub1_2.anInt6798;
			local209.anInt6941 = local209.aClass1_Sub2_Sub1_Sub1_2.anInt6798 + local209.aClass1_Sub2_Sub1_Sub1_2.method4792() * 64;
			Static104.method1853(arg1, arg0, local209, arg3, arg2);
		}
	}
}
