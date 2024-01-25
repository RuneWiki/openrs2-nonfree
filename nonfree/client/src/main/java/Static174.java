import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!in", name = "T", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_75 = new Class119(0, -2);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)B")
	public static byte method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(II)Lclient!as;")
	public static Class15 method2791(@OriginalArg(0) int arg0) {
		@Pc(18) Class15 local18 = (Class15) Static284.aClass126_40.method3141((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static19.aClass32_8.method785(arg0, 0);
		local18 = new Class15();
		if (local28 != null) {
			local18.method379(new Class3_Sub7(local28), arg0);
		}
		Static284.aClass126_40.method3132((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)[Lclient!op;")
	public static Class182[] method2793() {
		return new Class182[] { Static191.aClass182_6, Static272.aClass182_9, Static21.aClass182_2, Static289.aClass182_8, Static205.aClass182_7, Static121.aClass182_5 };
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZLclient!li;Ljava/lang/String;)V")
	public static void method2794(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) String arg3) {
		if (!arg0) {
			Static17.method371(arg2, 3, arg3);
			return;
		}
		@Pc(20) String local20;
		if (Static227.aString28.startsWith("win") && Static227.anInt4227 != 3) {
			local20 = null;
			if (arg2.anApplet1 != null) {
				local20 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local20 == null || !local20.equals("1")) {
				@Pc(40) Class43 local40 = Static17.method371(arg2, 0, arg3);
				Static60.aClass143_1 = arg2;
				Static114.aString16 = arg3;
				Static77.aClass43_3 = local40;
				return;
			}
		}
		if (Static227.aString28.startsWith("mac")) {
			local20 = null;
			if (arg2.anApplet1 != null) {
				local20 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local20 != null && local20.equals("1") && arg1) {
				Static17.method371(arg2, 1, arg3);
				return;
			}
		}
		Static17.method371(arg2, 2, arg3);
	}
}
