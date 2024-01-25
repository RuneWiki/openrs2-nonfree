import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "Lclient!ho;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_58 = new Class119(91, -1);

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "[I")
	public static final int[] anIntArray175 = new int[14];

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!gp", name = "P", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_50 = new Class217(52, 4);

	@OriginalMember(owner = "client!gp", name = "Q", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	public static void method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static263.aClass118ArrayArrayArray2[0][arg1][arg2] != null && Static263.aClass118ArrayArrayArray2[0][arg1][arg2].aClass118_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static263.aClass118ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class118 local46 = Static263.aClass118ArrayArrayArray2[local22][arg1][arg2] = new Class118(local22, arg1, arg2);
				if (local20) {
					local46.aByte63++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBC)I")
	public static int method2169(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V")
	public static void method2171(@OriginalArg(0) int arg0) {
		if (!Static55.method1137(arg0)) {
			return;
		}
		@Pc(16) Class156[] local16 = Static178.aClass156ArrayArray2[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(23) Class156 local23 = local16[local18];
			if (local23 != null) {
				local23.anInt4860 = 0;
				local23.anInt4851 = 1;
				local23.anInt4795 = 0;
			}
		}
	}
}
