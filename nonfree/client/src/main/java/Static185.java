import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array3;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	public static int anInt3367;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_47 = new Class84("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!vh;I)V")
	public static void method2823(@OriginalArg(0) Class250 arg0) {
		Static150.aClass250_28 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!kj;ILjava/lang/String;I)Lclient!gu;")
	public static Class100 method2824(@OriginalArg(0) Class138 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method3194(arg1);
		}
		@Pc(46) Class100 local46;
		if (arg2 == 1) {
			try {
				Static456.method696("openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg1)).toString() }, arg0.anApplet1);
				local46 = new Class100();
				local46.anInt2365 = 1;
				return local46;
			} catch (@Pc(52) Throwable local52) {
				local46 = new Class100();
				local46.anInt2365 = 2;
				return local46;
			}
		} else if (arg2 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_blank");
				local46 = new Class100();
				local46.anInt2365 = 1;
				return local46;
			} catch (@Pc(86) Exception local86) {
				local46 = new Class100();
				local46.anInt2365 = 2;
				return local46;
			}
		} else if (arg2 == 3) {
			try {
				Static456.method694(arg0.anApplet1, "loggedout");
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_top");
				local46 = new Class100();
				local46.anInt2365 = 1;
				return local46;
			} catch (@Pc(130) Exception local130) {
				local46 = new Class100();
				local46.anInt2365 = 2;
				return local46;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
	public static int method2825(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local9 & 0x33333333) + (local9 >>> 2 & 0xB3333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(45) int local45 = local31 + (local31 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILclient!ss;)V")
	public static void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class219 arg2) {
		if (arg2.aByte81 == 0) {
			arg2.anInt6418 = arg2.anInt6343;
		} else if (arg2.aByte81 == 1) {
			arg2.anInt6418 = (arg0 - arg2.anInt6398) / 2 + arg2.anInt6343;
		} else if (arg2.aByte81 == 2) {
			arg2.anInt6418 = arg0 - arg2.anInt6343 - arg2.anInt6398;
		} else if (arg2.aByte81 == 3) {
			arg2.anInt6418 = arg2.anInt6343 * arg0 >> 14;
		} else if (arg2.aByte81 == 4) {
			arg2.anInt6418 = (arg0 - arg2.anInt6398) / 2 + (arg2.anInt6343 * arg0 >> 14);
		} else {
			arg2.anInt6418 = arg0 - arg2.anInt6398 - (arg2.anInt6343 * arg0 >> 14);
		}
		if (arg2.aByte80 == 0) {
			arg2.anInt6375 = arg2.anInt6367;
		} else if (arg2.aByte80 == 1) {
			arg2.anInt6375 = arg2.anInt6367 + (arg1 - arg2.anInt6363) / 2;
		} else if (arg2.aByte80 == 2) {
			arg2.anInt6375 = arg1 - arg2.anInt6363 - arg2.anInt6367;
		} else if (arg2.aByte80 == 3) {
			arg2.anInt6375 = arg1 * arg2.anInt6367 >> 14;
		} else if (arg2.aByte80 == 4) {
			arg2.anInt6375 = (arg1 - arg2.anInt6363) / 2 + (arg1 * arg2.anInt6367 >> 14);
		} else {
			arg2.anInt6375 = arg1 - arg2.anInt6363 - (arg1 * arg2.anInt6367 >> 14);
		}
		if (!Static239.aBoolean287) {
			return;
		}
		if (Static53.method916(arg2).anInt7461 == 0 && arg2.anInt6377 != 0) {
			return;
		}
		if (arg2.anInt6418 < 0) {
			arg2.anInt6418 = 0;
		} else if (arg0 < arg2.anInt6418 + arg2.anInt6398) {
			arg2.anInt6418 = arg0 - arg2.anInt6398;
		}
		if (arg2.anInt6375 < 0) {
			arg2.anInt6375 = 0;
			return;
		}
		if (arg2.anInt6363 + arg2.anInt6375 > arg1) {
			arg2.anInt6375 = arg1 - arg2.anInt6363;
			return;
		}
	}
}
