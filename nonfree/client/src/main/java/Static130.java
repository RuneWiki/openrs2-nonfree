import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
	public static int anInt2833 = 0;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Lclient!sc;")
	public static Class107 aClass107_758 = Static231.method3737("<img=1>");

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lclient!sc;")
	private static Class107 aClass107_760 = Static231.method3737("Please wait)3)3)3");

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "Lclient!sc;")
	public static Class107 aClass107_759 = aClass107_760;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
	public static int anInt2835 = -1;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[S")
	public static short[] aShortArray42 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static159.anInt3497 * 128) {
			arg0 = Static159.anInt3497 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static213.anInt4593 * 128) {
			arg2 = Static213.anInt4593 * 128 - 1;
		}
		Static212.anInt4563 = Class45.anIntArray159[arg3];
		Static92.anInt1984 = Class45.anIntArray156[arg3];
		Static143.anInt3147 = Class45.anIntArray159[arg4];
		Static51.anInt3008 = Class45.anIntArray156[arg4];
		Static95.anInt2063 = arg0;
		Static156.anInt3421 = arg1;
		Static15.anInt343 = arg2;
		Static153.anInt3385 = arg0 / 128;
		Static175.anInt3799 = arg2 / 128;
		Static19.anInt389 = Static153.anInt3385 - Static111.anInt2473;
		if (Static19.anInt389 < 0) {
			Static19.anInt389 = 0;
		}
		Static194.anInt4294 = Static175.anInt3799 - Static111.anInt2473;
		if (Static194.anInt4294 < 0) {
			Static194.anInt4294 = 0;
		}
		Static10.anInt282 = Static153.anInt3385 + Static111.anInt2473;
		if (Static10.anInt282 > Static159.anInt3497) {
			Static10.anInt282 = Static159.anInt3497;
		}
		Static178.anInt3878 = Static175.anInt3799 + Static111.anInt2473;
		if (Static178.anInt3878 > Static213.anInt4593) {
			Static178.anInt3878 = Static213.anInt4593;
		}
		@Pc(102) int local102;
		@Pc(113) int local113;
		for (@Pc(99) int local99 = 0; local99 < Static111.anInt2473 + Static111.anInt2473 + 2; local99++) {
			for (local102 = 0; local102 < Static111.anInt2473 + Static111.anInt2473 + 2; local102++) {
				local113 = (local99 - Static111.anInt2473 << 7) - (Static95.anInt2063 & 0x7F);
				@Pc(123) int local123 = (local102 - Static111.anInt2473 << 7) - (Static15.anInt343 & 0x7F);
				@Pc(129) int local129 = Static153.anInt3385 + local99 - Static111.anInt2473;
				@Pc(135) int local135 = Static175.anInt3799 + local102 - Static111.anInt2473;
				if (local129 >= 0 && local135 >= 0 && local129 < Static159.anInt3497 && local135 < Static213.anInt4593) {
					@Pc(159) int local159;
					if (Static36.anIntArrayArrayArray3 == null) {
						local159 = Static55.anIntArrayArrayArray5[0][local129][local135] + 128 - Static156.anInt3421;
					} else {
						local159 = Static36.anIntArrayArrayArray3[0][local129][local135] + 128 - Static156.anInt3421;
					}
					@Pc(184) int local184 = Static55.anIntArrayArrayArray5[3][local129][local135] - Static156.anInt3421 - 1000;
					Static8.aBooleanArrayArray1[local99][local102] = Static171.method2731(local113, local184, local159, local123);
				} else {
					Static8.aBooleanArrayArray1[local99][local102] = false;
				}
			}
		}
		for (local102 = 0; local102 < Static111.anInt2473 + Static111.anInt2473 + 1; local102++) {
			for (local113 = 0; local113 < Static111.anInt2473 + Static111.anInt2473 + 1; local113++) {
				Static85.aBooleanArrayArray2[local102][local113] = Static8.aBooleanArrayArray1[local102][local113] || Static8.aBooleanArrayArray1[local102 + 1][local113] || Static8.aBooleanArrayArray1[local102][local113 + 1] || Static8.aBooleanArrayArray1[local102 + 1][local113 + 1];
			}
		}
		Static67.anIntArray136 = arg6;
		Static136.anIntArray254 = arg7;
		Static97.anIntArray212 = arg8;
		Static233.anIntArray382 = arg9;
		Static150.anIntArray291 = arg10;
		Static126.method2114();
		Static158.method2569(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lclient!sc;")
	public static Class107 method2170(@OriginalArg(0) int arg0) {
		@Pc(7) Class107 local7 = new Class107();
		local7.aByteArray55 = new byte[arg0];
		local7.anInt4186 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public static void method2171() {
		@Pc(3) int local3 = Static18.anInt379;
		@Pc(9) int local9 = Static196.anInt4302;
		@Pc(26) int local26 = Static154.anInt3388 - local3 - Static158.anInt3484;
		@Pc(33) int local33 = Static209.anInt4462 - Static180.anInt4990 - local9;
		if (local3 <= 0 && local26 <= 0 && local9 <= 0 && local33 <= 0) {
			return;
		}
		try {
			@Pc(57) Container local57;
			if (Static34.aFrame1 != null) {
				local57 = Static34.aFrame1;
			} else if (Static125.aFrame2 == null) {
				local57 = Static117.aClass34_2.anApplet1;
			} else {
				local57 = Static125.aFrame2;
			}
			@Pc(67) int local67 = 0;
			@Pc(69) int local69 = 0;
			if (Static125.aFrame2 == local57) {
				@Pc(75) Insets local75 = Static125.aFrame2.getInsets();
				local69 = local75.top;
				local67 = local75.left;
			}
			@Pc(84) Graphics local84 = local57.getGraphics();
			local84.setColor(Color.black);
			if (local3 > 0) {
				local84.fillRect(local67, local69, local3, Static209.anInt4462);
			}
			if (local9 > 0) {
				local84.fillRect(local67, local69, Static154.anInt3388, local9);
			}
			if (local26 > 0) {
				local84.fillRect(Static154.anInt3388 + local67 - local26, local69, local26, Static209.anInt4462);
			}
			if (local33 > 0) {
				local84.fillRect(local67, local69 + Static209.anInt4462 - local33, Static154.anInt3388, local33);
				return;
			}
		} catch (@Pc(134) Exception local134) {
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
	public static int method2172(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)I")
	public static int method2174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg2 & 0x7F;
		@Pc(36) int local36 = arg0;
		if (arg0 < 3 && (Static221.aByteArrayArrayArray14[1][local7][local11] & 0x2) == 2) {
			local36 = arg0 + 1;
		}
		@Pc(55) int local55 = arg1 & 0x7F;
		@Pc(92) int local92 = Static166.anIntArrayArrayArray11[local36][local7][local11 + 1] * (128 - local34) + Static166.anIntArrayArrayArray11[local36][local7 + 1][local11 + 1] * local34 >> 7;
		@Pc(120) int local120 = (128 - local34) * Static166.anIntArrayArrayArray11[local36][local7][local11] + local34 * Static166.anIntArrayArrayArray11[local36][local7 + 1][local11] >> 7;
		return local92 * local55 + local120 * (128 - local55) >> 7;
	}
}
