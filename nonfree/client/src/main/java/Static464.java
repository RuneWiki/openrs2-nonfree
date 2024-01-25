import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!za", name = "f", descriptor = "I")
	public static int anInt7333;

	@OriginalMember(owner = "client!za", name = "l", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_119 = new Class194(57, 3);

	@OriginalMember(owner = "client!za", name = "q", descriptor = "Lclient!vg;")
	public static final Class252 aClass252_39 = new Class252(16);

	@OriginalMember(owner = "client!za", name = "r", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_188 = new Class129(5, 0);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "I")
	public static int anInt7343 = 0;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZI)Z")
	public static boolean method5865(@OriginalArg(1) int arg0) {
		if (arg0 == 30 || arg0 == 22 || arg0 == 20 || arg0 == 10 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IZII)I")
	public static int method5867(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class5_Sub26 local10 = Static176.method2415(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray249.length; local23++) {
				if (arg2 == local10.anIntArray247[local23]) {
					local21 += local10.anIntArray249[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!l;ILjava/awt/Canvas;ILclient!gt;I)Lclient!za;")
	public static synchronized Class200 method5875(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class93 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static449.aBooleanArray27[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(41) Class200 local41;
		if (arg4 == 0) {
			local41 = Static191.method2564(arg0, arg1, local7);
		} else if (arg4 == 1) {
			local41 = Static7.method97(arg3, arg0, arg1, arg2, local7);
		} else if (arg4 == 2) {
			local41 = Static237.method5367(arg0, local7, arg3, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static449.aBooleanArray27[local7] = true;
		return local41;
	}
}
