import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	public static int anInt99 = 0;

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[104][104];

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lclient!cf;")
	public static Class2_Sub8 aClass2_Sub8_1 = new Class2_Sub8(0, 0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZLclient!nh;)Lclient!qe;")
	public static Class78 method76(@OriginalArg(2) Class2_Sub23 arg0) {
		try {
			@Pc(7) Class78 local7 = new Class78();
			local7.anInt3831 = arg0.method2111();
			if (local7.anInt3831 > 32767) {
				local7.anInt3831 = 32767;
			}
			local7.aByteArray48 = new byte[local7.anInt3831];
			arg0.anInt2703 += Static226.aClass52_1.method1729(local7.aByteArray48, 0, arg0.aByteArray41, arg0.anInt2703, local7.anInt3831);
			return local7;
		} catch (@Pc(52) Exception local52) {
			return Static208.aClass78_816;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
	public static void method77(@OriginalArg(1) int arg0) {
		Static203.anInt4537 += arg0 * 128;
		@Pc(31) int local31;
		if (Static203.anInt4537 > Static26.anIntArray81.length) {
			Static203.anInt4537 -= Static26.anIntArray81.length;
			local31 = (int) (Math.random() * 12.0D);
			Static18.method262(Static41.aClass79_Sub1Array1[local31]);
		}
		@Pc(40) int local40 = arg0 * 128;
		local31 = 0;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local75 = Static17.anIntArray51[local40 + local31] - arg0 * Static26.anIntArray81[local31 + Static203.anInt4537 & Static26.anIntArray81.length + -1] / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static17.anIntArray51[local31++] = local75;
		}
		@Pc(102) int local102;
		@Pc(104) int local104;
		@Pc(111) int local111;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local102 = local75 * 128;
			for (local104 = 0; local104 < 128; local104++) {
				local111 = (int) (Math.random() * 100.0D);
				if (local111 < 50 && local104 > 10 && local104 < 118) {
					Static17.anIntArray51[local104 + local102] = 255;
				} else {
					Static17.anIntArray51[local104 + local102] = 0;
				}
			}
		}
		for (local102 = 0; local102 < 256 - arg0; local102++) {
			Static97.anIntArray376[local102] = Static97.anIntArray376[arg0 + local102];
		}
		for (local104 = 256 - arg0; local104 < 256; local104++) {
			Static97.anIntArray376[local104] = (int) (Math.sin((double) Static90.anInt2015 / 14.0D) * 16.0D + Math.sin((double) Static90.anInt2015 / 15.0D) * 14.0D + Math.sin((double) Static90.anInt2015 / 16.0D) * 12.0D);
			Static90.anInt2015++;
		}
		Static111.anInt2446 += arg0;
		local111 = ((Static123.anInt2808 & 0x1) + arg0) / 2;
		if (local111 <= 0) {
			return;
		}
		@Pc(251) int local251;
		@Pc(258) int local258;
		for (@Pc(242) int local242 = 0; local242 < Static111.anInt2446; local242++) {
			local251 = (int) (Math.random() * 124.0D) + 2;
			local258 = (int) (Math.random() * 128.0D) + 128;
			Static17.anIntArray51[(local258 << 7) + local251] = 192;
		}
		Static111.anInt2446 = 0;
		@Pc(280) int local280;
		@Pc(285) int local285;
		for (local251 = 0; local251 < 256; local251++) {
			local280 = local251 * 128;
			local258 = 0;
			for (local285 = -local111; local285 < 128; local285++) {
				if (local285 + local111 < 128) {
					local258 += Static17.anIntArray51[local285 + local280 + local111];
				}
				if (local285 - local111 - 1 >= 0) {
					local258 -= Static17.anIntArray51[local285 + local280 - local111 - 1];
				}
				if (local285 >= 0) {
					Static127.anIntArray781[local285 + local280] = local258 / (local111 * 2 + 1);
				}
			}
		}
		for (local258 = 0; local258 < 128; local258++) {
			local280 = 0;
			for (local285 = -local111; local285 < 256; local285++) {
				@Pc(368) int local368 = local285 * 128;
				if (local111 + local285 < 256) {
					local280 += Static127.anIntArray781[local111 * 128 + local258 + local368];
				}
				if (local285 - local111 - 1 >= 0) {
					local280 -= Static127.anIntArray781[local258 + local368 - (local111 + 1) * 128];
				}
				if (local285 >= 0) {
					Static17.anIntArray51[local368 + local258] = local280 / (local111 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)Z")
	public static boolean method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)Lclient!mj;")
	public static Class64 method79(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class64 local8 = Static204.method3618(arg1);
		if (arg0 == -1) {
			return local8;
		} else if (local8 == null || local8.aClass64Array2 == null || local8.aClass64Array2.length <= arg0) {
			return null;
		} else {
			return local8.aClass64Array2[arg0];
		}
	}
}
