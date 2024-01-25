import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!in", name = "x", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_21 = new Class118(4);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIZ)I")
	public static int method3397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class2_Sub8 local10 = Static384.method5147(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray122.length; local28++) {
				if (local10.anIntArray123[local28] == arg0) {
					local26 += local10.anIntArray122[local28];
				}
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIILclient!ha;Lclient!kp;II)V")
	public static void method3398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class2_Sub2_Sub12 arg9, @OriginalArg(10) int arg10) {
		if (arg5 > arg0 && arg2 + arg0 > arg5 && arg4 > arg10 - 13 && arg4 < arg10 + 3) {
			arg6 = arg7;
		}
		@Pc(35) String local35 = Static173.method8451(arg9);
		Static194.aClass62_22.method5694(arg0 + 3, local35, Static140.aClass61Array4, arg10, arg6, Static610.anIntArray675);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public static void method3400(@OriginalArg(0) int arg0) {
		Static458.anInt7383 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static322.anInt5120; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Class13_Sub1_Sub4_Sub1.lb; local6++) {
				if (Static28.aClass53ArrayArrayArray1[arg0][local3][local6] == null) {
					Static28.aClass53ArrayArrayArray1[arg0][local3][local6] = new Class53(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "h", descriptor = "(I)Lclient!fl;")
	public static Class2_Sub2_Sub9 method3402() {
		return Static193.aClass2_Sub2_Sub9_3;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZD)V")
	public static void method3404(@OriginalArg(1) double arg0) {
		Static539.aClass177_10.method7879(Static372.aClass177_5);
		Static539.aClass177_10.method7872(0, 0, (int) arg0);
		Static361.aClass95_9.method6941(Static539.aClass177_10);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	public static void method3405(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static262.anInt5597 - Static2.anInt55;
		if (local8 >= 100) {
			Static445.anInt7122 = 1;
			Static12.anInt159 = -1;
			Static8.anInt107 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static339.aFloat100;
		if (local21 < Static167.anInt2956 >> 8) {
			local21 = Static167.anInt2956 >> 8;
		}
		if (Static85.aBooleanArray124[4] && Static637.anIntArray694[4] + 128 > local21) {
			local21 = Static637.anIntArray694[4] + 128;
		}
		@Pc(54) int local54 = Static365.anInt5778 + (int) Static440.aFloat144 & 0x3FFF;
		Static533.method7367(Static263.anInt4236, local54, local21, Static203.anInt3426, Static504.method6917(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090, Static91.anInt1705, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089) - 200, arg0, (local21 >> 3) * 3 + 600 << 2);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static644.anInt10376 = (int) (local103 * (float) (Static644.anInt10376 - Static339.anInt5378) + (float) Static339.anInt5378);
		Static440.anInt7072 = (int) ((float) Static358.anInt5675 + (float) (Static440.anInt7072 - Static358.anInt5675) * local103);
		Static250.anInt4000 = (int) ((float) Static310.anInt4994 + local103 * (float) (Static250.anInt4000 - Static310.anInt4994));
		Static220.anInt3605 = (int) ((float) Static102.anInt1339 + (float) (Static220.anInt3605 - Static102.anInt1339) * local103);
		@Pc(154) int local154 = Static338.anInt5355 - Static571.anInt9318;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static338.anInt5355 = (int) ((float) local154 * local103 + (float) Static571.anInt9318);
		Static338.anInt5355 &= 0x3FFF;
	}
}
