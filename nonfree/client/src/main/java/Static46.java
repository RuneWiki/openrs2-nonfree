import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!em;")
	public static final Class83 aClass83_26 = new Class83(103, 4);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!vv;Z[[[BIB)Z")
	public static boolean method763(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static364.aBoolean618) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8902 >> Static166.anInt7796;
		@Pc(13) int local13 = arg0.anInt8906 >> Static166.anInt7796;
		if (local8 < Static189.anInt3742 || local8 >= Static373.anInt6718 || local13 < Static179.anInt3330 || local13 >= Static9.anInt277) {
			return true;
		} else if ((arg2 == null || arg0.aByte113 < arg3 || arg2[arg0.aByte113][local8][local13] != arg4) && arg0.method7216() && !arg0.method7221()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static115.anInt1985 - 16 && local8 <= Static115.anInt1985 + 16 && local13 >= Static326.anInt4975 - 16 && local13 <= Static326.anInt4975 + 16) {
				if (Static336.aBoolean470) {
					Static198.aClass187Array1[Static222.anInt4110++].method3897(arg0);
					Static222.anInt4110 %= Static19.anInt533;
				} else {
					arg0.method7206(Static458.aClass78_153);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V")
	public static void method764() {
		@Pc(14) Class1_Sub9 local14 = Static123.method2194(Static469.aClass235_2, Static578.aClass208_109);
		Static42.method746(local14);
		for (@Pc(28) Class1_Sub38 local28 = (Class1_Sub38) Static148.aClass91_6.method2278(); local28 != null; local28 = (Class1_Sub38) Static148.aClass91_6.method2276()) {
			if (!local28.method7907()) {
				local28 = (Class1_Sub38) Static148.aClass91_6.method2278();
				if (local28 == null) {
					break;
				}
			}
			if (local28.anInt7675 == 0) {
				Static336.method5001(true, local28, true);
			}
		}
		if (Static390.aClass160_43 != null) {
			Static415.method5900(Static390.aClass160_43);
			Static390.aClass160_43 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method765(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static166.method6223(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local37 <= local45);
			return Static42.method748(arg0, local45);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!sea;ZIIIIZ)V")
	public static void method767(@OriginalArg(0) Class308 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= 0) {
			Static33.method637(arg3, arg2, arg0);
			return;
		}
		Static148.aClass308_59 = arg0;
		Static429.anInt7683 = arg2;
		Static215.anInt3929 = 0;
		Static144.aClass1_Sub6_Sub2_4 = null;
		Static403.anInt7226 = arg3;
		Static2.anInt71 = 1;
		Static167.aBoolean229 = false;
		Static23.anInt578 = Static54.aClass1_Sub6_Sub2_2.method3518() / arg1;
		if (Static23.anInt578 < 1) {
			Static23.anInt578 = 1;
		}
	}
}
