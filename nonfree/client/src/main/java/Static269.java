import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!qi;")
	public static Class201 aClass201_3;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!pc;")
	public static Class188 aClass188_72;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!pc;")
	public static Class188 aClass188_73;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public static final int anInt4964 = 1405;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public static void method4012() {
		Static313.aClass129_52.method3025();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z")
	public static boolean method4013() {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262;
		if (local8 == null || local8 == Static288.aClass265_41.aClass2_257) {
			return false;
		} else {
			if (local8.anInt4529 >= 2000) {
				local8.anInt4529 -= 2000;
			}
			return local8.anInt4529 == 1007;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!it;Z)V")
	public static void method4015(@OriginalArg(0) Class4_Sub2_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static164.anInt3206 == arg0.anInt6457 || arg0.anInt6469 == -1 || arg0.anInt6517 != 0) {
			local5 = true;
		} else {
			@Pc(22) Class46 local22 = Static9.aClass194_1.method4371(arg0.anInt6469);
			if (local22.aBoolean152 || local22.anIntArray89[arg0.anInt6483] < arg0.anInt6460 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt6457 - arg0.anInt6463;
			@Pc(60) int local60 = Static164.anInt3206 - arg0.anInt6463;
			@Pc(71) int local71 = arg0.anInt6496 * 128 + arg0.method5118() * 64;
			@Pc(82) int local82 = arg0.anInt6498 * 128 + arg0.method5118() * 64;
			@Pc(94) int local94 = arg0.anInt6454 * 128 + arg0.method5118() * 64;
			@Pc(106) int local106 = arg0.anInt6518 * 128 + arg0.method5118() * 64;
			arg0.anInt7111 = (local106 * local60 + local82 * (local54 - local60)) / local54;
			arg0.anInt7117 = (local71 * (local54 - local60) + local60 * local94) / local54;
		}
		arg0.anInt6526 = 0;
		if (arg0.anInt6500 == 0) {
			arg0.method5122(8192);
		}
		if (arg0.anInt6500 == 1) {
			arg0.method5122(12288);
		}
		if (arg0.anInt6500 == 2) {
			arg0.method5122(0);
		}
		if (arg0.anInt6500 == 3) {
			arg0.method5122(4096);
		}
	}
}
