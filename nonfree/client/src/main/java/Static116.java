import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "Lclient!dp;")
	public static Class53 aClass53_64;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_18 = new Class211();

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "Z")
	public static boolean aBoolean187 = true;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "[I")
	public static final int[] anIntArray290 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILclient!vj;Ljava/lang/String;Z)V")
	public static void method2345(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class206 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static158.method5100(arg1, arg2, 3);
			return;
		}
		@Pc(22) String local22;
		if (Static332.aString294.startsWith("win") && Static332.anInt6108 != 3) {
			local22 = null;
			if (arg1.anApplet1 != null) {
				local22 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(42) Class196 local42 = Static158.method5100(arg1, arg2, 0);
				Static177.aClass206_3 = arg1;
				Static325.aString282 = arg2;
				Static173.aClass196_3 = local42;
				return;
			}
		}
		if (Static332.aString294.startsWith("mac")) {
			local22 = null;
			if (arg1.anApplet1 != null) {
				local22 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg0) {
				Static158.method5100(arg1, arg2, 1);
				return;
			}
		}
		Static158.method5100(arg1, arg2, 2);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)Lclient!pe;")
	public static Class44_Sub4_Sub4 method2348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class187 local11 = Static39.aClass187ArrayArrayArray1[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class44_Sub4_Sub4 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class214 local22 = local11.aClass214_19; local22 != null; local22 = local22.aClass214_21) {
			@Pc(26) Class44_Sub4 local26 = local22.aClass44_Sub4_1;
			if (local26 instanceof Class44_Sub4_Sub4) {
				@Pc(32) Class44_Sub4_Sub4 local32 = (Class44_Sub4_Sub4) local26;
				@Pc(42) int local42 = (local32.method4714() - 1) * 64 + 60;
				@Pc(50) int local50 = local32.anInt6340 - local42 >> 7;
				@Pc(58) int local58 = local32.anInt6339 - local42 >> 7;
				@Pc(65) int local65 = local32.anInt6340 + local42 >> 7;
				@Pc(72) int local72 = local32.anInt6339 + local42 >> 7;
				if (arg0 >= local50 && local58 <= arg2 && arg0 <= local65 && arg2 <= local72) {
					@Pc(100) int local100 = (local65 + 1 - arg0) * (local72 + 1 - arg2);
					if (local19 < local100) {
						local17 = local32;
						local19 = local100;
					}
				}
			}
		}
		return local17;
	}
}
