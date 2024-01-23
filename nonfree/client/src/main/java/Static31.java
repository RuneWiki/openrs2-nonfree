import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public static int anInt572;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public static int method472() {
		return ((Static220.anInt5204 == 0 ? 0 : 1) << 21) + ((Static177.anInt3306 == 0 ? 0 : 1) << 20) + ((Static110.aBoolean160 ? 1 : 0) << 19) + (Static224.anInt6084 << 17) + ((Static66.aBoolean94 ? 1 : 0) << 15) + ((Static241.aBoolean341 ? 1 : 0) << 9) + ((Static40.aBoolean431 ? 1 : 0) << 7) + ((Static258.aBoolean367 ? 1 : 0) << 6) + ((Static76.aBoolean127 ? 1 : 0) << 4) + ((Static104.aBoolean155 ? 1 : 0) << 3) + (Static251.anInt5174 & 0x7) + ((Static201.aBoolean280 ? 1 : 0) << 5) + ((Static315.aBoolean435 ? 1 : 0) << 8) + ((Static199.aBoolean275 ? 1 : 0) << 10) + ((Static86.anInt1599 & 0x3) << 11) + ((Static67.aBoolean95 ? 1 : 0) << 13) + ((Static218.aBoolean307 ? 1 : 0) << 16) + ((Static305.anInt6006 == 0 ? 0 : 1) << 22) + (Static71.method1079() << 23);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!jo;")
	public static Class3_Sub4_Sub14 method473() {
		return Static228.aClass3_Sub4_Sub14_2;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	public static int method474(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local18 * local32 >> 12;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;BILclient!ua;)Lclient!tn;")
	public static Class105 method475(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class176 arg3) {
		if (Static155.anInt2915 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class105 local34 = (Class105) Class.forName("Class105_Sub2").getDeclaredConstructor().newInstance();
			local34.anInt3145 = arg2;
			local34.anIntArray367 = new int[(Static105.aBoolean156 ? 2 : 1) * 256];
			local34.method2778(arg1);
			local34.anInt3146 = (arg2 & 0xFFFFFC00) + 1024;
			if (local34.anInt3146 > 16384) {
				local34.anInt3146 = 16384;
			}
			local34.method2772(local34.anInt3146);
			if (Static83.anInt1562 > 0 && Static266.aClass143_1 == null) {
				Static266.aClass143_1 = new Class143();
				Static266.aClass143_1.aClass176_3 = arg3;
				arg3.method4523(Static266.aClass143_1, Static83.anInt1562);
			}
			if (Static266.aClass143_1 != null) {
				if (Static266.aClass143_1.aClass105Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static266.aClass143_1.aClass105Array1[arg0] = local34;
			}
			return local34;
		} catch (@Pc(120) Throwable local120) {
			try {
				@Pc(126) Class105_Sub1 local126 = new Class105_Sub1(arg3, arg0);
				local126.anInt3145 = arg2;
				local126.anIntArray367 = new int[(Static105.aBoolean156 ? 2 : 1) * 256];
				local126.method2778(arg1);
				local126.anInt3146 = 16384;
				local126.method2772(local126.anInt3146);
				if (Static83.anInt1562 > 0 && Static266.aClass143_1 == null) {
					Static266.aClass143_1 = new Class143();
					Static266.aClass143_1.aClass176_3 = arg3;
					arg3.method4523(Static266.aClass143_1, Static83.anInt1562);
				}
				if (Static266.aClass143_1 != null) {
					if (Static266.aClass143_1.aClass105Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static266.aClass143_1.aClass105Array1[arg0] = local126;
				}
				return local126;
			} catch (@Pc(188) Throwable local188) {
				return new Class105();
			}
		}
	}
}
