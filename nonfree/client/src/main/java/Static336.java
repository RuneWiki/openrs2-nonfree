import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "Lclient!in;")
	public static Class157 aClass157_171;

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V")
	public static void method5781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static535.anInt9666 = arg0 - Static303.anInt110;
		Static248.anInt5350 = arg1 - Static303.anInt108;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!wea;Ljava/lang/String;II)Lclient!of;")
	public static Class240 method5804(@OriginalArg(0) Class370 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method9080(arg1);
		}
		@Pc(44) Class240 local44;
		if (arg2 == 1) {
			try {
				Static646.method1787("openjs", new Object[] { (new URL(Static334.anApplet2.getCodeBase(), arg1)).toString() }, Static334.anApplet2);
				local44 = new Class240();
				local44.anInt7566 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class240();
				local44.anInt7566 = 2;
				return local44;
			}
		} else if (arg2 == 2) {
			try {
				Static334.anApplet2.getAppletContext().showDocument(new URL(Static334.anApplet2.getCodeBase(), arg1), "_blank");
				local44 = new Class240();
				local44.anInt7566 = 1;
				return local44;
			} catch (@Pc(84) Exception local84) {
				local44 = new Class240();
				local44.anInt7566 = 2;
				return local44;
			}
		} else if (arg2 == 3) {
			try {
				Static646.method1788(Static334.anApplet2, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static334.anApplet2.getAppletContext().showDocument(new URL(Static334.anApplet2.getCodeBase(), arg1), "_top");
				local44 = new Class240();
				local44.anInt7566 = 1;
				return local44;
			} catch (@Pc(123) Exception local123) {
				local44 = new Class240();
				local44.anInt7566 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(III)Lclient!aba;")
	public static Class3_Sub1_Sub1 method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass3_Sub1_Sub1_1 == null ? null : local7.aClass3_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "(III)V")
	public static void method5821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static452.method7100(local7.aClass3_Sub1_Sub1_1);
			if (local7.aClass3_Sub1_Sub1_1 != null) {
				local7.aClass3_Sub1_Sub1_1 = null;
			}
		}
	}
}
