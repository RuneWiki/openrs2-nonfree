import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_46 = new Class352(4);

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "[I")
	public static final int[] anIntArray417 = new int[32];

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "J")
	public static long aLong165 = 1L;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!d;IZILclient!bt;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class33 method4761(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		if (arg4 != null) {
			@Pc(22) Dimension local22 = arg4.getSize();
			local17 = local22.height;
			local15 = local22.width;
		}
		return Static207.method8122(local15, arg0, arg3, arg1, arg2, local17, arg4);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)I")
	public static int method4762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIII)V")
	public static void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(15) int local15 = arg2 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static449.method6181(arg0, arg2, arg1, arg4);
			}
		} else if (local15 == 0) {
			Static193.method3004(arg4, arg1, arg3, arg0);
		} else {
			@Pc(46) int local46 = (local15 << 12) / local10;
			@Pc(55) int local55 = arg1 - (arg0 * local46 >> 12);
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (arg3 < Static472.anInt7503) {
				local68 = Static472.anInt7503;
				local76 = local55 + (local46 * Static472.anInt7503 >> 12);
			} else if (arg3 > Static257.anInt4172) {
				local76 = (local46 * Static257.anInt4172 >> 12) + local55;
				local68 = Static257.anInt4172;
			} else {
				local68 = arg3;
				local76 = arg2;
			}
			@Pc(117) int local117;
			@Pc(119) int local119;
			if (arg0 < Static472.anInt7503) {
				local119 = local55 + (Static472.anInt7503 * local46 >> 12);
				local117 = Static472.anInt7503;
			} else if (Static257.anInt4172 >= arg0) {
				local117 = arg0;
				local119 = arg1;
			} else {
				local119 = local55 + (local46 * Static257.anInt4172 >> 12);
				local117 = Static257.anInt4172;
			}
			if (Static73.anInt1542 > local119) {
				local117 = (Static73.anInt1542 - local55 << 12) / local46;
				local119 = Static73.anInt1542;
			} else if (Static527.anInt8177 < local119) {
				local119 = Static527.anInt8177;
				local117 = (Static527.anInt8177 - local55 << 12) / local46;
			}
			if (local76 < Static73.anInt1542) {
				local68 = (Static73.anInt1542 - local55 << 12) / local46;
				local76 = Static73.anInt1542;
			} else if (local76 > Static527.anInt8177) {
				local76 = Static527.anInt8177;
				local68 = (Static527.anInt8177 - local55 << 12) / local46;
			}
			Static337.method4617(arg4, local117, local76, local119, local68);
		}
	}
}
