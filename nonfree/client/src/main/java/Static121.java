import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt2597;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray69 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "[Lclient!nc;")
	public static final Class2_Sub10_Sub12[] aClass2_Sub10_Sub12Array4 = new Class2_Sub10_Sub12[14];

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
	public static int anInt2600 = 0;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Lclient!cf;")
	public static Class30 aClass30_17 = new Class30();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!is;IILjava/lang/String;)Lclient!or;")
	public static Class182 method2476(@OriginalArg(0) Class111 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method2805(arg2);
		}
		@Pc(41) Class182 local41;
		if (arg1 == 1) {
			try {
				Static403.method4140(arg0.anApplet1, "openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local41 = new Class182();
				local41.anInt4498 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class182();
				local41.anInt4498 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class182();
				local41.anInt4498 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class182();
				local41.anInt4498 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static403.method4138("loggedout", arg0.anApplet1);
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class182();
				local41.anInt4498 = 1;
				return local41;
			} catch (@Pc(125) Exception local125) {
				local41 = new Class182();
				local41.anInt4498 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIZ)I")
	public static int method2478(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static204.method3472(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!wg;)I")
	public static int method2479(@OriginalArg(1) Class1_Sub5_Sub1_Sub2 arg0) {
		@Pc(13) Class133 local13 = arg0.aClass133_1;
		if (local13.anIntArray653 != null) {
			local13 = local13.method3094(Static321.aClass211_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local13.lb;
		@Pc(36) Class103 local36 = arg0.method5552();
		if (arg0.aBoolean460) {
			local30 = local13.anInt3350;
		} else if (arg0.anInt6423 == local36.anInt2819 || arg0.anInt6423 == local36.anInt2824 || local36.anInt2827 == arg0.anInt6423 || arg0.anInt6423 == local36.anInt2828) {
			local30 = local13.anInt3357;
		} else if (arg0.anInt6423 == local36.anInt2836 || arg0.anInt6423 == local36.anInt2820 || local36.anInt2813 == arg0.anInt6423 || arg0.anInt6423 == local36.anInt2826) {
			local30 = local13.anInt3354;
		}
		return local30;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIIILclient!is;)Ljava/awt/Frame;")
	public static Frame method2480(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class111 arg3) {
		if (!arg3.method2810()) {
			return null;
		}
		@Pc(17) Class241[] local17 = Static311.method4586(arg3);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt6298 == arg1 && arg2 == local17[local25].anInt6295 && (!local23 || local17[local25].anInt6293 > arg0)) {
				arg0 = local17[local25].anInt6293;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(105) Class182 local105 = arg3.method2813(arg0, arg1, arg2);
		while (local105.anInt4498 == 0) {
			Static358.method2028(10L);
		}
		@Pc(120) Frame local120 = (Frame) local105.anObject6;
		if (local120 == null) {
			return null;
		} else if (local105.anInt4498 == 2) {
			Static17.method318(local120, arg3);
			return null;
		} else {
			return local120;
		}
	}
}
