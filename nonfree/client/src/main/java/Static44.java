import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[S")
	public static short[] aShortArray11 = new short[256];

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_18 = new Class240(90, 3);

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!sia;")
	public static final Class323 aClass323_1 = new Class323();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method790(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 2);
		local9.method8834();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ub;I)I")
	public static int method791(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class261 local8 = arg0.aClass261_1;
		if (local8.anIntArray364 != null) {
			local8 = local8.method5772(Static210.aClass262_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt6824;
		@Pc(27) Class286 local27 = arg0.method7878();
		if (arg0.anInt9647 == -1 || arg0.aBoolean673) {
			local23 = local8.anInt6800;
		} else if (local27.anInt7545 == arg0.anInt9647 || local27.anInt7513 == arg0.anInt9647 || local27.anInt7525 == arg0.anInt9647 || arg0.anInt9647 == local27.anInt7517) {
			local23 = local8.anInt6789;
		} else if (local27.anInt7510 == arg0.anInt9647 || arg0.anInt9647 == local27.anInt7507 || arg0.anInt9647 == local27.anInt7535 || local27.anInt7526 == arg0.anInt9647) {
			local23 = local8.anInt6788;
		}
		return local23;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIB)I")
	public static int method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!uq;I)V")
	public static void method793(@OriginalArg(0) Class362 arg0) {
		Static206.anInt3612 = arg0.method8353("p11_full");
		Static642.anInt10556 = arg0.method8353("p12_full");
		Static336.anInt5797 = arg0.method8353("b12_full");
	}
}
