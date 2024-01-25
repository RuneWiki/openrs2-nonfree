import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray124;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "[Lclient!ao;")
	public static Class10_Sub1[] aClass10_Sub1Array2;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	public static int anInt4562;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "J")
	public static long aLong142;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!pp;")
	public static Class4_Sub35 aClass4_Sub35_1 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!sf;)V")
	public static void method4030(@OriginalArg(0) Class8_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort98; local2 <= arg0.aShort96; local2++) {
			for (@Pc(6) int local6 = arg0.aShort97; local6 <= arg0.aShort99; local6++) {
				@Pc(16) Class128 local16 = Static273.aClass128ArrayArrayArray4[arg0.aByte77][local2][local6];
				if (local16 != null) {
					@Pc(21) Class117 local21 = local16.aClass117_2;
					@Pc(23) Class117 local23 = null;
					while (local21 != null) {
						if (local21.aClass8_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass117_2 = local21.aClass117_1;
							} else {
								local23.aClass117_1 = local21.aClass117_1;
							}
							local21.method3326();
							break;
						}
						local23 = local21;
						local21 = local21.aClass117_1;
					}
					local16.aByte46 = 0;
					for (@Pc(56) Class117 local56 = local16.aClass117_2; local56 != null; local56 = local56.aClass117_1) {
						local16.aByte46 = (byte) (local16.aByte46 | local56.anInt3669);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!kn;IIZLclient!vq;)V")
	public static void method4032(@OriginalArg(0) Class116 arg0, @OriginalArg(4) Class47 arg1) {
		Static46.aClass116_4.method3273();
		if (Static57.aBoolean109) {
			return;
		}
		for (@Pc(21) Class4_Sub3 local21 = (Class4_Sub3) arg0.method3270(); local21 != null; local21 = (Class4_Sub3) arg0.method3272()) {
			@Pc(28) Class136 local28 = Static11.method223(local21.anInt210);
			if (Static218.method3956(local28)) {
				@Pc(40) boolean local40 = Static60.method1266(local28, arg1, local21);
				if (local40) {
					Static237.method5584(local21, arg1, local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Lclient!ao;")
	public static Class10_Sub1 method4033() {
		return Static77.aClass10_Sub1Array1.length > Static287.anInt4409 ? Static77.aClass10_Sub1Array1[Static287.anInt4409++] : null;
	}
}
