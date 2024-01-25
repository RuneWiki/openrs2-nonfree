import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lclient!vo;")
	public static Class381 aClass381_13 = null;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZB)V")
	public static void method8603(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 65) {
			aClass381_13 = null;
		}
		if (Static616.aClass339_1 == null) {
			Static253.method4388();
		}
		if (arg0) {
			Static616.aClass339_1.method8114();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBIII)V")
	public static void method8604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static481.anInt8152 = arg0;
		Static274.anInt3228 = arg2;
		Static54.anInt675 = arg1;
		Static398.anInt6884 = arg3;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BC)Z")
	public static boolean method8605(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static158.method3118(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static318.aCharArray8;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				@Pc(30) char local30 = local20[local22];
				if (arg0 == local30) {
					return true;
				}
			}
			if (-100 != -100) {
				method8603(false, (byte) -92);
			}
			@Pc(63) char[] local63 = Static463.aCharArray14;
			for (@Pc(65) int local65 = 0; local65 < local63.length; local65++) {
				@Pc(73) char local73 = local63[local65];
				if (arg0 == local73) {
					return true;
				}
			}
			return false;
		}
	}
}
