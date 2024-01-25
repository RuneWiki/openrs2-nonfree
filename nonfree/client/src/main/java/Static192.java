import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!kl", name = "Y", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!kl", name = "W", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!kl", name = "Z", descriptor = "I")
	public static final int anInt3398 = 0;

	@OriginalMember(owner = "client!kl", name = "ab", descriptor = "[I")
	public static final int[] anIntArray392 = new int[13];

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Lclient!lk;")
	public static Class1_Sub24 method2745() {
		if (Static353.aClass17_25 == null || Static361.aClass186_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub24 local16 = (Class1_Sub24) Static361.aClass186_1.method4295(); local16 != null; local16 = (Class1_Sub24) Static361.aClass186_1.method4295()) {
			@Pc(24) Class97 local24 = Static353.aClass249_4.method5522(local16.anInt3616);
			if (local24 != null && local24.aBoolean184 && local24.method1857(Static353.anInterface4_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2752(@OriginalArg(0) String arg0) {
		if (Static231.aStringArray79 == null) {
			Static232.method618();
		}
		@Pc(20) String[] local20 = Static88.method1335(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			for (@Pc(26) int local26 = Static215.anInt3688; local26 > 0; local26--) {
				Static231.aStringArray79[local26] = Static231.aStringArray79[local26 - 1];
			}
			Static231.aStringArray79[0] = local20[local22];
			if (Static231.aStringArray79.length - 1 > Static215.anInt3688) {
				Static215.anInt3688++;
				if (Static209.anInt3638 > 0) {
					Static209.anInt3638++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!je;III)V")
	public static void method2754(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class34 local8 = arg0.method2511(Static66.aClass164_2);
		if (local8 == null) {
			return;
		}
		Static66.aClass164_2.method5313(arg2, arg1, arg0.anInt3074 + arg2, arg0.anInt3071 + arg1);
		if (Static222.anInt4507 >= 3) {
			Static66.aClass164_2.method5312(local8, arg2, arg1);
		} else {
			Static129.aClass51_5.method4676((float) arg0.anInt3074 / 2.0F + (float) arg2, (float) arg0.anInt3071 / 2.0F + (float) arg1, ((int) -Static386.aFloat82 & 0x3FFF) << 2, local8, arg2, arg1);
		}
	}
}
