import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public static int anInt9951 = 2;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIILclient!ha;ILclient!tk;)V")
	public static void method8456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class354 arg4) {
		@Pc(9) Class376 local9 = Static201.aClass97_3.method1927(arg4.anInt9418);
		if (local9.anInt10342 == -1) {
			return;
		}
		if (arg4.aBoolean649) {
			@Pc(23) int local23 = arg0 + arg4.anInt9413;
			arg0 = local23 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Class155 local39 = local9.method8774(arg0, arg4.aBoolean647, arg2);
		if (local39 == null) {
			return;
		}
		@Pc(46) int local46 = arg4.anInt9385;
		@Pc(49) int local49 = arg4.anInt9410;
		if ((arg0 & 0x1) == 1) {
			local49 = arg4.anInt9385;
			local46 = arg4.anInt9410;
		}
		@Pc(63) int local63 = local39.method7206();
		@Pc(75) int local75 = local39.method7209();
		if (local9.aBoolean744) {
			local75 = local49 * 4;
			local63 = local46 * 4;
		}
		if (local9.anInt10340 == 0) {
			local39.method7192(arg3, arg1 + 4 - local49 * 4, local63, local75);
		} else {
			local39.method7200(arg3, arg1 + 4 - local49 * 4, local63, local75, 0, local9.anInt10340 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
	public static int method8458() {
		return Static510.aClass216_1.method4932();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
	public static int method8460(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static515.method7059(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZZ)V")
	public static void method8461(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static261.anInt4685--;
			if (Static261.anInt4685 == 0) {
				Static305.anIntArray314 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static632.anInt10345--;
		if (Static632.anInt10345 == 0) {
			Static408.anIntArray407 = null;
			return;
		}
	}
}
