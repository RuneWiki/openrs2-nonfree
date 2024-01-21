import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!rc;")
	public static Class74 aClass74_34 = new Class74(64);

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_599 = Static32.method683("Cabbage");

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public static int anInt1191 = -1;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public static int anInt1195 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method939() {
		aClass49_599 = null;
		anIntArray110 = null;
		aClass74_34 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public static void method940() {
		while (true) {
			if (Static86.aClass2_Sub13_Sub1_13.method2977(Static180.anInt3988) >= 27) {
				@Pc(14) int local14 = Static86.aClass2_Sub13_Sub1_13.method2978(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local14] == null) {
						Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local14] = new Class2_Sub2_Sub3_Sub7_Sub1();
						local19 = true;
					}
					@Pc(35) Class2_Sub2_Sub3_Sub7_Sub1 local35 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local14];
					Static1.anIntArray1[Static1.anInt2++] = local14;
					local35.anInt3582 = Static127.anInt2757;
					@Pc(51) int local51 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
					@Pc(56) int local56 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
					if (local56 == 1) {
						Static90.anIntArray192[Static88.anInt1850++] = local14;
					}
					@Pc(74) int local74 = Static86.aClass2_Sub13_Sub1_13.method2978(5);
					@Pc(81) int local81 = Static162.anIntArray322[Static86.aClass2_Sub13_Sub1_13.method2978(3)];
					if (local19) {
						local35.anInt3571 = local35.anInt3536 = local81;
					}
					if (local74 > 15) {
						local74 -= 32;
					}
					@Pc(98) int local98 = Static86.aClass2_Sub13_Sub1_13.method2978(5);
					if (local98 > 15) {
						local98 -= 32;
					}
					local35.aClass2_Sub2_Sub15_1 = Static169.method2802(Static86.aClass2_Sub13_Sub1_13.method2978(14));
					local35.anInt3581 = local35.aClass2_Sub2_Sub15_1.anInt3209;
					local35.anInt3573 = local35.aClass2_Sub2_Sub15_1.anInt3213;
					local35.anInt3547 = local35.aClass2_Sub2_Sub15_1.anInt3196;
					local35.anInt3525 = local35.aClass2_Sub2_Sub15_1.anInt3217;
					local35.anInt3528 = local35.aClass2_Sub2_Sub15_1.anInt3208;
					local35.anInt3551 = local35.aClass2_Sub2_Sub15_1.anInt3203;
					local35.anInt3539 = local35.aClass2_Sub2_Sub15_1.anInt3207;
					local35.anInt3545 = local35.aClass2_Sub2_Sub15_1.anInt3216;
					if (local35.anInt3545 == 0) {
						local35.anInt3536 = 0;
					}
					local35.anInt3585 = local35.aClass2_Sub2_Sub15_1.anInt3205;
					local35.method2735(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0] + local74, local51 == 1, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0] + local98);
					continue;
				}
			}
			Static86.aClass2_Sub13_Sub1_13.method2974();
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	public static int method941(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local1 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return arg0 + local1;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public static void method942(@OriginalArg(1) int arg0) {
		Static61.anInt1317 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZB)V")
	public static void method943(@OriginalArg(0) boolean arg0) {
		Static167.method2773();
		Static182.anInt4064++;
		if (Static182.anInt4064 < 50 && !arg0) {
			return;
		}
		Static182.anInt4064 = 0;
		if (Static3.aBoolean4 || Static51.aClass57_3 == null) {
			return;
		}
		Static176.aClass2_Sub13_Sub1_14.method2976(20);
		try {
			Static51.aClass57_3.method1885(Static176.aClass2_Sub13_Sub1_14.anInt3940, Static176.aClass2_Sub13_Sub1_14.aByteArray49);
			Static176.aClass2_Sub13_Sub1_14.anInt3940 = 0;
		} catch (@Pc(46) IOException local46) {
			Static3.aBoolean4 = true;
		}
	}
}
