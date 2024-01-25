import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!fo;")
	public static Class82 aClass82_65;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
	public static final int[] anIntArray316 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLjava/lang/String;ZILclient!fq;)V")
	public static void method3869(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class83 arg3) {
		if (!arg2) {
			Static456.method5943(arg3, arg1, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static117.aString26.startsWith("win") && Static117.anInt2198 != 3) {
			local14 = null;
			if (arg3.anApplet1 != null) {
				local14 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(34) Class232 local34 = Static456.method5943(arg3, arg1, 0);
				Static278.aClass232_5 = local34;
				Static113.aString22 = arg1;
				Static161.aClass83_1 = arg3;
				return;
			}
		}
		if (Static117.aString26.startsWith("mac")) {
			local14 = null;
			if (arg3.anApplet1 != null) {
				local14 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg0) {
				Static456.method5943(arg3, arg1, 1);
				return;
			}
		}
		Static456.method5943(arg3, arg1, 2);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3877(@OriginalArg(1) String arg0) {
		if (!Static433.aBoolean798) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static285.anInt5015;
		@Pc(14) int[] local14 = Static103.anIntArray135;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class25_Sub5_Sub1_Sub2 local24 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local14[local16]];
			if (local24 != null && local24 != Static447.aClass25_Sub5_Sub1_Sub2_4 && local24.aString51 != null && local24.aString51.equalsIgnoreCase(arg0)) {
				Static52.method867(Static50.aClass103_38);
				Static18.aClass1_Sub28_Sub1_1.method5376(0);
				Static18.aClass1_Sub28_Sub1_1.method5393(Static353.anInt6050);
				Static18.aClass1_Sub28_Sub1_1.method5395(local14[local16]);
				Static18.aClass1_Sub28_Sub1_1.method5374(Static331.anInt5639);
				Static18.aClass1_Sub28_Sub1_1.method5359(Static257.anInt4671);
				local10 = true;
				Static360.method4834(true, -2, local24.method3427(), local24.anIntArray284[0], 0, local24.method3427(), 0, local24.anIntArray283[0]);
				break;
			}
		}
		if (!local10) {
			Static208.method2938(Static170.aClass119_80.method2673(Static394.anInt6582) + arg0);
		}
		if (Static433.aBoolean798) {
			Static124.method5684();
		}
	}
}
