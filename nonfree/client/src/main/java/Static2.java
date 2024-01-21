import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Lclient!id;")
	public static Class1_Sub2_Sub10 aClass1_Sub2_Sub10_1;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	public static int anInt47;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_12 = Static120.method2057("Hierhin gehen");

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public static int anInt37 = 0;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static int[] anIntArray1 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!q;")
	public static Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!h;")
	public static Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	public static int anInt46 = 0;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "[Lclient!tb;")
	public static Class80[] aClass80Array1 = new Class80[4];

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method20() {
		aClass81_12 = null;
		anIntArray1 = null;
		aClass71_1 = null;
		aClass80Array1 = null;
		aClass30_2 = null;
		aClass1_Sub2_Sub10_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBZI)V")
	public static void method21(@OriginalArg(2) boolean arg0) {
		Static102.anInt2246 = 2;
		Static107.aBoolean100 = arg0;
		Static185.anInt3915 = 22050;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] method22() {
		@Pc(8) Class1_Sub2_Sub2_Sub3[] local8 = new Class1_Sub2_Sub2_Sub3[Static43.anInt1081];
		for (@Pc(15) int local15 = 0; local15 < Static43.anInt1081; local15++) {
			@Pc(21) Class1_Sub2_Sub2_Sub3 local21 = new Class1_Sub2_Sub2_Sub3();
			local21.anInt2741 = Static23.anInt582;
			local21.anInt2740 = Static97.anInt2130;
			local21.anInt2739 = Static155.anIntArray369[local15];
			local21.anInt2738 = Static25.anIntArray37[local15];
			local21.anInt2737 = Static73.anIntArray155[local15];
			local21.anInt2736 = Static161.anIntArray386[local15];
			@Pc(51) byte[] local51 = Static178.aByteArrayArray10[local15];
			@Pc(57) int local57 = local21.anInt2737 * local21.anInt2736;
			local21.anIntArray288 = new int[local57];
			for (@Pc(63) int local63 = 0; local63 < local57; local63++) {
				local21.anIntArray288[local63] = Static73.anIntArray156[local51[local63] & 0xFF];
			}
			local8[local15] = local21;
		}
		Static176.method3057();
		return local8;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!va;")
	public static RuntimeException_Sub1 method24(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString7 = local9.aString7 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
