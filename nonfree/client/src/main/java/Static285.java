import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "[Lclient!ta;")
	public static Class65[] aClass65Array3;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method3510() {
		if (Static405.anInt6682 == 0) {
			return;
		}
		try {
			if (++Static276.anInt970 > 1500) {
				if (Static125.aClass11_5 != null) {
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
				}
				if (Static239.anInt4518 >= 1) {
					Static296.anInt5302 = -5;
					Static405.anInt6682 = 0;
					return;
				}
				if (Static313.anInt5435 == Static133.anInt2755) {
					Static313.anInt5435 = Static11.anInt154;
				} else {
					Static313.anInt5435 = Static133.anInt2755;
				}
				Static239.anInt4518++;
				Static276.anInt970 = 0;
				Static405.anInt6682 = 1;
			}
			if (Static405.anInt6682 == 1) {
				Static36.aClass199_3 = Static206.aClass66_4.method1728(Static13.aString4, Static313.anInt5435);
				Static405.anInt6682 = 2;
			}
			@Pc(118) int local118;
			if (Static405.anInt6682 == 2) {
				if (Static36.aClass199_3.anInt5760 == 2) {
					throw new IOException();
				}
				if (Static36.aClass199_3.anInt5760 != 1) {
					return;
				}
				Static125.aClass11_5 = new Class11((Socket) Static36.aClass199_3.anObject29, Static206.aClass66_4);
				Static36.aClass199_3 = null;
				Static125.aClass11_5.method142(Static3.aClass4_Sub12_Sub1_5.anInt2997, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
				Static329.method4427();
				local118 = Static125.aClass11_5.method139();
				Static329.method4427();
				if (local118 != 101) {
					Static296.anInt5302 = local118;
					Static405.anInt6682 = 0;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
					return;
				}
				Static405.anInt6682 = 3;
			}
			if (Static405.anInt6682 == 3 && Static125.aClass11_5.method133() >= 2) {
				local118 = Static125.aClass11_5.method139() << 8 | Static125.aClass11_5.method139();
				Static162.method5279(local118);
				if (Static56.anInt1028 == -1) {
					Static405.anInt6682 = 0;
					Static296.anInt5302 = 6;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
				} else {
					Static405.anInt6682 = 0;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
					Static445.method5617();
				}
			}
		} catch (@Pc(188) IOException local188) {
			if (Static125.aClass11_5 != null) {
				Static125.aClass11_5.method138();
				Static125.aClass11_5 = null;
			}
			if (Static239.anInt4518 >= 1) {
				Static405.anInt6682 = 0;
				Static296.anInt5302 = -4;
			} else {
				Static405.anInt6682 = 1;
				Static276.anInt970 = 0;
				Static239.anInt4518++;
				if (Static133.anInt2755 == Static313.anInt5435) {
					Static313.anInt5435 = Static11.anInt154;
				} else {
					Static313.anInt5435 = Static133.anInt2755;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBI)Lclient!r;")
	public static Class16_Sub1_Sub5 method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class164 local11 = Static202.aClass164ArrayArrayArray5[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class16_Sub1_Sub5 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class7 local27 = local11.aClass7_3; local27 != null; local27 = local27.aClass7_1) {
			@Pc(31) Class16_Sub1 local31 = local27.aClass16_Sub1_1;
			if (local31 instanceof Class16_Sub1_Sub5) {
				@Pc(37) Class16_Sub1_Sub5 local37 = (Class16_Sub1_Sub5) local31;
				@Pc(47) int local47 = (local37.method4751() - 1) * 64 + 60;
				@Pc(54) int local54 = local37.anInt6893 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt6892 - local47 >> 7;
				@Pc(69) int local69 = local47 + local37.anInt6893 >> 7;
				@Pc(76) int local76 = local37.anInt6892 + local47 >> 7;
				if (local54 <= arg1 && local62 <= arg0 && arg1 <= local69 && arg0 <= local76) {
					@Pc(110) int local110 = (local76 + 1 - arg0) * (-arg1 + 1 + local69);
					if (local110 > local24) {
						local17 = local37;
						local24 = local110;
					}
				}
			}
		}
		return local17;
	}
}
