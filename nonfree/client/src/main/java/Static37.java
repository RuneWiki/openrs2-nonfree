import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
	public static boolean aBoolean28;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!ge;")
	public static Class29 aClass29_9 = new Class29(30);

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ge;")
	public static Class29 aClass29_10 = new Class29(500);

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!r;")
	private static Class61 aClass61_308 = Static129.method2060("Unexpected server response)3");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_307 = aClass61_308;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method702() {
		aClass29_10 = null;
		aClass61_307 = null;
		aClass29_9 = null;
		aClass61_308 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method703(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static4.aClass34_2);
		arg0.addMouseMotionListener(Static4.aClass34_2);
		arg0.addFocusListener(Static4.aClass34_2);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[I[Lclient!ec;I[IB)V")
	public static void method704(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1;
		@Pc(20) int local20 = arg0 + 1;
		@Pc(26) int local26 = (arg3 + arg0) / 2;
		@Pc(30) Class18 local30 = arg2[local26];
		arg2[local26] = arg2[arg3];
		arg2[arg3] = local30;
		while (local20 > local16) {
			@Pc(43) boolean local43 = true;
			@Pc(46) int local46;
			@Pc(69) int local69;
			@Pc(72) int local72;
			do {
				local20--;
				for (local46 = 0; local46 < 4; local46++) {
					if (arg1[local46] == 2) {
						local69 = arg2[local20].anInt909;
						local72 = local30.anInt909;
					} else if (arg1[local46] == 1) {
						local72 = local30.anInt903;
						if (local72 == -1 && arg4[local46] == 1) {
							local72 = 2001;
						}
						local69 = arg2[local20].anInt903;
						if (local69 == -1 && arg4[local46] == 1) {
							local69 = 2001;
						}
					} else if (arg1[local46] == 3) {
						local72 = local30.aBoolean25 ? 1 : 0;
						local69 = arg2[local20].aBoolean25 ? 1 : 0;
					} else {
						local69 = arg2[local20].anInt907;
						local72 = local30.anInt907;
					}
					if (local69 != local72) {
						if ((arg4[local46] != 1 || local69 <= local72) && (arg4[local46] != 0 || local72 <= local69)) {
							local43 = false;
						}
						break;
					}
					if (local46 == 3) {
						local43 = false;
					}
				}
			} while (local43);
			local43 = true;
			do {
				local16++;
				for (local46 = 0; local46 < 4; local46++) {
					if (arg1[local46] == 2) {
						local72 = local30.anInt909;
						local69 = arg2[local16].anInt909;
					} else if (arg1[local46] == 1) {
						local69 = arg2[local16].anInt903;
						if (local69 == -1 && arg4[local46] == 1) {
							local69 = 2001;
						}
						local72 = local30.anInt903;
						if (local72 == -1 && arg4[local46] == 1) {
							local72 = 2001;
						}
					} else if (arg1[local46] == 3) {
						local72 = local30.aBoolean25 ? 1 : 0;
						local69 = arg2[local16].aBoolean25 ? 1 : 0;
					} else {
						local72 = local30.anInt907;
						local69 = arg2[local16].anInt907;
					}
					if (local69 != local72) {
						if ((arg4[local46] != 1 || local72 <= local69) && (arg4[local46] != 0 || local72 >= local69)) {
							local43 = false;
						}
						break;
					}
					if (local46 == 3) {
						local43 = false;
					}
				}
			} while (local43);
			if (local20 > local16) {
				@Pc(318) Class18 local318 = arg2[local16];
				arg2[local16] = arg2[local20];
				arg2[local20] = local318;
			}
		}
		method704(local20, arg1, arg2, arg3, arg4);
		method704(arg0, arg1, arg2, local20 + 1, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!k;")
	public static Class5_Sub2_Sub9 method705(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub2_Sub9 local6 = (Class5_Sub2_Sub9) Static83.aClass29_21.method766((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static109.aClass26_29.method1038(8, arg0);
		local6 = new Class5_Sub2_Sub9();
		if (local26 != null) {
			local6.method1074(new Class5_Sub14(local26));
		}
		Static83.aClass29_21.method762(local6, (long) arg0);
		return local6;
	}
}
