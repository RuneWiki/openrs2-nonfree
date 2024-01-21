import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
	public static int anInt4116;

	@OriginalMember(owner = "client!w", name = "V", descriptor = "I")
	public static int anInt4121;

	@OriginalMember(owner = "client!w", name = "R", descriptor = "I")
	public static int anInt4117 = 0;

	@OriginalMember(owner = "client!w", name = "X", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1187 = Static181.method2795("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
	public static int anInt4123 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pd;)V")
	public static void method3141(@OriginalArg(0) Class78 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3028; local2 <= arg0.anInt3031; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3036; local6 <= arg0.anInt3040; local6++) {
				@Pc(16) Class2_Sub23 local16 = Static203.aClass2_Sub23ArrayArrayArray1[arg0.anInt3033][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt3554; local20++) {
						if (local16.aClass78Array3[local20] == arg0) {
							local16.anInt3554--;
							for (local35 = local20; local35 < local16.anInt3554; local35++) {
								local16.aClass78Array3[local35] = local16.aClass78Array3[local35 + 1];
								local16.anIntArray328[local35] = local16.anIntArray328[local35 + 1];
							}
							local16.aClass78Array3[local16.anInt3554] = null;
							break;
						}
					}
					local16.anInt3563 = 0;
					for (local35 = 0; local35 < local16.anInt3554; local35++) {
						local16.anInt3563 |= local16.anIntArray328[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void method3142() {
		Static158.aBoolean148 = true;
		Static171.aBoolean164 = true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!eh;III)[Lclient!fc;")
	public static Class29[] method3143(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static66.method1261(arg2, arg1, arg0) ? Static82.method1478() : null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BIBI)I")
	public static int method3144(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg1; local9++) {
			local7 = Class57.anIntArray267[(arg0[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
