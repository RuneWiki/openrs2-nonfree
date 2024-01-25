import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!d;")
	public static Interface9 anInterface9_5;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_76 = new Class151(107, 3);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLclient!lc;Ljava/lang/String;ILjava/lang/String;)Lclient!pga;")
	public static Class281 method3023(@OriginalArg(1) Class207 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg2 == 0) {
			return arg0.method4575(arg3);
		}
		@Pc(60) Class281 local60;
		if (arg2 == 1) {
			try {
				@Pc(40) Object local40 = Static684.method6375(Static649.anApplet2, new Object[] { (new URL(Static649.anApplet2.getCodeBase(), arg3)).toString() }, arg1);
				if (local40 == null) {
					throw new RuntimeException();
				}
				@Pc(50) Class281 local50 = new Class281();
				local50.anInt7338 = 1;
				return local50;
			} catch (@Pc(56) Throwable local56) {
				local60 = new Class281();
				local60.anInt7338 = 2;
				return local60;
			}
		} else if (arg2 == 2) {
			try {
				Static649.anApplet2.getAppletContext().showDocument(new URL(Static649.anApplet2.getCodeBase(), arg3), "_blank");
				local60 = new Class281();
				local60.anInt7338 = 1;
				return local60;
			} catch (@Pc(88) Exception local88) {
				local60 = new Class281();
				local60.anInt7338 = 2;
				return local60;
			}
		} else if (arg2 == 3) {
			try {
				Static684.method6376("loggedout", Static649.anApplet2);
			} catch (@Pc(109) Throwable local109) {
			}
			try {
				Static649.anApplet2.getAppletContext().showDocument(new URL(Static649.anApplet2.getCodeBase(), arg3), "_top");
				local60 = new Class281();
				local60.anInt7338 = 1;
				return local60;
			} catch (@Pc(129) Exception local129) {
				local60 = new Class281();
				local60.anInt7338 = 2;
				return local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class73 local28 = Static267.aClass73ArrayArrayArray2[local9][arg0][arg1] = Static267.aClass73ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class144 local33 = local28.aClass144_1; local33 != null; local33 = local33.aClass144_2) {
					@Pc(37) Class3_Sub1_Sub2 local37 = local33.aClass3_Sub1_Sub2_1;
					if (local37.aShort124 == arg0 && local37.aShort125 == arg1) {
						local37.aByte141--;
					}
				}
				if (local28.aClass3_Sub1_Sub5_1 != null) {
					local28.aClass3_Sub1_Sub5_1.aByte141--;
				}
				if (local28.aClass3_Sub1_Sub4_1 != null) {
					local28.aClass3_Sub1_Sub4_1.aByte141--;
				}
				if (local28.aClass3_Sub1_Sub4_2 != null) {
					local28.aClass3_Sub1_Sub4_2.aByte141--;
				}
				if (local28.aClass3_Sub1_Sub3_1 != null) {
					local28.aClass3_Sub1_Sub3_1.aByte141--;
				}
				if (local28.aClass3_Sub1_Sub3_2 != null) {
					local28.aClass3_Sub1_Sub3_2.aByte141--;
				}
			}
		}
		if (Static267.aClass73ArrayArrayArray2[0][arg0][arg1] == null) {
			Static267.aClass73ArrayArrayArray2[0][arg0][arg1] = new Class73(0);
			Static267.aClass73ArrayArrayArray2[0][arg0][arg1].aByte20 = 1;
		}
		Static267.aClass73ArrayArrayArray2[0][arg0][arg1].aClass73_1 = local7;
		Static267.aClass73ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Lclient!ida;")
	public static Class69 method3026() {
		try {
			return (Class69) Class.forName("Class69_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class69_Sub2();
		}
	}
}
