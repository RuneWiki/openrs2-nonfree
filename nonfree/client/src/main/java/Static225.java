import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!qda;")
	public static final Class281 aClass281_13 = new Class281(1);

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt3890 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)Z")
	public static boolean method3512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static364.method5693(arg0, arg1) || Static194.method3065(arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method3516(@OriginalArg(1) String arg0) {
		return Static639.method8797(16, arg0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Z")
	public static boolean method3517() {
		if (Static297.aBoolean391) {
			try {
				if ((Boolean) Static652.method1918("showingVideoAd", Static270.anApplet5)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!vfa;III)V")
	public static void method3518(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static629.aClass357_15 != null || Static251.aBoolean343 || (arg0 == null || Static599.method8375(arg0) == null)) {
			return;
		}
		Static629.aClass357_15 = arg0;
		Static536.aClass357_10 = Static599.method8375(arg0);
		Static254.anInt4284 = arg1;
		Static389.anInt6784 = 0;
		Static243.aBoolean334 = false;
		Static466.anInt7864 = arg2;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lclient!uk;")
	public static Class346 method3519(@OriginalArg(1) int arg0) {
		@Pc(8) Class346[] local8 = Static326.method5076();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class346 local16 = local8[local10];
			if (arg0 == local16.anInt9496) {
				return local16;
			}
		}
		return null;
	}
}
