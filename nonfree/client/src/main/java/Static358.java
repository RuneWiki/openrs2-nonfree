import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
	public static int anInt5640;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "Lclient!vga;")
	public static final Class392 aClass392_1 = new Class392();

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Z")
	public static boolean method4991() {
		if (Static304.aBoolean320) {
			try {
				if ((Boolean) Static728.method688(Static41.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z[[BLclient!uu;)V")
	public static void method4992(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class114_Sub1 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(34) int local34;
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt10214; local3++) {
			Static445.method5895();
			for (local11 = 0; local11 < Static497.anInt7926 >> 3; local11++) {
				for (local15 = 0; local15 < Static646.anInt9979 >> 3; local15++) {
					local25 = Static66.anIntArrayArrayArray1[local3][local11][local15];
					if (local25 != -1) {
						local34 = local25 >> 24 & 0x3;
						if (!arg1.aBoolean680 || local34 == 0) {
							@Pc(47) int local47 = local25 >> 1 & 0x3;
							@Pc(53) int local53 = local25 >> 14 & 0x3FF;
							@Pc(59) int local59 = local25 >> 3 & 0x7FF;
							@Pc(70) int local70 = (local53 / 8 << 8) + (local59 / 8);
							for (@Pc(72) int local72 = 0; local72 < Static385.anIntArray437.length; local72++) {
								if (local70 == Static385.anIntArray437[local72] && arg0[local72] != null) {
									@Pc(94) Class3_Sub2 local94 = new Class3_Sub2(arg0[local72]);
									arg1.method8680(local94, local15 * 8, local59, local34, local53, local3, local11 * 8, local47, Static455.aClass109Array1);
									arg1.method8692(local59, local15 * 8, local94, Static153.aClass22_4, local34, local47, local11 * 8, local3, local53);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (false) {
			method4998(19);
		}
		for (local11 = 0; local11 < arg1.anInt10214; local11++) {
			Static445.method5895();
			for (local15 = 0; local15 < Static497.anInt7926 >> 3; local15++) {
				for (local25 = 0; local25 < Static646.anInt9979 >> 3; local25++) {
					local34 = Static66.anIntArrayArrayArray1[local11][local15][local25];
					if (local34 == -1) {
						arg1.method8684(local11, local25 * 8, 8, local15 * 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/awt/Component;IILclient!br;)Lclient!lba;")
	public static Class107 method4995(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class47 arg3) {
		if (Static330.anInt9773 == 0) {
			throw new IllegalStateException();
		} else if (arg2 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(44) Class107 local44 = (Class107) Class.forName("fb").getDeclaredConstructor().newInstance();
				local44.anIntArray471 = new int[(Static330.aBoolean659 ? 2 : 1) * 256];
				local44.anInt6189 = arg1;
				local44.method5369(arg0);
				local44.anInt6188 = (arg1 & 0xFFFFFC00) + 1024;
				if (local44.anInt6188 > 16384) {
					local44.anInt6188 = 16384;
				}
				local44.method5373(local44.anInt6188);
				if (Static553.anInt8496 > 0 && Static353.aClass274_1 == null) {
					Static353.aClass274_1 = new Class274();
					Static353.aClass274_1.aClass47_5 = arg3;
					arg3.method1394(Static553.anInt8496, Static353.aClass274_1);
				}
				if (Static353.aClass274_1 != null) {
					if (Static353.aClass274_1.aClass107Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static353.aClass274_1.aClass107Array1[arg2] = local44;
				}
				return local44;
			} catch (@Pc(126) Throwable local126) {
				try {
					@Pc(132) Class107_Sub2 local132 = new Class107_Sub2(arg3, arg2);
					local132.anIntArray471 = new int[(Static330.aBoolean659 ? 2 : 1) * 256];
					local132.anInt6189 = arg1;
					local132.method5369(arg0);
					local132.anInt6188 = 16384;
					local132.method5373(local132.anInt6188);
					if (Static553.anInt8496 > 0 && Static353.aClass274_1 == null) {
						Static353.aClass274_1 = new Class274();
						Static353.aClass274_1.aClass47_5 = arg3;
						arg3.method1394(Static553.anInt8496, Static353.aClass274_1);
					}
					if (Static353.aClass274_1 != null) {
						if (Static353.aClass274_1.aClass107Array1[arg2] != null) {
							throw new IllegalArgumentException();
						}
						Static353.aClass274_1.aClass107Array1[arg2] = local132;
					}
					return local132;
				} catch (@Pc(202) Throwable local202) {
					return new Class107();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)V")
	public static void method4996(@OriginalArg(0) int arg0) {
		Static265.aClass292_3 = Static95.aClass292_2;
		Static565.anInt8601 = arg0;
		Static11.anInt525 = 2;
		@Pc(11) String local11 = null;
		if (Static633.aByteArray92 != null) {
			@Pc(18) Class3_Sub2 local18 = new Class3_Sub2(Static633.aByteArray92);
			local11 = Static248.method3508(local18.method2063(), -110);
			Static605.aLong302 = local18.method2063();
		}
		if (local11 == null) {
			Static625.method8221(35);
		} else {
			Static45.method1224("", local11, true, false);
		}
	}
}
