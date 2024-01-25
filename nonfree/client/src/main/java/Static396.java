import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "[[Lclient!jq;")
	public static Class156[][] aClass156ArrayArray1;

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "[I")
	public static final int[] anIntArray688 = new int[64];

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
	public static int anInt7115 = 0;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient!et;")
	public static Class87 aClass87_1 = new Class87(8);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)Z")
	public static boolean method5968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static137.method2259(arg1, arg0) & Static3.method207(arg0, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([BIBIIII)Z")
	public static boolean method5969(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg1 + 7) / 8);
		@Pc(41) int local41 = -((arg4 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local31; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local16;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public static void method5970() {
		if (Static151.aString29.toLowerCase().indexOf("microsoft") != -1) {
			Static367.anIntArray660[219] = 42;
			Static367.anIntArray660[223] = 28;
			Static367.anIntArray660[188] = 71;
			Static367.anIntArray660[187] = 27;
			Static367.anIntArray660[186] = 57;
			Static367.anIntArray660[189] = 26;
			Static367.anIntArray660[220] = 74;
			Static367.anIntArray660[192] = 58;
			Static367.anIntArray660[190] = 72;
			Static367.anIntArray660[191] = 73;
			Static367.anIntArray660[221] = 43;
			Static367.anIntArray660[222] = 59;
			return;
		}
		Static367.anIntArray660[92] = 74;
		Static367.anIntArray660[45] = 26;
		Static367.anIntArray660[93] = 43;
		Static367.anIntArray660[61] = 27;
		Static367.anIntArray660[46] = 72;
		Static367.anIntArray660[44] = 71;
		Static367.anIntArray660[47] = 73;
		if (Static151.aMethod1 == null) {
			Static367.anIntArray660[222] = 59;
			Static367.anIntArray660[192] = 58;
		} else {
			Static367.anIntArray660[192] = 28;
			Static367.anIntArray660[520] = 59;
			Static367.anIntArray660[222] = 58;
		}
		Static367.anIntArray660[91] = 42;
		Static367.anIntArray660[59] = 57;
	}
}
