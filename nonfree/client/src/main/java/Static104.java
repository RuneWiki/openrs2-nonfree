import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fr", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray45;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_50 = new Class41(19, 7);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBLclient!fc;)Lclient!rl;")
	public static Class2_Sub33 method1845(@OriginalArg(0) int arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(8) byte[] local8 = arg1.method1564(arg0);
		return local8 == null ? null : new Class2_Sub33(local8);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!oj;ILjava/lang/String;Z)V")
	public static void method1846(@OriginalArg(0) Class13 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(23) int local23 = Static62.aClass216_4.method5078(arg1, 250, null);
		@Pc(32) int local32 = Static62.aClass216_4.method5076(arg1, 250, null) * 13;
		Static304.aClass82_4.method4482(6, 6, local23 + 4 + 4, local32 + 4 - -4, -16777216, 0);
		Static304.aClass82_4.method4552(6, 6, local23 + 8, local32 + 4 + 4, -1, 0);
		arg0.method5611(0, 10, 0, 1, local32, 1, null, 10, -1, arg1, 0, local23, -1, null, null);
		Static299.method4675(local32 + 4 + 4, 6, 6, local23 + 4 + 4);
		if (arg2) {
			Static304.aClass82_4.method4461();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
	public static int method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static57.aByteArrayArray14 == null ? 0 : (Static57.aByteArrayArray14[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!dq;Ljava/lang/String;ZZZ)V")
	public static void method1848(@OriginalArg(0) Class53 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2) {
			Static38.method819(3, arg1, arg0);
			return;
		}
		@Pc(25) String local25;
		if (Static65.aString14.startsWith("win") && Static65.anInt1255 != 3) {
			local25 = null;
			if (arg0.anApplet1 != null) {
				local25 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(45) Class1 local45 = Static38.method819(0, arg1, arg0);
				Static358.aClass1_9 = local45;
				Static287.aString46 = arg1;
				Static332.aClass53_5 = arg0;
				return;
			}
		}
		if (Static65.aString14.startsWith("mac")) {
			local25 = null;
			if (arg0.anApplet1 != null) {
				local25 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg3) {
				Static38.method819(1, arg1, arg0);
				return;
			}
		}
		Static38.method819(2, arg1, arg0);
	}
}
