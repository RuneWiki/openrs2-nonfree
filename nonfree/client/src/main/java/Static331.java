import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public static int anInt7371;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_187 = new Class163(57, -1);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!af;")
	public static RuntimeException_Sub1 method5952(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method5956() {
		for (@Pc(15) Class3_Sub3_Sub15 local15 = (Class3_Sub3_Sub15) client.lb.method4519(); local15 != null; local15 = (Class3_Sub3_Sub15) client.lb.method4525()) {
			@Pc(20) Class1_Sub2_Sub1 local20 = local15.aClass1_Sub2_Sub1_1;
			if (Static172.anInt3107 > local20.anInt538) {
				local15.method6288();
				local20.method546();
			} else if (Static172.anInt3107 >= local20.anInt563) {
				if (local20.anInt548 > 0) {
					@Pc(53) Class3_Sub40 local53 = (Class3_Sub40) Static63.aClass140_37.method3490((long) (local20.anInt548 - 1));
					if (local53 != null) {
						@Pc(58) Class1_Sub2_Sub6_Sub1 local58 = local53.aClass1_Sub2_Sub6_Sub1_2;
						if (local58.anInt7560 >= 0 && local58.anInt7560 < Static373.anInt6324 * 128 && local58.anInt7557 >= 0 && local58.anInt7557 < Static291.anInt5062 * 128) {
							local20.method551(local58.anInt7557, Static181.method4212(local20.aByte101, local58.anInt7557, local58.anInt7560) - local20.anInt559, Static172.anInt3107, local58.anInt7560);
						}
					}
				}
				if (local20.anInt548 < 0) {
					@Pc(107) int local107 = -local20.anInt548 - 1;
					@Pc(118) Class1_Sub2_Sub6_Sub2 local118;
					if (Static317.anInt5364 == local107) {
						local118 = Static203.aClass1_Sub2_Sub6_Sub2_1;
					} else {
						local118 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local107];
					}
					if (local118 != null && local118.anInt7560 >= 0 && Static373.anInt6324 * 128 > local118.anInt7560 && local118.anInt7557 >= 0 && Static291.anInt5062 * 128 > local118.anInt7557) {
						local20.method551(local118.anInt7557, Static181.method4212(local20.aByte101, local118.anInt7557, local118.anInt7560) - local20.anInt559, Static172.anInt3107, local118.anInt7560);
					}
				}
				local20.method545(Static46.anInt814);
				Static114.method1845(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BB)C")
	public static char method5972(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static81.aCharArray3[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILclient!ub;ILclient!cd;ILclient!wk;)V")
	public static void method5981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub6_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class31 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub2_Sub6_Sub2 arg6) {
		@Pc(7) Class3_Sub29 local7 = new Class3_Sub29();
		local7.anInt3791 = arg3;
		local7.anInt3783 = arg5 << 7;
		local7.anInt3781 = arg1 << 7;
		if (arg4 != null) {
			local7.aClass31_1 = arg4;
			@Pc(40) int local40 = arg4.anInt786;
			@Pc(43) int local43 = arg4.anInt784;
			if (arg0 == 1 || arg0 == 3) {
				local40 = arg4.anInt784;
				local43 = arg4.anInt786;
			}
			local7.anInt3788 = arg1 + local43 << 7;
			local7.anInt3782 = arg4.anInt809;
			local7.anInt3787 = arg4.anInt772;
			local7.anInt3790 = arg4.anInt767;
			local7.anInt3789 = local40 + arg5 << 7;
			local7.anInt3792 = arg4.anInt799;
			local7.anIntArray252 = arg4.anIntArray46;
			local7.anInt3778 = arg4.anInt759 << 7;
			if (arg4.anIntArray44 != null) {
				local7.aBoolean276 = true;
				local7.method3256();
			}
			if (local7.anIntArray252 != null) {
				local7.anInt3779 = (int) (Math.random() * (double) (local7.anInt3782 - local7.anInt3792)) + local7.anInt3792;
			}
			Static163.aClass193_67.method4527(local7);
		} else if (arg2 != null) {
			local7.aClass1_Sub2_Sub6_Sub1_1 = arg2;
			@Pc(186) Class158 local186 = arg2.aClass158_1;
			if (local186.anIntArray294 != null) {
				local7.aBoolean276 = true;
				local186 = local186.method3705(Static119.aClass47_1);
			}
			if (local186 != null) {
				local7.anInt3788 = arg1 + local186.anInt4454 << 7;
				local7.anInt3789 = local186.anInt4454 + arg5 << 7;
				local7.anInt3787 = Static201.method3082(arg2);
				local7.anInt3790 = local186.anInt4448;
				local7.anInt3778 = local186.anInt4445 << 7;
			}
			Static163.aClass193_68.method4527(local7);
		} else if (arg6 != null) {
			local7.aClass1_Sub2_Sub6_Sub2_2 = arg6;
			local7.anInt3789 = arg5 + arg6.method6204() << 7;
			local7.anInt3788 = arg6.method6204() + arg1 << 7;
			local7.anInt3787 = Static299.method4272(arg6);
			local7.anInt3790 = arg6.anInt7646;
			local7.anInt3778 = arg6.anInt7662 << 7;
			Static307.aClass140_32.method3494((long) arg6.anInt7621, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
	public static void method6001() {
		Static132.aClass167_4.ha(Static66.anInt1271, Static39.aClass79_Sub1_1.aBoolean159 ? Static442.anInt7408 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dq;IBLjava/awt/Canvas;Lclient!l;I)Lclient!qa;")
	public static synchronized Class167 method6026(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static289.aBooleanArray18[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(54) Class167 local54;
		if (arg4 == 0) {
			local54 = Static313.method4386(local7, arg2, arg3);
		} else if (arg4 == 1) {
			local54 = Static413.method5688(arg0, arg3, local7, arg1, arg2);
		} else if (arg4 == 2) {
			local54 = Static12.method199(arg2, local7, arg3, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static289.aBooleanArray18[local7] = true;
		return local54;
	}
}
