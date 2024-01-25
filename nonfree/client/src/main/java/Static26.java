import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!be", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "[I")
	public static final int[] anIntArray28 = new int[2];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ci;II)I")
	public static int method371(@OriginalArg(0) Class42 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!oh;")
	public static Class10 method372(@OriginalArg(1) Component arg0) {
		return new Class10_Sub1(arg0);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)Z")
	public static boolean method373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ci;ILjava/lang/String;)Lclient!mg;")
	public static Class159 method374(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method665(arg2);
		}
		@Pc(43) Class159 local43;
		if (arg0 == 1) {
			try {
				Static455.method620("openjs", arg1.anApplet1, new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() });
				local43 = new Class159();
				local43.anInt4271 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class159();
				local43.anInt4271 = 2;
				return local43;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local43 = new Class159();
				local43.anInt4271 = 1;
				return local43;
			} catch (@Pc(83) Exception local83) {
				local43 = new Class159();
				local43.anInt4271 = 2;
				return local43;
			}
		} else if (arg0 == 3) {
			try {
				Static455.method622("loggedout", arg1.anApplet1);
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local43 = new Class159();
				local43.anInt4271 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class159();
				local43.anInt4271 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(III)Lclient!eb;")
	public static Class47_Sub3 method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class47_Sub3 local14 = local7.aClass47_Sub3_1;
			local7.aClass47_Sub3_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
	public static void method377() {
		Static328.aClass121_9.ua(((float) Static327.aClass230_Sub1_1.anInt7304 * 0.1F + 0.7F) * 1.1523438F);
		Static328.aClass121_9.XA(Static19.anInt296, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static328.aClass121_9.V(Static18.anInt291, -1, 256);
		Static328.aClass121_9.method4597(Static311.aClass89_2);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIBII)V")
	public static void method379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg0 >= Static47.anInt762 && Static60.anInt1086 >= arg0 + arg2 && arg5 - arg0 >= Static357.anInt6537 && Static85.anInt1517 >= arg5 + arg0) {
			Static402.method5668(arg3, arg1, arg2, arg0, arg5, arg4);
		} else {
			Static50.method694(arg1, arg0, arg4, arg2, arg5, arg3);
		}
	}
}
