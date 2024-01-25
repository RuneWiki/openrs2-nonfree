import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	public static int anInt6231;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
	public static final int[] anIntArray535 = new int[1024];

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_54 = new Class42(32);

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_55 = new Class42(16);

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)I")
	public static int method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZII)V")
	public static void method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg3) {
			Static60.method1252();
		}
		if (Static30.aFrame1 != null && (arg2 != 3 || arg4 != Static229.anInt4486 || arg1 != Static45.anInt1175)) {
			Static138.method2590(Static30.aFrame1, Static202.aClass10_3);
			Static30.aFrame1 = null;
		}
		if (arg2 == 3 && Static30.aFrame1 == null) {
			Static30.aFrame1 = Static99.method2014(Static202.aClass10_3, arg4, arg1, 0);
			if (Static30.aFrame1 != null) {
				Static229.anInt4486 = arg4;
				Static45.anInt1175 = arg1;
				Static287.method4908(Static202.aClass10_3);
			}
		}
		if (arg2 == 3 && Static30.aFrame1 == null) {
			method5534(arg0, -1, Static326.anInt6197, true, -1);
			return;
		}
		@Pc(110) Container local110;
		@Pc(86) Insets local86;
		if (Static30.aFrame1 != null) {
			Static275.anInt5385 = arg1;
			Static9.anInt307 = arg4;
			local110 = Static30.aFrame1;
		} else if (Static168.aFrame2 == null) {
			local110 = Static202.aClass10_3.anApplet1;
			Static9.anInt307 = local110.getSize().width;
			Static275.anInt5385 = local110.getSize().height;
		} else {
			local86 = Static168.aFrame2.getInsets();
			@Pc(95) int local95 = local86.left + local86.right;
			Static9.anInt307 = Static168.aFrame2.getSize().width - local95;
			@Pc(106) int local106 = local86.top + local86.bottom;
			Static275.anInt5385 = Static168.aFrame2.getSize().height - local106;
			local110 = Static168.aFrame2;
		}
		@Pc(151) int local151;
		if (arg2 == 1) {
			Static17.anInt5991 = 765;
			Static269.anInt5158 = (Static9.anInt307 - 765) / 2;
			Static246.anInt4801 = 503;
			Static312.anInt5960 = 0;
		} else if (Static46.anInt1196 < 96 && Static134.anInt2746 == 0) {
			local151 = Static9.anInt307 > 1024 ? 1024 : Static9.anInt307;
			@Pc(158) int local158 = Static275.anInt5385 > 768 ? 768 : Static275.anInt5385;
			Static269.anInt5158 = (Static9.anInt307 - local151) / 2;
			Static17.anInt5991 = local151;
			Static246.anInt4801 = local158;
			Static312.anInt5960 = 0;
		} else {
			Static312.anInt5960 = 0;
			Static17.anInt5991 = Static9.anInt307;
			Static246.anInt4801 = Static275.anInt5385;
			Static269.anInt5158 = 0;
		}
		if (Static226.anInt4439 != 0) {
			@Pc(205) boolean local205;
			if (Static17.anInt5991 < 1024 && Static246.anInt4801 < 768) {
				local205 = true;
			} else {
				local205 = false;
			}
		}
		if (arg3) {
			Static43.method967(Static134.anInt2746);
		} else {
			Static243.aCanvas3.setSize(Static17.anInt5991, Static246.anInt4801);
			if (Static15.aClass59_1 != null) {
				Static15.aClass59_1.method4884();
			}
			if (Static168.aFrame2 == local110) {
				local86 = Static168.aFrame2.getInsets();
				Static243.aCanvas3.setLocation(Static269.anInt5158 + local86.left, Static312.anInt5960 + local86.top);
			} else {
				Static243.aCanvas3.setLocation(Static269.anInt5158, Static312.anInt5960);
			}
		}
		if (arg2 >= 2) {
			Static145.aBoolean466 = true;
		} else {
			Static145.aBoolean466 = false;
		}
		if (Static207.anInt4106 != -1) {
			Static101.method2032(true);
		}
		if (Static95.aClass68_23 != null && (Static247.anInt3874 == 30 || Static247.anInt3874 == 25)) {
			Static125.method2419();
		}
		for (local151 = 0; local151 < 100; local151++) {
			Static293.aBooleanArray25[local151] = true;
		}
		Static303.aBoolean433 = true;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!lj;III)V")
	public static void method5535(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static318.anIntArrayArrayArray19[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt1945 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass5_Sub13_Sub1Array2[arg0.anInt1945++] = Static233.aClass5_Sub13_Sub1Array3[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt1945; local19 < 4; local19++) {
			arg0.aClass5_Sub13_Sub1Array2[local19] = null;
		}
	}
}
