import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!vla", name = "z", descriptor = "[Lclient!s;")
	public static Class133[] aClass133Array5;

	@OriginalMember(owner = "client!vla", name = "B", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_203 = new Class225(39, 3);

	@OriginalMember(owner = "client!vla", name = "A", descriptor = "I")
	public static int anInt10550 = -1;

	@OriginalMember(owner = "client!vla", name = "b", descriptor = "(I)[Lclient!os;")
	public static Class281[] method9231() {
		return new Class281[] { Static61.aClass281_4, Static127.aClass281_8, Static213.aClass281_9, Static635.aClass281_16, Static335.aClass281_12, Static476.aClass281_14, Static111.aClass281_5, Static151.aClass281_15, Static717.aClass281_18, Static383.aClass281_2, Static241.aClass281_11, Static676.aClass281_17, Static54.aClass281_3, Static346.aClass281_13, Static233.aClass281_10 };
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(II[BIIII)Z")
	public static boolean method9234(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg4 + 8 - 1) / 8);
		for (@Pc(51) int local51 = local32; local51 < 0; local51++) {
			for (@Pc(57) int local57 = local42; local57 < 0; local57++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local19;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(ILclient!pm;)I")
	public static int method9235(@OriginalArg(1) Class295 arg0) {
		if (Static261.aClass295_16 == arg0) {
			return 6407;
		} else if (arg0 == Static165.aClass295_6) {
			return 6408;
		} else if (Static408.aClass295_11 == arg0) {
			return 6406;
		} else if (arg0 == Static341.aClass295_9) {
			return 6409;
		} else if (Static307.aClass295_8 == arg0) {
			return 6410;
		} else if (arg0 == Static161.aClass295_5) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
