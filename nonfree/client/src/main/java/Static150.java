import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z", line = 28)
	public static boolean method2954(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Class2_Sub3_Sub9.anInt1622; local1 < Static86.anInt1912; local1++) {
			@Pc(6) Class67[][] local6 = Static307.aClass67ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static198.anInt3784; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static229.anInt4641 + local9;
				@Pc(18) int local18 = Static229.anInt4641 - local9;
				if (local14 >= Static152.anInt2957 || local18 < Static206.anInt4628) {
					for (@Pc(27) int local27 = -Static198.anInt3784; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static197.anInt3776 + local27;
						@Pc(36) int local36 = Static197.anInt3776 - local27;
						@Pc(48) Class67 local48;
						if (local14 >= Static152.anInt2957) {
							if (local32 >= Static207.anInt3944) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean138) {
									Class2_Sub11.aBoolean131 = arg0;
									Static153.aClass15_1.method1585(local48);
									Static153.aClass15_1.method1588();
								}
							}
							if (local36 < Static28.anInt722) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean138) {
									Class2_Sub11.aBoolean131 = arg0;
									Static153.aClass15_1.method1585(local48);
									Static153.aClass15_1.method1588();
								}
							}
						}
						if (local18 < Static206.anInt4628) {
							if (local32 >= Static207.anInt3944) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean138) {
									Class2_Sub11.aBoolean131 = arg0;
									Static153.aClass15_1.method1585(local48);
									Static153.aClass15_1.method1588();
								}
							}
							if (local36 < Static28.anInt722) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean138) {
									Class2_Sub11.aBoolean131 = arg0;
									Static153.aClass15_1.method1585(local48);
									Static153.aClass15_1.method1588();
								}
							}
						}
						if (Class236.anInt6724 == 0) {
							if (Static151.aBoolean208) {
								Static153.aClass15_1.method1580(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(CB)Z", line = 140)
	public static boolean method2955(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static83.method1941(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Class141.aCharArray3;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (arg0 == local34) {
					return true;
				}
			}
			@Pc(54) char[] local54 = Class9.aCharArray1;
			for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
				@Pc(62) char local62 = local54[local56];
				if (arg0 == local62) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!ml;ILclient!ci;II)Lclient!wm;", line = 205)
	public static Class19 method2956(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Class local6 = Class.forName("Class19_Sub1");
			@Pc(58) Constructor local58 = local6.getConstructor(Canvas.class, ci.class, Integer.TYPE, Integer.TYPE, ml.class);
			return (Class19) local58.newInstance(arg0, arg2, Integer.valueOf(arg4), new Integer(arg3), arg1);
		} catch (@Pc(91) Exception local91) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 230)
	public static void method2957() {
		Class2_Sub3_Sub24.anInt4949 = 0;
		Class92.aClass135_19.method3545();
		Class243.aBoolean477 = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V", line = 258)
	public static void method2958(@OriginalArg(1) int arg0) {
		if (!Static207.method3917(arg0)) {
			return;
		}
		@Pc(14) Class161[] local14 = Static25.aClass161ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class161 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt4241 = 0;
				local22.anInt4276 = 0;
				local22.anInt4309 = 1;
			}
		}
	}
}
