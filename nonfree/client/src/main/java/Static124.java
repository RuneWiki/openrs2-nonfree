import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "Lclient!th;")
	public static Class168 aClass168_93;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "Lclient!ja;")
	public static Class83 aClass83_2;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lclient!th;")
	public static Class168 aClass168_94;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = new String[1000];

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
	public static int[] anIntArray274 = new int[1000];

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
	public static int anInt2706 = 0;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
	public static int anInt2710 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!fc;IIIBLclient!kc;Lclient!jh;I)V")
	public static void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) Class2_Sub4_Sub2 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) Class1_Sub16 local13 = new Class1_Sub16();
		local13.anInt3277 = arg4 * 128;
		local13.anInt3268 = arg7 * 128;
		local13.anInt3276 = arg3;
		if (arg5 != null) {
			local13.anInt3271 = arg5.anInt3212 * 128;
			local13.anInt3269 = arg5.anInt3178;
			local13.aClass92_1 = arg5;
			@Pc(152) int local152 = arg5.anInt3227;
			local13.anInt3278 = arg5.anInt3189;
			local13.anInt3279 = arg5.anInt3222;
			local13.anIntArray303 = arg5.anIntArray298;
			local13.anInt3275 = arg5.anInt3211;
			@Pc(171) int local171 = arg5.anInt3182;
			if (arg0 == 1 || arg0 == 3) {
				local171 = arg5.anInt3227;
				local152 = arg5.anInt3182;
			}
			local13.anInt3272 = (arg4 + local152) * 128;
			local13.anInt3280 = (arg7 + local171) * 128;
			if (arg5.anIntArray300 != null) {
				local13.aBoolean213 = true;
				local13.method2372();
			}
			if (local13.anIntArray303 != null) {
				local13.anInt3273 = local13.anInt3278 + (int) ((double) (local13.anInt3275 - local13.anInt3278) * Math.random());
			}
			Static80.aClass26_14.method668(local13);
		} else if (arg1 != null) {
			local13.aClass2_Sub4_Sub1_1 = arg1;
			@Pc(37) Class145 local37 = arg1.aClass145_1;
			if (local37.anIntArray455 != null) {
				local13.aBoolean213 = true;
				local37 = local37.method3711();
			}
			if (local37 != null) {
				local13.anInt3272 = (local37.anInt4909 + arg4) * 128;
				local13.anInt3280 = (arg7 + local37.anInt4909) * 128;
				local13.anInt3279 = Static75.method1315(arg1);
				local13.anInt3271 = local37.anInt4910 * 128;
				local13.anInt3269 = local37.anInt4940;
			}
			Static13.aClass26_3.method668(local13);
		} else if (arg6 != null) {
			local13.aClass2_Sub4_Sub2_2 = arg6;
			local13.anInt3272 = (arg4 + arg6.method2088()) * 128;
			local13.anInt3280 = (arg6.method2088() + arg7) * 128;
			local13.anInt3279 = Static64.method1133(arg6);
			local13.anInt3269 = arg6.anInt2883;
			local13.anInt3271 = arg6.anInt2882 * 128;
			Static125.aClass186_10.method4575((long) arg2, local13);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!th;I)V")
	public static void method2030(@OriginalArg(0) Class168 arg0) {
		Static165.aClass168_121 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!na;IBLjava/awt/Component;)Lclient!hn;")
	public static Class15 method2031(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static230.anInt3026 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class15 local35 = (Class15) Class.forName("Class15_Sub2").getDeclaredConstructor().newInstance();
			local35.anInt1672 = arg2;
			local35.anIntArray184 = new int[(Static263.aBoolean329 ? 2 : 1) * 256];
			local35.method1250(arg3);
			local35.anInt1676 = (arg2 & 0xFFFFFC00) + 1024;
			if (local35.anInt1676 > 16384) {
				local35.anInt1676 = 16384;
			}
			local35.method1258(local35.anInt1676);
			if (Static229.anInt4846 > 0 && Static94.aClass184_1 == null) {
				Static94.aClass184_1 = new Class184();
				Static94.aClass184_1.aClass112_4 = arg1;
				arg1.method2879(Static229.anInt4846, Static94.aClass184_1);
			}
			if (Static94.aClass184_1 != null) {
				if (Static94.aClass184_1.aClass15Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static94.aClass184_1.aClass15Array1[arg0] = local35;
			}
			return local35;
		} catch (@Pc(112) Throwable local112) {
			try {
				@Pc(118) Class15_Sub1 local118 = new Class15_Sub1(arg1, arg0);
				local118.anInt1672 = arg2;
				local118.anIntArray184 = new int[(Static263.aBoolean329 ? 2 : 1) * 256];
				local118.method1250(arg3);
				local118.anInt1676 = 16384;
				local118.method1258(local118.anInt1676);
				if (Static229.anInt4846 > 0 && Static94.aClass184_1 == null) {
					Static94.aClass184_1 = new Class184();
					Static94.aClass184_1.aClass112_4 = arg1;
					arg1.method2879(Static229.anInt4846, Static94.aClass184_1);
				}
				if (Static94.aClass184_1 != null) {
					if (Static94.aClass184_1.aClass15Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static94.aClass184_1.aClass15Array1[arg0] = local118;
				}
				return local118;
			} catch (@Pc(191) Throwable local191) {
				return new Class15();
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public static void method2034() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static181.anInt3973 - 1; local13++) {
				if (Static86.aShortArray64[local13] < 1000 && Static86.aShortArray64[local13 + 1] > 1000) {
					local7 = false;
					@Pc(40) String local40 = Static190.aStringArray34[local13];
					Static190.aStringArray34[local13] = Static190.aStringArray34[local13 + 1];
					Static190.aStringArray34[local13 + 1] = local40;
					@Pc(58) String local58 = Static112.aStringArray24[local13];
					Static112.aStringArray24[local13] = Static112.aStringArray24[local13 + 1];
					Static112.aStringArray24[local13 + 1] = local58;
					@Pc(76) int local76 = Static270.anIntArray485[local13];
					Static270.anIntArray485[local13] = Static270.anIntArray485[local13 + 1];
					Static270.anIntArray485[local13 + 1] = local76;
					@Pc(94) int local94 = Static256.anIntArray475[local13];
					Static256.anIntArray475[local13] = Static256.anIntArray475[local13 + 1];
					Static256.anIntArray475[local13 + 1] = local94;
					@Pc(112) int local112 = Static144.anIntArray304[local13];
					Static144.anIntArray304[local13] = Static144.anIntArray304[local13 + 1];
					Static144.anIntArray304[local13 + 1] = local112;
					@Pc(130) short local130 = Static86.aShortArray64[local13];
					Static86.aShortArray64[local13] = Static86.aShortArray64[local13 + 1];
					Static86.aShortArray64[local13 + 1] = local130;
					@Pc(148) long local148 = Static171.aLongArray6[local13];
					Static171.aLongArray6[local13] = Static171.aLongArray6[local13 + 1];
					Static171.aLongArray6[local13 + 1] = local148;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method2038() {
		Static313.aClass89_52.method2265();
		Static46.aClass89_8.method2265();
		Static141.aClass89_46.method2265();
		Static256.aClass89_41.method2265();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	public static void method2041(@OriginalArg(0) boolean arg0) {
		@Pc(19) byte[][] local19;
		if (Static294.aBoolean367 && arg0) {
			local19 = Static129.aByteArrayArray11;
		} else {
			local19 = Static24.aByteArrayArray4;
		}
		@Pc(26) int local26 = Static230.aByteArrayArray13.length;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) byte[] local35 = local19[local28];
			if (local35 != null) {
				@Pc(49) int local49 = (Static234.anIntArray456[local28] & 0xFF) * 64 - Static217.anInt4673;
				@Pc(60) int local60 = (Static234.anIntArray456[local28] >> 8) * 64 - Static159.anInt3527;
				Static248.method3834();
				Static209.method3356(arg0, local49, Static82.aClass75Array1, local35, local60);
			}
		}
	}
}
