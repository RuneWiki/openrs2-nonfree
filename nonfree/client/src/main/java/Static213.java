import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
	public static boolean aBoolean231;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!eg;")
	public static final Class60 aClass60_5 = new Class60("", 15);

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt3560 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!fi;")
	public static Class76 method2817(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static34.aClass76ArrayArray1[local7] == null || Static34.aClass76ArrayArray1[local7][local16] == null) {
			@Pc(30) boolean local30 = Static305.method3794(local7);
			if (!local30) {
				return null;
			}
		}
		return Static34.aClass76ArrayArray1[local7][local16];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIII)I")
	public static int method2818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
	public static int method2819() {
		if (Static317.aFrame2 == null) {
			return Static242.aBoolean251 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I")
	public static int method2821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static311.anIntArray363[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void method2822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class2_Sub2 local13 = local7.aClass2_Sub2_2;
		@Pc(16) Class2_Sub2 local16 = local7.aClass2_Sub2_3;
		if (local13 != null) {
			local13.anInt4391 = local13.anInt4391 * arg3 / (0x10 << Static419.anInt6980 - 7);
			local13.anInt4381 = local13.anInt4381 * arg3 / (0x10 << Static419.anInt6980 - 7);
		}
		if (local16 != null) {
			local16.anInt4391 = local16.anInt4391 * arg3 / (0x10 << Static419.anInt6980 - 7);
			local16.anInt4381 = local16.anInt4381 * arg3 / (0x10 << Static419.anInt6980 - 7);
		}
	}
}
