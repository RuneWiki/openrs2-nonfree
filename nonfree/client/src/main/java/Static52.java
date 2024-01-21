import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fh", name = "Ob", descriptor = "I")
	public static int anInt1280;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "Lclient!tg;")
	public static Class81 aClass81_446 = Static120.method2057("::");

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "Lclient!tg;")
	public static Class81 aClass81_447 = Static120.method2057("Fps:");

	@OriginalMember(owner = "client!fh", name = "wb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_448 = Static120.method2057("<col=00ff00>");

	@OriginalMember(owner = "client!fh", name = "Db", descriptor = "Lclient!nd;")
	public static Class59 aClass59_11 = new Class59(64);

	@OriginalMember(owner = "client!fh", name = "Lb", descriptor = "I")
	public static int anInt1279 = 0;

	@OriginalMember(owner = "client!fh", name = "Nb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_450 = Static120.method2057("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ie;Lclient!vb;Lclient!vb;Lclient!vb;I)Z")
	public static boolean method930(@OriginalArg(0) Class1_Sub10_Sub3 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3) {
		Static14.aClass82_6 = arg3;
		Static115.aClass1_Sub10_Sub3_2 = arg0;
		Static97.aClass82_34 = arg1;
		Static175.aClass82_51 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lclient!le;")
	public static Class1_Sub2_Sub11 method933(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub11 local10 = (Class1_Sub2_Sub11) Static59.aClass59_13.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static180.aClass82_70.method2942(arg0, 16);
		local10 = new Class1_Sub2_Sub11();
		if (local25 != null) {
			local10.method1629(new Class1_Sub8(local25));
		}
		Static59.aClass59_13.method1973(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public static void method939() {
		Static158.anInt3590 = 0;
		Static77.anInt1829 = 0;
		Static21.method422();
		Static73.method1274();
		Static54.method964();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static158.anInt3590; local17++) {
			local23 = Static45.anIntArray94[local17];
			if (Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local23].anInt3022 != Static142.anInt3104) {
				Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local23].aClass1_Sub2_Sub5_1 = null;
				Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local23] = null;
			}
		}
		if (Static98.anInt2162 != Static21.aClass1_Sub8_Sub1_1.anInt446) {
			throw new RuntimeException("gnp1 pos:" + Static21.aClass1_Sub8_Sub1_1.anInt446 + " psize:" + Static98.anInt2162);
		}
		for (local23 = 0; local23 < Static35.anInt962; local23++) {
			if (Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[Static85.anIntArray15[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static35.anInt962);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt1851; local12++) {
			@Pc(18) Class75 local18 = local7.aClass75Array2[local12];
			if ((local18.aLong118 >> 29 & 0x3L) == 2L && local18.anInt3164 == arg1 && local18.anInt3158 == arg2) {
				Static3.method75(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	public static void method944() {
		aClass81_448 = null;
		aClass81_447 = null;
		aClass81_450 = null;
		aClass81_446 = null;
		aClass59_11 = null;
	}
}
