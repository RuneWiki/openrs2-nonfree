import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	public static int anInt1145;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	public static int anInt1138 = 0;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
	public static int anInt1143 = 0;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_3 = new Class95(3, 14);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Lclient!ae;")
	public static Class6_Sub1 method829(@OriginalArg(0) int arg0) {
		@Pc(9) Class138[] local9 = Class7_Sub4.aClass138Array4;
		synchronized (Class7_Sub4.aClass138Array4) {
			@Pc(28) Class6_Sub1 local28;
			if (arg0 >= Class7_Sub4.aClass138Array4.length || Class7_Sub4.aClass138Array4[arg0].method3313()) {
				local28 = new Class6_Sub1();
				local28.aClass6_Sub5Array1 = new Class6_Sub5[arg0];
				for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
					local28.aClass6_Sub5Array1[local49] = new Class6_Sub5();
				}
			} else {
				local28 = (Class6_Sub1) Class7_Sub4.aClass138Array4[arg0].method3309();
				local28.method5914();
				@Pc(35) int local35 = Static47.anIntArray87[arg0]--;
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public static void method832() {
		if (Static116.anInt5389 == 0) {
			return;
		}
		try {
			if (++Static286.anInt1444 > 2000) {
				if (Static88.aClass251_2 != null) {
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
				}
				if (Static80.anInt2014 >= 1) {
					Static443.anInt4523 = -5;
					Static116.anInt5389 = 0;
					return;
				}
				Static80.anInt2014++;
				if (Static306.anInt5453 == Static417.anInt6845) {
					Static417.anInt6845 = Static219.anInt4144;
				} else {
					Static417.anInt6845 = Static306.anInt5453;
				}
				Static286.anInt1444 = 0;
				Static116.anInt5389 = 1;
			}
			if (Static116.anInt5389 == 1) {
				Static274.aClass43_8 = Static66.aClass143_2.method3390(Static417.anInt6845, Static452.aString67);
				Static116.anInt5389 = 2;
			}
			@Pc(109) int local109;
			if (Static116.anInt5389 == 2) {
				if (Static274.aClass43_8.anInt1521 == 2) {
					throw new IOException();
				}
				if (Static274.aClass43_8.anInt1521 != 1) {
					return;
				}
				Static88.aClass251_2 = new Class251((Socket) Static274.aClass43_8.anObject3, Static66.aClass143_2);
				Static274.aClass43_8 = null;
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
				Static349.method4648();
				local109 = Static88.aClass251_2.method5349();
				Static349.method4648();
				if (local109 != 21) {
					Static443.anInt4523 = local109;
					Static116.anInt5389 = 0;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
					return;
				}
				Static116.anInt5389 = 3;
			}
			if (Static116.anInt5389 == 3) {
				if (Static88.aClass251_2.method5348() < 1) {
					return;
				}
				Static46.aStringArray7 = new String[Static88.aClass251_2.method5349()];
				Static116.anInt5389 = 4;
			}
			if (Static116.anInt5389 == 4 && Static88.aClass251_2.method5348() >= Static46.aStringArray7.length * 8) {
				Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
				Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, Static46.aStringArray7.length * 8);
				for (local109 = 0; local109 < Static46.aStringArray7.length; local109++) {
					Static46.aStringArray7[local109] = Static413.method5302(Static237.aClass3_Sub7_Sub1_1.method2610());
				}
				Static116.anInt5389 = 0;
				Static443.anInt4523 = 21;
				Static88.aClass251_2.method5345();
				Static88.aClass251_2 = null;
			}
		} catch (@Pc(199) IOException local199) {
			if (Static88.aClass251_2 != null) {
				Static88.aClass251_2.method5345();
				Static88.aClass251_2 = null;
			}
			if (Static80.anInt2014 >= 1) {
				Static116.anInt5389 = 0;
				Static443.anInt4523 = -4;
			} else {
				if (Static417.anInt6845 == Static306.anInt5453) {
					Static417.anInt6845 = Static219.anInt4144;
				} else {
					Static417.anInt6845 = Static306.anInt5453;
				}
				Static286.anInt1444 = 0;
				Static80.anInt2014++;
				Static116.anInt5389 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
	public static void method833(@OriginalArg(0) int arg0) {
		Static151.anInt3052 = arg0;
		@Pc(14) Class126 local14 = Static101.aClass126_58;
		synchronized (Static101.aClass126_58) {
			Static101.aClass126_58.method3135();
		}
	}
}
