import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!oha;")
	public static Class258 aClass258_1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
	public static void method3759() {
		@Pc(5) int local5 = 0;
		if (Static627.aClass5_Sub46_31.aClass11_Sub11_1.method2927() == 1) {
			local5 = 55;
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8541() == 0) {
			local5 |= 0x40;
		}
		Static389.method5973(local5);
		Static525.aClass371_4.method8556(local5);
		Static479.aClass348_1.method8208(local5);
		Static258.aClass138_1.method3198(local5);
		Static452.aClass170_4.method4000(local5);
		Static449.method6677(local5);
		Static237.method3642(local5);
		Static204.method3175(local5);
		Static392.method6101(local5);
		Static532.method7607();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method3760(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg5++;
				arg1[local30] = (byte) (arg1[local30] - arg2[arg3++]);
				@Pc(43) int local43 = arg5++;
				arg1[local43] = (byte) (arg1[local43] - arg2[arg3++]);
				@Pc(56) int local56 = arg5++;
				arg1[local56] = (byte) (arg1[local56] - arg2[arg3++]);
				@Pc(69) int local69 = arg5++;
				arg1[local69] = (byte) (arg1[local69] - arg2[arg3++]);
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local30 = arg5++;
				arg1[local30] = (byte) (arg1[local30] - arg2[arg3++]);
			}
			arg5 += arg7;
			arg3 += arg4;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!vfa;BZII)V")
	public static void method3761(@OriginalArg(0) Class357 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt9852;
		if (arg0.aByte131 == 0) {
			arg0.anInt9852 = arg0.anInt9840;
		} else if (arg0.aByte131 == 1) {
			arg0.anInt9852 = arg2 - arg0.anInt9840;
		} else if (arg0.aByte131 == 2) {
			arg0.anInt9852 = arg2 * arg0.anInt9840 >> 14;
		}
		@Pc(47) int local47 = arg0.anInt9797;
		if (arg0.aByte134 == 0) {
			arg0.anInt9797 = arg0.anInt9794;
		} else if (arg0.aByte134 == 1) {
			arg0.anInt9797 = arg3 - arg0.anInt9794;
		} else if (arg0.aByte134 == 2) {
			arg0.anInt9797 = arg0.anInt9794 * arg3 >> 14;
		}
		if (arg0.aByte131 == 4) {
			arg0.anInt9852 = arg0.anInt9786 * arg0.anInt9797 / arg0.anInt9792;
		}
		if (arg0.aByte134 == 4) {
			arg0.anInt9797 = arg0.anInt9852 * arg0.anInt9792 / arg0.anInt9786;
		}
		if (Static571.aBoolean764 && (Static74.method1225(arg0).anInt10264 != 0 || arg0.anInt9828 == 0)) {
			if (arg0.anInt9797 < 5 && arg0.anInt9852 < 5) {
				arg0.anInt9797 = 5;
				arg0.anInt9852 = 5;
			} else {
				if (arg0.anInt9797 <= 0) {
					arg0.anInt9797 = 5;
				}
				if (arg0.anInt9852 <= 0) {
					arg0.anInt9852 = 5;
				}
			}
		}
		if (Static422.anInt7182 == arg0.anInt9785) {
			Static583.aClass357_12 = arg0;
		}
		if (arg1 && arg0.anObjectArray11 != null && (local8 != arg0.anInt9852 || arg0.anInt9797 != local47)) {
			@Pc(201) Class5_Sub9 local201 = new Class5_Sub9();
			local201.aClass357_2 = arg0;
			local201.anObjectArray1 = arg0.anObjectArray11;
			Static297.aClass306_18.method7303(local201);
		}
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(Z)V")
	public static void method3762() {
		if (Static466.anInt7862 == 1 || Static466.anInt7862 == 3 || Static466.anInt7862 != Static463.anInt7853 && (Static466.anInt7862 == 0 || Static463.anInt7853 == 0)) {
			Static108.anInt1716 = 0;
			Static58.anInt926 = 0;
			Static51.aClass81_11.method1602();
		}
		Static463.anInt7853 = Static466.anInt7862;
	}
}
