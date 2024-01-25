import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
	public static int anInt1357 = 0;

	@OriginalMember(owner = "client!dk", name = "C", descriptor = "Lclient!o;")
	public static final Class169 aClass169_52 = new Class169("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!dk", name = "H", descriptor = "Lclient!at;")
	public static final Class17 aClass17_11 = new Class17();

	@OriginalMember(owner = "client!dk", name = "L", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_40 = new Class48(4, 2);

	@OriginalMember(owner = "client!dk", name = "M", descriptor = "[I")
	public static final int[] anIntArray181 = new int[500];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ug;")
	public static Class25_Sub1 method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class116 local14 = local7.aClass116_3; local14 != null; local14 = local14.aClass116_2) {
			@Pc(18) Class25_Sub1 local18 = local14.aClass25_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort88 == arg1 && local18.aShort89 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!tq;Z)V")
	public static void method1126(@OriginalArg(0) Class164 arg0) {
		if (Static224.anInt3825 != Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 && (Static25.aClass132ArrayArrayArray1 != null && Static146.method2197(Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, arg0))) {
			Static224.anInt3825 = Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)Z")
	public static boolean method1127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface6 local14 = (Interface6) Static186.method2676(arg0, arg2, arg1);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static125.method1830(local14) & true;
		}
		local14 = (Interface6) method1123(arg0, arg2, arg1, ki.class);
		if (local14 != null) {
			local16 &= Static125.method1830(local14);
		}
		local14 = (Interface6) Static91.method1355(arg0, arg2, arg1);
		if (local14 != null) {
			local16 &= Static125.method1830(local14);
		}
		return local16;
	}
}
