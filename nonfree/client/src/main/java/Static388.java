import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "[Lclient!rda;")
	public static Class4_Sub1[] aClass4_Sub1Array8;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public static int anInt6572;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array16;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!mj;")
	public static Class238 aClass238_11 = null;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_168 = new Class381(76, -1);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILclient!ha;II)Lclient!ka;")
	public static Class43 method5738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class43 local12 = (Class43) Static11.aClass168_2.method3860(local6);
		if (local12 == null) {
			@Pc(22) Class197 local22 = Static485.method8979(Static570.aClass126_258, arg1);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt5125 < 13) {
				local22.method4604();
			}
			local12 = arg3.method8588(local22, 2055, Static551.anInt8716, 64, 768);
			Static11.aClass168_2.method3853(local6, local12);
		}
		local12 = local12.method8840((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.a(arg0);
		}
		if (arg4 != 0) {
			local12.FA(arg4);
		}
		if (arg5 != 0) {
			local12.VA(arg5);
		}
		if (arg2 != 0) {
			local12.H(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;ILclient!tga;)Lclient!uga;")
	public static Class361 method5739(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class349 arg3) {
		if (arg2 == 0) {
			return arg3.method7730(arg0);
		}
		@Pc(55) Class361 local55;
		if (arg2 == 1) {
			try {
				@Pc(34) Object local34 = Static684.method784(new Object[] { (new URL(Static265.anApplet2.getCodeBase(), arg0)).toString() }, arg1, Static265.anApplet2);
				if (local34 == null) {
					throw new RuntimeException();
				}
				@Pc(45) Class361 local45 = new Class361();
				local45.anInt9720 = 1;
				return local45;
			} catch (@Pc(51) Throwable local51) {
				local55 = new Class361();
				local55.anInt9720 = 2;
				return local55;
			}
		} else if (arg2 == 2) {
			try {
				Static265.anApplet2.getAppletContext().showDocument(new URL(Static265.anApplet2.getCodeBase(), arg0), "_blank");
				local55 = new Class361();
				local55.anInt9720 = 1;
				return local55;
			} catch (@Pc(94) Exception local94) {
				local55 = new Class361();
				local55.anInt9720 = 2;
				return local55;
			}
		} else if (arg2 == 3) {
			try {
				Static684.method782(Static265.anApplet2, "loggedout");
			} catch (@Pc(115) Throwable local115) {
			}
			try {
				Static265.anApplet2.getAppletContext().showDocument(new URL(Static265.anApplet2.getCodeBase(), arg0), "_top");
				local55 = new Class361();
				local55.anInt9720 = 1;
				return local55;
			} catch (@Pc(137) Exception local137) {
				local55 = new Class361();
				local55.anInt9720 = 2;
				return local55;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z")
	public static boolean method5740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V")
	public static void method5742() {
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_2, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_2, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub28_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub7_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub22_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub14_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub8_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub3_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub21_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub23_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub10_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_2, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub12_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub20_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub17_1, 0);
		Static534.method7354();
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub26_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub1_1, 1);
		Static569.method7681();
		Static8.method134();
		Static27.aBoolean20 = true;
	}
}
