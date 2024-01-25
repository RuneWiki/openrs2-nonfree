import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "Lclient!ec;")
	public static Interface3 anInterface3_8;

	@OriginalMember(owner = "client!mr", name = "O", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!mr", name = "zb", descriptor = "I")
	public static int anInt6934;

	@OriginalMember(owner = "client!mr", name = "Fb", descriptor = "Lclient!iq;")
	public static Class104 aClass104_194;

	@OriginalMember(owner = "client!mr", name = "tb", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_165 = new Class140("M", "M", "M", "M");

	@OriginalMember(owner = "client!mr", name = "Eb", descriptor = "I")
	public static int anInt6939 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;IBZ)I")
	public static int method5769(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(99) int local99;
			if (local46 >= '0' && local46 <= '9') {
				local99 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local99 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local99 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local99) {
				throw new NumberFormatException();
			}
			if (local31) {
				local99 = -local99;
			}
			@Pc(124) int local124 = arg1 * local35 + local99;
			if (local124 / arg1 != local35) {
				throw new NumberFormatException();
			}
			local35 = local124;
			local33 = true;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public static void method5771() {
		@Pc(10) Class107 local10 = Static217.aClass107_29;
		synchronized (Static217.aClass107_29) {
			Static217.aClass107_29.method3015();
		}
		local10 = Static258.aClass107_38;
		synchronized (Static258.aClass107_38) {
			Static258.aClass107_38.method3015();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method5775(@OriginalArg(1) Class104 arg0) {
		Static331.aClass104_168 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIII)Z")
	public static boolean method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static118.method2302(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static325.anInt6336;
			@Pc(14) int local14 = arg2 << Static325.anInt6336;
			return Static283.method4806(local10 + 1, Static9.aClass105Array1[arg0].method4453(arg1, arg2) + arg3, local14 + 1) && Static283.method4806(local10 + Static6.anInt96 - 1, Static9.aClass105Array1[arg0].method4453(arg1 + 1, arg2) + arg3, local14 + 1) && Static283.method4806(local10 + Static6.anInt96 - 1, Static9.aClass105Array1[arg0].method4453(arg1 + 1, arg2 + 1) + arg3, local14 + Static6.anInt96 - 1) && Static283.method4806(local10 + 1, Static9.aClass105Array1[arg0].method4453(arg1, arg2 + 1) + arg3, local14 + Static6.anInt96 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!fh;IIB)V")
	public static void method5788(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static80.aClass68_8 = arg0;
		Static291.anInt5262 = arg1;
		Static251.anInt5259 = arg2;
	}
}
