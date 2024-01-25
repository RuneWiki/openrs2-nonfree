import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public static int anInt2779;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public static int anInt2777 = 0;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!is", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Loaded input handler";

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString109 = "Opened title screen";

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)Lclient!rg;")
	public static Class177 method2694(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static314.aClass177ArrayArray1[local12] == null || Static314.aClass177ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static198.method3725(local12);
			if (!local30) {
				return null;
			}
		}
		return Static314.aClass177ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;ZBLclient!kq;Z)V")
	public static void method2695(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class110 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static264.method4810(3, arg2, arg0);
			return;
		}
		@Pc(23) String local23;
		if (Static168.aString140.startsWith("win") && Static168.anInt3543 != 3) {
			local23 = null;
			if (arg2.anApplet1 != null) {
				local23 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local23 == null || !local23.equals("1")) {
				@Pc(43) Class134 local43 = Static264.method4810(0, arg2, arg0);
				Static23.aString16 = arg0;
				Static315.aClass134_9 = local43;
				Static25.aClass110_1 = arg2;
				return;
			}
		}
		if (Static168.aString140.startsWith("mac")) {
			local23 = null;
			if (arg2.anApplet1 != null) {
				local23 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local23 != null && local23.equals("1") && arg1) {
				Static264.method4810(1, arg2, arg0);
				return;
			}
		}
		Static264.method4810(2, arg2, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public static void method2697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class145 local14 = Static49.method1111(arg1);
		@Pc(17) int local17 = local14.anInt4270;
		@Pc(20) int local20 = local14.anInt4271;
		@Pc(23) int local23 = local14.anInt4268;
		@Pc(30) int local30 = Class176.anIntArray651[local23 - local20];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local20;
		Static282.method4871(~local30 & Static49.anIntArray126[local17] | arg0 << local20 & local30, local17);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method2698(@OriginalArg(1) Class165 arg0) {
		Static54.anInt3487 = 0;
		Static290.anInt5616 = 0;
		Static293.aClass175_6 = new Class175();
		Static331.aClass15_Sub4_Sub1_Sub1Array2 = new Class15_Sub4_Sub1_Sub1[1024];
		Static298.method5222(arg0);
		Static203.method3793(arg0);
	}
}
