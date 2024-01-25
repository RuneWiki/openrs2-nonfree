import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	public static int anInt7012;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_115 = new Class142("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_119 = new Class242(15, 2);

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lclient!vo;")
	public static final Class265 aClass265_11 = new Class265("", 14);

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
	public static int anInt7015 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!ev;Lclient!ev;)V")
	public static void method5627(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_268 != null) {
			arg0.method5953();
		}
		arg0.aClass1_268 = arg1.aClass1_268;
		arg0.aClass1_267 = arg1;
		arg0.aClass1_268.aClass1_267 = arg0;
		arg0.aClass1_267.aClass1_268 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BZ)Z")
	public static boolean method5629(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static186.aClass117_3.method5713();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static186.aClass117_3.method5679();
		} else if (!Static186.aClass117_3.method5712()) {
			arg0 = false;
		}
		if (arg0 == local14) {
			return false;
		} else {
			Static126.aClass19_Sub1_1.aBoolean377 = arg0;
			Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)I")
	public static int method5630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static44.method582(arg0 - 1, arg1 + -1) + Static44.method582(arg0 - 1, arg1 + 1) + Static44.method582(arg0 + 1, arg1 + -1) + Static44.method582(arg0 - -1, arg1 + 1);
		@Pc(70) int local70 = Static44.method582(arg0, arg1 - 1) + Static44.method582(arg0, arg1 + 1) + Static44.method582(arg0 + -1, arg1) + Static44.method582(arg0 + 1, arg1);
		@Pc(80) int local80 = Static44.method582(arg0, arg1);
		return local41 / 16 + local70 / 8 + local80 / 4;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!nt;Ljava/lang/String;ZIZ)V")
	public static void method5632(@OriginalArg(0) Class177 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2) {
			Static126.method1562(3, arg0, arg1);
			return;
		}
		@Pc(16) String local16;
		if (Static289.aString48.startsWith("win") && Static289.anInt4838 != 3) {
			local16 = null;
			if (arg0.anApplet1 != null) {
				local16 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local16 == null || !local16.equals("1")) {
				@Pc(36) Class253 local36 = Static126.method1562(0, arg0, arg1);
				Static15.aClass177_1 = arg0;
				Static149.aString21 = arg1;
				Static53.aClass253_1 = local36;
				return;
			}
		}
		if (Static289.aString48.startsWith("mac")) {
			local16 = null;
			if (arg0.anApplet1 != null) {
				local16 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local16 != null && local16.equals("1") && arg3) {
				Static126.method1562(1, arg0, arg1);
				return;
			}
		}
		Static126.method1562(2, arg0, arg1);
	}
}
