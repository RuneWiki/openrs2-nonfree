import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "[Lclient!gh;")
	public static Class93[] aClass93Array1;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "Lclient!pf;")
	public static Class197 aClass197_1;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
	public static int anInt3767;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
	public static int anInt3768;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_49 = new Class142("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZII[B)Z")
	public static boolean method2956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg0 + 8 - 1) / 8);
		@Pc(37) int local37 = -((arg1 + 8 - 1) / 8);
		for (@Pc(44) int local44 = local28; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local13;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public static void method2957() {
		@Pc(9) int local9 = (int) ((double) Static147.anInt2300 * 34.46D);
		local9 <<= 0x0;
		if (Static186.aClass117_3.method5706()) {
			local9 += 128;
		}
		Static186.aClass117_3.d(50, local9);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BII)V")
	public static void method2958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg0, 5);
		local8.method384();
		local8.anInt381 = arg1;
	}
}
