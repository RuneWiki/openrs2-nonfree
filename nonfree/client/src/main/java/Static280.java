import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public static final int anInt4824 = 1403;

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
	public static int anInt4835 = -1;

	@OriginalMember(owner = "client!qi", name = "bb", descriptor = "Lclient!wk;")
	public static final Class246 aClass246_25 = new Class246(16);

	@OriginalMember(owner = "client!qi", name = "cb", descriptor = "S")
	public static short aShort62 = 256;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZZLjava/lang/String;Lclient!is;)V")
	public static void method4252(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class111 arg3) {
		if (!arg1) {
			Static121.method2476(arg3, 3, arg2);
			return;
		}
		@Pc(19) String local19;
		if (Static152.aString35.startsWith("win") && Static152.anInt2983 != 3) {
			local19 = null;
			if (arg3.anApplet1 != null) {
				local19 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local19 == null || !local19.equals("1")) {
				@Pc(39) Class182 local39 = Static121.method2476(arg3, 0, arg2);
				Static187.aString38 = arg2;
				Static88.aClass111_2 = arg3;
				Static191.aClass182_8 = local39;
				return;
			}
		}
		if (Static152.aString35.startsWith("mac")) {
			local19 = null;
			if (arg3.anApplet1 != null) {
				local19 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local19 != null && local19.equals("1") && arg0) {
				Static121.method2476(arg3, 1, arg2);
				return;
			}
		}
		Static121.method2476(arg3, 2, arg2);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
	public static void method4257(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static187.method3245(0, arg1, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILclient!n;IIIIILclient!vc;I)Lclient!n;")
	public static Class66 method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class63 arg9) {
		@Pc(6) long local6 = (long) arg6;
		@Pc(12) Class66 local12 = (Class66) Static55.aClass160_9.method3599(local6);
		if (local12 == null) {
			@Pc(22) Class200 local22 = Static331.method4882(Static237.aClass171_58, arg6);
			if (local22 == null) {
				return null;
			}
			local12 = arg9.method1998(local22, 1031, Static165.anInt3177, 64, 768);
			Static55.aClass160_9.method3602(local6, local12);
		}
		local12 = local12.method5119((byte) 2, 1031, true);
		if (arg5 != 0) {
			local12.method5157(arg5);
		}
		if (arg1 != 0) {
			local12.method5153(arg1);
		}
		if (arg7 != 0) {
			local12.method5145(arg7);
		}
		if (arg0 != 0) {
			local12.method5132(0, arg0, 0);
		}
		return local12;
	}
}
