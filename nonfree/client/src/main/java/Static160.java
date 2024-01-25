import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
	public static int anInt8867;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString100 = null;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	public static void method7592() {
		@Pc(8) Class5_Sub36_Sub2 local8 = Static4.aClass389_17.aClass5_Sub36_Sub2_2;
		@Pc(12) int local12 = local8.method7291();
		@Pc(16) int local16 = local8.method7333();
		@Pc(26) boolean local26 = local8.method7330() == 1;
		@Pc(30) int local30 = local8.method7300();
		Static139.anInt2749 = local8.method7330();
		Static280.method4497();
		Static492.method6897(local12, true);
		local8.method7336();
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(70) int local70;
		for (@Pc(53) int local53 = 0; local53 < 4; local53++) {
			for (local57 = 0; local57 < Static271.anInt4910 >> 3; local57++) {
				for (local61 = 0; local61 < Static613.anInt9909 >> 3; local61++) {
					local70 = local8.method7343(1);
					if (local70 == 1) {
						Static653.anIntArrayArrayArray20[local53][local57][local61] = local8.method7343(26);
					} else {
						Static653.anIntArrayArrayArray20[local53][local57][local61] = -1;
					}
				}
			}
		}
		local8.method7340();
		local57 = (Static4.aClass389_17.anInt10756 - local8.anInt8456) / 16;
		Static387.anIntArrayArray42 = new int[local57][4];
		for (local61 = 0; local61 < local57; local61++) {
			for (local70 = 0; local70 < 4; local70++) {
				Static387.anIntArrayArray42[local61][local70] = local8.method7268();
			}
		}
		Static135.aByteArrayArray7 = new byte[local57][];
		Static404.anIntArray406 = new int[local57];
		Static378.aByteArrayArray15 = new byte[local57][];
		Static572.anIntArray520 = new int[local57];
		Static123.anIntArray121 = new int[local57];
		Static61.anIntArray66 = new int[local57];
		Static547.anIntArray496 = null;
		Static56.aByteArrayArray1 = new byte[local57][];
		Static429.aByteArrayArray16 = new byte[local57][];
		Static75.anIntArray68 = new int[local57];
		Static311.aByteArrayArray14 = null;
		local57 = 0;
		for (local70 = 0; local70 < 4; local70++) {
			for (@Pc(217) int local217 = 0; local217 < Static271.anInt4910 >> 3; local217++) {
				for (@Pc(221) int local221 = 0; local221 < Static613.anInt9909 >> 3; local221++) {
					@Pc(231) int local231 = Static653.anIntArrayArrayArray20[local70][local217][local221];
					if (local231 != -1) {
						@Pc(241) int local241 = local231 >> 14 & 0x3FF;
						@Pc(247) int local247 = local231 >> 3 & 0x7FF;
						@Pc(257) int local257 = local247 / 8 + (local241 / 8 << 8);
						for (@Pc(259) int local259 = 0; local259 < local57; local259++) {
							if (local257 == Static75.anIntArray68[local259]) {
								local257 = -1;
								break;
							}
						}
						if (local257 != -1) {
							Static75.anIntArray68[local57] = local257;
							@Pc(300) int local300 = local257 >> 8 & 0xFF;
							@Pc(304) int local304 = local257 & 0xFF;
							Static123.anIntArray121[local57] = Static495.aClass126_12.method3067("m" + local300 + "_" + local304);
							Static404.anIntArray406[local57] = Static495.aClass126_12.method3067("l" + local300 + "_" + local304);
							Static61.anIntArray66[local57] = Static495.aClass126_12.method3067("um" + local300 + "_" + local304);
							Static572.anIntArray520[local57] = Static495.aClass126_12.method3067("ul" + local300 + "_" + local304);
							local57++;
						}
					}
				}
			}
		}
		Static372.method5546(local30, local26, 12, local16);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!tga;IIILjava/awt/Component;)Lclient!eca;")
	public static Class45 method7595(@OriginalArg(0) Class349 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static417.anInt7038 == 0) {
			throw new IllegalStateException();
		} else if (arg1 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(36) Class45 local36 = (Class45) Class.forName("br").getDeclaredConstructor().newInstance();
				local36.anIntArray495 = new int[(Static404.aBoolean460 ? 2 : 1) * 256];
				local36.anInt8662 = arg2;
				local36.method7461(arg3);
				local36.anInt8661 = (arg2 & 0xFFFFFC00) + 1024;
				if (local36.anInt8661 > 16384) {
					local36.anInt8661 = 16384;
				}
				local36.method7456(local36.anInt8661);
				if (Static207.anInt3690 > 0 && Static205.aClass6_1 == null) {
					Static205.aClass6_1 = new Class6();
					Static205.aClass6_1.aClass349_1 = arg0;
					arg0.method7746(Static205.aClass6_1, Static207.anInt3690);
				}
				if (Static205.aClass6_1 != null) {
					if (Static205.aClass6_1.aClass45Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static205.aClass6_1.aClass45Array1[arg1] = local36;
				}
				return local36;
			} catch (@Pc(121) Throwable local121) {
				try {
					@Pc(127) Class45_Sub2 local127 = new Class45_Sub2(arg0, arg1);
					local127.anIntArray495 = new int[(Static404.aBoolean460 ? 2 : 1) * 256];
					local127.anInt8662 = arg2;
					local127.method7461(arg3);
					local127.anInt8661 = 16384;
					local127.method7456(local127.anInt8661);
					if (Static207.anInt3690 > 0 && Static205.aClass6_1 == null) {
						Static205.aClass6_1 = new Class6();
						Static205.aClass6_1.aClass349_1 = arg0;
						arg0.method7746(Static205.aClass6_1, Static207.anInt3690);
					}
					if (Static205.aClass6_1 != null) {
						if (Static205.aClass6_1.aClass45Array1[arg1] != null) {
							throw new IllegalArgumentException();
						}
						Static205.aClass6_1.aClass45Array1[arg1] = local127;
					}
					return local127;
				} catch (@Pc(195) Throwable local195) {
					return new Class45();
				}
			}
		}
	}
}
