import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
	public static int anInt653;

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
	public static int anInt647 = 127;

	@OriginalMember(owner = "client!ci", name = "U", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_215 = Static177.method3050(" is already on your ignore list)3");

	@OriginalMember(owner = "client!ci", name = "W", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_216 = Static177.method3050("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ci", name = "X", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
	public static int anInt651 = 0;

	@OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_217 = aClass46_216;

	@OriginalMember(owner = "client!ci", name = "eb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_218 = aClass46_215;

	@OriginalMember(owner = "client!ci", name = "gb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_219 = Static177.method3050("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ci", name = "hb", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static111.method2060(arg0, arg2, arg1);
		@Pc(28) int local28;
		@Pc(44) int local44;
		@Pc(42) int local42;
		@Pc(62) int local62;
		if (local10 != 0L) {
			@Pc(21) int local21 = (int) local10 >> 20 & 0x3;
			local28 = (int) local10 >> 14 & 0x1F;
			local42 = arg2 * 4 + 4 * 512 * (103 - arg1) + 24624;
			local44 = arg4;
			if (local10 > 0L) {
				local44 = arg3;
			}
			@Pc(55) int[] local55 = Static125.aClass4_Sub1_Sub7_Sub2_4.anIntArray323;
			local62 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(66) Class4_Sub1_Sub19 local66 = Static113.method2090(local62);
			if (local66.anInt4183 == -1) {
				if (local28 == 0 || local28 == 2) {
					if (local21 == 0) {
						local55[local42] = local44;
						local55[local42 + 512] = local44;
						local55[local42 + 1024] = local44;
						local55[local42 + 1536] = local44;
					} else if (local21 == 1) {
						local55[local42] = local44;
						local55[local42 + 1] = local44;
						local55[local42 + 2] = local44;
						local55[local42 + 3] = local44;
					} else if (local21 == 2) {
						local55[local42 + 3] = local44;
						local55[local42 + 512 + 3] = local44;
						local55[local42 + 1024 + 3] = local44;
						local55[local42 + 3 + 1536] = local44;
					} else if (local21 == 3) {
						local55[local42 + 1536] = local44;
						local55[local42 + 1536 + 1] = local44;
						local55[local42 + 1538] = local44;
						local55[local42 + 1539] = local44;
					}
				}
				if (local28 == 3) {
					if (local21 == 0) {
						local55[local42] = local44;
					} else if (local21 == 1) {
						local55[local42 + 3] = local44;
					} else if (local21 == 2) {
						local55[local42 + 1539] = local44;
					} else if (local21 == 3) {
						local55[local42 + 1536] = local44;
					}
				}
				if (local28 == 2) {
					if (local21 == 3) {
						local55[local42] = local44;
						local55[local42 + 512] = local44;
						local55[local42 + 1024] = local44;
						local55[local42 + 1536] = local44;
					} else if (local21 == 0) {
						local55[local42] = local44;
						local55[local42 + 1] = local44;
						local55[local42 + 2] = local44;
						local55[local42 + 3] = local44;
					} else if (local21 == 1) {
						local55[local42 + 3] = local44;
						local55[local42 + 3 + 512] = local44;
						local55[local42 + 3 + 1024] = local44;
						local55[local42 + 1536 + 3] = local44;
					} else if (local21 == 2) {
						local55[local42 + 1536] = local44;
						local55[local42 + 1 + 1536] = local44;
						local55[local42 + 2 + 1536] = local44;
						local55[local42 + 1536 + 3] = local44;
					}
				}
			} else {
				@Pc(376) Class4_Sub1_Sub7_Sub3 local376 = Static61.aClass4_Sub1_Sub7_Sub3Array7[local66.anInt4183];
				if (local376 != null) {
					@Pc(388) int local388 = (local66.anInt4191 * 4 - local376.anInt3484) / 2;
					@Pc(398) int local398 = (local66.anInt4187 * 4 - local376.anInt3482) / 2;
					local376.method2642(arg2 * 4 + local388 + 48, (-local66.anInt4187 + (104 - arg1)) * 4 + 48 + local398);
				}
			}
		}
		local10 = Static187.method3164(arg0, arg2, arg1);
		if (local10 != 0L) {
			local44 = (int) local10 >> 14 & 0x1F;
			@Pc(454) int local454 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			local28 = (int) local10 >> 20 & 0x3;
			@Pc(465) Class4_Sub1_Sub19 local465 = Static113.method2090(local454);
			@Pc(499) int local499;
			if (local465.anInt4183 != -1) {
				@Pc(475) Class4_Sub1_Sub7_Sub3 local475 = Static61.aClass4_Sub1_Sub7_Sub3Array7[local465.anInt4183];
				if (local475 != null) {
					@Pc(488) int local488 = (local465.anInt4191 * 4 - local475.anInt3484) / 2;
					local499 = (local465.anInt4187 * 4 - local475.anInt3482) / 2;
					local475.method2642(arg2 * 4 + local488 + 48, local499 + 48 + (-arg1 + 104 + -local465.anInt4187) * 4);
				}
			} else if (local44 == 9) {
				local62 = 15658734;
				if (local10 > 0L) {
					local62 = 15597568;
				}
				@Pc(540) int[] local540 = Static125.aClass4_Sub1_Sub7_Sub2_4.anIntArray323;
				local499 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
				if (local28 == 0 || local28 == 2) {
					local540[local499 + 1536] = local62;
					local540[local499 + 1024 + 1] = local62;
					local540[local499 + 2 + 512] = local62;
					local540[local499 + 3] = local62;
				} else {
					local540[local499] = local62;
					local540[local499 + 1 + 512] = local62;
					local540[local499 + 2 + 1024] = local62;
					local540[local499 + 1539] = local62;
				}
			}
		}
		local10 = Static78.method1588(arg0, arg2, arg1);
		if (local10 == 0L) {
			return;
		}
		local28 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		@Pc(643) Class4_Sub1_Sub19 local643 = Static113.method2090(local28);
		if (local643.anInt4183 == -1) {
			return;
		}
		@Pc(653) Class4_Sub1_Sub7_Sub3 local653 = Static61.aClass4_Sub1_Sub7_Sub3Array7[local643.anInt4183];
		if (local653 != null) {
			local42 = (local643.anInt4191 * 4 - local653.anInt3484) / 2;
			local62 = (local643.anInt4187 * 4 - local653.anInt3482) / 2;
			local653.method2642(arg2 * 4 + local42 + 48, local62 + (-arg1 + 104 + -local643.anInt4187) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IB)I")
	public static int method438(@OriginalArg(0) int arg0) {
		@Pc(7) Class4_Sub1_Sub2 local7 = Static188.method3182(arg0);
		@Pc(10) int local10 = local7.anInt218;
		@Pc(13) int local13 = local7.anInt220;
		@Pc(16) int local16 = local7.anInt211;
		@Pc(23) int local23 = Class14.anIntArray58[local13 - local16];
		return Static147.anIntArray64[local10] >> local16 & local23;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Color;Lclient!jd;I)V")
	public static void method440(@OriginalArg(1) Color arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static137.aCanvas1.getGraphics();
			if (Static111.aFont1 == null) {
				Static111.aFont1 = new Font("Helvetica", 1, 13);
				Static64.aFontMetrics1 = Static137.aCanvas1.getFontMetrics(Static111.aFont1);
			}
			if (Static9.aBoolean19) {
				Static9.aBoolean19 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static102.anInt2589, Static47.anInt1222);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static39.anImage1 == null) {
					Static39.anImage1 = Static137.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static39.anImage1.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static111.aFont1);
				local47.setColor(Color.white);
				arg1.method1657((304 - arg1.method1671(Static64.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static39.anImage1, Static102.anInt2589 / 2 - 152, Static47.anInt1222 / 2 + -18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static102.anInt2589 / 2 - 152;
				@Pc(137) int local137 = Static47.anInt1222 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local131, local137, 303, 33);
				local2.fillRect(local131 + 2, local137 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local131 + 1, local137 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local131 + 2, local137 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static111.aFont1);
				local2.setColor(Color.white);
				arg1.method1657(local131 + (304 - arg1.method1671(Static64.aFontMetrics1)) / 2, local137 + 22, local2);
			}
		} catch (@Pc(219) Exception local219) {
			Static137.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!jd;BLclient!nh;Lclient!jd;)Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 method441(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(16) int local16 = arg1.method2859(arg0);
		@Pc(22) int local22 = arg1.method2860(local16, arg2);
		return Static110.method2049(arg1, local22, local16);
	}
}
