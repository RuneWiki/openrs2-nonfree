import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bs", name = "O", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_40 = new Class184(15, -1);

	@OriginalMember(owner = "client!bs", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Z")
	public static boolean method920(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method921(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static4.anInt815;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(26) Class44 local26 = Static176.aClass120_1.method3120(arg0[local11]);
			if (local26.anInt1549 != -1) {
				@Pc(39) Class22 local39 = (Class22) Static269.aClass5_43.method104((long) local26.anInt1549);
				if (local39 == null) {
					@Pc(47) Class166 local47 = Static460.method3975(Static20.aClass56_10, local26.anInt1549, 0);
					if (local47 != null) {
						local39 = Static266.aClass75_7.method2590(local47);
						Static269.aClass5_43.method114((long) local26.anInt1549, local39);
					}
				}
				if (local39 != null) {
					Static270.aClass22Array21[local9] = local39;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}
