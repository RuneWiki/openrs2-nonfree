import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!kr", name = "Lb", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_24 = new Class267(8);

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "(I)Z")
	public static boolean method4537() {
		return Static326.aBoolean396;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V")
	public static void method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 13);
		local8.method6211();
		local8.anInt7557 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[IIII)V")
	public static void method4540(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(8) int local8 = arg3 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (local11 > arg2) {
			@Pc(15) int local15 = arg2 + 1;
			arg0[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg1;
			arg2 = local45 + 1;
			arg0[arg2] = arg1;
		}
		while (local8 > arg2) {
			arg2++;
			arg0[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIBILclient!ba;)Lclient!ew;")
	public static Class81 method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3) {
		return arg3 == null ? null : new Class81(arg2, arg1, arg0, arg3.ZA(), arg3.ha(), arg3.M(), arg3.DA(), arg3.EA(), arg3.LA(), arg3.K());
	}
}
