import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "Lclient!aa;")
	public static Class2 aClass2_8;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "[I")
	public static final int[] anIntArray296 = new int[64];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIILclient!bb;Lclient!bb;)V")
	public static void method3758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1 arg3, @OriginalArg(4) Class1_Sub1 arg4) {
		@Pc(4) Class227 local4 = Static361.method5054(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub1_1 = arg3;
			local4.aClass1_Sub1_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3759(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static171.aClass250_48.anInt7168 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static158.aClass272_1.anInt7762; local18++) {
			@Pc(25) Class209 local25 = Static158.aClass272_1.method6283(local18);
			if ((!arg1 || local25.aBoolean418) && local25.anInt6066 == -1 && local25.anInt6015 == -1 && local25.anInt6008 == 0 && local25.lb.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static48.anInt871 = -1;
					Static11.aShortArray2 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(77) short[] local77 = new short[local14.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local16; local79++) {
						local77[local79] = local14[local79];
					}
					local14 = local77;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static336.anInt5622 = 0;
		Static48.anInt871 = local16;
		Static11.aShortArray2 = local14;
		@Pc(122) String[] local122 = new String[Static48.anInt871];
		for (@Pc(124) int local124 = 0; local124 < Static48.anInt871; local124++) {
			local122[local124] = Static158.aClass272_1.method6283(local14[local124]).lb;
		}
		Static382.method5290(local122, Static11.aShortArray2);
		Static171.aClass250_48.method5794();
		Static171.aClass250_48.anInt7168 = 2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method3761(@OriginalArg(0) int[] arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(18) int local18 = Static34.anInt3344;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(31) Class115 local31 = Static113.aClass206_2.method4882(arg0[local20]);
			if (local31.anInt3400 != -1) {
				@Pc(44) Class2 local44 = (Class2) Static437.aClass268_58.method6166((long) local31.anInt3400);
				if (local44 == null) {
					@Pc(52) Class154 local52 = Static467.method3619(Static8.aClass250_2, local31.anInt3400, 0);
					if (local52 != null) {
						local44 = Static413.aClass167_11.method5993(local52);
						Static437.aClass268_58.method6164(local44, (long) local31.anInt3400);
					}
				}
				if (local44 != null) {
					Static306.aClass2Array15[local18] = local44;
					local16.append(" <img=").append(local18).append(">");
					local18++;
				}
			}
		}
		return local16.toString();
	}
}
