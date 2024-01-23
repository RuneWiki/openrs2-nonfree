import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "[I")
	public static int[] anIntArray24 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;ZIIZIZJLjava/lang/String;II)V")
	public static void method288(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(128);
		local28.method2191(10);
		local28.method2208((arg3 ? 4 : 0) | (arg5 ? 2 : 0) | (arg1 ? 1 : 0));
		local28.method2193(arg6);
		local28.method2236(local8[0]);
		local28.method2188(arg0);
		local28.method2236(local8[1]);
		local28.method2208(Static23.anInt656);
		local28.method2191(arg4);
		local28.method2191(arg2);
		local28.method2236(local8[2]);
		local28.method2208(arg8);
		local28.method2208(arg9);
		local28.method2236(local8[3]);
		local28.method2231(Static65.aBigInteger1, Static142.aBigInteger2);
		@Pc(118) Class1_Sub14 local118 = new Class1_Sub14(350);
		local118.method2188(arg7);
		@Pc(131) int local131 = 8 - Static34.method690(arg7) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.method2191((int) (Math.random() * 255.0D));
		}
		local118.method2211(local8);
		Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
		Static2.aClass1_Sub14_Sub1_1.method2191(22);
		Static2.aClass1_Sub14_Sub1_1.method2208(local118.anInt3000 + local28.anInt3000 + 2);
		Static2.aClass1_Sub14_Sub1_1.method2208(551);
		Static2.aClass1_Sub14_Sub1_1.method2201(local28.anInt3000, local28.aByteArray55);
		Static2.aClass1_Sub14_Sub1_1.method2201(local118.anInt3000, local118.aByteArray55);
		Static251.anInt5521 = 1;
		Static264.anInt5301 = 0;
		Static119.anInt2584 = 0;
		Static252.anInt5113 = -3;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)I")
	public static int method289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(35) int local35 = Static257.method3965(arg0 + 45365, 4, arg1 + 91923) + (Static257.method3965(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static257.method3965(arg0, 1, arg1) + -128 >> 2) - 128;
		local35 = (int) ((double) local35 * 0.3D) + 35;
		if (local35 < 10) {
			local35 = 10;
		} else if (local35 > 60) {
			local35 = 60;
		}
		return local35;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!jh;I)V")
	public static void method290(@OriginalArg(1) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) Static125.aClass186_10.method4570((long) arg1);
		if (local10 == null) {
			Static124.method2029(0, null, arg1, Static185.anInt4085, arg0.anIntArray283[0], null, arg0, arg0.anIntArray286[0]);
		} else {
			local10.method2372();
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
	public static void method291() {
		for (@Pc(15) Class1_Sub3_Sub12 local15 = (Class1_Sub3_Sub12) Static250.aClass26_48.method666(); local15 != null; local15 = (Class1_Sub3_Sub12) Static250.aClass26_48.method672()) {
			@Pc(20) Class2_Sub6 local20 = local15.aClass2_Sub6_1;
			if (local20.anInt4961 != Static185.anInt4085 || local20.aBoolean306) {
				local15.method4767();
			} else if (Static133.anInt3061 >= local20.anInt4966) {
				local20.method3729(Static286.anInt5740);
				if (local20.aBoolean306) {
					local15.method4767();
				} else {
					Static114.method1842(local20.anInt4961, local20.anInt4960, local20.anInt4962, local20.anInt4965, 60, local20, 0, -1L, false);
				}
			}
		}
	}
}
