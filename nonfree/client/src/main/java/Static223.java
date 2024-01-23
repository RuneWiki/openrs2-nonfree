import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	public static int anInt4821;

	@OriginalMember(owner = "client!we", name = "U", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_34;

	@OriginalMember(owner = "client!we", name = "W", descriptor = "Lclient!oe;")
	public static Class72 aClass72_282;

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
	public static int anInt4831;

	@OriginalMember(owner = "client!we", name = "cb", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_35;

	@OriginalMember(owner = "client!we", name = "eb", descriptor = "Lclient!oe;")
	public static Class72 aClass72_283;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "Lclient!sb;")
	public static Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "[I")
	public static int[] anIntArray783 = new int[1000];

	@OriginalMember(owner = "client!we", name = "db", descriptor = "I")
	public static int anInt4832 = 0;

	@OriginalMember(owner = "client!we", name = "gb", descriptor = "Lclient!mj;")
	public static Class64 aClass64_14 = null;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)I")
	public static int method3924(@OriginalArg(0) int arg0) {
		if (Static211.anInt4647 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)Z")
	public static boolean method3925() {
		try {
			return Static93.method1624();
		} catch (@Pc(14) IOException local14) {
			Static162.method2928();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static181.anInt4200 + "," + Static189.anInt4412 + "," + Static21.anInt401 + " - " + Static145.anInt3288 + "," + (Static28.anInt497 + Static31.aClass5_Sub2_Sub2_1.anIntArray333[0]) + "," + (Static31.aClass5_Sub2_Sub2_1.anIntArray334[0] + Static57.anInt628) + " - ";
			for (@Pc(62) int local62 = 0; Static145.anInt3288 > local62 && local62 < 50; local62++) {
				local60 = local60 + Static139.aClass2_Sub23_Sub1_4.aByteArray41[local62] + ",";
			}
			Static139.method2127(local19, local60);
			Static192.method3513();
			return true;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!mj;B)V")
	public static void method3926(@OriginalArg(0) Class64 arg0) {
		@Pc(13) int local13 = arg0.anInt3002;
		if (local13 == 324) {
			if (Static27.anInt492 == -1) {
				Static27.anInt492 = arg0.anInt3076;
				Static85.anInt1886 = arg0.anInt3081;
			}
			if (Static106.aClass112_2.aBoolean210) {
				arg0.anInt3076 = Static27.anInt492;
			} else {
				arg0.anInt3076 = Static85.anInt1886;
			}
		} else if (local13 == 325) {
			if (Static27.anInt492 == -1) {
				Static27.anInt492 = arg0.anInt3076;
				Static85.anInt1886 = arg0.anInt3081;
			}
			if (Static106.aClass112_2.aBoolean210) {
				arg0.anInt3076 = Static85.anInt1886;
			} else {
				arg0.anInt3076 = Static27.anInt492;
			}
		} else if (local13 == 327) {
			arg0.anInt2994 = 150;
			arg0.anInt3028 = (int) (Math.sin((double) Static123.anInt2808 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3024 = 5;
			arg0.anInt3067 = -1;
		} else if (local13 == 328) {
			if (Static31.aClass5_Sub2_Sub2_1.aClass78_423 == null) {
				arg0.anInt3067 = 0;
			} else {
				arg0.anInt2994 = 150;
				arg0.anInt3028 = (int) (Math.sin((double) Static123.anInt2808 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3024 = 5;
				arg0.anInt3067 = ((int) Static31.aClass5_Sub2_Sub2_1.aClass78_423.method3016() << 11) + 2047;
				arg0.anInt3050 = Static31.aClass5_Sub2_Sub2_1.anInt1830;
				arg0.anInt3058 = Static31.aClass5_Sub2_Sub2_1.anInt1878;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
	public static int method3927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method3930(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static206.aBoolean196) {
			try {
				@Pc(29) Class42 local29 = (Class42) Class.forName("Class42_Sub1").getDeclaredConstructor().newInstance();
				local29.method1283(arg0);
				return local29;
			} catch (@Pc(36) Throwable local36) {
				Static206.aBoolean196 = true;
			}
		}
		return arg0;
	}
}
