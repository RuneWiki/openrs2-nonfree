import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array13;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_37 = new Class227();

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZII)I")
	public static int method4840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static147.aByteArrayArrayArray22[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static147.aByteArrayArrayArray22[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jk;B)V")
	public static void method4842(@OriginalArg(0) Class124 arg0) {
		if (!Static433.aBoolean798) {
			return;
		}
		if (arg0.anObjectArray17 != null) {
			@Pc(18) Class124 local18 = Static334.method4492(Static331.anInt5639, Static353.anInt6050);
			if (local18 != null) {
				@Pc(24) Class1_Sub40 local24 = new Class1_Sub40();
				local24.anObjectArray36 = arg0.anObjectArray17;
				local24.aClass124_14 = arg0;
				local24.aClass124_13 = local18;
				Static298.method4076(local24);
			}
		}
		Static52.method867(Static459.aClass103_250);
		Static18.aClass1_Sub28_Sub1_1.method5347(arg0.anInt3348);
		Static18.aClass1_Sub28_Sub1_1.method5347(Static331.anInt5639);
		Static18.aClass1_Sub28_Sub1_1.method5350(Static257.anInt4671);
		Static18.aClass1_Sub28_Sub1_1.method5350(Static353.anInt6050);
		Static18.aClass1_Sub28_Sub1_1.method5393(arg0.anInt3405);
		Static18.aClass1_Sub28_Sub1_1.method5359(arg0.anInt3430);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!bu;Z)Z")
	public static boolean method4843(@OriginalArg(0) Class30 arg0) {
		return Static259.aClass30_8 == arg0 || arg0 == Static207.aClass30_11 || arg0 == Static43.aClass30_2 || Static327.aClass30_9 == arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jk;IIB)V")
	public static void method4848(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static178.anInt3115 = arg2;
		Static394.anInt6584 = arg1;
		Static224.aClass124_6 = arg0;
	}
}
