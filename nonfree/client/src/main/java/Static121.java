import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "nb", descriptor = "[I")
	private static int[] anIntArray362 = new int[10000];

	@OriginalMember(owner = "client!ue", name = "Lb", descriptor = "[I")
	private static int[] anIntArray371 = new int[10000];

	@OriginalMember(owner = "client!ue", name = "Nb", descriptor = "I")
	private static int anInt3341 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ue;Lclient!ue;IIIZ)V")
	public static void method2230(@OriginalArg(0) Class3_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2227();
		arg0.method2241();
		arg1.method2227();
		arg1.method2241();
		anInt3341++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray368;
		@Pc(19) int local19 = arg1.anInt3345;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt3345; local21++) {
			@Pc(27) Class44 local27 = arg0.aClass44Array2[local21];
			if (local27.anInt2146 != 0) {
				local37 = arg0.anIntArray363[local21] - arg3;
				if (local37 <= arg1.anInt3344) {
					@Pc(48) int local48 = arg0.anIntArray368[local21] - arg2;
					if (local48 >= arg1.anInt3340 && local48 <= arg1.anInt3338) {
						@Pc(64) int local64 = arg0.anIntArray369[local21] - arg4;
						if (local64 >= arg1.anInt3337 && local64 <= arg1.anInt3343) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class44 local81 = arg1.aClass44Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray369[local75] && local37 == arg1.anIntArray363[local75] && local81.anInt2146 != 0) {
									if (arg0.aClass44Array1 == null) {
										arg0.aClass44Array1 = new Class44[arg0.anInt3345];
									}
									if (arg1.aClass44Array1 == null) {
										arg1.aClass44Array1 = new Class44[local19];
									}
									@Pc(121) Class44 local121 = arg0.aClass44Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass44Array1[local21] = new Class44(local27);
									}
									@Pc(138) Class44 local138 = arg1.aClass44Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass44Array1[local75] = new Class44(local81);
									}
									local121.anInt2156 += local81.anInt2156;
									local121.anInt2147 += local81.anInt2147;
									local121.anInt2151 += local81.anInt2151;
									local121.anInt2146 += local81.anInt2146;
									local138.anInt2156 += local27.anInt2156;
									local138.anInt2147 += local27.anInt2147;
									local138.anInt2151 += local27.anInt2151;
									local138.anInt2146 += local27.anInt2146;
									local13++;
									anIntArray362[local21] = anInt3341;
									anIntArray371[local75] = anInt3341;
								}
							}
						}
					}
				}
			}
		}
		if (local13 < 3 || !arg5) {
			return;
		}
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt3339; local232++) {
			if (anIntArray362[arg0.anIntArray367[local232]] == anInt3341 && anIntArray362[arg0.anIntArray365[local232]] == anInt3341 && anIntArray362[arg0.anIntArray364[local232]] == anInt3341) {
				if (arg0.aByteArray89 == null) {
					arg0.aByteArray89 = new byte[arg0.anInt3339];
				}
				arg0.aByteArray89[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt3339; local37++) {
			if (anIntArray371[arg1.anIntArray367[local37]] == anInt3341 && anIntArray371[arg1.anIntArray365[local37]] == anInt3341 && anIntArray371[arg1.anIntArray364[local37]] == anInt3341) {
				if (arg1.aByteArray89 == null) {
					arg1.aByteArray89 = new byte[arg1.anInt3339];
				}
				arg1.aByteArray89[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "(I)I")
	public static int method2235(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class3_Sub1_Sub1_Sub7.anIntArray366[arg0];
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
	public static int method2240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!jb;II)Lclient!ue;")
	public static Class3_Sub1_Sub1_Sub7 method2242(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method931(0, arg1);
		return local5 == null ? null : new Class3_Sub1_Sub1_Sub7(local5);
	}

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "()V")
	public static void method2244() {
		anIntArray362 = null;
		anIntArray371 = null;
		Class3_Sub1_Sub1_Sub7.anIntArray366 = null;
	}
}
