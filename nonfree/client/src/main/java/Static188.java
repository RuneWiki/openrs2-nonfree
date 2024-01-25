import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Lclient!nd;")
	public static Class238 aClass238_91;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	public static void method3203() {
		@Pc(1) Class69 local1 = Static570.aClass69_60;
		synchronized (Static570.aClass69_60) {
			Static570.aClass69_60.method1910(5);
		}
		local1 = Static86.aClass69_10;
		synchronized (Static86.aClass69_10) {
			Static86.aClass69_10.method1910(5);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZII)V")
	public static void method3205(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static560.aClass323_36.method7484((long) arg2) != null) {
			return;
		}
		if (Static31.aBoolean67) {
			@Pc(29) Class2_Sub52 local29 = new Class2_Sub52(arg2, new Class161_Sub1(4096, aClass238_91, arg2), arg1, arg0);
			local29.aClass161_Sub1_1.method3866(Static85.aStringArray9[Static496.anInt7407]);
			Static560.aClass323_36.method7477(local29, (long) arg2);
		} else {
			Static2.method57(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII[I)V")
	public static void method3208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(5) int local5 = arg0 - 1;
		@Pc(9) int local9 = local5 - 7;
		while (local9 > arg2) {
			@Pc(15) int local15 = arg2 + 1;
			arg3[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			arg2 = local45 + 1;
			arg3[arg2] = arg1;
		}
		while (local5 > arg2) {
			arg2++;
			arg3[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!bh;")
	public static Class2_Sub7_Sub2 method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub7_Sub2 local20 = (Class2_Sub7_Sub2) Static64.aClass323_6.method7484((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class2_Sub7_Sub2(arg0, arg1);
			Static64.aClass323_6.method7477(local20, local20.aLong278);
		}
		return local20;
	}
}
