import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!ga;")
	public static Class82 aClass82_21;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!ga;")
	public static Class82 aClass82_22 = null;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray27 = new byte[1000][];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!ik;I)V")
	public static void method5118(@OriginalArg(1) Class3_Sub25_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(20) boolean local20 = arg0.method2783(1) == 1;
		if (local20) {
			Static198.anIntArray224[Static40.anInt660++] = arg1;
		}
		@Pc(35) int local35 = arg0.method2783(2);
		@Pc(39) Class1_Sub2_Sub6_Sub2 local39 = Static216.aClass1_Sub2_Sub6_Sub2Array1[arg1];
		if (local35 != 0) {
			@Pc(148) int local148;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local35 == 1) {
				local148 = arg0.method2783(3);
				local153 = local39.anIntArray510[0];
				local158 = local39.anIntArray509[0];
				if (local148 == 0) {
					local158--;
					local153--;
				} else if (local148 == 1) {
					local158--;
				} else if (local148 == 2) {
					local158--;
					local153++;
				} else if (local148 == 3) {
					local153--;
				} else if (local148 == 4) {
					local153++;
				} else if (local148 == 5) {
					local158++;
					local153--;
				} else if (local148 == 6) {
					local158++;
				} else if (local148 == 7) {
					local153++;
					local158++;
				}
				if (local20) {
					local39.anInt7683 = local153;
					local39.anInt7648 = local158;
					local39.aBoolean514 = true;
				} else {
					local39.method6212(Static131.aByteArray47[arg1], local158, local153);
				}
			} else if (local35 == 2) {
				local148 = arg0.method2783(4);
				local153 = local39.anIntArray510[0];
				local158 = local39.anIntArray509[0];
				if (local148 == 0) {
					local158 -= 2;
					local153 -= 2;
				} else if (local148 == 1) {
					local153--;
					local158 -= 2;
				} else if (local148 == 2) {
					local158 -= 2;
				} else if (local148 == 3) {
					local153++;
					local158 -= 2;
				} else if (local148 == 4) {
					local158 -= 2;
					local153 += 2;
				} else if (local148 == 5) {
					local158--;
					local153 -= 2;
				} else if (local148 == 6) {
					local158--;
					local153 += 2;
				} else if (local148 == 7) {
					local153 -= 2;
				} else if (local148 == 8) {
					local153 += 2;
				} else if (local148 == 9) {
					local153 -= 2;
					local158++;
				} else if (local148 == 10) {
					local158++;
					local153 += 2;
				} else if (local148 == 11) {
					local158 += 2;
					local153 -= 2;
				} else if (local148 == 12) {
					local153--;
					local158 += 2;
				} else if (local148 == 13) {
					local158 += 2;
				} else if (local148 == 14) {
					local153++;
					local158 += 2;
				} else if (local148 == 15) {
					local153 += 2;
					local158 += 2;
				}
				if (local20) {
					local39.anInt7648 = local158;
					local39.anInt7683 = local153;
					local39.aBoolean514 = true;
				} else {
					local39.method6212(Static131.aByteArray47[arg1], local158, local153);
				}
			} else {
				local148 = arg0.method2783(1);
				@Pc(412) int local412;
				@Pc(420) int local420;
				@Pc(431) int local431;
				@Pc(438) int local438;
				if (local148 == 0) {
					local153 = arg0.method2783(12);
					local158 = local153 >> 10;
					local412 = local153 >> 5 & 0x1F;
					if (local412 > 15) {
						local412 -= 32;
					}
					local420 = local153 & 0x1F;
					if (local420 > 15) {
						local420 -= 32;
					}
					local431 = local39.anIntArray510[0] + local412;
					local438 = local39.anIntArray509[0] + local420;
					if (local20) {
						local39.anInt7648 = local438;
						local39.aBoolean514 = true;
						local39.anInt7683 = local431;
					} else {
						local39.method6212(Static131.aByteArray47[arg1], local438, local431);
					}
					local39.aByte101 = (byte) (local158 + local39.aByte101 & 0x3);
					if (Static317.anInt5364 == arg1) {
						Static276.anInt4606 = local39.aByte101;
					}
				} else {
					local153 = arg0.method2783(30);
					local158 = local153 >> 28;
					local412 = local153 >> 14 & 0x3FFF;
					local420 = local153 & 0x3FFF;
					local431 = (local412 + local39.anIntArray510[0] + Static59.anInt1127 & 0x3FFF) - Static59.anInt1127;
					local438 = (local420 + Static49.anInt873 + local39.anIntArray509[0] & 0x3FFF) - Static49.anInt873;
					if (local20) {
						local39.anInt7683 = local431;
						local39.aBoolean514 = true;
						local39.anInt7648 = local438;
					} else {
						local39.method6212(Static131.aByteArray47[arg1], local438, local431);
					}
					local39.aByte101 = (byte) (local39.aByte101 + local158 & 0x3);
					if (arg1 == Static317.anInt5364) {
						Static276.anInt4606 = local39.aByte101;
					}
				}
			}
		} else if (local20) {
			local39.aBoolean514 = false;
		} else if (arg1 == Static317.anInt5364) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(63) Class197 local63 = Static147.aClass197Array1[arg1] = new Class197();
			local63.anInt5548 = (Static59.anInt1127 + local39.anIntArray510[0] >> 6 << 14) + ((local39.aByte101 << 28) + (Static49.anInt873 + local39.anIntArray509[0] >> 6));
			if (local39.anInt7647 == -1) {
				local63.anInt5547 = local39.aClass234_7.method5422();
			} else {
				local63.anInt5547 = local39.anInt7647;
			}
			local63.aBoolean400 = local39.aBoolean512;
			local63.anInt5546 = local39.anInt7580;
			if (local39.anInt7662 > 0) {
				Static27.method496(local39);
			}
			Static216.aClass1_Sub2_Sub6_Sub2Array1[arg1] = null;
			if (arg0.method2783(1) != 0) {
				Static159.method2511(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static359.anInt6118 = arg5;
		Static317.anInt5360 = arg4;
		Static83.anInt1536 = arg0;
		Static87.anInt1583 = arg1;
		Static443.anInt7442 = arg3;
		if (arg2 && Static317.anInt5360 >= 100) {
			Static266.anInt4433 = Static87.anInt1583 * 128 + 64;
			Static152.anInt7561 = Static359.anInt6118 * 128 + 64;
			Static410.anInt6946 = Static181.method4212(Static276.anInt4606, Static152.anInt7561, Static266.anInt4433) - Static443.anInt7442;
		}
		Static27.anInt490 = 2;
	}
}
