import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!l;")
	public static Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_1 = new Class214(101, 28);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
	public static final int[] anIntArray1 = new int[1024];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Lclient!rj;")
	public static Class219 method13(@OriginalArg(1) int arg0) {
		@Pc(8) Class219[] local8 = Static312.method5441();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class219 local16 = local8[local10];
			if (arg0 == local16.anInt6234) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ki;IB)V")
	public static void method14(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1.anInt6505 && arg0 != -1) {
			@Pc(87) Class130 local87 = Static143.aClass85_1.method2406(arg0);
			@Pc(90) int local90 = local87.anInt3937;
			if (local90 == 1) {
				arg1.anInt6543 = 0;
				arg1.anInt6502 = 0;
				arg1.anInt6487 = 1;
				arg1.anInt6496 = arg2;
				arg1.anInt6479 = 0;
				Static125.method2339(arg1.anInt7514, arg1.anInt6543, arg1.anInt7515, arg1 == Static52.aClass11_Sub5_Sub2_Sub1_2, local87, arg1.aByte100);
			}
			if (local90 == 2) {
				arg1.anInt6502 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt6505 == -1 || Static143.aClass85_1.method2406(arg0).anInt3938 >= Static143.aClass85_1.method2406(arg1.anInt6505).anInt3938) {
			arg1.anInt6550 = arg1.anInt6549;
			arg1.anInt6487 = 1;
			arg1.anInt6543 = 0;
			arg1.anInt6479 = 0;
			arg1.anInt6502 = 0;
			arg1.anInt6505 = arg0;
			arg1.anInt6496 = arg2;
			if (arg1.anInt6505 != -1) {
				Static125.method2339(arg1.anInt7514, arg1.anInt6543, arg1.anInt7515, arg1 == Static52.aClass11_Sub5_Sub2_Sub1_2, Static143.aClass85_1.method2406(arg1.anInt6505), arg1.aByte100);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method15() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static193.anInt3853; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static301.anInt5585; local17++) {
				if (Static297.method4527(local7, Static294.aClass162ArrayArrayArray2, true, local17, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public static void method17() {
		Static448.method6134(Static303.aClass212_74);
		for (@Pc(22) Class4_Sub39 local22 = (Class4_Sub39) Static157.aClass96_22.method2798(); local22 != null; local22 = (Class4_Sub39) Static157.aClass96_22.method2796()) {
			if (!local22.method6325()) {
				local22 = (Class4_Sub39) Static157.aClass96_22.method2798();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt6722 == 0) {
				Static298.method4546(local22, true, true);
			}
		}
		if (Static341.aClass240_13 != null) {
			Static273.method4374(Static341.aClass240_13);
			Static341.aClass240_13 = null;
		}
	}
}
