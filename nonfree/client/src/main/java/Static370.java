import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array10;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
	public static int anInt7046;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method5904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI[BZIILclient!eq;)Lclient!mba;")
	public static Class121_Sub2_Sub1 method5905(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class33_Sub3 arg3) {
		if (arg3.aBoolean275 || Static474.method7016(arg2) && Static474.method7016(arg0)) {
			return new Class121_Sub2_Sub1(arg3, 3553, 6406, arg2, arg0, false, arg1, 6406);
		} else if (arg3.aBoolean262) {
			return new Class121_Sub2_Sub1(arg3, 34037, 6406, arg2, arg0, false, arg1, 6406);
		} else {
			return new Class121_Sub2_Sub1(arg3, 6406, arg2, arg0, Static95.method2482(arg2), Static95.method2482(arg0), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIBI)V")
	public static void method5906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static472.anInt6105 <= arg3 && Static202.anInt4720 >= arg1 && arg0 >= Static246.anInt5506 && Static583.anInt9761 >= arg4) {
			Static106.method2585(arg4, arg1, arg0, arg2, arg3);
		} else {
			Static381.method6053(arg3, arg1, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5907(@OriginalArg(0) Class33 arg0) {
		for (@Pc(4) Class2_Sub2 local4 = (Class2_Sub2) Static477.aClass375_7.method8638(); local4 != null; local4 = (Class2_Sub2) Static477.aClass375_7.method8635()) {
			if (local4.aBoolean16) {
				local4.method231(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)I")
	public static int method5910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(JZILclient!aa;IILclient!gaa;II)V")
	public static void method5913(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class108 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg4 * arg4 + arg3 * arg3;
		if ((long) local14 > arg0) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg5.anInt4067 / 2, arg5.anInt4037 / 2);
		if (local30 * local30 >= local14) {
			Static625.method8489(arg6, arg4, arg7, arg5, arg3, arg2, Static104.aClass5Array5[arg1]);
			return;
		}
		local30 -= 10;
		@Pc(46) int local46;
		if (Static516.anInt9019 == 4) {
			local46 = (int) Static502.aFloat230 & 0x3FFF;
		} else {
			local46 = (int) Static502.aFloat230 + Static30.anInt575 & 0x3FFF;
		}
		@Pc(57) int local57 = Class3_Sub1_Sub2.anIntArray84[local46];
		@Pc(61) int local61 = Class3_Sub1_Sub2.anIntArray85[local46];
		if (Static516.anInt9019 != 4) {
			local61 = local61 * 256 / (Static127.anInt3186 + 256);
			local57 = local57 * 256 / (Static127.anInt3186 + 256);
		}
		@Pc(92) int local92 = local61 * arg4 + arg3 * local57 >> 14;
		@Pc(103) int local103 = local61 * arg3 - local57 * arg4 >> 14;
		@Pc(109) double local109 = Math.atan2((double) local92, (double) local103);
		@Pc(116) int local116 = (int) (Math.sin(local109) * (double) local30);
		@Pc(123) int local123 = (int) (Math.cos(local109) * (double) local30);
		Static452.aClass5Array12[arg1].method7579((float) local116 + (float) arg5.anInt4067 / 2.0F + (float) arg6, (float) -local123 + (float) arg5.anInt4037 / 2.0F + (float) arg7, 4096, (int) (-local109 / 6.283185307179586D * 65535.0D));
	}
}
