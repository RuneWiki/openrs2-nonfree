import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	public static int anInt6210;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray73 = new String[100];

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt6209 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I")
	public static int method5265(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method5266() {
		Static104.aClass198_85.method5213();
		Static52.aClass198_47.method5213();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	public static int method5268(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5269(@OriginalArg(1) String arg0) {
		@Pc(19) String local19 = Static84.method2102(Static15.method863(arg0));
		if (local19 == null) {
			local19 = "";
		}
		return local19;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public static void method5271() {
		if (Static222.anInt4518 == 0) {
			return;
		}
		try {
			if (++Static166.anInt3583 > 2000) {
				if (Static155.aClass114_3 != null) {
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
				}
				if (Static122.anInt2882 >= 1) {
					Static288.anInt5640 = -5;
					Static222.anInt4518 = 0;
					return;
				}
				Static222.anInt4518 = 1;
				Static122.anInt2882++;
				if (Static206.anInt4324 == Static184.anInt3886) {
					Static184.anInt3886 = Static328.anInt6269;
				} else {
					Static184.anInt3886 = Static206.anInt4324;
				}
				Static166.anInt3583 = 0;
			}
			if (Static222.anInt4518 == 1) {
				Static113.aClass185_1 = Static1.aClass134_7.method3760(Static184.anInt3886, Static309.aString62);
				Static222.anInt4518 = 2;
			}
			@Pc(118) int local118;
			if (Static222.anInt4518 == 2) {
				if (Static113.aClass185_1.anInt5682 == 2) {
					throw new IOException();
				}
				if (Static113.aClass185_1.anInt5682 != 1) {
					return;
				}
				Static155.aClass114_3 = new Class114((Socket) Static113.aClass185_1.anObject4, Static1.aClass134_7);
				Static113.aClass185_1 = null;
				Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, Static15.aClass4_Sub11_Sub1_2.anInt3768);
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				local118 = Static155.aClass114_3.method3170();
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				if (local118 != 21) {
					Static222.anInt4518 = 0;
					Static288.anInt5640 = local118;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
					return;
				}
				Static222.anInt4518 = 3;
			}
			if (Static222.anInt4518 == 3) {
				if (Static155.aClass114_3.method3161() < 1) {
					return;
				}
				Static174.aStringArray46 = new String[Static155.aClass114_3.method3170()];
				Static222.anInt4518 = 4;
			}
			if (Static222.anInt4518 == 4 && Static155.aClass114_3.method3161() >= Static174.aStringArray46.length * 8) {
				Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
				Static155.aClass114_3.method3168(Static174.aStringArray46.length * 8, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
				for (local118 = 0; local118 < Static174.aStringArray46.length; local118++) {
					Static174.aStringArray46[local118] = Static58.method1229(Static127.aClass4_Sub11_Sub1_3.method3407());
				}
				Static288.anInt5640 = 21;
				Static222.anInt4518 = 0;
				Static155.aClass114_3.method3165();
				Static155.aClass114_3 = null;
			}
		} catch (@Pc(228) IOException local228) {
			if (Static155.aClass114_3 != null) {
				Static155.aClass114_3.method3165();
				Static155.aClass114_3 = null;
			}
			if (Static122.anInt2882 < 1) {
				Static222.anInt4518 = 1;
				Static122.anInt2882++;
				if (Static184.anInt3886 == Static206.anInt4324) {
					Static184.anInt3886 = Static328.anInt6269;
				} else {
					Static184.anInt3886 = Static206.anInt4324;
				}
				Static166.anInt3583 = 0;
			} else {
				Static288.anInt5640 = -4;
				Static222.anInt4518 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILclient!ml;ILjava/awt/Component;)Lclient!ng;")
	public static Class35 method5272(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static251.anInt5134 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class35 local30 = (Class35) Class.forName("Class35_Sub2").getDeclaredConstructor().newInstance();
			local30.anInt2929 = arg0;
			local30.anIntArray255 = new int[(Static314.aBoolean451 ? 2 : 1) * 256];
			local30.method2555(arg3);
			local30.anInt2924 = (arg0 & -1024) + 1024;
			if (local30.anInt2924 > 16384) {
				local30.anInt2924 = 16384;
			}
			local30.method2552(local30.anInt2924);
			if (Static2.anInt51 > 0 && Static7.aClass135_1 == null) {
				Static7.aClass135_1 = new Class135();
				Static7.aClass135_1.aClass134_4 = arg1;
				arg1.method3762(Static2.anInt51, Static7.aClass135_1);
			}
			if (Static7.aClass135_1 != null) {
				if (Static7.aClass135_1.aClass35Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static7.aClass135_1.aClass35Array1[arg2] = local30;
			}
			return local30;
		} catch (@Pc(100) Throwable local100) {
			try {
				@Pc(106) Class35_Sub1 local106 = new Class35_Sub1(arg1, arg2);
				local106.anInt2929 = arg0;
				local106.anIntArray255 = new int[(Static314.aBoolean451 ? 2 : 1) * 256];
				local106.method2555(arg3);
				local106.anInt2924 = 16384;
				local106.method2552(local106.anInt2924);
				if (Static2.anInt51 > 0 && Static7.aClass135_1 == null) {
					Static7.aClass135_1 = new Class135();
					Static7.aClass135_1.aClass134_4 = arg1;
					arg1.method3762(Static2.anInt51, Static7.aClass135_1);
				}
				if (Static7.aClass135_1 != null) {
					if (Static7.aClass135_1.aClass35Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static7.aClass135_1.aClass35Array1[arg2] = local106;
				}
				return local106;
			} catch (@Pc(170) Throwable local170) {
				return new Class35();
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	public static void method5273(@OriginalArg(0) int arg0) {
		if (Static83.anIntArray201 == null || Static83.anIntArray201.length < arg0) {
			Static83.anIntArray201 = new int[arg0];
		}
	}
}
