import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "[I")
	public static final int[] anIntArray245 = new int[13];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
	public static void method2422(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static89.anInt2231 != -1) {
				Static327.method5307(Static89.anInt2231);
			}
			for (@Pc(15) Class1_Sub37 local15 = (Class1_Sub37) Static351.aClass197_33.method5161(); local15 != null; local15 = (Class1_Sub37) Static351.aClass197_33.method5154()) {
				if (!local15.method5627()) {
					local15 = (Class1_Sub37) Static351.aClass197_33.method5161();
					if (local15 == null) {
						break;
					}
				}
				Static107.method2331(true, false, local15);
			}
			Static89.anInt2231 = -1;
			Static351.aClass197_33 = new Class197(8);
			Static324.method5273();
			Static89.anInt2231 = Static46.anInt1502;
			Static267.method4700(false);
			Static45.method1050();
			Static196.method3781(Static89.anInt2231);
		}
		Static280.method4869();
		Static245.anInt4996 = -1;
		Static270.method4744(Static46.anInt1504);
		Static198.aClass17_Sub1_Sub1_Sub1_3 = new Class17_Sub1_Sub1_Sub1();
		Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] = 52;
		Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 = 6656;
		Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 = 6656;
		Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] = 52;
		Static64.anInt1797 = 0;
		Static320.anInt5326 = 0;
		if (Static147.anInt3204 == 2) {
			Static64.anInt1797 = Static354.anInt6757 << 7;
			Static320.anInt5326 = Static301.anInt5960 << 7;
		} else {
			Static340.method5487();
		}
		Static308.method2772();
		if (Static320.anInt5326 == 0 || Static64.anInt1797 == 0) {
			Static232.method4269(10);
		} else {
			Static305.method5134();
			Static232.method4269(28);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	public static void method2423(@OriginalArg(0) int arg0) {
		Static111.anInt2596 = arg0;
		@Pc(12) Class87 local12 = Static28.aClass87_5;
		synchronized (Static28.aClass87_5) {
			Static28.aClass87_5.method2485();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIII)V")
	public static void method2424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static79.anInt4165 / (float) Static79.anInt4158;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(39) int local39 = arg0 - (arg1 - local13) / 2;
		@Pc(47) int local47 = arg3 - (arg2 - local11) / 2;
		Static68.anInt1821 = -1;
		Static231.anInt4758 = -1;
		Static62.anInt1771 = local47 * Static79.anInt4158 / local11;
		Static169.anInt3636 = Static79.anInt4165 - Static79.anInt4165 * local39 / local13;
		Static246.method4421();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!wo;IBI)Lclient!al;")
	public static Class1_Sub4_Sub1 method2425(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class1_Sub8 local21 = new Class1_Sub8(arg0.method5648(arg2, arg1));
		@Pc(54) Class1_Sub4_Sub1 local54 = new Class1_Sub4_Sub1(arg1, local21.method4534(), local21.method4534(), local21.method4545(), local21.method4545(), local21.method4532() == 1, local21.method4532(), local21.method4532());
		@Pc(58) int local58 = local21.method4532();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass16_1.method416(new Class1_Sub44(local21.method4532(), local21.method4556(), local21.method4556(), local21.method4556(), local21.method4556(), local21.method4556(), local21.method4556(), local21.method4556(), local21.method4556()));
		}
		local54.method320();
		return local54;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB[I)[I")
	public static int[] method2427(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			for (@Pc(24) int local24 = 0; local24 < 36; local24++) {
				@Pc(30) int local30 = arg1[local10];
				if (local30 == 0) {
					if (local24 > 0 && arg1[local10 - 1] != 0) {
						local30 = arg0;
					} else if (local12 > 0 && arg1[local10 - 36] != 0) {
						local30 = arg0;
					} else if (local24 < 35 && arg1[local10 + 1] != 0) {
						local30 = arg0;
					} else if (local12 < 31 && arg1[local10 + 36] != 0) {
						local30 = arg0;
					}
				}
				local8[local10++] = local30;
			}
		}
		return local8;
	}
}
