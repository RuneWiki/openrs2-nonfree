import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "Lclient!hs;")
	public static Class14_Sub25 aClass14_Sub25_1;

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
	public static int anInt1476;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
	public static final int anInt1475 = 50;

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "[I")
	public static final int[] anIntArray104 = new int[anInt1475];

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "[I")
	public static final int[] anIntArray105 = new int[anInt1475];

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "[I")
	public static final int[] anIntArray106 = new int[anInt1475];

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "[I")
	public static final int[] anIntArray107 = new int[anInt1475];

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "[I")
	public static final int[] anIntArray108 = new int[anInt1475];

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "[I")
	public static final int[] anIntArray109 = new int[anInt1475];

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[anInt1475];

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)V")
	public static void method1267() {
		for (@Pc(11) int local11 = 0; local11 < Static471.anInt8216; local11++) {
			@Pc(17) int local17 = Static530.anIntArray671[local11];
			@Pc(24) Class14_Sub44 local24 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local17);
			if (local24 != null) {
				@Pc(29) Class12_Sub2_Sub2_Sub1_Sub1 local29 = local24.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static539.method7650(local29.aClass283_1.anInt8617, local29);
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLclient!so;)Lclient!gi;")
	public static Class92 method1268(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(10) Class168 local10 = Static191.method2989()[arg0.method5866()];
		@Pc(17) Class339 local17 = Static324.method5108()[arg0.method5866()];
		@Pc(23) int local23 = arg0.method5890();
		@Pc(27) int local27 = arg0.method5890();
		@Pc(31) int local31 = arg0.method5900();
		@Pc(40) int local40 = arg0.method5900();
		@Pc(44) int local44 = arg0.method5890();
		@Pc(48) int local48 = arg0.method5878();
		@Pc(54) int local54 = arg0.method5878();
		return new Class92(local10, local17, local23, local27, local31, local40, local44, local48, local54);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	public static void method1269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static432.method6337(local7.aClass12_Sub2_Sub3_2);
		Static432.method6337(local7.aClass12_Sub2_Sub3_1);
		if (local7.aClass12_Sub2_Sub3_2 != null) {
			local7.aClass12_Sub2_Sub3_2 = null;
		}
		if (local7.aClass12_Sub2_Sub3_1 != null) {
			local7.aClass12_Sub2_Sub3_1 = null;
		}
	}
}
