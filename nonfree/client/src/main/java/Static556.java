import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!rn;")
	public static Class3_Sub43 aClass3_Sub43_4;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
	public static int[] anIntArray580 = new int[1];

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
	public static boolean aBoolean676 = true;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method7351() {
		for (@Pc(15) Class3_Sub7_Sub16 local15 = (Class3_Sub7_Sub16) Static432.aClass112_51.method3088(); local15 != null; local15 = (Class3_Sub7_Sub16) Static432.aClass112_51.method3084()) {
			@Pc(20) Class41_Sub2_Sub1_Sub5 local20 = local15.aClass41_Sub2_Sub1_Sub5_1;
			if (local20.aBoolean575) {
				local15.method7825();
				local20.method6284();
			} else if (local20.anInt7524 <= Static506.anInt8251) {
				local20.method6288(Static541.anInt8161);
				if (local20.aBoolean575) {
					local15.method7825();
				} else {
					Static586.method1886(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lclient!wp;")
	public static Class361 method7352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class361 local7 = Static265.method4040(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass361Array2 == null || arg1 >= local7.aClass361Array2.length) {
			return null;
		} else {
			return local7.aClass361Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public static void method7354() {
		if (!Static292.aBoolean365) {
			return;
		}
		while (true) {
			while (Static286.anInt4914 < Static563.aClass119_Sub1Array2.length) {
				@Pc(22) Class119_Sub1 local22 = Static563.aClass119_Sub1Array2[Static286.anInt4914];
				if (local22 != null && local22.anInt3547 == -1) {
					if (Static190.aClass3_Sub38_2 == null) {
						Static190.aClass3_Sub38_2 = Static194.aClass290_1.method6414(local22.aString20);
					}
					@Pc(50) int local50 = Static190.aClass3_Sub38_2.anInt6787;
					if (local50 == -1) {
						return;
					}
					Static190.aClass3_Sub38_2 = null;
					local22.anInt3547 = local50;
					Static286.anInt4914++;
				} else {
					Static286.anInt4914++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII)V")
	public static void method7355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static293.method3974(arg0)) {
			Static257.method3947(Static380.aClass361ArrayArray2[arg0], arg1);
		}
	}
}
