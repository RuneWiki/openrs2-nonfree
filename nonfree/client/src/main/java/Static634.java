import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_23 = new Class368(5, 3);

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	public static int anInt10948 = 0;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "Z")
	public static boolean aBoolean788 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method9354() {
		if (Static96.aClass48_5.aBoolean75 && Static186.aClass66_1.anInt1756 != -1) {
			Static163.method3291(Static186.aClass66_1.anInt1756, Static186.aClass66_1.aString22);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	public static void method9356(@OriginalArg(0) boolean arg0) {
		Static481.aClass76_14.method9629(Static435.aClass101_11.method8112());
		@Pc(15) int[] local15 = Static435.aClass101_11.Y();
		Static451.anInt8149 = local15[0];
		Static541.anInt9466 = local15[2];
		Static503.anInt8366 = local15[3];
		Static192.anInt4087 = local15[1];
		if (arg0) {
			Static435.aClass101_11.DA(Static670.anInt7889, Static569.anInt9968, Static422.anInt7763, Static39.anInt10895);
			Static466.method7484(Static483.aDouble20);
		} else {
			Static435.aClass101_11.DA(Static611.anInt10746, Static257.anInt4919, Static41.anInt914, Static637.anInt10987);
			Static466.method7484(Static583.aDouble25);
		}
	}

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
	public static void method9358() {
		Static595.aClass101_14.xa(((float) Static230.aClass2_Sub54_15.aClass4_Sub1_1.method89() * 0.1F + 0.7F) * Static489.aFloat178);
		Static595.aClass101_14.ZA(Static567.anInt9848, Static240.aFloat91, Static21.aFloat1, (float) (Static558.anInt9716 << 2), (float) (Static109.anInt1989 << 2), (float) (Static481.anInt8661 << 2));
		Static595.aClass101_14.method8068(Static283.aClass3_2);
	}
}
