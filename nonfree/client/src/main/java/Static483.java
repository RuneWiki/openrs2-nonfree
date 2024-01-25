import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "[Lclient!ns;")
	public static Class256[] aClass256Array1;

	@OriginalMember(owner = "client!qda", name = "o", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_146 = new Class322(80, -1);

	@OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
	public static int anInt8237 = 2;

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)I")
	public static int method7188() {
		return Static470.anInt8040;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)Lclient!ofa;")
	public static Class267 method7190(@OriginalArg(0) int arg0) {
		@Pc(8) Class267[] local8 = Static677.method8636();
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			@Pc(22) Class267 local22 = local8[local16];
			if (arg0 == local22.anInt7238) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIBI[IIII)Z")
	public static boolean method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 > Static3.anInt17) {
			arg1 = Static3.anInt17;
		}
		if (arg0 >= arg1) {
			return true;
		}
		arg5 += arg0 * arg4;
		@Pc(38) int local38 = arg1 - arg0 >> 2;
		arg3 += arg0 - 1;
		@Pc(86) int local86;
		@Pc(57) int local57;
		@Pc(70) int local70;
		if (Static559.anInt9035 == 1) {
			Static14.anInt211 += local38;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg1 - arg0 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg3++;
						if (arg2[arg3] > arg5) {
							arg2[arg3] = arg5;
						}
						arg5 += arg4;
					}
				}
				local57 = arg3 + 1;
				if (arg5 < arg2[local57]) {
					arg2[local57] = arg5;
				}
				local70 = arg5 + arg4;
				local57++;
				if (arg2[local57] > local70) {
					arg2[local57] = local70;
				}
				local70 += arg4;
				local86 = ~local70;
				local57++;
				if (local86 > ~arg2[local57]) {
					arg2[local57] = local70;
				}
				local70 += arg4;
				arg3 = local57 + 1;
				if (arg2[arg3] > local70) {
					arg2[arg3] = local70;
				}
				arg5 = local70 + arg4;
			}
		} else {
			arg5 -= 38400;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg1 - arg0 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg3++;
						if (arg2[arg3] > arg5) {
							return false;
						}
						arg5 += arg4;
					}
				}
				local57 = arg3 + 1;
				if (arg2[local57] > arg5) {
					return false;
				}
				local70 = arg5 + arg4;
				local57++;
				if (local70 < arg2[local57]) {
					return false;
				}
				local70 += arg4;
				local86 = ~local70;
				local57++;
				if (local86 > ~arg2[local57]) {
					return false;
				}
				local70 += arg4;
				arg3 = local57 + 1;
				if (arg2[arg3] > local70) {
					return false;
				}
				arg5 = local70 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIB)Z")
	public static boolean method7197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static447.method6916(arg1, arg0) || Static114.method2148(arg0, arg1);
	}
}
