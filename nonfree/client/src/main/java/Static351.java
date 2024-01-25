import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public static int anInt6806 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
	public static int method5647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 / arg2;
		@Pc(22) int local22 = arg1 & arg2 - 1;
		@Pc(26) int local26 = arg0 / arg2;
		@Pc(32) int local32 = arg0 & arg2 - 1;
		@Pc(37) int local37 = Static100.method1857(local16, local26);
		@Pc(44) int local44 = Static100.method1857(local16 + 1, local26);
		@Pc(51) int local51 = Static100.method1857(local16, local26 + 1);
		@Pc(60) int local60 = Static100.method1857(local16 + 1, local26 + 1);
		@Pc(67) int local67 = Static98.method5503(arg2, local44, local37, local22);
		@Pc(74) int local74 = Static98.method5503(arg2, local60, local51, local22);
		return Static98.method5503(arg2, local74, local67, local32);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ur;BI)V")
	public static void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt6517 && arg0 != -1) {
			@Pc(88) Class116 local88 = Static340.method5560(arg0);
			@Pc(91) int local91 = local88.anInt3739;
			if (local91 == 1) {
				arg1.anInt6505 = 0;
				arg1.anInt6493 = 0;
				arg1.anInt6487 = 0;
				arg1.anInt6490 = arg2;
				arg1.anInt6534 = 1;
				Static291.method4975(false, local88, arg1.anInt6487, arg1.anInt6465, arg1.anInt6466);
			}
			if (local91 == 2) {
				arg1.anInt6505 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt6517 == -1 || Static340.method5560(arg0).anInt3749 >= Static340.method5560(arg1.anInt6517).anInt3749) {
			arg1.anInt6505 = 0;
			arg1.anInt6490 = arg2;
			arg1.anInt6534 = 1;
			arg1.anInt6551 = arg1.anInt6547;
			arg1.anInt6517 = arg0;
			arg1.anInt6487 = 0;
			arg1.anInt6493 = 0;
			if (arg1.anInt6517 != -1) {
				Static291.method4975(false, Static340.method5560(arg1.anInt6517), arg1.anInt6487, arg1.anInt6465, arg1.anInt6466);
				return;
			}
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5649(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static164.anInt3686; local16++) {
			if (arg0.equalsIgnoreCase(Static284.aStringArray41[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method5650() {
		@Pc(3) Class141 local3 = Static183.aClass141_1;
		synchronized (Static183.aClass141_1) {
			Static64.anInt1349++;
			Static11.anInt256 = Static294.anInt3995;
			@Pc(19) int local19;
			if (Static9.anInt6463 >= 0) {
				while (Static9.anInt6463 != Static90.anInt2015) {
					local19 = Static124.anIntArray311[Static90.anInt2015];
					Static90.anInt2015 = Static90.anInt2015 + 1 & 0x7F;
					if (local19 < 0) {
						Static77.aBooleanArray13[~local19] = false;
					} else {
						Static77.aBooleanArray13[local19] = true;
					}
				}
			} else {
				for (local19 = 0; local19 < 112; local19++) {
					Static77.aBooleanArray13[local19] = false;
				}
				Static9.anInt6463 = Static90.anInt2015;
			}
			Static294.anInt3995 = Static171.anInt3787;
		}
	}
}
