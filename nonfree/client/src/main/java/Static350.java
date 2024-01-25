import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!mga", name = "x", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_47 = new Class181(2, 6);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!qda;Z)I")
	public static int method5350(@OriginalArg(0) Class281 arg0) {
		if (Static507.aClass281_21 == arg0) {
			return 6407;
		} else if (arg0 == Static208.aClass281_10) {
			return 6408;
		} else if (arg0 == Static225.aClass281_13) {
			return 6406;
		} else if (arg0 == Static274.aClass281_22) {
			return 6409;
		} else if (arg0 == Static191.aClass281_9) {
			return 6410;
		} else if (Static582.aClass281_20 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)V")
	public static void method5351(@OriginalArg(1) int arg0) {
		Static340.anInt5872 = 3;
		Static299.anInt4748 = arg0;
		Static95.anInt1501 = -1;
		Static10.anInt161 = 100;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZLclient!nba;)V")
	public static void method5352(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub35 arg1) {
		if (arg1.aBoolean540) {
			if (arg1.anInt6496 < 0 || Static593.method8313(arg1.anInt6488, arg1.anInt6496)) {
				if (arg0) {
					Static521.method7481(arg1.anInt6495, (Class35) null, arg1.anInt6492, arg1.anInt6493, arg1.anInt6497);
				} else {
					Static373.method5813(arg1.anInt6490, -1, arg1.anInt6492, arg1.anInt6493, arg1.anInt6496, arg1.anInt6495, arg1.anInt6488, arg1.anInt6497);
				}
				arg1.method8911();
			}
		} else if (arg1.aBoolean539 && arg1.anInt6495 >= 1 && arg1.anInt6497 >= 1 && Static111.anInt1752 - 2 >= arg1.anInt6495 && arg1.anInt6497 <= Static279.anInt4567 - 2 && (arg1.anInt6491 < 0 || Static593.method8313(arg1.anInt6487, arg1.anInt6491))) {
			if (arg0) {
				Static521.method7481(arg1.anInt6495, arg1.aClass35_2, arg1.anInt6492, arg1.anInt6493, arg1.anInt6497);
			} else {
				Static373.method5813(arg1.anInt6494, -1, arg1.anInt6492, arg1.anInt6493, arg1.anInt6491, arg1.anInt6495, arg1.anInt6487, arg1.anInt6497);
			}
			arg1.aBoolean539 = false;
			if (!arg0 && arg1.anInt6491 == arg1.anInt6496 && arg1.anInt6496 == -1) {
				arg1.method8911();
			} else if (!arg0 && arg1.anInt6491 == arg1.anInt6496 && arg1.anInt6494 == arg1.anInt6490 && arg1.anInt6487 == arg1.anInt6488) {
				arg1.method8911();
			}
		}
	}
}
