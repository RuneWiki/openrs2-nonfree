import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_160 = new Class119(64);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
	public static int method4671(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local13 >> 12;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	public static void method4675() {
		@Pc(10) Class119 local10 = Static162.aClass119_99;
		synchronized (Static162.aClass119_99) {
			Static162.aClass119_99.method3304();
		}
		local10 = Static217.aClass119_128;
		synchronized (Static217.aClass119_128) {
			Static217.aClass119_128.method3304();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;Lclient!rd;I)Lclient!ts;")
	public static Class193 method4677(@OriginalArg(1) String arg0, @OriginalArg(2) Class168 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method4834(arg0);
		}
		@Pc(51) Class193 local51;
		if (arg2 == 1) {
			try {
				Static358.method2("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, arg1.anApplet1);
				local51 = new Class193();
				local51.anInt6293 = 1;
				return local51;
			} catch (@Pc(57) Throwable local57) {
				local51 = new Class193();
				local51.anInt6293 = 2;
				return local51;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local51 = new Class193();
				local51.anInt6293 = 1;
				return local51;
			} catch (@Pc(91) Exception local91) {
				local51 = new Class193();
				local51.anInt6293 = 2;
				return local51;
			}
		} else if (arg2 == 3) {
			try {
				Static358.method3(arg1.anApplet1, "loggedout");
			} catch (@Pc(115) Throwable local115) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local51 = new Class193();
				local51.anInt6293 = 1;
				return local51;
			} catch (@Pc(137) Exception local137) {
				local51 = new Class193();
				local51.anInt6293 = 2;
				return local51;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lclient!on;ZIII)V")
	public static void method4678(@OriginalArg(1) Class146[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class146 local13 = arg0[local7];
			if (local13 != null && arg3 == local13.anInt4458) {
				Static356.method5994(arg4, local13, arg2, arg1);
				Static71.method1643(local13, arg4, arg2);
				if (local13.anInt4430 - local13.anInt4468 < local13.anInt4487) {
					local13.anInt4487 = local13.anInt4430 - local13.anInt4468;
				}
				if (local13.anInt4487 < 0) {
					local13.anInt4487 = 0;
				}
				if (local13.anInt4483 > local13.anInt4482 - local13.anInt4414) {
					local13.anInt4483 = local13.anInt4482 - local13.anInt4414;
				}
				if (local13.anInt4483 < 0) {
					local13.anInt4483 = 0;
				}
				if (local13.anInt4419 == 0) {
					Static41.method968(arg1, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static124.anInt4221 <= arg3 && Static96.anInt2180 >= arg4 && Static228.anInt920 <= arg1 && Static307.anInt6214 >= arg5) {
			Static281.method5074(arg1, arg6, arg2, arg4, arg0, arg5, arg3);
		} else {
			Static114.method5714(arg5, arg2, arg1, arg6, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)Z")
	public static boolean method4680() {
		return Static129.anInt2728 == 0 ? Static25.aBoolean123 : true;
	}
}
