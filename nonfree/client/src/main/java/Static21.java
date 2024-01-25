import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!l;")
	public static Class11 aClass11_2;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array3;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_7 = new Class55("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!b", name = "V", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!b", name = "W", descriptor = "[I")
	public static final int[] anIntArray31 = new int[8];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method221(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static206.anInt3640; local11++) {
			if (arg0.equalsIgnoreCase(Static248.aStringArray35[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static226.aStringArray33[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!et;)V")
	public static void method222(@OriginalArg(0) Class74 arg0) {
		if (Static270.anInt4582 >= 65535) {
			return;
		}
		@Pc(6) Class7_Sub30 local6 = arg0.aClass7_Sub30_2;
		Static302.aClass74Array1[Static270.anInt4582] = arg0;
		Static128.aBooleanArray9[Static270.anInt4582] = false;
		Static270.anInt4582++;
		@Pc(21) int local21 = arg0.anInt2041;
		if (arg0.aBoolean110) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2041;
		if (arg0.aBoolean109) {
			local29 = Static315.anInt5183 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5023() + Static297.anInt4923 - local6.method5031() >> Static168.anInt3026;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5023() + local6.method5031() - Static297.anInt4923 >> Static168.anInt3026;
			if (local73 >= Static295.anInt4910) {
				local73 = Static295.anInt4910 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray33[local41++];
				@Pc(105) int local105 = (local6.method5032() + Static297.anInt4923 - local6.method5031() >> Static168.anInt3026) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static264.anInt4480) {
					local113 = Static264.anInt4480 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static194.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static194.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static270.anInt4582;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static194.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static270.anInt4582 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static194.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static270.anInt4582 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static194.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static270.anInt4582 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!ec;Ljava/lang/String;)Lclient!tf;")
	public static Class236 method225(@OriginalArg(0) int arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method1464(arg2);
		}
		@Pc(39) Class236 local39;
		if (arg0 == 1) {
			try {
				Static468.method5096(arg1.anApplet1, new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, "openjs");
				local39 = new Class236();
				local39.anInt6178 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class236();
				local39.anInt6178 = 2;
				return local39;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local39 = new Class236();
				local39.anInt6178 = 1;
				return local39;
			} catch (@Pc(81) Exception local81) {
				local39 = new Class236();
				local39.anInt6178 = 2;
				return local39;
			}
		} else if (arg0 == 3) {
			try {
				Static468.method5098(arg1.anApplet1, "loggedout");
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local39 = new Class236();
				local39.anInt6178 = 1;
				return local39;
			} catch (@Pc(123) Exception local123) {
				local39 = new Class236();
				local39.anInt6178 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIILclient!ok;III)V")
	public static void method227(@OriginalArg(1) int arg0, @OriginalArg(3) Class178 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static195.anInt3458 = arg2;
		Static351.anInt5638 = 1;
		Static20.anInt2216 = arg0;
		Static286.aBoolean251 = false;
		Static455.anInt6328 = 0;
		Static126.aClass178_41 = arg1;
		Static415.anInt6610 = Static108.aClass7_Sub8_Sub3_1.method4483() / arg3;
		if (Static415.anInt6610 < 1) {
			Static415.anInt6610 = 1;
		}
	}
}
