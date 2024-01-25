import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rda", name = "L", descriptor = "Lclient!uu;")
	public static Class343 aClass343_231;

	@OriginalMember(owner = "client!rda", name = "J", descriptor = "Lclient!st;")
	public static final Class314 aClass314_121 = new Class314(27, 11);

	@OriginalMember(owner = "client!rda", name = "K", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!rda", name = "M", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "[I")
	public static final int[] anIntArray525 = new int[1];

	@OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
	public static int anInt8277 = 0;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!jm;)V")
	public static void method7156(@OriginalArg(1) Class3_Sub26 arg0) {
		if (Static567.aClass351ArrayArrayArray4 == null) {
			return;
		}
		@Pc(13) Interface2 local13 = null;
		if (arg0.anInt5290 == 0) {
			local13 = (Interface2) Static380.method5991(arg0.anInt5293, arg0.anInt5296, arg0.anInt5286);
		}
		if (arg0.anInt5290 == 1) {
			local13 = (Interface2) Static483.method7129(arg0.anInt5293, arg0.anInt5296, arg0.anInt5286);
		}
		if (arg0.anInt5290 == 2) {
			local13 = (Interface2) Static137.method2371(arg0.anInt5293, arg0.anInt5296, arg0.anInt5286, bda.class);
		}
		if (arg0.anInt5290 == 3) {
			local13 = (Interface2) Static279.method4563(arg0.anInt5293, arg0.anInt5296, arg0.anInt5286);
		}
		if (local13 == null) {
			arg0.anInt5295 = -1;
			arg0.anInt5299 = 0;
			arg0.anInt5291 = 0;
		} else {
			arg0.anInt5295 = local13.method7500();
			arg0.anInt5291 = local13.method7495();
			arg0.anInt5299 = local13.method7496();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)I")
	public static int method7158(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)Z")
	public static boolean method7159(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
