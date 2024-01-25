import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
	public static int[] anIntArray586;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)Lclient!fw;")
	public static Class109 method7046() {
		return new Class109(1, false);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)I")
	public static int method7047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static511.aByteArrayArrayArray19[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static511.aByteArrayArrayArray19[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
	public static boolean method7050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static404.method5707(arg1, arg0)) {
			return Static171.method2606(arg0, arg1) | (arg0 & 0xB000) != 0 | Static29.method752(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static77.method6754(arg1, arg0) | Static264.method4170(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7051(@OriginalArg(0) String arg0) {
		@Pc(7) boolean local7 = false;
		if (arg0.startsWith("--> ")) {
			arg0 = arg0.substring(4);
			local7 = true;
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(27) int local27 = arg0.indexOf(" ", "directlogin ".length());
			if (local27 >= 0) {
				@Pc(32) int local32 = arg0.length();
				arg0 = arg0.substring(0, local27) + " ";
				for (@Pc(48) int local48 = local27 + 1; local48 < local32; local48++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 ? "--> " + arg0 : arg0;
	}
}
