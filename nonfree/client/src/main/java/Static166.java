import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
	public static int[] anIntArray382 = Class2_Sub1_Sub4_Sub4.anIntArray304;

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
	private static int[] anIntArray385 = new int[10000];

	@OriginalMember(owner = "client!v", name = "sb", descriptor = "[I")
	private static int[] anIntArray387 = new int[10000];

	@OriginalMember(owner = "client!v", name = "yb", descriptor = "I")
	private static int anInt3621 = 0;

	@OriginalMember(owner = "client!v", name = "Ab", descriptor = "[I")
	public static int[] anIntArray390 = Class2_Sub1_Sub4_Sub4.anIntArray299;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	public static void method2548() {
		anIntArray385 = null;
		anIntArray387 = null;
		anIntArray390 = null;
		anIntArray382 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!kh;II)Lclient!v;")
	public static Class2_Sub1_Sub3_Sub7 method2551(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1030(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub3_Sub7(local5);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;Lclient!v;IIIZ)V")
	public static void method2558(@OriginalArg(0) Class2_Sub1_Sub3_Sub7 arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2557();
		arg0.method2549();
		arg1.method2557();
		arg1.method2549();
		anInt3621++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray391;
		@Pc(19) int local19 = arg1.anInt3618;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt3618; local21++) {
			@Pc(27) Class44 local27 = arg0.aClass44Array1[local21];
			if (local27.anInt1869 != 0) {
				local37 = arg0.anIntArray384[local21] - arg3;
				if (local37 <= arg1.anInt3619) {
					@Pc(48) int local48 = arg0.anIntArray391[local21] - arg2;
					if (local48 >= arg1.anInt3622 && local48 <= arg1.anInt3617) {
						@Pc(64) int local64 = arg0.anIntArray388[local21] - arg4;
						if (local64 >= arg1.anInt3620 && local64 <= arg1.anInt3624) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class44 local81 = arg1.aClass44Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray388[local75] && local37 == arg1.anIntArray384[local75] && local81.anInt1869 != 0) {
									if (arg0.aClass44Array2 == null) {
										arg0.aClass44Array2 = new Class44[arg0.anInt3618];
									}
									if (arg1.aClass44Array2 == null) {
										arg1.aClass44Array2 = new Class44[local19];
									}
									@Pc(121) Class44 local121 = arg0.aClass44Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass44Array2[local21] = new Class44(local27);
									}
									@Pc(138) Class44 local138 = arg1.aClass44Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass44Array2[local75] = new Class44(local81);
									}
									local121.anInt1871 += local81.anInt1871;
									local121.anInt1872 += local81.anInt1872;
									local121.anInt1875 += local81.anInt1875;
									local121.anInt1869 += local81.anInt1869;
									local138.anInt1871 += local27.anInt1871;
									local138.anInt1872 += local27.anInt1872;
									local138.anInt1875 += local27.anInt1875;
									local138.anInt1869 += local27.anInt1869;
									local13++;
									anIntArray385[local21] = anInt3621;
									anIntArray387[local75] = anInt3621;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt3616; local232++) {
			if (anIntArray385[arg0.anIntArray392[local232]] == anInt3621 && anIntArray385[arg0.anIntArray389[local232]] == anInt3621 && anIntArray385[arg0.anIntArray383[local232]] == anInt3621) {
				if (arg0.aByteArray48 == null) {
					arg0.aByteArray48 = new byte[arg0.anInt3616];
				}
				arg0.aByteArray48[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt3616; local37++) {
			if (anIntArray387[arg1.anIntArray392[local37]] == anInt3621 && anIntArray387[arg1.anIntArray389[local37]] == anInt3621 && anIntArray387[arg1.anIntArray383[local37]] == anInt3621) {
				if (arg1.aByteArray48 == null) {
					arg1.aByteArray48 = new byte[arg1.anInt3616];
				}
				arg1.aByteArray48[local37] = 2;
			}
		}
	}
}
