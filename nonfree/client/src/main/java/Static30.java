import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array1;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	public static int anInt572;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_207 = Static186.method3527(" loggt sich aus)3");

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_208 = Static186.method3527("huffman");

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_209 = Static186.method3527("<br>(X");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
	public static void method429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static6.method87(arg1, arg2, arg4, arg3);
			}
		} else if (local15 == 0) {
			Static177.method2915(arg2, arg3, arg0, arg4);
		} else {
			@Pc(41) int local41 = (local15 << 12) / local10;
			@Pc(50) int local50 = arg4 - (arg2 * local41 >> 12);
			@Pc(60) int local60;
			@Pc(58) int local58;
			if (Static131.anInt2713 > arg2) {
				local60 = Static131.anInt2713;
				local58 = (Static131.anInt2713 * local41 >> 12) + local50;
			} else if (Static135.anInt2790 >= arg2) {
				local58 = arg4;
				local60 = arg2;
			} else {
				local58 = (local41 * Static135.anInt2790 >> 12) + local50;
				local60 = Static135.anInt2790;
			}
			if (local58 < Static49.anInt1030) {
				local60 = (Static49.anInt1030 - local50 << 12) / local41;
				local58 = Static49.anInt1030;
			} else if (Static177.anInt3701 < local58) {
				local58 = Static177.anInt3701;
				local60 = (Static177.anInt3701 - local50 << 12) / local41;
			}
			@Pc(132) int local132;
			@Pc(130) int local130;
			if (arg0 < Static131.anInt2713) {
				local130 = local50 + (Static131.anInt2713 * local41 >> 12);
				local132 = Static131.anInt2713;
			} else if (Static135.anInt2790 >= arg0) {
				local130 = arg1;
				local132 = arg0;
			} else {
				local130 = local50 + (Static135.anInt2790 * local41 >> 12);
				local132 = Static135.anInt2790;
			}
			if (Static49.anInt1030 > local130) {
				local130 = Static49.anInt1030;
				local132 = (Static49.anInt1030 - local50 << 12) / local41;
			} else if (Static177.anInt3701 < local130) {
				local130 = Static177.anInt3701;
				local132 = (Static177.anInt3701 - local50 << 12) / local41;
			}
			Static219.method2422(local60, local132, local58, arg3, local130);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)Lclient!hh;")
	public static Class50 method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - arg0;
		if (local16 < -9) {
			return Static20.aClass50_163;
		} else if (local16 < -6) {
			return Static74.aClass50_494;
		} else if (local16 < -3) {
			return Static11.aClass50_105;
		} else if (local16 < 0) {
			return Static141.aClass50_1236;
		} else if (local16 > 9) {
			return Static104.aClass50_675;
		} else if (local16 > 6) {
			return Static32.aClass50_228;
		} else if (local16 > 3) {
			return Static188.aClass50_1254;
		} else if (local16 > 0) {
			return Static112.aClass50_718;
		} else {
			return Static85.aClass50_556;
		}
	}
}
